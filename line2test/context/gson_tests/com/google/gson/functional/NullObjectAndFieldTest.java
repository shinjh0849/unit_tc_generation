protected void setUp() throws Exception
public void testTopLevelNullObjectSerialization()
public void testTopLevelNullObjectDeserialization() throws Exception
public void testExplicitSerializationOfNulls()
public void testExplicitDeserializationOfNulls() throws Exception
public void testExplicitSerializationOfNullArrayMembers()
public void testNullWrappedPrimitiveMemberSerialization()
public void testNullWrappedPrimitiveMemberDeserialization()
public void testExplicitSerializationOfNullCollectionMembers()
public void testExplicitSerializationOfNullStringMembers()
public void testCustomSerializationOfNulls()
public void testPrintPrintingObjectWithNulls() throws Exception
public void testPrintPrintingArraysWithNulls() throws Exception
public JsonElement serialize(ClassWithObjects src, Type typeOfSrc, JsonSerializationContext context)
public void testExplicitNullSetsFieldToNullDuringDeserialization()
public JsonElement serialize(ObjectWithField src, Type typeOfSrc, JsonSerializationContext context)
public void testCustomTypeAdapterPassesNullSerialization()
public ObjectWithField deserialize(JsonElement json, Type type, JsonDeserializationContext context)
public void testCustomTypeAdapterPassesNullDesrialization()
GsonBuilder gsonBuilder
