public void testNull() throws Exception
public void testOneLineRegion() throws Exception
public void testTwoLineRegion() throws Exception
public void testThreeLineRegionAcrossNumberRange() throws Exception
public void testThreeLineRegionEmptyLine() throws Exception
public void testOnlyOneEmptyLine() throws Exception
public void testTwoEmptyLines() throws Exception
public void testThreeLineRemoveLastEmptyLine() throws Exception
public void testFormatErrorSpaces() throws Exception
public void testFormatErrorTabs() throws Exception
public void testFormatErrorSpaceEndOfLine1() throws Exception
public void testFormatErrorSpaceEndOfLine2() throws Exception
private LightweightMessageFormatter formatter(String string)
public String getSourceLine(String sourceName, int lineNumber)
public Region getSourceRegion(String sourceName, int lineNumber)
private SourceExcerptProvider source(final String source)
private String format(Region region)
private Region region(final int startLine, final int endLine, final String source)
DiagnosticType FOO_TYPE=Optional[DiagnosticType.error("TEST_FOO", "error description here")]
