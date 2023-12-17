 ProcessDefines(AbstractCompiler compiler, Map<String, Node> replacements)
 CollectDefines(AbstractCompiler compiler, List<Name> listOfDefines)
 RefInfo(Ref ref, Name name)
public DefineInfo(Node initialValue, Node initialValueParent)
 ProcessDefines injectNamespace(GlobalNamespace namespace)
public void process(Node externs, Node root)
private void overrideDefines(Map<String, DefineInfo> allDefines)
private static String format(MessageFormat format, Object... params)
private boolean isValidDefineType(JSTypeExpression expression)
private Map<String, DefineInfo> collectDefines(Node root, GlobalNamespace namespace)
 Map<String, DefineInfo> getAllDefines()
public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
private void updateAssignAllowedStack(Node n, boolean entering)
private boolean isAssignAllowed()
private boolean processDefineAssignment(NodeTraversal t, String name, Node value, Node valueParent)
private static Node getValueParent(Ref ref)
private void setDefineInfoNotAssignable(DefineInfo info, NodeTraversal t)
public void setNotAssignable(String reason)
public String getReasonWhyNotAssignable()
public boolean recordAssignment(Node value)
public Node getLastValue()
Set<String> KNOWN_DEFINES=Optional[Sets.newHashSet("COMPILED")]
AbstractCompiler compiler
Map<String, Node> dominantReplacements
GlobalNamespace namespace=Optional[null]
DiagnosticType UNKNOWN_DEFINE_WARNING=Optional[DiagnosticType.warning("JSC_UNKNOWN_DEFINE_WARNING", "unknown @define variable {0}")]
DiagnosticType INVALID_DEFINE_TYPE_ERROR=Optional[DiagnosticType.error("JSC_INVALID_DEFINE_TYPE_ERROR", "@define tag only permits literal types")]
DiagnosticType INVALID_DEFINE_INIT_ERROR=Optional[DiagnosticType.error("JSC_INVALID_DEFINE_INIT_ERROR", "illegal initialization of @define variable {0}")]
DiagnosticType NON_GLOBAL_DEFINE_INIT_ERROR=Optional[DiagnosticType.error("JSC_NON_GLOBAL_DEFINE_INIT_ERROR", "@define variable {0} assignment must be global")]
DiagnosticType DEFINE_NOT_ASSIGNABLE_ERROR=Optional[DiagnosticType.error("JSC_DEFINE_NOT_ASSIGNABLE_ERROR", "@define variable {0} cannot be reassigned due to code at {1}.")]
MessageFormat REASON_DEFINE_NOT_ASSIGNABLE=Optional[new MessageFormat("line {0} of {1}")]
