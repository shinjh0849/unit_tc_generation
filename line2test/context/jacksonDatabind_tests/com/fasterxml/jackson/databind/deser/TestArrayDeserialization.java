private Bean1()
public Bean1(int x, int y, List<Bean2> beans)
public Bean2(String d)
public NonDeserializable(String v, boolean bogus)
public int getX()
public int getY()
public List<Bean2> getBeans()
public void setX(int x)
public void setY(int y)
public void setBeans(List<Bean2> b)
public boolean equals(Object o)
public void serialize(JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public String toString()
public boolean equals(Object o)
public void serializeWithType(JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonProcessingException
public NonDeserializable[] deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException
public void testUntypedArray() throws Exception
public void testIntegerArray() throws Exception
public void testFromEmptyString() throws Exception
public void testFromEmptyString2() throws Exception
public void testUntypedArrayOfArrays() throws Exception
public void testStringArray() throws Exception
public void testCharArray() throws Exception
public void testBooleanArray() throws Exception
public void testByteArrayAsNumbers() throws Exception
public void testByteArrayAsBase64() throws Exception
public void testByteArraysAsBase64() throws Exception
public void testByteArraysWith763() throws Exception
public void testShortArray() throws Exception
public void testIntArray() throws Exception
public void testLongArray() throws Exception
public void testDoubleArray() throws Exception
public void testFloatArray() throws Exception
public void testBeanArray() throws Exception
public void testCustomDeserializers() throws Exception
ObjectMapper MAPPER=Optional[new ObjectMapper()]
