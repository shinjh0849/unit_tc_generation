protected ValueClassXY(int x, int y) { [EOL]     _x = x + 1; [EOL]     _y = y + 1; [EOL] } <line_num>: 22,25
public SimpleBuilderXY withX(int x) { [EOL]     this.x = x; [EOL]     return this; [EOL] } <line_num>: 33,36
public SimpleBuilderXY withY(int y) { [EOL]     this.y = y; [EOL]     return this; [EOL] } <line_num>: 38,41
public ValueClassXY build() { [EOL]     return new ValueClassXY(x, y); [EOL] } <line_num>: 43,45
public void testSimpleBuilder() throws Exception { [EOL]     ValueClassXY value = MAPPER.readValue("[1,2]", ValueClassXY.class); [EOL]     assertEquals(2, value._x); [EOL]     assertEquals(3, value._y); [EOL] } <line_num>: 56,62
