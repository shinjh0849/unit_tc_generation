public void setX(int value) { [EOL]     _x = value; [EOL] } <line_num>: 26,26
@JsonIgnore [EOL] public void setY(int value) { [EOL]     _y = value; [EOL] } <line_num>: 27,27
@JsonProperty("y") [EOL] void foobar(int value) { [EOL]     ; [EOL] } <line_num>: 32,34
public void testSimpleIgnore() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     SizeClassIgnore result = m.readValue("{ \"x\":1, \"y\" : 2 }", SizeClassIgnore.class); [EOL]     assertEquals(1, result._x); [EOL]     assertEquals(0, result._y); [EOL] } <line_num>: 43,52
