 StrictModeCheck(AbstractCompiler compiler)
 StrictModeCheck(AbstractCompiler compiler, boolean noVarCheck, boolean noCajaChecks)
public void process(Node externs, Node root)
public void visit(NodeTraversal t, Node n, Node parent)
private void checkFunctionUse(NodeTraversal t, Node n)
private static boolean isDeclaration(Node n)
private void checkNameUse(NodeTraversal t, Node n)
private void checkAssignment(NodeTraversal t, Node n)
private void checkDelete(NodeTraversal t, Node n)
private void checkObjectLiteral(NodeTraversal t, Node n)
private void checkLabel(NodeTraversal t, Node n)
public void visit(NodeTraversal t, Node n, Node parent)
private void checkDeclaration(NodeTraversal t, Node n)
private void checkProperty(NodeTraversal t, Node n)
DiagnosticType UNKNOWN_VARIABLE=Optional[DiagnosticType.warning("JSC_UNKNOWN_VARIABLE", "unknown variable {0}")]
DiagnosticType EVAL_USE=Optional[DiagnosticType.error("JSC_EVAL_USE", "\"eval\" cannot be used in Caja")]
DiagnosticType EVAL_DECLARATION=Optional[DiagnosticType.warning("JSC_EVAL_DECLARATION", "\"eval\" cannot be redeclared in ES5 strict mode")]
DiagnosticType EVAL_ASSIGNMENT=Optional[DiagnosticType.warning("JSC_EVAL_ASSIGNMENT", "the \"eval\" object cannot be reassigned in ES5 strict mode")]
DiagnosticType ARGUMENTS_DECLARATION=Optional[DiagnosticType.warning("JSC_ARGUMENTS_DECLARATION", "\"arguments\" cannot be redeclared in ES5 strict mode")]
DiagnosticType ARGUMENTS_ASSIGNMENT=Optional[DiagnosticType.warning("JSC_ARGUMENTS_ASSIGNMENT", "the \"arguments\" object cannot be reassigned in ES5 strict mode")]
DiagnosticType DELETE_VARIABLE=Optional[DiagnosticType.warning("JSC_DELETE_VARIABLE", "variables, functions, and arguments cannot be deleted in " + "ES5 strict mode")]
DiagnosticType ILLEGAL_NAME=Optional[DiagnosticType.error("JSC_ILLEGAL_NAME", "identifiers ending in '__' cannot be used in Caja")]
DiagnosticType DUPLICATE_OBJECT_KEY=Optional[DiagnosticType.warning("JSC_DUPLICATE_OBJECT_KEY", "object literals cannot contain duplicate keys in ES5 strict mode")]
DiagnosticType BAD_FUNCTION_DECLARATION=Optional[DiagnosticType.error("JSC_BAD_FUNCTION_DECLARATION", "functions can only be declared at top level or immediately within " + "another function in ES5 strict mode")]
AbstractCompiler compiler
boolean noVarCheck
boolean noCajaChecks
