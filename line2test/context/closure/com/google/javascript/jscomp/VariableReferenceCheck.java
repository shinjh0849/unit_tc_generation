public VariableReferenceCheck(AbstractCompiler compiler, CheckLevel checkLevel)
public void process(Node externs, Node root)
public void hotSwapScript(Node scriptRoot, Node originalRoot)
public void afterExitScope(NodeTraversal t, ReferenceMap referenceMap)
private void checkVar(NodeTraversal t, Var v, List<Reference> references)
DiagnosticType UNDECLARED_REFERENCE=Optional[DiagnosticType.warning("JSC_REFERENCE_BEFORE_DECLARE", "Variable referenced before declaration: {0}")]
DiagnosticType REDECLARED_VARIABLE=Optional[DiagnosticType.warning("JSC_REDECLARED_VARIABLE", "Redeclared variable: {0}")]
DiagnosticType AMBIGUOUS_FUNCTION_DECL=Optional[DiagnosticType.disabled("AMBIGUOUS_FUNCTION_DECL", "Ambiguous use of a named function: {0}.")]
AbstractCompiler compiler
CheckLevel checkLevel
Set<BasicBlock> blocksWithDeclarations=Optional[Sets.newHashSet()]
