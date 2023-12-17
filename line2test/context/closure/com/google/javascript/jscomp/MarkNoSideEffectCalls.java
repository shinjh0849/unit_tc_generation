 MarkNoSideEffectCalls(AbstractCompiler compiler)
 GatherNoSideEffectFunctions(boolean inExterns)
 SetNoSideEffectCallProperty(SimpleDefinitionFinder defFinder)
public void process(Node externs, Node root)
private static boolean definitionTypeContainsFunctionType(Definition def)
private static boolean hasNoSideEffectsAnnotation(Node node)
public void visit(NodeTraversal traversal, Node node, Node parent)
public void visit(NodeTraversal traversal, Node node, Node parent)
DiagnosticType INVALID_NO_SIDE_EFFECT_ANNOTATION=Optional[DiagnosticType.error("JSC_INVALID_NO_SIDE_EFFECT_ANNOTATION", "@nosideeffects may only appear in externs files.")]
AbstractCompiler compiler
Set<Node> noSideEffectFunctionNames
