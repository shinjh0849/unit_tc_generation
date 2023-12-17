@Override [EOL] @Before [EOL] public void setUp() throws Exception { [EOL]     exceptionContext = new DefaultExceptionContext(); [EOL]     super.setUp(); [EOL] } <line_num>: 28,33
@Test [EOL] public void testFormattedExceptionMessageNull() { [EOL]     exceptionContext = new DefaultExceptionContext(); [EOL]     exceptionContext.getFormattedExceptionMessage(null); [EOL] } <line_num>: 35,39
