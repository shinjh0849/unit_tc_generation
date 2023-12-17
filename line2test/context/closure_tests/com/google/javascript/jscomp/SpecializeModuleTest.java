public SpecializeModuleTest()
 FunctionFinder(String target)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
protected CompilerPass create(AbstractCompiler compiler)
public void process(Node externs, Node root)
protected CompilerPass getProcessor(final Compiler compiler)
public void setUp() throws Exception
public void testSpecializeInline()
public void testSpecializeCascadedInline()
public void testSpecializeInlineWithMultipleDependents()
public void testSpecializeInlineWithNamespaces()
public void testSpecializeInlineWithRegularFunctions()
public void testDontSpecializeLocalNonAnonymousFunctions()
public void testAddDummyVarsForRemovedFunctions()
public void testSpecializeRemoveUnusedProperties()
public void testDontSpecializeAliasedFunctions_inline()
public void testDontSpecializeAliasedFunctions_remove_unused_properties()
public void testSpecializeDevirtualizePrototypeMethods()
public void testSpecializeDevirtualizePrototypeMethodsWithInline()
public void process(Node externs, Node root)
public CompilerPass getProcessor(final Compiler compiler)
public void testRemovedFunctions()
public void testSpecializedFunctions()
public void testCanFixupFunction()
private Node findFunction(String name)
public void visit(NodeTraversal t, Node n, Node parent)
String SHARED_EXTERNS=Optional["var alert = function() {}"]
PassFactory inlineFunctions=Optional[new PassFactory("inlineFunctions", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new InlineFunctions(compiler, compiler.getUniqueNameIdSupplier(), true, false, true, true, true);
    }
}]
PassFactory removeUnusedPrototypeProperties=Optional[new PassFactory("removeUnusedPrototypeProperties", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new RemoveUnusedPrototypeProperties(compiler, false, false);
    }
}]
PassFactory devirtualizePrototypeMethods=Optional[new PassFactory("devirtualizePrototypeMethods", true) {

    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
        return new DevirtualizePrototypeMethods(compiler);
    }
}]
