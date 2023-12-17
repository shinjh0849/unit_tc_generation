protected ValueClassXY(int x, int y) { [EOL]     _x = x + 1; [EOL]     _y = y + 1; [EOL] } <line_num>: 19,22
protected ValueClassABC(int a, int b, int c) { [EOL]     this.a = a; [EOL]     this.b = b; [EOL]     this.c = c; [EOL] } <line_num>: 51,55
protected ValueImmutable(int v) { [EOL]     value = v; [EOL] } <line_num>: 86,86
private BuildImmutable() { [EOL]     this(0); [EOL] } <line_num>: 92,92
private BuildImmutable(int v) { [EOL]     value = v; [EOL] } <line_num>: 93,95
protected ValueFoo(int v) { [EOL]     value = v; [EOL] } <line_num>: 110,110
protected CreatorValue(int a, int b, int c) { [EOL]     this.a = a; [EOL]     this.b = b; [EOL]     this.c = c; [EOL] } <line_num>: 133,137
@JsonCreator [EOL] public CreatorBuilder(@JsonProperty("a") int a, @JsonProperty("b") int b) { [EOL]     this.a = a; [EOL]     this.b = b; [EOL] } <line_num>: 144,150
public SimpleBuilderXY withX(int x) { [EOL]     this.x = x; [EOL]     return this; [EOL] } <line_num>: 29,32
public SimpleBuilderXY withY(int y) { [EOL]     this.y = y; [EOL]     return this; [EOL] } <line_num>: 34,37
public ValueClassXY build() { [EOL]     return new ValueClassXY(x, y); [EOL] } <line_num>: 39,41
@JsonProperty("b") [EOL] public BuildABC assignB(int b) { [EOL]     this.b = b; [EOL]     return this; [EOL] } <line_num>: 63,67
@JsonSetter("c") [EOL] public void c(int c) { [EOL]     this.c = c; [EOL] } <line_num>: 70,73
public ValueClassABC build() { [EOL]     return new ValueClassABC(a, b, c); [EOL] } <line_num>: 75,77
public BuildImmutable withValue(int v) { [EOL]     return new BuildImmutable(v); [EOL] } <line_num>: 96,98
public ValueImmutable build() { [EOL]     return new ValueImmutable(value); [EOL] } <line_num>: 99,101
public BuildFoo fooValue(int v) { [EOL]     value = v; [EOL]     return this; [EOL] } <line_num>: 117,120
public ValueFoo construct() { [EOL]     return new ValueFoo(value); [EOL] } <line_num>: 121,123
public CreatorBuilder withC(int v) { [EOL]     c = v; [EOL]     return this; [EOL] } <line_num>: 152,155
public CreatorValue build() { [EOL]     return new CreatorValue(a, b, c); [EOL] } <line_num>: 156,158
public void testSimple() throws Exception { [EOL]     String json = "{\"x\":1,\"y\":2}"; [EOL]     Object o = mapper.readValue(json, ValueClassXY.class); [EOL]     assertNotNull(o); [EOL]     assertSame(ValueClassXY.class, o.getClass()); [EOL]     ValueClassXY value = (ValueClassXY) o; [EOL]     assertEquals(value._x, 2); [EOL]     assertEquals(value._y, 3); [EOL] } <line_num>: 169,179
public void testMultiAccess() throws Exception { [EOL]     String json = "{\"c\":3,\"a\":2,\"b\":-9}"; [EOL]     ValueClassABC value = mapper.readValue(json, ValueClassABC.class); [EOL]     assertNotNull(value); [EOL]     assertEquals(value.a, 2); [EOL]     assertEquals(value.b, -9); [EOL]     assertEquals(value.c, 3); [EOL] } <line_num>: 181,190
public void testImmutable() throws Exception { [EOL]     final String json = "{\"value\":13}"; [EOL]     ValueImmutable value = mapper.readValue(json, ValueImmutable.class); [EOL]     assertEquals(13, value.value); [EOL] } <line_num>: 193,198
public void testCustomWith() throws Exception { [EOL]     final String json = "{\"value\":1}"; [EOL]     ValueFoo value = mapper.readValue(json, ValueFoo.class); [EOL]     assertEquals(1, value.value); [EOL] } <line_num>: 201,206
public void testWithCreator() throws Exception { [EOL]     final String json = "{\"a\":1,\"c\":3,\"b\":2}"; [EOL]     CreatorValue value = mapper.readValue(json, CreatorValue.class); [EOL]     assertEquals(1, value.a); [EOL]     assertEquals(2, value.b); [EOL]     assertEquals(3, value.c); [EOL] } <line_num>: 209,216
