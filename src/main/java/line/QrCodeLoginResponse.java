/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package line;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-05-20")
public class QrCodeLoginResponse implements org.apache.thrift.TBase<QrCodeLoginResponse, QrCodeLoginResponse._Fields>, java.io.Serializable, Cloneable, Comparable<QrCodeLoginResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("QrCodeLoginResponse");

  private static final org.apache.thrift.protocol.TField CERTIFICATE_FIELD_DESC = new org.apache.thrift.protocol.TField("certificate", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ACCESS_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("accessToken", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField LAST_BIND_TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("lastBindTimestamp", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField META_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("metaData", org.apache.thrift.protocol.TType.MAP, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new QrCodeLoginResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new QrCodeLoginResponseTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String certificate; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String accessToken; // required
  public long lastBindTimestamp; // required
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> metaData; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CERTIFICATE((short)1, "certificate"),
    ACCESS_TOKEN((short)2, "accessToken"),
    LAST_BIND_TIMESTAMP((short)3, "lastBindTimestamp"),
    META_DATA((short)4, "metaData");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CERTIFICATE
          return CERTIFICATE;
        case 2: // ACCESS_TOKEN
          return ACCESS_TOKEN;
        case 3: // LAST_BIND_TIMESTAMP
          return LAST_BIND_TIMESTAMP;
        case 4: // META_DATA
          return META_DATA;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __LASTBINDTIMESTAMP_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CERTIFICATE, new org.apache.thrift.meta_data.FieldMetaData("certificate", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ACCESS_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("accessToken", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LAST_BIND_TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("lastBindTimestamp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.META_DATA, new org.apache.thrift.meta_data.FieldMetaData("metaData", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(QrCodeLoginResponse.class, metaDataMap);
  }

  public QrCodeLoginResponse() {
  }

  public QrCodeLoginResponse(
    java.lang.String certificate,
    java.lang.String accessToken,
    long lastBindTimestamp,
    java.util.Map<java.lang.String,java.lang.String> metaData)
  {
    this();
    this.certificate = certificate;
    this.accessToken = accessToken;
    this.lastBindTimestamp = lastBindTimestamp;
    setLastBindTimestampIsSet(true);
    this.metaData = metaData;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QrCodeLoginResponse(QrCodeLoginResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetCertificate()) {
      this.certificate = other.certificate;
    }
    if (other.isSetAccessToken()) {
      this.accessToken = other.accessToken;
    }
    this.lastBindTimestamp = other.lastBindTimestamp;
    if (other.isSetMetaData()) {
      java.util.Map<java.lang.String,java.lang.String> __this__metaData = new java.util.HashMap<java.lang.String,java.lang.String>(other.metaData);
      this.metaData = __this__metaData;
    }
  }

  public QrCodeLoginResponse deepCopy() {
    return new QrCodeLoginResponse(this);
  }

  @Override
  public void clear() {
    this.certificate = null;
    this.accessToken = null;
    setLastBindTimestampIsSet(false);
    this.lastBindTimestamp = 0;
    this.metaData = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCertificate() {
    return this.certificate;
  }

  public QrCodeLoginResponse setCertificate(@org.apache.thrift.annotation.Nullable java.lang.String certificate) {
    this.certificate = certificate;
    return this;
  }

  public void unsetCertificate() {
    this.certificate = null;
  }

  /** Returns true if field certificate is set (has been assigned a value) and false otherwise */
  public boolean isSetCertificate() {
    return this.certificate != null;
  }

  public void setCertificateIsSet(boolean value) {
    if (!value) {
      this.certificate = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getAccessToken() {
    return this.accessToken;
  }

  public QrCodeLoginResponse setAccessToken(@org.apache.thrift.annotation.Nullable java.lang.String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  public void unsetAccessToken() {
    this.accessToken = null;
  }

  /** Returns true if field accessToken is set (has been assigned a value) and false otherwise */
  public boolean isSetAccessToken() {
    return this.accessToken != null;
  }

  public void setAccessTokenIsSet(boolean value) {
    if (!value) {
      this.accessToken = null;
    }
  }

  public long getLastBindTimestamp() {
    return this.lastBindTimestamp;
  }

  public QrCodeLoginResponse setLastBindTimestamp(long lastBindTimestamp) {
    this.lastBindTimestamp = lastBindTimestamp;
    setLastBindTimestampIsSet(true);
    return this;
  }

  public void unsetLastBindTimestamp() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LASTBINDTIMESTAMP_ISSET_ID);
  }

  /** Returns true if field lastBindTimestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetLastBindTimestamp() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LASTBINDTIMESTAMP_ISSET_ID);
  }

  public void setLastBindTimestampIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LASTBINDTIMESTAMP_ISSET_ID, value);
  }

  public int getMetaDataSize() {
    return (this.metaData == null) ? 0 : this.metaData.size();
  }

  public void putToMetaData(java.lang.String key, java.lang.String val) {
    if (this.metaData == null) {
      this.metaData = new java.util.HashMap<java.lang.String,java.lang.String>();
    }
    this.metaData.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,java.lang.String> getMetaData() {
    return this.metaData;
  }

  public QrCodeLoginResponse setMetaData(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> metaData) {
    this.metaData = metaData;
    return this;
  }

  public void unsetMetaData() {
    this.metaData = null;
  }

  /** Returns true if field metaData is set (has been assigned a value) and false otherwise */
  public boolean isSetMetaData() {
    return this.metaData != null;
  }

  public void setMetaDataIsSet(boolean value) {
    if (!value) {
      this.metaData = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CERTIFICATE:
      if (value == null) {
        unsetCertificate();
      } else {
        setCertificate((java.lang.String)value);
      }
      break;

    case ACCESS_TOKEN:
      if (value == null) {
        unsetAccessToken();
      } else {
        setAccessToken((java.lang.String)value);
      }
      break;

    case LAST_BIND_TIMESTAMP:
      if (value == null) {
        unsetLastBindTimestamp();
      } else {
        setLastBindTimestamp((java.lang.Long)value);
      }
      break;

    case META_DATA:
      if (value == null) {
        unsetMetaData();
      } else {
        setMetaData((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CERTIFICATE:
      return getCertificate();

    case ACCESS_TOKEN:
      return getAccessToken();

    case LAST_BIND_TIMESTAMP:
      return getLastBindTimestamp();

    case META_DATA:
      return getMetaData();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CERTIFICATE:
      return isSetCertificate();
    case ACCESS_TOKEN:
      return isSetAccessToken();
    case LAST_BIND_TIMESTAMP:
      return isSetLastBindTimestamp();
    case META_DATA:
      return isSetMetaData();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof QrCodeLoginResponse)
      return this.equals((QrCodeLoginResponse)that);
    return false;
  }

  public boolean equals(QrCodeLoginResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_certificate = true && this.isSetCertificate();
    boolean that_present_certificate = true && that.isSetCertificate();
    if (this_present_certificate || that_present_certificate) {
      if (!(this_present_certificate && that_present_certificate))
        return false;
      if (!this.certificate.equals(that.certificate))
        return false;
    }

    boolean this_present_accessToken = true && this.isSetAccessToken();
    boolean that_present_accessToken = true && that.isSetAccessToken();
    if (this_present_accessToken || that_present_accessToken) {
      if (!(this_present_accessToken && that_present_accessToken))
        return false;
      if (!this.accessToken.equals(that.accessToken))
        return false;
    }

    boolean this_present_lastBindTimestamp = true;
    boolean that_present_lastBindTimestamp = true;
    if (this_present_lastBindTimestamp || that_present_lastBindTimestamp) {
      if (!(this_present_lastBindTimestamp && that_present_lastBindTimestamp))
        return false;
      if (this.lastBindTimestamp != that.lastBindTimestamp)
        return false;
    }

    boolean this_present_metaData = true && this.isSetMetaData();
    boolean that_present_metaData = true && that.isSetMetaData();
    if (this_present_metaData || that_present_metaData) {
      if (!(this_present_metaData && that_present_metaData))
        return false;
      if (!this.metaData.equals(that.metaData))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCertificate()) ? 131071 : 524287);
    if (isSetCertificate())
      hashCode = hashCode * 8191 + certificate.hashCode();

    hashCode = hashCode * 8191 + ((isSetAccessToken()) ? 131071 : 524287);
    if (isSetAccessToken())
      hashCode = hashCode * 8191 + accessToken.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(lastBindTimestamp);

    hashCode = hashCode * 8191 + ((isSetMetaData()) ? 131071 : 524287);
    if (isSetMetaData())
      hashCode = hashCode * 8191 + metaData.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(QrCodeLoginResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCertificate()).compareTo(other.isSetCertificate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCertificate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.certificate, other.certificate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAccessToken()).compareTo(other.isSetAccessToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAccessToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.accessToken, other.accessToken);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLastBindTimestamp()).compareTo(other.isSetLastBindTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastBindTimestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastBindTimestamp, other.lastBindTimestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMetaData()).compareTo(other.isSetMetaData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetaData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metaData, other.metaData);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("QrCodeLoginResponse(");
    boolean first = true;

    sb.append("certificate:");
    if (this.certificate == null) {
      sb.append("null");
    } else {
      sb.append(this.certificate);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("accessToken:");
    if (this.accessToken == null) {
      sb.append("null");
    } else {
      sb.append(this.accessToken);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastBindTimestamp:");
    sb.append(this.lastBindTimestamp);
    first = false;
    if (!first) sb.append(", ");
    sb.append("metaData:");
    if (this.metaData == null) {
      sb.append("null");
    } else {
      sb.append(this.metaData);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class QrCodeLoginResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public QrCodeLoginResponseStandardScheme getScheme() {
      return new QrCodeLoginResponseStandardScheme();
    }
  }

  private static class QrCodeLoginResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<QrCodeLoginResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, QrCodeLoginResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CERTIFICATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.certificate = iprot.readString();
              struct.setCertificateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ACCESS_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.accessToken = iprot.readString();
              struct.setAccessTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LAST_BIND_TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lastBindTimestamp = iprot.readI64();
              struct.setLastBindTimestampIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // META_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.metaData = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map0.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key1;
                @org.apache.thrift.annotation.Nullable java.lang.String _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readString();
                  _val2 = iprot.readString();
                  struct.metaData.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setMetaDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, QrCodeLoginResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.certificate != null) {
        oprot.writeFieldBegin(CERTIFICATE_FIELD_DESC);
        oprot.writeString(struct.certificate);
        oprot.writeFieldEnd();
      }
      if (struct.accessToken != null) {
        oprot.writeFieldBegin(ACCESS_TOKEN_FIELD_DESC);
        oprot.writeString(struct.accessToken);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(LAST_BIND_TIMESTAMP_FIELD_DESC);
      oprot.writeI64(struct.lastBindTimestamp);
      oprot.writeFieldEnd();
      if (struct.metaData != null) {
        oprot.writeFieldBegin(META_DATA_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.metaData.size()));
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter4 : struct.metaData.entrySet())
          {
            oprot.writeString(_iter4.getKey());
            oprot.writeString(_iter4.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class QrCodeLoginResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public QrCodeLoginResponseTupleScheme getScheme() {
      return new QrCodeLoginResponseTupleScheme();
    }
  }

  private static class QrCodeLoginResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<QrCodeLoginResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, QrCodeLoginResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCertificate()) {
        optionals.set(0);
      }
      if (struct.isSetAccessToken()) {
        optionals.set(1);
      }
      if (struct.isSetLastBindTimestamp()) {
        optionals.set(2);
      }
      if (struct.isSetMetaData()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetCertificate()) {
        oprot.writeString(struct.certificate);
      }
      if (struct.isSetAccessToken()) {
        oprot.writeString(struct.accessToken);
      }
      if (struct.isSetLastBindTimestamp()) {
        oprot.writeI64(struct.lastBindTimestamp);
      }
      if (struct.isSetMetaData()) {
        {
          oprot.writeI32(struct.metaData.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter5 : struct.metaData.entrySet())
          {
            oprot.writeString(_iter5.getKey());
            oprot.writeString(_iter5.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, QrCodeLoginResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.certificate = iprot.readString();
        struct.setCertificateIsSet(true);
      }
      if (incoming.get(1)) {
        struct.accessToken = iprot.readString();
        struct.setAccessTokenIsSet(true);
      }
      if (incoming.get(2)) {
        struct.lastBindTimestamp = iprot.readI64();
        struct.setLastBindTimestampIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.metaData = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map6.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _key7;
          @org.apache.thrift.annotation.Nullable java.lang.String _val8;
          for (int _i9 = 0; _i9 < _map6.size; ++_i9)
          {
            _key7 = iprot.readString();
            _val8 = iprot.readString();
            struct.metaData.put(_key7, _val8);
          }
        }
        struct.setMetaDataIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
