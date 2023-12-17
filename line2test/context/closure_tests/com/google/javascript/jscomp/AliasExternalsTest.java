public AliasExternalsTest()
protected int getNumRepetitions()
public void setUp()
public void testGlobalAlias()
public void testUnaliasable()
public void testAliasableGlobals()
public void testAliasableAndUnaliasableGlobals()
public void testGlobalAssigment()
public void testNewOperator()
public void testGetProp()
public void testIgnoredOps()
public void testSetProp()
public void testParentChild()
public void testModulesWithoutDependencies()
public void testModulesWithDependencies()
public void testPropAccessorPushedDeeper1()
public void testPropAccessorPushedDeeper2()
public void testPropAccessorPushedDeeper3()
public void testPropAccessorNotPushedDeeper()
public void testPropMutatorPushedDeeper()
public void testPropMutatorNotPushedDeeper()
public void testGlobalAliasPushedDeeper()
public void testGlobalAliasNotPushedDeeper()
public void testNoAliasAnnotationForSingleVar()
public void testNoAliasAnnotationForMultiVarDeclaration()
public void testNoAliasAnnotationForFunction()
private String formatPropNameDecl(String prop)
private String formatSetPropFn(String prop)
protected CompilerPass getProcessor(Compiler compiler)
String EXTERNS=Optional[// Globals
"/** @const */ var window;" + "/** @const */ var document;" + "var arguments;var _USER_ID;var ActiveXObject;" + "function eval(x) {}" + // Properties
"window.setTimeout;" + "window.eval;" + "props.window;props.innerHTML;props.length;props.prototype;props.length;" + // More globals
"/** @noalias */ var RangeObject; " + "var /** @noalias */ RuntimeObject, SelectionObject;" + "/** @noalias */ function NoAliasFunction() {};"]
String unaliasableGlobals
String aliasableGlobals
String MODULE_SRC_ONE=Optional["a=b.length;a=b.length;a=b.length;"]
String MODULE_SRC_TWO=Optional["c=d.length;"]
