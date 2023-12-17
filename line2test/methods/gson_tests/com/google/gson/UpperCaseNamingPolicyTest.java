@Override [EOL] protected void setUp() throws Exception { [EOL]     super.setUp(); [EOL]     namingPolicy = new UpperCaseNamingPolicy(); [EOL] } <line_num>: 36,40
public void testAllLowerCase() throws Exception { [EOL]     assertEquals(ALL_UPPER, namingPolicy.translateName(ALL_LOWER, String.class, null)); [EOL] } <line_num>: 42,44
public void testAllUpperCase() throws Exception { [EOL]     assertEquals(ALL_UPPER, namingPolicy.translateName(ALL_UPPER, String.class, null)); [EOL] } <line_num>: 46,48
public void testMixedCase() throws Exception { [EOL]     assertEquals(ALL_UPPER, namingPolicy.translateName(MIXED, String.class, null)); [EOL] } <line_num>: 50,52
