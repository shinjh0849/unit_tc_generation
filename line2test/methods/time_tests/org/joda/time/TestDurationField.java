public TestDurationField(String name) { [EOL]     super(name); [EOL] } <line_num>: 38,40
public static void main(String[] args) { [EOL]     junit.textui.TestRunner.run(suite()); [EOL] } <line_num>: 30,32
public static TestSuite suite() { [EOL]     return new TestSuite(TestDurationField.class); [EOL] } <line_num>: 34,36
protected void setUp() throws Exception { [EOL] } <line_num>: 42,43
protected void tearDown() throws Exception { [EOL] } <line_num>: 45,46
public void test_subtract() throws Exception { [EOL]     DurationField fld = ISOChronology.getInstanceUTC().millis(); [EOL]     assertEquals(900, fld.subtract(1000L, 100)); [EOL]     assertEquals(900L, fld.subtract(1000L, 100L)); [EOL]     assertEquals((1000L - Integer.MAX_VALUE), fld.subtract(1000L, Integer.MAX_VALUE)); [EOL]     assertEquals((1000L - Integer.MIN_VALUE), fld.subtract(1000L, Integer.MIN_VALUE)); [EOL]     assertEquals((1000L - Long.MAX_VALUE), fld.subtract(1000L, Long.MAX_VALUE)); [EOL]     try { [EOL]         fld.subtract(-1000L, Long.MIN_VALUE); [EOL]         fail(); [EOL]     } catch (ArithmeticException ex) { [EOL]     } [EOL] } <line_num>: 49,60
