public DevirtualizePrototypeMethodsTest()
private RewritePrototypeMethodTestInput()
private NoRewriteDeclarationUsedAsRValue()
private NoRewriteIfNotInGlobalScopeTestInput()
private NoRewriteMultipleDefinitionTestInput()
private NoRewritePrototypeObjectLiteralsTestInput()
private NoRewriteNonCallReferenceTestInput()
private NoRewriteNestedFunctionTestInput()
private ModuleTestInput()
 TypeInformationGatherer(Compiler compiler, CompilerPass passUnderTest, List<String> typeInformation)
protected int getNumRepetitions()
protected void setUp() throws Exception
private static String newlineJoin(String... parts)
private static String semicolonJoin(String... parts)
public void testRewritePrototypeMethods1() throws Exception
public void testRewritePrototypeMethods2() throws Exception
public void testRewriteChained() throws Exception
public void testRewriteDeclIsExpressionStatement() throws Exception
public void testNoRewriteDeclUsedAsAssignmentRhs() throws Exception
public void testNoRewriteDeclUsedAsCallArgument() throws Exception
public void testRewriteInGlobalScope() throws Exception
public void testNoRewriteIfNotInGlobalScope1() throws Exception
public void testNoRewriteIfNotInGlobalScope2() throws Exception
public void testNoRewriteNamespaceFunctions() throws Exception
public void testRewriteSingleDefinition1() throws Exception
public void testRewriteSingleDefinition2() throws Exception
public void testNoRewriteMultipleDefinition1() throws Exception
public void testNoRewriteMultipleDefinition2() throws Exception
public void testNoRewriteMultipleDefinition3() throws Exception
public void testRewritePrototypeNoObjectLiterals() throws Exception
public void testRewritePrototypeObjectLiterals1() throws Exception
public void testNoRewritePrototypeObjectLiterals2() throws Exception
public void testNoRewriteExternalMethods1() throws Exception
public void testNoRewriteExternalMethods2() throws Exception
public void testNoRewriteCodingConvention() throws Exception
public void testRewriteNoVarArgs() throws Exception
public void testNoRewriteVarArgs() throws Exception
public void testRewriteCallReference() throws Exception
public void testNoRewriteNoReferences() throws Exception
public void testNoRewriteNonCallReference() throws Exception
public void testRewriteNoNestedFunction() throws Exception
public void testNoRewriteNestedFunction() throws Exception
public void testRewriteImplementedMethod() throws Exception
public void testRewriteImplementedMethod2() throws Exception
public void testRewriteImplementedMethod3() throws Exception
public void testRewriteImplementedMethod4() throws Exception
public void testRewriteImplementedMethodInObj() throws Exception
public void testNoRewriteGet1() throws Exception
public void testNoRewriteGet2() throws Exception
public void testNoRewriteSet1() throws Exception
public void testNoRewriteSet2() throws Exception
public void testNoRewriteNotImplementedMethod() throws Exception
public void testWrapper()
public void testRewriteSameModule1() throws Exception
public void testRewriteSameModule2() throws Exception
public void testRewriteSameModule3() throws Exception
public void testRewriteDefinitionBeforeUse() throws Exception
public void testNoRewriteUseBeforeDefinition() throws Exception
private void checkTypes(String source, String expected, List<String> expectedTypes)
protected CompilerPass getProcessor(Compiler compiler)
public void process(Node externs, Node root)
public String getNameString(Node n)
public void visit(NodeTraversal traversal, Node node, Node parent)
String EXTERNAL_SYMBOLS=Optional["var extern;extern.externalMethod"]
List<String> typeInformation
