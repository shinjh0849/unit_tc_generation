 SyntacticScopeCreator(AbstractCompiler compiler)
 SyntacticScopeCreator(AbstractCompiler compiler, RedeclarationHandler redeclarationHandler)
public Scope createScope(Node n, Scope parent)
private void scanRoot(Node n, Scope parent)
private void scanVars(Node n, Node parent)
 void onRedeclaration(Scope s, String name, Node n, CompilerInput input)
public void onRedeclaration(Scope s, String name, Node n, CompilerInput input)
private void declareVar(Node n)
 static boolean hasDuplicateDeclarationSuppression(Node n, Scope.Var origVar)
 static Scope generateUntypedTopScope(AbstractCompiler compiler)
AbstractCompiler compiler
Scope scope
InputId inputId
RedeclarationHandler redeclarationHandler
String ARGUMENTS=Optional["arguments"]
DiagnosticType VAR_MULTIPLY_DECLARED_ERROR=Optional[DiagnosticType.error("JSC_VAR_MULTIPLY_DECLARED_ERROR", "Variable {0} first declared in {1}")]
DiagnosticType VAR_ARGUMENTS_SHADOWED_ERROR=Optional[DiagnosticType.error("JSC_VAR_ARGUMENTS_SHADOWED_ERROR", "Shadowing \"arguments\" is not allowed")]
