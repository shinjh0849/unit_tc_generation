protected PrimitiveArrayDeserializers(Class<T> cls)
public CharDeser()
public BooleanDeser()
public ByteDeser()
public ShortDeser()
public IntDeser()
public LongDeser()
public FloatDeser()
public DoubleDeser()
public static JsonDeserializer<?> forType(Class<?> rawType)
public Object deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException, JsonProcessingException
public char[] deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public boolean[] deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
private final boolean[] handleNonArray(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public byte[] deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
private final byte[] handleNonArray(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public short[] deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
private final short[] handleNonArray(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public int[] deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
private final int[] handleNonArray(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public long[] deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
private final long[] handleNonArray(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public float[] deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
private final float[] handleNonArray(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public double[] deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
private final double[] handleNonArray(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
