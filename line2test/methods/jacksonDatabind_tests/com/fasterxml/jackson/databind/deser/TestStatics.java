public static void setX(int value) { [EOL]     throw new Error("Should NOT call static method"); [EOL] } <line_num>: 18,18
@JsonProperty("x") [EOL] public void assignX(int x) { [EOL]     _x = x; [EOL] } <line_num>: 20,20
public void testSimpleIgnore() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     Bean result = m.readValue("{ \"x\":3}", Bean.class); [EOL]     assertEquals(3, result._x); [EOL] } <line_num>: 29,35
