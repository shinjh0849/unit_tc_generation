@Override [EOL] protected void setUp() throws Exception { [EOL]     super.setUp(); [EOL]     strategy = new NullExclusionStrategy(); [EOL] } <line_num>: 29,33
public void testNeverSkipsClass() throws Exception { [EOL]     assertFalse(strategy.shouldSkipClass(String.class)); [EOL] } <line_num>: 35,37
public void testNeverSkipsField() throws Exception { [EOL]     assertFalse(strategy.shouldSkipField(new FieldAttributes(String.class, String.class.getFields()[0]))); [EOL] } <line_num>: 39,42
