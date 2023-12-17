@Before [EOL] public void setUp() throws Exception { [EOL]     initializer = new AtomicSafeInitializerTestImpl(); [EOL] } <line_num>: 36,39
@Override [EOL] protected ConcurrentInitializer<Object> createInitializer() { [EOL]     return initializer; [EOL] } <line_num>: 46,49
@Test [EOL] public void testNumberOfInitializeInvocations() throws ConcurrentException, InterruptedException { [EOL]     testGetConcurrent(); [EOL]     assertEquals("Wrong number of invocations", 1, initializer.initCounter.get()); [EOL] } <line_num>: 54,60
@Override [EOL] protected Object initialize() throws ConcurrentException { [EOL]     initCounter.incrementAndGet(); [EOL]     return new Object(); [EOL] } <line_num>: 72,76
