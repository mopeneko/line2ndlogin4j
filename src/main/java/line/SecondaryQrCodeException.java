/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package line;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-05-20")
public class SecondaryQrCodeException extends org.apache.thrift.TException implements org.apache.thrift.TBase<SecondaryQrCodeException, SecondaryQrCodeException._Fields>, java.io.Serializable, Cloneable, Comparable<SecondaryQrCodeException> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SecondaryQrCodeException");

  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ALERT_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("alertMessage", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SecondaryQrCodeExceptionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SecondaryQrCodeExceptionTupleSchemeFactory();

  /**
   * 
   * @see ErrorCode
   */
  public @org.apache.thrift.annotation.Nullable ErrorCode code; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String alertMessage; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see ErrorCode
     */
    CODE((short)1, "code"),
    ALERT_MESSAGE((short)2, "alertMessage");

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
        case 1: // CODE
          return CODE;
        case 2: // ALERT_MESSAGE
          return ALERT_MESSAGE;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ErrorCode.class)));
    tmpMap.put(_Fields.ALERT_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("alertMessage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SecondaryQrCodeException.class, metaDataMap);
  }

  public SecondaryQrCodeException() {
  }

  public SecondaryQrCodeException(
    ErrorCode code,
    java.lang.String alertMessage)
  {
    this();
    this.code = code;
    this.alertMessage = alertMessage;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SecondaryQrCodeException(SecondaryQrCodeException other) {
    if (other.isSetCode()) {
      this.code = other.code;
    }
    if (other.isSetAlertMessage()) {
      this.alertMessage = other.alertMessage;
    }
  }

  public SecondaryQrCodeException deepCopy() {
    return new SecondaryQrCodeException(this);
  }

  @Override
  public void clear() {
    this.code = null;
    this.alertMessage = null;
  }

  /**
   * 
   * @see ErrorCode
   */
  @org.apache.thrift.annotation.Nullable
  public ErrorCode getCode() {
    return this.code;
  }

  /**
   * 
   * @see ErrorCode
   */
  public SecondaryQrCodeException setCode(@org.apache.thrift.annotation.Nullable ErrorCode code) {
    this.code = code;
    return this;
  }

  public void unsetCode() {
    this.code = null;
  }

  /** Returns true if field code is set (has been assigned a value) and false otherwise */
  public boolean isSetCode() {
    return this.code != null;
  }

  public void setCodeIsSet(boolean value) {
    if (!value) {
      this.code = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getAlertMessage() {
    return this.alertMessage;
  }

  public SecondaryQrCodeException setAlertMessage(@org.apache.thrift.annotation.Nullable java.lang.String alertMessage) {
    this.alertMessage = alertMessage;
    return this;
  }

  public void unsetAlertMessage() {
    this.alertMessage = null;
  }

  /** Returns true if field alertMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetAlertMessage() {
    return this.alertMessage != null;
  }

  public void setAlertMessageIsSet(boolean value) {
    if (!value) {
      this.alertMessage = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((ErrorCode)value);
      }
      break;

    case ALERT_MESSAGE:
      if (value == null) {
        unsetAlertMessage();
      } else {
        setAlertMessage((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CODE:
      return getCode();

    case ALERT_MESSAGE:
      return getAlertMessage();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CODE:
      return isSetCode();
    case ALERT_MESSAGE:
      return isSetAlertMessage();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SecondaryQrCodeException)
      return this.equals((SecondaryQrCodeException)that);
    return false;
  }

  public boolean equals(SecondaryQrCodeException that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_code = true && this.isSetCode();
    boolean that_present_code = true && that.isSetCode();
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code))
        return false;
      if (!this.code.equals(that.code))
        return false;
    }

    boolean this_present_alertMessage = true && this.isSetAlertMessage();
    boolean that_present_alertMessage = true && that.isSetAlertMessage();
    if (this_present_alertMessage || that_present_alertMessage) {
      if (!(this_present_alertMessage && that_present_alertMessage))
        return false;
      if (!this.alertMessage.equals(that.alertMessage))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCode()) ? 131071 : 524287);
    if (isSetCode())
      hashCode = hashCode * 8191 + code.getValue();

    hashCode = hashCode * 8191 + ((isSetAlertMessage()) ? 131071 : 524287);
    if (isSetAlertMessage())
      hashCode = hashCode * 8191 + alertMessage.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SecondaryQrCodeException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, other.code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAlertMessage()).compareTo(other.isSetAlertMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAlertMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.alertMessage, other.alertMessage);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SecondaryQrCodeException(");
    boolean first = true;

    sb.append("code:");
    if (this.code == null) {
      sb.append("null");
    } else {
      sb.append(this.code);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("alertMessage:");
    if (this.alertMessage == null) {
      sb.append("null");
    } else {
      sb.append(this.alertMessage);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SecondaryQrCodeExceptionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SecondaryQrCodeExceptionStandardScheme getScheme() {
      return new SecondaryQrCodeExceptionStandardScheme();
    }
  }

  private static class SecondaryQrCodeExceptionStandardScheme extends org.apache.thrift.scheme.StandardScheme<SecondaryQrCodeException> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SecondaryQrCodeException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.code = line.ErrorCode.findByValue(iprot.readI32());
              struct.setCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ALERT_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.alertMessage = iprot.readString();
              struct.setAlertMessageIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SecondaryQrCodeException struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.code != null) {
        oprot.writeFieldBegin(CODE_FIELD_DESC);
        oprot.writeI32(struct.code.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.alertMessage != null) {
        oprot.writeFieldBegin(ALERT_MESSAGE_FIELD_DESC);
        oprot.writeString(struct.alertMessage);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SecondaryQrCodeExceptionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SecondaryQrCodeExceptionTupleScheme getScheme() {
      return new SecondaryQrCodeExceptionTupleScheme();
    }
  }

  private static class SecondaryQrCodeExceptionTupleScheme extends org.apache.thrift.scheme.TupleScheme<SecondaryQrCodeException> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SecondaryQrCodeException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCode()) {
        optionals.set(0);
      }
      if (struct.isSetAlertMessage()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCode()) {
        oprot.writeI32(struct.code.getValue());
      }
      if (struct.isSetAlertMessage()) {
        oprot.writeString(struct.alertMessage);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SecondaryQrCodeException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.code = line.ErrorCode.findByValue(iprot.readI32());
        struct.setCodeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.alertMessage = iprot.readString();
        struct.setAlertMessageIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

