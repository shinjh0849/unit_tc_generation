public IntsDeserializer() { [EOL]     super(int[].class); [EOL] } <line_num>: 94,94
@JsonProperty [EOL] public void size(int value) { [EOL]     _size = value; [EOL] } <line_num>: 34,34
@JsonProperty("length") [EOL] public void foobar(int value) { [EOL]     _length = value; [EOL] } <line_num>: 35,35
@JsonProperty [EOL] protected void other(int value) { [EOL]     _other = value; [EOL] } <line_num>: 38,38
public void errorOut(int value) { [EOL]     throw new Error(); [EOL] } <line_num>: 41,41
@JsonProperty [EOL] public void setX(int value) { [EOL]     _x = value; [EOL] } <line_num>: 48,48
public void setXandY(int x, int y) { [EOL]     throw new Error(); [EOL] } <line_num>: 51,51
@JsonDeserialize [EOL] public void x(int value) { [EOL]     _x = value; [EOL] } <line_num>: 62,62
public void setX(int value) { [EOL]     _x = value; [EOL] } <line_num>: 71,71
@JsonProperty("y") [EOL] void foobar(int value) { [EOL]     _y = value; [EOL] } <line_num>: 72,72
public void setZ(int value) { [EOL]     _z = value; [EOL] } <line_num>: 79,79
@Override [EOL] public int[] deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException { [EOL]     return new int[] { jp.getIntValue() }; [EOL] } <line_num>: 95,100
public void testSimpleSetter() throws Exception { [EOL]     SizeClassSetter result = MAPPER.readValue("{ \"other\":3, \"size\" : 2, \"length\" : -999 }", SizeClassSetter.class); [EOL]     assertEquals(3, result._other); [EOL]     assertEquals(2, result._size); [EOL]     assertEquals(-999, result._length); [EOL] } <line_num>: 111,120
public void testSimpleSetter2() throws Exception { [EOL]     SizeClassSetter2 result = MAPPER.readValue("{ \"x\": -3 }", SizeClassSetter2.class); [EOL]     assertEquals(-3, result._x); [EOL] } <line_num>: 123,128
public void testSimpleSetter3() throws Exception { [EOL]     SizeClassSetter3 result = MAPPER.readValue("{ \"x\": 128 }", SizeClassSetter3.class); [EOL]     assertEquals(128, result._x); [EOL] } <line_num>: 131,137
public void testSetterInheritance() throws Exception { [EOL]     BeanSubClass result = MAPPER.readValue("{ \"x\":1, \"z\" : 3, \"y\" : 2 }", BeanSubClass.class); [EOL]     assertEquals(1, result._x); [EOL]     assertEquals(2, result._y); [EOL]     assertEquals(3, result._z); [EOL] } <line_num>: 143,151
public void testImpliedProperty() throws Exception { [EOL]     BeanWithDeserialize bean = MAPPER.readValue("{\"a\":3}", BeanWithDeserialize.class); [EOL]     assertNotNull(bean); [EOL]     assertEquals(3, bean.a); [EOL] } <line_num>: 153,158
