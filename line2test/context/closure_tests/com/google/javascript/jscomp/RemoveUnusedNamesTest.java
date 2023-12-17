public RemoveUnusedNamesTest()
protected int getNumRepetitions()
public void process(Node externs, Node root)
protected CompilerPass getProcessor(final Compiler compiler)
public void setUp()
public void testAnalyzeUnusedPrototypeProperties()
public void testAnalyzeUnusedPrototypeProperties2()
public void testAnalyzeUnusedPrototypeProperties3()
public void testAliasing()
public void testStatement()
public void testExportedMethodsByNamingConvention()
public void testExportedMethodsByNamingConventionAlwaysExported()
String EXTERNS=Optional["/** @constructor */\n " + "function IFoo() { } \n" + "IFoo.prototype.bar; \n" + "/** @constructor */\n " + "var mExtern; \n" + "mExtern.bExtern; \n" + "mExtern['cExtern']; \n"]
boolean canRemoveExterns=Optional[false]
