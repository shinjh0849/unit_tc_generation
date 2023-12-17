public ClosureRewriteClass(AbstractCompiler compiler)
 MemberDefinition(JSDocInfo info, Node name, Node value)
 ClassDefinition(Node name, Node superClass, MemberDefinition constructor, List<MemberDefinition> staticProps, List<MemberDefinition> props, Node classModifier)
public void process(Node externs, Node root)
public void hotSwapScript(Node scriptRoot, Node originalRoot)
public void visit(NodeTraversal t, Node n, Node parent)
private boolean validateUsage(Node n)
private boolean isContainedInGoogDefineClass(Node n)
private void maybeRewriteClassDefinition(Node n)
private void maybeRewriteClassDefinition(Node n, Node target, Node value)
private ClassDefinition extractClassDefinition(Node targetName, Node callNode)
private Node maybeDetach(Node node)
private boolean validateObjLit(Node objlit)
private Node extractProperty(Node objlit, String keyName)
private List<MemberDefinition> objectLitToList(Node objlit)
private void rewriteGoogDefineClass(Node exprRoot, ClassDefinition cls)
private Node fixupSrcref(Node node)
private Node fixupFreeCall(Node call)
private boolean isGoogDefineClass(Node value)
DiagnosticType GOOG_CLASS_TARGET_INVALID=Optional[DiagnosticType.error("JSC_GOOG_CLASS_TARGET_INVALID", "Unsupported class definition expression.")]
DiagnosticType GOOG_CLASS_SUPER_CLASS_NOT_VALID=Optional[DiagnosticType.error("JSC_GOOG_CLASS_SUPER_CLASS_NOT_VALID", "The super class must be null or a valid name reference")]
DiagnosticType GOOG_CLASS_DESCRIPTOR_NOT_VALID=Optional[DiagnosticType.error("JSC_GOOG_CLASS_DESCRIPTOR_NOT_VALID", "The class descriptor must be an object literal")]
DiagnosticType GOOG_CLASS_CONSTRUCTOR_MISING=Optional[DiagnosticType.error("JSC_GOOG_CLASS_CONSTRUCTOR_MISING", "The constructor expression is missing for the class descriptor")]
DiagnosticType GOOG_CLASS_STATICS_NOT_VALID=Optional[DiagnosticType.error("JSC_GOOG_CLASS_STATICS_NOT_VALID", "The class statics descriptor must be an object or function literal")]
DiagnosticType GOOG_CLASS_UNEXPECTED_PARAMS=Optional[DiagnosticType.error("JSC_GOOG_CLASS_UNEXPECTED_PARAMS", "The class definition has too many arguments.")]
AbstractCompiler compiler
