private TestObject(String value) { [EOL]     this.someStringValue = value; [EOL] } <line_num>: 59,61
private TestObjectWrapper(TestObjectInterface obj) { [EOL]     this.obj = obj; [EOL] } <line_num>: 68,70
@Override [EOL] protected void setUp() throws Exception { [EOL]     super.setUp(); [EOL]     gson = new Gson(); [EOL]     obj = new TestObject("StringValue"); [EOL] } <line_num>: 35,40
public void testSerializingObjectImplementingInterface() throws Exception { [EOL]     assertEquals(OBJ_JSON, gson.toJson(obj)); [EOL] } <line_num>: 42,44
public void testSerializingInterfaceObjectField() throws Exception { [EOL]     TestObjectWrapper objWrapper = new TestObjectWrapper(obj); [EOL]     assertEquals("{\"obj\":" + OBJ_JSON + "}", gson.toJson(objWrapper)); [EOL] } <line_num>: 46,49
