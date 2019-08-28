/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Trade extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8664958261795046365L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Trade\",\"fields\":[{\"name\":\"trade_id\",\"type\":\"string\"},{\"name\":\"book_id\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Trade> ENCODER =
      new BinaryMessageEncoder<Trade>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Trade> DECODER =
      new BinaryMessageDecoder<Trade>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Trade> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Trade> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Trade> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Trade>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Trade to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Trade from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Trade instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Trade fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence trade_id;
  @Deprecated public java.lang.CharSequence book_id;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Trade() {}

  /**
   * All-args constructor.
   * @param trade_id The new value for trade_id
   * @param book_id The new value for book_id
   */
  public Trade(java.lang.CharSequence trade_id, java.lang.CharSequence book_id) {
    this.trade_id = trade_id;
    this.book_id = book_id;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return trade_id;
    case 1: return book_id;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: trade_id = (java.lang.CharSequence)value$; break;
    case 1: book_id = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'trade_id' field.
   * @return The value of the 'trade_id' field.
   */
  public java.lang.CharSequence getTradeId() {
    return trade_id;
  }


  /**
   * Sets the value of the 'trade_id' field.
   * @param value the value to set.
   */
  public void setTradeId(java.lang.CharSequence value) {
    this.trade_id = value;
  }

  /**
   * Gets the value of the 'book_id' field.
   * @return The value of the 'book_id' field.
   */
  public java.lang.CharSequence getBookId() {
    return book_id;
  }


  /**
   * Sets the value of the 'book_id' field.
   * @param value the value to set.
   */
  public void setBookId(java.lang.CharSequence value) {
    this.book_id = value;
  }

  /**
   * Creates a new Trade RecordBuilder.
   * @return A new Trade RecordBuilder
   */
  public static Trade.Builder newBuilder() {
    return new Trade.Builder();
  }

  /**
   * Creates a new Trade RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Trade RecordBuilder
   */
  public static Trade.Builder newBuilder(Trade.Builder other) {
    if (other == null) {
      return new Trade.Builder();
    } else {
      return new Trade.Builder(other);
    }
  }

  /**
   * Creates a new Trade RecordBuilder by copying an existing Trade instance.
   * @param other The existing instance to copy.
   * @return A new Trade RecordBuilder
   */
  public static Trade.Builder newBuilder(Trade other) {
    if (other == null) {
      return new Trade.Builder();
    } else {
      return new Trade.Builder(other);
    }
  }

  /**
   * RecordBuilder for Trade instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Trade>
    implements org.apache.avro.data.RecordBuilder<Trade> {

    private java.lang.CharSequence trade_id;
    private java.lang.CharSequence book_id;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Trade.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.trade_id)) {
        this.trade_id = data().deepCopy(fields()[0].schema(), other.trade_id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.book_id)) {
        this.book_id = data().deepCopy(fields()[1].schema(), other.book_id);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing Trade instance
     * @param other The existing instance to copy.
     */
    private Builder(Trade other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.trade_id)) {
        this.trade_id = data().deepCopy(fields()[0].schema(), other.trade_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.book_id)) {
        this.book_id = data().deepCopy(fields()[1].schema(), other.book_id);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'trade_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getTradeId() {
      return trade_id;
    }


    /**
      * Sets the value of the 'trade_id' field.
      * @param value The value of 'trade_id'.
      * @return This builder.
      */
    public Trade.Builder setTradeId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.trade_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'trade_id' field has been set.
      * @return True if the 'trade_id' field has been set, false otherwise.
      */
    public boolean hasTradeId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'trade_id' field.
      * @return This builder.
      */
    public Trade.Builder clearTradeId() {
      trade_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'book_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getBookId() {
      return book_id;
    }


    /**
      * Sets the value of the 'book_id' field.
      * @param value The value of 'book_id'.
      * @return This builder.
      */
    public Trade.Builder setBookId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.book_id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'book_id' field has been set.
      * @return True if the 'book_id' field has been set, false otherwise.
      */
    public boolean hasBookId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'book_id' field.
      * @return This builder.
      */
    public Trade.Builder clearBookId() {
      book_id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Trade build() {
      try {
        Trade record = new Trade();
        record.trade_id = fieldSetFlags()[0] ? this.trade_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.book_id = fieldSetFlags()[1] ? this.book_id : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Trade>
    WRITER$ = (org.apache.avro.io.DatumWriter<Trade>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Trade>
    READER$ = (org.apache.avro.io.DatumReader<Trade>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.trade_id);

    out.writeString(this.book_id);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.trade_id = in.readString(this.trade_id instanceof Utf8 ? (Utf8)this.trade_id : null);

      this.book_id = in.readString(this.book_id instanceof Utf8 ? (Utf8)this.book_id : null);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.trade_id = in.readString(this.trade_id instanceof Utf8 ? (Utf8)this.trade_id : null);
          break;

        case 1:
          this.book_id = in.readString(this.book_id instanceof Utf8 ? (Utf8)this.book_id : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










