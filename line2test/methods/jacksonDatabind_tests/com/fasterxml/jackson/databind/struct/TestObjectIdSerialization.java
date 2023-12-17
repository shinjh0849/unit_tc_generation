public Identifiable() { [EOL]     this(0); [EOL] } <line_num>: 22,22
public Identifiable(int v) { [EOL]     value = v; [EOL] } <line_num>: 23,25
public IdentifiableWithProp() { [EOL]     this(0, 0); [EOL] } <line_num>: 38,38
public IdentifiableWithProp(int id, int value) { [EOL]     this.customId = id; [EOL]     this.value = value; [EOL] } <line_num>: 39,42
public IdWrapper() { [EOL] } <line_num>: 52,52
public IdWrapper(int v) { [EOL]     node = new ValueNode(v); [EOL] } <line_num>: 53,55
public ValueNode() { [EOL]     this(0); [EOL] } <line_num>: 62,62
public ValueNode(int v) { [EOL]     value = v; [EOL] } <line_num>: 63,63
public IdWrapperCustom() { [EOL] } <line_num>: 73,73
public IdWrapperCustom(int id, int value) { [EOL]     node = new ValueNodeCustom(id, value); [EOL] } <line_num>: 74,76
public ValueNodeCustom() { [EOL]     this(0, 0); [EOL] } <line_num>: 86,86
public ValueNodeCustom(int id, int value) { [EOL]     this.id = id; [EOL]     this.value = value; [EOL] } <line_num>: 87,90
public AlwaysAsId() { [EOL]     this(0); [EOL] } <line_num>: 98,98
public AlwaysAsId(int v) { [EOL]     value = v; [EOL] } <line_num>: 99,101
public TreeNode() { [EOL] } <line_num>: 132,132
public TreeNode(TreeNode p, int id, String name) { [EOL]     parent = p; [EOL]     this.id = id; [EOL]     this.name = name; [EOL] } <line_num>: 133,137
public int getId() { [EOL]     return id; [EOL] } <line_num>: 84,84
public void testSimpleSerializationClass() throws Exception { [EOL]     Identifiable src = new Identifiable(13); [EOL]     src.next = src; [EOL]     String json = MAPPER.writeValueAsString(src); [EOL]     assertEquals(EXP_SIMPLE_INT_CLASS, json); [EOL]     json = MAPPER.writeValueAsString(src); [EOL]     assertEquals(EXP_SIMPLE_INT_CLASS, json); [EOL] } <line_num>: 160,172
public void testSimpleSerializationProperty() throws Exception { [EOL]     IdWrapper src = new IdWrapper(7); [EOL]     src.node.next = src; [EOL]     String json = MAPPER.writeValueAsString(src); [EOL]     assertEquals(EXP_SIMPLE_INT_PROP, json); [EOL]     json = MAPPER.writeValueAsString(src); [EOL]     assertEquals(EXP_SIMPLE_INT_PROP, json); [EOL] } <line_num>: 177,188
public void testCustomPropertyForClass() throws Exception { [EOL]     IdentifiableWithProp src = new IdentifiableWithProp(123, -19); [EOL]     src.next = src; [EOL]     String json = MAPPER.writeValueAsString(src); [EOL]     assertEquals(EXP_CUSTOM_PROP, json); [EOL]     json = MAPPER.writeValueAsString(src); [EOL]     assertEquals(EXP_CUSTOM_PROP, json); [EOL] } <line_num>: 198,210
public void testCustomPropertyViaProperty() throws Exception { [EOL]     IdWrapperCustom src = new IdWrapperCustom(123, 7); [EOL]     src.node.next = src; [EOL]     String json = MAPPER.writeValueAsString(src); [EOL]     assertEquals(EXP_CUSTOM_PROP_VIA_REF, json); [EOL]     json = MAPPER.writeValueAsString(src); [EOL]     assertEquals(EXP_CUSTOM_PROP_VIA_REF, json); [EOL] } <line_num>: 214,225
public void testAlwaysAsId() throws Exception { [EOL]     String json = MAPPER.writeValueAsString(new AlwaysContainer()); [EOL]     assertEquals("{\"a\":1,\"b\":2}", json); [EOL] } <line_num>: 227,231
public void testAlwaysIdForTree() throws Exception { [EOL]     TreeNode root = new TreeNode(null, 1, "root"); [EOL]     TreeNode leaf = new TreeNode(root, 2, "leaf"); [EOL]     root.child = leaf; [EOL]     String json = MAPPER.writeValueAsString(root); [EOL]     assertEquals("{\"id\":1,\"name\":\"root\",\"parent\":null,\"child\":" + "{\"id\":2,\"name\":\"leaf\",\"parent\":1,\"child\":null}}", json); [EOL] } <line_num>: 233,244
public void testInvalidProp() throws Exception { [EOL]     try { [EOL]         MAPPER.writeValueAsString(new Broken()); [EOL]         fail("Should have thrown an exception"); [EOL]     } catch (JsonMappingException e) { [EOL]         verifyException(e, "can not find property with name 'id'"); [EOL]     } [EOL] } <line_num>: 252,260
