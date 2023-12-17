public Identifiable()
public Identifiable(int v)
public IdentifiableWithProp()
public IdentifiableWithProp(int id, int value)
public IdWrapper()
public IdWrapper(int v)
public ValueNode()
public ValueNode(int v)
public IdWrapperCustom()
public IdWrapperCustom(int id, int value)
public ValueNodeCustom()
public ValueNodeCustom(int id, int value)
public AlwaysAsId()
public AlwaysAsId(int v)
public TreeNode()
public TreeNode(TreeNode p, int id, String name)
public int getId()
public void testSimpleSerializationClass() throws Exception
public void testSimpleSerializationProperty() throws Exception
public void testCustomPropertyForClass() throws Exception
public void testCustomPropertyViaProperty() throws Exception
public void testAlwaysAsId() throws Exception
public void testAlwaysIdForTree() throws Exception
public void testInvalidProp() throws Exception
String EXP_SIMPLE_INT_CLASS=Optional["{\"id\":1,\"value\":13,\"next\":1}"]
ObjectMapper MAPPER=Optional[new ObjectMapper()]
String EXP_SIMPLE_INT_PROP=Optional["{\"node\":{\"@id\":1,\"value\":7,\"next\":{\"node\":1}}}"]
String EXP_CUSTOM_PROP=Optional["{\"customId\":123,\"value\":-19,\"next\":123}"]
String EXP_CUSTOM_PROP_VIA_REF=Optional["{\"node\":{\"id\":123,\"value\":7,\"next\":{\"node\":123}}}"]
