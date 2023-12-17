protected CompilerTestCase(String externs, boolean compareAsTree)
protected CompilerTestCase(String externs)
protected CompilerTestCase()
private BlackHoleErrorManager(Compiler compiler)
protected abstract CompilerPass getProcessor(Compiler compiler)
protected CompilerOptions getOptions()
protected CompilerOptions getOptions(CompilerOptions options)
protected CodingConvention getCodingConvention()
public void setFilename(String filename)
protected int getNumRepetitions()
 void allowSourcelessWarnings()
 Compiler getLastCompiler()
protected void enableEcmaScript5(boolean acceptES5)
protected void allowExternsChanges(boolean allowExternsChanges)
public void enableTypeCheck(CheckLevel level)
public void enableLineNumberCheck(boolean newVal)
 void disableTypeCheck()
 void enableClosurePass()
protected void enableNormalize()
protected void enableNormalize(boolean normalizeExpected)
protected void disableNormalize()
 void enableMarkNoSideEffects()
protected void enableAstValidation(boolean validate)
private static TypeCheck createTypeCheck(Compiler compiler, CheckLevel level)
public void test(String js, String expected)
public void test(String js, String expected, DiagnosticType error)
public void test(String js, String expected, DiagnosticType error, DiagnosticType warning, String description)
public void test(String js, String expected, DiagnosticType error, DiagnosticType warning)
public void test(String externs, String js, String expected, DiagnosticType error, DiagnosticType warning)
public void test(String externs, String js, String expected, DiagnosticType error, DiagnosticType warning, String description)
public void test(List<SourceFile> externs, String js, String expected, DiagnosticType error, DiagnosticType warning, String description)
private String[] maybeCreateArray(String expected)
public void test(String[] js, String[] expected)
public void test(String[] js, String[] expected, DiagnosticType error)
public void test(String[] js, String[] expected, DiagnosticType error, DiagnosticType warning)
public void test(String[] js, String[] expected, DiagnosticType error, DiagnosticType warning, String description)
public void test(JSModule[] modules, String[] expected)
public void test(JSModule[] modules, String[] expected, DiagnosticType error)
public void test(JSModule[] modules, String[] expected, DiagnosticType error, DiagnosticType warning)
public void testSame(String js)
public void testSame(String js, DiagnosticType warning)
public void testSame(String js, DiagnosticType diag, boolean error)
public void testSame(String externs, String js, DiagnosticType warning)
public void testSame(String externs, String js, DiagnosticType diag, boolean error)
public void testSame(String externs, String js, DiagnosticType warning, String description)
public void testSame(String[] js)
public void testSame(String[] js, DiagnosticType error)
public void testSame(String[] js, DiagnosticType error, DiagnosticType warning)
public void testSame(JSModule[] modules)
public void testSame(JSModule[] modules, DiagnosticType warning)
protected void test(Compiler compiler, String[] expected, DiagnosticType error, DiagnosticType warning)
private void test(Compiler compiler, String[] expected, DiagnosticType error, DiagnosticType warning, String description)
private void normalizeActualCode(Compiler compiler, Node externsRoot, Node mainRoot)
protected Node parseExpectedJs(String[] expected)
protected Node parseExpectedJs(String expected)
 static JSModule[] createModuleChain(String... inputs)
 static JSModule[] createModuleStar(String... inputs)
 static JSModule[] createModuleBush(String... inputs)
 static JSModule[] createModuleTree(String... inputs)
 static JSModule[] createModules(String... inputs)
public void println(CheckLevel level, JSError error)
public void printSummary()
 Compiler createCompiler()
protected void setExpectedSymbolTableError(DiagnosticType type)
public void visit(Node n)
protected final Node findQualifiedNameNode(final String name, Node root)
List<SourceFile> externsInputs
boolean compareAsTree
boolean parseTypeInfo
boolean allowSourcelessWarnings=Optional[false]
boolean closurePassEnabled=Optional[false]
boolean typeCheckEnabled=Optional[false]
CheckLevel typeCheckLevel
boolean normalizeEnabled=Optional[false]
boolean normalizeExpected=Optional[false]
boolean checkLineNumbers=Optional[true]
DiagnosticType expectedSymbolTableError=Optional[null]
boolean markNoSideEffects=Optional[false]
Compiler lastCompiler
boolean acceptES5=Optional[true]
boolean allowExternsChanges=Optional[false]
boolean astValidationEnabled=Optional[true]
String filename=Optional["testcode"]
