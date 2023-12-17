 VarCheck(AbstractCompiler compiler)
 VarCheck(AbstractCompiler compiler, boolean sanityCheck)
public void process(Node externs, Node root)
public void hotSwapScript(Node scriptRoot, Node originalRoot)
public void visit(NodeTraversal t, Node n, Node parent)
private void createSynthesizedExternVar(String varName)
public void visit(NodeTraversal t, Node n, Node parent)
private CompilerInput getSynthesizedExternsInput()
private Node getSynthesizedExternsRoot()
DiagnosticType UNDEFINED_VAR_ERROR=Optional[DiagnosticType.error("JSC_UNDEFINED_VARIABLE", "variable {0} is undeclared")]
DiagnosticType VIOLATED_MODULE_DEP_ERROR=Optional[DiagnosticType.error("JSC_VIOLATED_MODULE_DEPENDENCY", "module {0} cannot reference {2}, defined in " + "module {1}, since {1} loads after {0}")]
DiagnosticType MISSING_MODULE_DEP_ERROR=Optional[DiagnosticType.warning("JSC_MISSING_MODULE_DEPENDENCY", "missing module dependency; module {0} should depend " + "on module {1} because it references {2}")]
DiagnosticType STRICT_MODULE_DEP_ERROR=Optional[DiagnosticType.disabled("JSC_STRICT_MODULE_DEPENDENCY", "module {0} cannot reference {2}, defined in " + "module {1}")]
DiagnosticType NAME_REFERENCE_IN_EXTERNS_ERROR=Optional[DiagnosticType.warning("JSC_NAME_REFERENCE_IN_EXTERNS", "accessing name {0} in externs has no effect")]
DiagnosticType UNDEFINED_EXTERN_VAR_ERROR=Optional[DiagnosticType.warning("JSC_UNDEFINED_EXTERN_VAR_ERROR", "name {0} is not undefined in the externs.")]
Node synthesizedExternsRoot=Optional[null]
Set<String> varsToDeclareInExterns=Optional[Sets.newHashSet()]
AbstractCompiler compiler
boolean sanityCheck
boolean strictExternCheck
