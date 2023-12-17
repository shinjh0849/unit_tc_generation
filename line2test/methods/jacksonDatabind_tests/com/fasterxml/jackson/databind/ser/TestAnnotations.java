public ClassMethodSerializer(int x) { [EOL]     _x = x; [EOL] } <line_num>: 68,68
public InactiveClassMethodSerializer(int x) { [EOL]     _x = x; [EOL] } <line_num>: 81,81
@JsonCreator [EOL] public GettersWithoutSetters(@JsonProperty("a") int a) { [EOL] } <line_num>: 108,109
@JsonProperty [EOL] public int size() { [EOL]     return 3; [EOL] } <line_num>: 29,29
@JsonProperty("length") [EOL] public int foobar() { [EOL]     return -17; [EOL] } <line_num>: 30,30
@JsonProperty [EOL] protected int value() { [EOL]     return 0; [EOL] } <line_num>: 32,32
protected int getNotReally(int arg) { [EOL]     return 0; [EOL] } <line_num>: 35,35
@JsonProperty [EOL] protected int getX() { [EOL]     return 3; [EOL] } <line_num>: 42,42
@JsonSerialize [EOL] protected int getY() { [EOL]     return 8; [EOL] } <line_num>: 49,49
@JsonSerialize(using = StringSerializer.class) [EOL] public int getX() { [EOL]     return _x; [EOL] } <line_num>: 70,71
@JsonSerialize(using = JsonSerializer.None.class) [EOL] public int getX() { [EOL]     return _x; [EOL] } <line_num>: 84,85
public int getX() { [EOL]     return 1; [EOL] } <line_num>: 93,93
@JsonProperty("y") [EOL] private int getY() { [EOL]     return 2; [EOL] } <line_num>: 94,95
public int getZ() { [EOL]     return 3; [EOL] } <line_num>: 99,99
public int getA() { [EOL]     return 3; [EOL] } <line_num>: 112,112
public int getB() { [EOL]     return 4; [EOL] } <line_num>: 115,115
public int getC() { [EOL]     return 5; [EOL] } <line_num>: 118,118
public void setC(int v) { [EOL] } <line_num>: 119,119
public int getD() { [EOL]     return 6; [EOL] } <line_num>: 122,122
@JsonProperty [EOL] public int getA() { [EOL]     return 123; [EOL] } <line_num>: 128,129
@Override [EOL] public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException { [EOL]     jgen.writeBoolean(true); [EOL] } <line_num>: 140,145
@Override [EOL] public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException { [EOL]     jgen.writeString("X" + value + "X"); [EOL] } <line_num>: 150,155
public void testSimpleGetter() throws Exception { [EOL]     Map<String, Object> result = writeAndMap(MAPPER, new SizeClassGetter()); [EOL]     assertEquals(3, result.size()); [EOL]     assertEquals(Integer.valueOf(3), result.get("size")); [EOL]     assertEquals(Integer.valueOf(-17), result.get("length")); [EOL]     assertEquals(Integer.valueOf(0), result.get("value")); [EOL] } <line_num>: 167,174
public void testSimpleGetter2() throws Exception { [EOL]     Map<String, Object> result = writeAndMap(MAPPER, new SizeClassGetter2()); [EOL]     assertEquals(1, result.size()); [EOL]     assertEquals(Integer.valueOf(3), result.get("x")); [EOL] } <line_num>: 176,181
public void testSimpleGetter3() throws Exception { [EOL]     Map<String, Object> result = writeAndMap(MAPPER, new SizeClassGetter3()); [EOL]     assertEquals(1, result.size()); [EOL]     assertEquals(Integer.valueOf(8), result.get("y")); [EOL] } <line_num>: 184,189
public void testGetterInheritance() throws Exception { [EOL]     Map<String, Object> result = writeAndMap(MAPPER, new SubClassBean()); [EOL]     assertEquals(3, result.size()); [EOL]     assertEquals(Integer.valueOf(1), result.get("x")); [EOL]     assertEquals(Integer.valueOf(2), result.get("y")); [EOL]     assertEquals(Integer.valueOf(3), result.get("z")); [EOL] } <line_num>: 195,202
public void testClassSerializer() throws Exception { [EOL]     StringWriter sw = new StringWriter(); [EOL]     MAPPER.writeValue(sw, new ClassSerializer()); [EOL]     assertEquals("true", sw.toString()); [EOL] } <line_num>: 208,213
public void testActiveMethodSerializer() throws Exception { [EOL]     StringWriter sw = new StringWriter(); [EOL]     MAPPER.writeValue(sw, new ClassMethodSerializer(13)); [EOL]     assertEquals("{\"x\":\"X13X\"}", sw.toString()); [EOL] } <line_num>: 219,227
public void testInactiveMethodSerializer() throws Exception { [EOL]     String json = MAPPER.writeValueAsString(new InactiveClassMethodSerializer(8)); [EOL]     assertEquals("{\"x\":8}", json); [EOL] } <line_num>: 229,236
public void testGettersWithoutSetters() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     GettersWithoutSetters bean = new GettersWithoutSetters(123); [EOL]     assertFalse(m.isEnabled(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS)); [EOL]     assertEquals("{\"a\":3,\"b\":4,\"c\":5,\"d\":6}", m.writeValueAsString(bean)); [EOL]     m = new ObjectMapper(); [EOL]     m.enable(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS); [EOL]     assertEquals("{\"a\":3,\"c\":5,\"d\":6}", m.writeValueAsString(bean)); [EOL] } <line_num>: 238,251
public void testGettersWithoutSettersOverride() throws Exception { [EOL]     GettersWithoutSetters2 bean = new GettersWithoutSetters2(); [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     m.enable(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS); [EOL]     assertEquals("{\"a\":123}", m.writeValueAsString(bean)); [EOL] } <line_num>: 253,259
