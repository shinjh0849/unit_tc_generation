public Identifiable() { [EOL]     this(0); [EOL] } <line_num>: 22,22
public Identifiable(int v) { [EOL]     value = v; [EOL] } <line_num>: 23,25
public UUIDNode() { [EOL]     this(0); [EOL] } <line_num>: 36,36
public UUIDNode(int v) { [EOL]     value = v; [EOL] } <line_num>: 37,37
public IdWrapper() { [EOL] } <line_num>: 47,47
public IdWrapper(int v) { [EOL]     node = new ValueNode(v); [EOL] } <line_num>: 48,50
public ValueNode() { [EOL]     this(0); [EOL] } <line_num>: 57,57
public ValueNode(int v) { [EOL]     value = v; [EOL] } <line_num>: 58,58
public IdentifiableCustom() { [EOL]     this(-1, 0); [EOL] } <line_num>: 72,72
public IdentifiableCustom(int i, int v) { [EOL]     customId = i; [EOL]     value = v; [EOL] } <line_num>: 73,76
public IdWrapperExt() { [EOL] } <line_num>: 85,85
public IdWrapperExt(int v) { [EOL]     node = new ValueNodeExt(v); [EOL] } <line_num>: 86,88
public ValueNodeExt() { [EOL]     this(0); [EOL] } <line_num>: 97,97
public ValueNodeExt(int v) { [EOL]     value = v; [EOL] } <line_num>: 98,98
public void setCustomId(int i) { [EOL]     customId = i; [EOL] } <line_num>: 100,102
public void testSimpleDeserializationClass() throws Exception { [EOL]     Identifiable result = mapper.readValue(EXP_SIMPLE_INT_CLASS, Identifiable.class); [EOL]     assertEquals(13, result.value); [EOL]     assertSame(result, result.next); [EOL] } <line_num>: 115,121
public void testSimpleUUIDForClassRoundTrip() throws Exception { [EOL]     UUIDNode root = new UUIDNode(1); [EOL]     UUIDNode child1 = new UUIDNode(2); [EOL]     UUIDNode child2 = new UUIDNode(3); [EOL]     root.first = child1; [EOL]     root.second = child2; [EOL]     child1.parent = root; [EOL]     child2.parent = root; [EOL]     child1.first = child2; [EOL]     String json = mapper.writeValueAsString(root); [EOL]     UUIDNode result = mapper.readValue(json, UUIDNode.class); [EOL]     assertEquals(1, result.value); [EOL]     UUIDNode result2 = result.first; [EOL]     UUIDNode result3 = result.second; [EOL]     assertNotNull(result2); [EOL]     assertNotNull(result3); [EOL]     assertEquals(2, result2.value); [EOL]     assertEquals(3, result3.value); [EOL]     assertSame(result, result2.parent); [EOL]     assertSame(result, result3.parent); [EOL]     assertSame(result3, result2.first); [EOL] } <line_num>: 123,149
public void testSimpleDeserializationProperty() throws Exception { [EOL]     IdWrapper result = mapper.readValue(EXP_SIMPLE_INT_PROP, IdWrapper.class); [EOL]     assertEquals(7, result.node.value); [EOL]     assertSame(result.node, result.node.next.node); [EOL] } <line_num>: 154,159
public void testSimpleDeserWithForwardRefs() throws Exception { [EOL]     IdWrapper result = mapper.readValue("{\"node\":{\"value\":7,\"next\":{\"node\":1}, \"@id\":1}}", IdWrapper.class); [EOL]     assertEquals(7, result.node.value); [EOL]     assertSame(result.node, result.node.next.node); [EOL] } <line_num>: 162,168
public void testCustomDeserializationClass() throws Exception { [EOL]     IdentifiableCustom result = mapper.readValue(EXP_CUSTOM_VIA_CLASS, IdentifiableCustom.class); [EOL]     assertEquals(-900, result.value); [EOL]     assertSame(result, result.next); [EOL] } <line_num>: 178,184
public void testCustomDeserializationProperty() throws Exception { [EOL]     IdWrapperExt result = mapper.readValue(EXP_CUSTOM_VIA_PROP, IdWrapperExt.class); [EOL]     assertEquals(99, result.node.value); [EOL]     assertSame(result.node, result.node.next.node); [EOL]     assertEquals(3, result.node.customId); [EOL] } <line_num>: 188,195
