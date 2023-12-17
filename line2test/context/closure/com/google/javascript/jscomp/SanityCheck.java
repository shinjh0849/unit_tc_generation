 SanityCheck(AbstractCompiler compiler)
public void process(Node externs, Node root)
private void sanityCheckAst(Node externs, Node root)
private void sanityCheckVars(Node externs, Node root)
private Node sanityCheckCodeGeneration(Node root)
private void sanityCheckNormalization(Node externs, Node root)
DiagnosticType CANNOT_PARSE_GENERATED_CODE=Optional[DiagnosticType.error("JSC_CANNOT_PARSE_GENERATED_CODE", "Internal compiler error. Cannot parse generated code: {0}")]
DiagnosticType GENERATED_BAD_CODE=Optional[DiagnosticType.error("JSC_GENERATED_BAD_CODE", "Internal compiler error. Generated bad code." + "----------------------------------------\n" + "Expected:\n{0}\n" + "----------------------------------------\n" + "Actual:\n{1}")]
AbstractCompiler compiler
AstValidator astValidator=Optional[new AstValidator()]
