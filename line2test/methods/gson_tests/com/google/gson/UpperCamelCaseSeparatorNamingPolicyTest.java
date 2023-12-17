@Override [EOL] protected void setUp() throws Exception { [EOL]     super.setUp(); [EOL]     namingPolicy = new UpperCamelCaseSeparatorNamingPolicy(" "); [EOL] } <line_num>: 30,34
public void testAllLowerCase() throws Exception { [EOL]     assertEquals("Some Field Name", namingPolicy.translateName("someFieldName", String.class, null)); [EOL] } <line_num>: 36,39
public void testAllUpperCase() throws Exception { [EOL]     assertEquals("U R L", namingPolicy.translateName("URL", String.class, null)); [EOL] } <line_num>: 41,44
public void testAllUpperCaseExceptFirst() throws Exception { [EOL]     assertEquals("U R L", namingPolicy.translateName("uRL", String.class, null)); [EOL] } <line_num>: 46,49
public void testAllUpperCaseStartingWithUnderscore() throws Exception { [EOL]     assertEquals("_U R L", namingPolicy.translateName("_uRL", String.class, null)); [EOL] } <line_num>: 51,54
public void testMixedCase() throws Exception { [EOL]     assertEquals("_Some Field Name", namingPolicy.translateName("_someFieldName", String.class, null)); [EOL] } <line_num>: 56,59
