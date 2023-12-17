public CleanupPasses(CompilerOptions options)
public MemoizedScopeCleanupPass(AbstractCompiler compiler)
protected List<PassFactory> getChecks()
protected State getIntermediateState()
protected List<PassFactory> getOptimizations()
protected void setIntermediateState(State state)
protected HotSwapCompilerPass create(AbstractCompiler compiler)
protected HotSwapCompilerPass create(AbstractCompiler compiler)
protected HotSwapCompilerPass create(AbstractCompiler compiler)
public void hotSwapScript(Node scriptRoot, Node originalRoot)
public void process(Node externs, Node root)
State state
PassFactory fieldCleanupPassFactory=Optional[new HotSwapPassFactory("FieldCleaupPassFactory", false) {

    @Override
    protected HotSwapCompilerPass create(AbstractCompiler compiler) {
        return new FieldCleanupPass(compiler);
    }
}]
PassFactory scopeCleanupPassFactory=Optional[new HotSwapPassFactory("ScopeCleanupPassFactory", false) {

    @Override
    protected HotSwapCompilerPass create(AbstractCompiler compiler) {
        return new MemoizedScopeCleanupPass(compiler);
    }
}]
PassFactory globalVarRefCleanupPassFactory=Optional[new HotSwapPassFactory("GlobalVarRefCleanupPassFactory", false) {

    @Override
    protected HotSwapCompilerPass create(AbstractCompiler compiler) {
        return new GlobalVarRefCleanupPass(compiler);
    }
}]
