/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.colak.kafkapublishertest.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class MyEventAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4902116559142802910L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MyEventAvro\",\"namespace\":\"com.colak.kafkapublishertest.avro\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"version\",\"type\":{\"type\":\"int\",\"logicalType\":\"positive-int\"}},{\"name\":\"occurredAt\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\",\"logicalType\":\"iso8601-datetime-with-offset\"}}],\"version\":1}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.UUIDConversion());
  }

  private static final BinaryMessageEncoder<MyEventAvro> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<MyEventAvro> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<MyEventAvro> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<MyEventAvro> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<MyEventAvro> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this MyEventAvro to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a MyEventAvro from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a MyEventAvro instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static MyEventAvro fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.util.UUID id;
  private int version;
  private java.lang.CharSequence occurredAt;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MyEventAvro() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param version The new value for version
   * @param occurredAt The new value for occurredAt
   */
  public MyEventAvro(java.util.UUID id, java.lang.Integer version, java.lang.CharSequence occurredAt) {
    this.id = id;
    this.version = version;
    this.occurredAt = occurredAt;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return version;
    case 2: return occurredAt;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      new org.apache.avro.Conversions.UUIDConversion(),
      null,
      null,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.util.UUID)value$; break;
    case 1: version = (java.lang.Integer)value$; break;
    case 2: occurredAt = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.util.UUID getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.util.UUID value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'version' field.
   * @return The value of the 'version' field.
   */
  public int getVersion() {
    return version;
  }


  /**
   * Sets the value of the 'version' field.
   * @param value the value to set.
   */
  public void setVersion(int value) {
    this.version = value;
  }

  /**
   * Gets the value of the 'occurredAt' field.
   * @return The value of the 'occurredAt' field.
   */
  public java.lang.CharSequence getOccurredAt() {
    return occurredAt;
  }


  /**
   * Sets the value of the 'occurredAt' field.
   * @param value the value to set.
   */
  public void setOccurredAt(java.lang.CharSequence value) {
    this.occurredAt = value;
  }

  /**
   * Creates a new MyEventAvro RecordBuilder.
   * @return A new MyEventAvro RecordBuilder
   */
  public static com.colak.kafkapublishertest.avro.MyEventAvro.Builder newBuilder() {
    return new com.colak.kafkapublishertest.avro.MyEventAvro.Builder();
  }

  /**
   * Creates a new MyEventAvro RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MyEventAvro RecordBuilder
   */
  public static com.colak.kafkapublishertest.avro.MyEventAvro.Builder newBuilder(com.colak.kafkapublishertest.avro.MyEventAvro.Builder other) {
    if (other == null) {
      return new com.colak.kafkapublishertest.avro.MyEventAvro.Builder();
    } else {
      return new com.colak.kafkapublishertest.avro.MyEventAvro.Builder(other);
    }
  }

  /**
   * Creates a new MyEventAvro RecordBuilder by copying an existing MyEventAvro instance.
   * @param other The existing instance to copy.
   * @return A new MyEventAvro RecordBuilder
   */
  public static com.colak.kafkapublishertest.avro.MyEventAvro.Builder newBuilder(com.colak.kafkapublishertest.avro.MyEventAvro other) {
    if (other == null) {
      return new com.colak.kafkapublishertest.avro.MyEventAvro.Builder();
    } else {
      return new com.colak.kafkapublishertest.avro.MyEventAvro.Builder(other);
    }
  }

  /**
   * RecordBuilder for MyEventAvro instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MyEventAvro>
    implements org.apache.avro.data.RecordBuilder<MyEventAvro> {

    private java.util.UUID id;
    private int version;
    private java.lang.CharSequence occurredAt;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.colak.kafkapublishertest.avro.MyEventAvro.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.version)) {
        this.version = data().deepCopy(fields()[1].schema(), other.version);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.occurredAt)) {
        this.occurredAt = data().deepCopy(fields()[2].schema(), other.occurredAt);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing MyEventAvro instance
     * @param other The existing instance to copy.
     */
    private Builder(com.colak.kafkapublishertest.avro.MyEventAvro other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.version)) {
        this.version = data().deepCopy(fields()[1].schema(), other.version);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.occurredAt)) {
        this.occurredAt = data().deepCopy(fields()[2].schema(), other.occurredAt);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.util.UUID getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.colak.kafkapublishertest.avro.MyEventAvro.Builder setId(java.util.UUID value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.colak.kafkapublishertest.avro.MyEventAvro.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'version' field.
      * @return The value.
      */
    public int getVersion() {
      return version;
    }


    /**
      * Sets the value of the 'version' field.
      * @param value The value of 'version'.
      * @return This builder.
      */
    public com.colak.kafkapublishertest.avro.MyEventAvro.Builder setVersion(int value) {
      validate(fields()[1], value);
      this.version = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'version' field has been set.
      * @return True if the 'version' field has been set, false otherwise.
      */
    public boolean hasVersion() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'version' field.
      * @return This builder.
      */
    public com.colak.kafkapublishertest.avro.MyEventAvro.Builder clearVersion() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'occurredAt' field.
      * @return The value.
      */
    public java.lang.CharSequence getOccurredAt() {
      return occurredAt;
    }


    /**
      * Sets the value of the 'occurredAt' field.
      * @param value The value of 'occurredAt'.
      * @return This builder.
      */
    public com.colak.kafkapublishertest.avro.MyEventAvro.Builder setOccurredAt(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.occurredAt = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'occurredAt' field has been set.
      * @return True if the 'occurredAt' field has been set, false otherwise.
      */
    public boolean hasOccurredAt() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'occurredAt' field.
      * @return This builder.
      */
    public com.colak.kafkapublishertest.avro.MyEventAvro.Builder clearOccurredAt() {
      occurredAt = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public MyEventAvro build() {
      try {
        MyEventAvro record = new MyEventAvro();
        record.id = fieldSetFlags()[0] ? this.id : (java.util.UUID) defaultValue(fields()[0]);
        record.version = fieldSetFlags()[1] ? this.version : (java.lang.Integer) defaultValue(fields()[1]);
        record.occurredAt = fieldSetFlags()[2] ? this.occurredAt : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<MyEventAvro>
    WRITER$ = (org.apache.avro.io.DatumWriter<MyEventAvro>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<MyEventAvro>
    READER$ = (org.apache.avro.io.DatumReader<MyEventAvro>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}









