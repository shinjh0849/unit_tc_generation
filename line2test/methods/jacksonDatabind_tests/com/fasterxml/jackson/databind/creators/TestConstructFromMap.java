@JsonCreator [EOL] ConstructorFromMap(Map<?, ?> arg) { [EOL]     _x = ((Number) arg.get("x")).intValue(); [EOL]     _y = (String) arg.get("y"); [EOL] } <line_num>: 26,31
private FactoryFromPoint(Point p) { [EOL]     _x = p.x; [EOL]     _y = p.y; [EOL] } <line_num>: 38,41
private FactoryFromDecimalString(BigDecimal d) { [EOL]     _value = d.intValue(); [EOL] } <line_num>: 55,57
@JsonCreator [EOL] static FactoryFromPoint createIt(Point p) { [EOL]     return new FactoryFromPoint(p); [EOL] } <line_num>: 43,47
@JsonCreator [EOL] static FactoryFromDecimalString whateverNameWontMatter(BigDecimal d) { [EOL]     return new FactoryFromDecimalString(d); [EOL] } <line_num>: 59,63
public void testViaConstructor() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     ConstructorFromMap result = m.readValue("{ \"x\":1, \"y\" : \"abc\" }", ConstructorFromMap.class); [EOL]     assertEquals(1, result._x); [EOL]     assertEquals("abc", result._y); [EOL] } <line_num>: 72,79
public void testViaFactory() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     FactoryFromPoint result = m.readValue("{ \"x\" : 3, \"y\" : 4 }", FactoryFromPoint.class); [EOL]     assertEquals(3, result._x); [EOL]     assertEquals(4, result._y); [EOL] } <line_num>: 81,87
public void testViaFactoryUsingString() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     FactoryFromDecimalString result = m.readValue("\"12.57\"", FactoryFromDecimalString.class); [EOL]     assertNotNull(result); [EOL]     assertEquals(12, result._value); [EOL] } <line_num>: 89,95
