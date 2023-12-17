@Before [EOL] public void setUp() throws Exception { [EOL]     initializer = new LazyInitializerTestImpl(); [EOL] } <line_num>: 30,33
@Override [EOL] protected ConcurrentInitializer<Object> createInitializer() { [EOL]     return initializer; [EOL] } <line_num>: 41,44
@Override [EOL] protected Object initialize() { [EOL]     return new Object(); [EOL] } <line_num>: 53,56
