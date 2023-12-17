protected void setUp() throws Exception
public void testTrailingComma() throws Exception
public void testMisplacedTypeAnnotation() throws Exception
private void assertNoWarningOrError(String code)
private JSError assertError(String code, DiagnosticType type, String description)
private JSError assertWarning(String code, DiagnosticType type, String description)
private Compiler parseCode(String code)
