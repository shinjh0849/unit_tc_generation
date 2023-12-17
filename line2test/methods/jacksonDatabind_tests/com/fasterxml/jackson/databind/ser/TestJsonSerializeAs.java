public int getFoo(); <line_num>: 13,13
@Override [EOL] public int getFoo() { [EOL]     return 42; [EOL] } <line_num>: 19,20
public int getBar() { [EOL]     return 15; [EOL] } <line_num>: 21,21
public FooImpl[] getFoos() { [EOL]     return new FooImpl[] { new FooImpl() }; [EOL] } <line_num>: 25,27
public FooImpl getFoo() { [EOL]     return new FooImpl(); [EOL] } <line_num>: 31,33
public void testSerializeAsInClass() throws IOException { [EOL]     assertEquals("{\"foo\":42}", WRITER.writeValueAsString(new FooImpl())); [EOL] } <line_num>: 45,48
public void testSerializeAsForArrayProp() throws IOException { [EOL]     assertEquals("{\"foos\":[{\"foo\":42}]}", WRITER.writeValueAsString(new Fooables())); [EOL] } <line_num>: 50,53
public void testSerializeAsForSimpleProp() throws IOException { [EOL]     assertEquals("{\"foo\":{\"foo\":42}}", WRITER.writeValueAsString(new FooableWrapper())); [EOL] } <line_num>: 55,58
