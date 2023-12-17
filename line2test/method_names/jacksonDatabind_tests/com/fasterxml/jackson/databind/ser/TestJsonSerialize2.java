public SimpleKey(String str)
public SimpleValue(String str)
public ActualValue(String str)
public ListWrapperSimple(String value)
public ListWrapperWithSerializer(String value)
public MapWrapperSimple(String key, String value)
public MapWrapperWithSerializer(String key, String value)
public String toString()
public void serialize(SimpleKey key, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException
public void serialize(SimpleValue value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException
public void testSerializedAsListWithClassAnnotations() throws IOException
public void testSerializedAsMapWithClassAnnotations() throws IOException
public void testSerializedAsListWithClassSerializer() throws IOException
public void testSerializedAsListWithPropertyAnnotations() throws IOException
public void testSerializedAsMapWithClassSerializer() throws IOException
public void testSerializedAsMapWithPropertyAnnotations() throws IOException
public void testSerializedAsListWithPropertyAnnotations2() throws IOException
public void testSerializedAsMapWithPropertyAnnotations2() throws IOException
public void testEmptyInclusion() throws IOException
public void testNullSerializer() throws Exception
