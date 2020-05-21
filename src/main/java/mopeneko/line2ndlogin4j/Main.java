package mopeneko.line2ndlogin4j;

import java.util.HashMap;
import java.util.Base64;
import java.net.URLEncoder;
import org.apache.thrift.TException;
import org.apache.thrift.transport.THttpClient;
import org.apache.thrift.protocol.TCompactProtocol;
import org.whispersystems.curve25519.*;
import line.SecondaryQrCodeLoginService;
import line.SecondaryQrCodeLoginPermitNoticeService;
import line.CreateQrSessionRequest;
import line.CreateQrSessionResponse;
import line.CreateQrCodeRequest;
import line.CreateQrCodeResponse;
import line.CheckQrCodeVerifiedRequest;
import line.VerifyCertificateRequest;
import line.CreatePinCodeRequest;
import line.CreatePinCodeResponse;
import line.CheckPinCodeVerifiedRequest;
import line.QrCodeLoginRequest;
import line.QrCodeLoginResponse;

public class Main {
	public static void main(String[] args) throws TException {
		final String HOST = "ga2.line.naver.jp";
		final String QR_PATH = "/acct/lgn/sq/v1";
		final String QR_PN_PATH = "/acct/lp/lgn/sq/v1";

		var headers = new HashMap<String, String>();
		headers.put("User-Agent", "LLA/2.13.2 Nexus 7 10.0.0");
		headers.put("X-Line-Application", "ANDROIDLITE\t2.13.2\tAndroid OS\t10;SECONDARY");
		headers.put("x-lal", "ja_jp");

		var transport = new THttpClient("https://" + HOST + QR_PATH);
		transport.setCustomHeaders(headers);
		transport.open();
		var protocol = new TCompactProtocol(transport);
		var client = new SecondaryQrCodeLoginService.Client(protocol);

		var createQrSessionRequest = new CreateQrSessionRequest();
		var createQrSessionResponse = new CreateQrSessionResponse();
		try {
			createQrSessionResponse = client.createSession(createQrSessionRequest);
		} catch (TException e) {
			System.out.println("Failed to create session.");
			transport.close();
			return;
		}

		final String authSessionId = createQrSessionResponse.authSessionId;

		var createQrCodeRequest = new CreateQrCodeRequest();
		createQrCodeRequest.authSessionId = authSessionId;
		var createQrCodeResponse = new CreateQrCodeResponse();
		try {
			createQrCodeResponse = client.createQrCode(createQrCodeRequest);
		} catch (TException e) {
			System.out.println("Failed to create QR code.");
			transport.close();
			return;
		}

		var cipher = Curve25519.getInstance(Curve25519.BEST);
		var keyPair = cipher.generateKeyPair();
		var encodedPublicKey = Base64.getEncoder().encodeToString(keyPair.getPublicKey());

		var secret = "";
		try {
			secret = URLEncoder.encode(encodedPublicKey, "UTF-8");
		} catch (Exception e) {}

		System.out.println("Callback URL -> " + createQrCodeResponse.callbackUrl + "?secret=" + secret + "&e2eeVersion=1");

		var pnTransport = new THttpClient("https://" + HOST + QR_PN_PATH);
		pnTransport.setCustomHeaders(headers);
		pnTransport.open();
		var pnProtocol = new TCompactProtocol(pnTransport);
		var pnClient = new SecondaryQrCodeLoginPermitNoticeService.Client(pnProtocol);

		headers.put("X-Line-Access", authSessionId);

		var checkQrCodeVerifiedRequest = new line.CheckQrCodeVerifiedRequest();
		checkQrCodeVerifiedRequest.authSessionId = authSessionId;
		try {
			pnClient.checkQrCodeVerified(checkQrCodeVerifiedRequest);
		} catch (TException e) {
			System.out.println("Timed out.");
			transport.close();
			pnTransport.close();
			return;
		}

		headers.remove("X-Line-Access");

		var isCertificateVerified = true;

		var verifyCertificateRequest = new VerifyCertificateRequest();
		verifyCertificateRequest.authSessionId = authSessionId;
		try {
			client.verifyCertificate(verifyCertificateRequest);
		} catch(TException e) {
			isCertificateVerified = false;
		}
		
		if (!isCertificateVerified) {
			var createPinCodeRequest = new CreatePinCodeRequest();
			createPinCodeRequest.authSessionId = authSessionId;
			var createPinCodeResponse = new CreatePinCodeResponse();
			try {
				createPinCodeResponse = client.createPinCode(createPinCodeRequest);
			} catch (TException e) {
				System.out.println("Failed to create PIN code.");
				e.printStackTrace();
				transport.close();
				pnTransport.close();
				return;
			}

			System.out.println("PIN code -> " + createPinCodeResponse.pinCode);

			headers.put("X-Line-Access", authSessionId);

			var checkPinCodeVerifiedRequest = new CheckPinCodeVerifiedRequest();
			checkPinCodeVerifiedRequest.authSessionId = authSessionId;
			try {
				pnClient.checkPinCodeVerified(checkPinCodeVerifiedRequest);
			} catch (TException e) {
				System.out.println("Timed out.");
				transport.close();
				pnTransport.close();
				return;
			}

			headers.remove("X-Line-Access");
		}

		var qrCodeLoginRequest = new QrCodeLoginRequest();
		qrCodeLoginRequest.authSessionId = authSessionId;
		qrCodeLoginRequest.systemName = "Android OS";
		qrCodeLoginRequest.autoLoginIsRequired = true;
		var qrCodeLoginResponse = new QrCodeLoginResponse();
		try {
			qrCodeLoginResponse = client.qrCodeLogin(qrCodeLoginRequest);
		} catch (TException e) {
			System.out.println("Failed to login.");
			transport.close();
			pnTransport.close();
			return;
		}

		System.out.println("Result -> " + qrCodeLoginResponse);
		transport.close();
		pnTransport.close();
	}
}
