public TestBasePartial(String name) { [EOL]     super(name); [EOL] } <line_num>: 55,57
MockPartial() { [EOL]     super(new int[] { 1970, 1 }, null); [EOL] } <line_num>: 106,108
public static void main(String[] args) { [EOL]     junit.textui.TestRunner.run(suite()); [EOL] } <line_num>: 47,49
public static TestSuite suite() { [EOL]     return new TestSuite(TestBasePartial.class); [EOL] } <line_num>: 51,53
protected void setUp() throws Exception { [EOL]     DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW); [EOL]     zone = DateTimeZone.getDefault(); [EOL]     DateTimeZone.setDefault(DateTimeZone.UTC); [EOL] } <line_num>: 59,63
protected void tearDown() throws Exception { [EOL]     DateTimeUtils.setCurrentMillisSystem(); [EOL]     DateTimeZone.setDefault(zone); [EOL]     zone = null; [EOL] } <line_num>: 65,69
public void testSetMethods() throws Throwable { [EOL]     MockPartial mock = new MockPartial(); [EOL]     assertEquals(1970, mock.getYear()); [EOL]     assertEquals(1, mock.getMonthOfYear()); [EOL]     mock.setYear(2004); [EOL]     assertEquals(2004, mock.getYear()); [EOL]     assertEquals(1, mock.getMonthOfYear()); [EOL]     mock.setMonthOfYear(6); [EOL]     assertEquals(2004, mock.getYear()); [EOL]     assertEquals(6, mock.getMonthOfYear()); [EOL]     mock.set(2005, 5); [EOL]     assertEquals(2005, mock.getYear()); [EOL]     assertEquals(5, mock.getMonthOfYear()); [EOL]     try { [EOL]         mock.setMonthOfYear(0); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     assertEquals(2005, mock.getYear()); [EOL]     assertEquals(5, mock.getMonthOfYear()); [EOL]     try { [EOL]         mock.setMonthOfYear(13); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     assertEquals(2005, mock.getYear()); [EOL]     assertEquals(5, mock.getMonthOfYear()); [EOL] } <line_num>: 72,102
protected DateTimeField getField(int index, Chronology chrono) { [EOL]     switch(index) { [EOL]         case 0: [EOL]             return chrono.year(); [EOL]         case 1: [EOL]             return chrono.monthOfYear(); [EOL]         default: [EOL]             throw new IndexOutOfBoundsException(); [EOL]     } [EOL] } <line_num>: 110,119
public int size() { [EOL]     return 2; [EOL] } <line_num>: 121,123
public int getYear() { [EOL]     return getValue(0); [EOL] } <line_num>: 125,127
public void setYear(int year) { [EOL]     setValue(0, year); [EOL] } <line_num>: 129,131
public int getMonthOfYear() { [EOL]     return getValue(1); [EOL] } <line_num>: 133,135
public void setMonthOfYear(int month) { [EOL]     setValue(1, month); [EOL] } <line_num>: 137,139
public void set(int year, int month) { [EOL]     setValues(new int[] { year, month }); [EOL] } <line_num>: 141,143
