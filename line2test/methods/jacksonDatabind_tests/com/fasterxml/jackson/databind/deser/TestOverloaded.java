BaseListBean() { [EOL] } <line_num>: 21,21
ArrayListBean() { [EOL] } <line_num>: 28,28
public void setList(List<String> l) { [EOL]     list = l; [EOL] } <line_num>: 23,23
public void setList(ArrayList<String> l) { [EOL]     super.setList(l); [EOL] } <line_num>: 30,30
public void setValue(Number n) { [EOL]     value = n; [EOL] } <line_num>: 49,49
public void setValue(String str) { [EOL]     value = str; [EOL] } <line_num>: 53,53
@JsonProperty [EOL] public void setValue(String str) { [EOL]     _value = str; [EOL] } <line_num>: 61,62
public void setValue(Object o) { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 65,65
public void setA(ArrayList<Object> a) { [EOL] } <line_num>: 72,72
public void setA(LinkedList<Object> a) { [EOL] } <line_num>: 73,73
public void testSpecialization() throws Exception { [EOL]     ArrayListBean bean = MAPPER.readValue("{\"list\":[\"a\",\"b\",\"c\"]}", ArrayListBean.class); [EOL]     assertNotNull(bean.list); [EOL]     assertEquals(3, bean.list.size()); [EOL]     assertEquals(ArrayList.class, bean.list.getClass()); [EOL]     assertEquals("a", bean.list.get(0)); [EOL]     assertEquals("b", bean.list.get(1)); [EOL]     assertEquals("c", bean.list.get(2)); [EOL] } <line_num>: 106,116
public void testOverride() throws Exception { [EOL]     WasNumberBean bean = MAPPER.readValue("{\"value\" : \"abc\"}", WasNumberBean.class); [EOL]     assertNotNull(bean); [EOL]     assertEquals("abc", bean.value); [EOL] } <line_num>: 122,128
public void testConflictResolution() throws Exception { [EOL]     Overloaded739 bean = MAPPER.readValue("{\"value\":\"abc\"}", Overloaded739.class); [EOL]     assertNotNull(bean); [EOL]     assertEquals("abc", bean._value); [EOL] } <line_num>: 131,137
public void testSetterConflict() throws Exception { [EOL]     try { [EOL]         MAPPER.readValue("{ }", ConflictBean.class); [EOL]     } catch (Exception e) { [EOL]         verifyException(e, "Conflicting setter definitions"); [EOL]     } [EOL] } <line_num>: 148,155
