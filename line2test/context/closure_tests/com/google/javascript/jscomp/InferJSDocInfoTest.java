public int getNumRepetitions()
protected CompilerOptions getOptions()
public void visit(NodeTraversal t, Node n, Node parent)
public void process(Node externs, Node root)
public CompilerPass getProcessor(final Compiler compiler)
public void testNativeCtor()
public void testStructuralFunctions()
public void testInstanceObject()
public void testInterface()
public void testNamespacedCtor()
public void testAbstractMethod()
private JSType findGlobalNameType(String name)
private JSType findNameType(String name, Scope scope)
Scope globalScope
Callback callback=Optional[new AbstractPostOrderCallback() {

    @Override
    public void visit(NodeTraversal t, Node n, Node parent) {
        Scope s = t.getScope();
        if (s.isGlobal()) {
            globalScope = s;
        }
    }
}]
