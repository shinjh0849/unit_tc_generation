public int getX() { [EOL]     return 3; [EOL] } <line_num>: 33,33
public static int getA() { [EOL]     return -3; [EOL] } <line_num>: 35,35
@JsonProperty [EOL] public static int getFoo() { [EOL]     return 123; [EOL] } <line_num>: 38,38
public void testStaticFields() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     Map<String, Object> result = writeAndMap(m, new FieldBean()); [EOL]     assertEquals(1, result.size()); [EOL]     assertEquals(Integer.valueOf(1), result.get("x")); [EOL] } <line_num>: 47,53
public void testStaticMethods() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     Map<String, Object> result = writeAndMap(m, new GetterBean()); [EOL]     assertEquals(1, result.size()); [EOL]     assertEquals(Integer.valueOf(3), result.get("x")); [EOL] } <line_num>: 55,61
