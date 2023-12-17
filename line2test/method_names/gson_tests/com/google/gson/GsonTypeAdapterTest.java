protected void setUp() throws Exception
public void testDefaultTypeAdapterThrowsParseException() throws Exception
public void testTypeAdapterThrowsException() throws Exception
public void testTypeAdapterProperlyConvertsTypes() throws Exception
public void testTypeAdapterDoesNotAffectNonAdaptedTypes() throws Exception
public JsonElement serialize(AtomicLong src, Type typeOfSrc, JsonSerializationContext context)
public AtomicLong deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public JsonElement serialize(AtomicInteger src, Type typeOfSrc, JsonSerializationContext context)
public AtomicInteger deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
