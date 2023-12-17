public Identifiable()
public Identifiable(int v)
public UUIDNode()
public UUIDNode(int v)
public IdWrapper()
public IdWrapper(int v)
public ValueNode()
public ValueNode(int v)
public IdentifiableCustom()
public IdentifiableCustom(int i, int v)
public IdWrapperExt()
public IdWrapperExt(int v)
public ValueNodeExt()
public ValueNodeExt(int v)
public void setCustomId(int i)
public void testSimpleDeserializationClass() throws Exception
public void testSimpleUUIDForClassRoundTrip() throws Exception
public void testSimpleDeserializationProperty() throws Exception
public void testSimpleDeserWithForwardRefs() throws Exception
public void testCustomDeserializationClass() throws Exception
public void testCustomDeserializationProperty() throws Exception
ObjectMapper mapper=Optional[new ObjectMapper()]
String EXP_SIMPLE_INT_CLASS=Optional["{\"id\":1,\"value\":13,\"next\":1}"]
String EXP_SIMPLE_INT_PROP=Optional["{\"node\":{\"@id\":1,\"value\":7,\"next\":{\"node\":1}}}"]
String EXP_CUSTOM_VIA_CLASS=Optional["{\"customId\":123,\"value\":-900,\"next\":123}"]
String EXP_CUSTOM_VIA_PROP=Optional["{\"node\":{\"customId\":3,\"value\":99,\"next\":{\"node\":3}}}"]
