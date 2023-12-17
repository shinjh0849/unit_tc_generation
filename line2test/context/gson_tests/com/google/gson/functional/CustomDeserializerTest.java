private DataHolder()
public DataHolder(String data)
private DataHolderWrapper()
public DataHolderWrapper(DataHolder data)
private SubTypes(Type subClass)
protected void setUp() throws Exception
public void testDefaultConstructorNotCalledOnObject() throws Exception
public void testDefaultConstructorNotCalledOnField() throws Exception
public String getData()
public DataHolder getWrappedData()
public DataHolder deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public MyBase deserialize(JsonElement json, Type pojoType, JsonDeserializationContext context) throws JsonParseException
public void testJsonTypeFieldBasedDeserialization()
public Type getSubclass()
public Base deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public void testCustomDeserializerReturnsNullForTopLevelObject()
public Base deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public void testCustomDeserializerReturnsNull()
public Long deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public void testCustomDeserializerReturnsNullForTopLevelPrimitives()
public Long deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public void testCustomDeserializerReturnsNullForPrimitiveFields()
public Base deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public void testCustomDeserializerReturnsNullForArrayElements()
public Base deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public void testCustomDeserializerReturnsNullForArrayElementsForArrayField()
String DEFAULT_VALUE=Optional["test123"]
String SUFFIX=Optional["blah"]
Gson gson
