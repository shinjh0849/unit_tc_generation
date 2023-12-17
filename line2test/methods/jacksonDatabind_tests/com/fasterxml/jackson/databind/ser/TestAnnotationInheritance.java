@JsonProperty [EOL] public int width() { [EOL]     return 3; [EOL] } <line_num>: 26,26
@JsonProperty [EOL] public int length() { [EOL]     return 7; [EOL] } <line_num>: 27,27
@JsonProperty [EOL] int width(); <line_num>: 41,41
@JsonProperty [EOL] int length(); <line_num>: 42,42
@Override [EOL] public int width() { [EOL]     return 9; [EOL] } <line_num>: 54,55
@Override [EOL] public int width() { [EOL]     return 1; [EOL] } <line_num>: 62,63
@Override [EOL] public int length() { [EOL]     return 2; [EOL] } <line_num>: 64,65
public int getFoobar() { [EOL]     return 5; [EOL] } <line_num>: 67,67
public void testSimpleGetterInheritance() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     Map<String, Object> result = writeAndMap(m, new PojoSubclass()); [EOL]     assertEquals(2, result.size()); [EOL]     assertEquals(Integer.valueOf(7), result.get("length")); [EOL]     assertEquals(Integer.valueOf(9), result.get("width")); [EOL] } <line_num>: 76,83
public void testSimpleGetterInterfaceImpl() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     Map<String, Object> result = writeAndMap(m, new PojoImpl()); [EOL]     assertEquals(3, result.size()); [EOL]     assertEquals(Integer.valueOf(5), result.get("foobar")); [EOL]     assertEquals(Integer.valueOf(1), result.get("width")); [EOL]     assertEquals(Integer.valueOf(2), result.get("length")); [EOL] } <line_num>: 85,94
@SuppressWarnings("unchecked") [EOL] private Map<String, Object> writeAndMap(ObjectMapper m, Object value) throws IOException { [EOL]     StringWriter sw = new StringWriter(); [EOL]     m.writeValue(sw, value); [EOL]     return (Map<String, Object>) m.readValue(sw.toString(), Object.class); [EOL] } <line_num>: 102,109
