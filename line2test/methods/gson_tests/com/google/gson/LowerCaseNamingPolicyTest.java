@Override [EOL] protected void setUp() throws Exception { [EOL]     super.setUp(); [EOL]     namingPolicy = new LowerCaseNamingPolicy(); [EOL] } <line_num>: 35,39
public void testAllLowerCase() throws Exception { [EOL]     assertEquals(ALL_LOWER, namingPolicy.translateName(ALL_LOWER, String.class, null)); [EOL] } <line_num>: 41,43
public void testAllUpperCase() throws Exception { [EOL]     assertEquals(ALL_LOWER, namingPolicy.translateName(ALL_UPPER, String.class, null)); [EOL] } <line_num>: 45,47
public void testMixedCase() throws Exception { [EOL]     assertEquals(ALL_LOWER, namingPolicy.translateName(MIXED, String.class, null)); [EOL] } <line_num>: 49,51
