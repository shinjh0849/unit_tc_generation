 TweakFunction(String name)
 TweakFunction(String name, String expectedTypeName, int validNodeTypeA)
 TweakFunction(String name, String expectedTypeName, int validNodeTypeA, int validNodeTypeB)
 TweakFunction(String name, TweakFunction registerFunction)
 TweakFunction(String name, String expectedTypeName, int validNodeTypeA, int validNodeTypeB, TweakFunction registerFunction)
 ProcessTweaks(AbstractCompiler compiler, boolean stripTweaks, Map<String, Node> compilerDefaultValueOverrides)
 CollectTweaksResult(Map<String, TweakInfo> tweakInfos, List<TweakFunctionCall> getOverridesCalls)
 TweakFunctionCall(String sourceName, TweakFunction tweakFunc, Node callNode)
 TweakFunctionCall(String sourceName, TweakFunction tweakFunc, Node callNode, Node valueNode)
 TweakInfo(String tweakId)
 boolean isValidNodeType(int type)
 boolean isCorrectRegisterFunction(TweakFunction registerFunction)
 boolean isGetterFunction()
 String getName()
 String getExpectedTypeName()
 Node createDefaultValueNode()
public void process(Node externs, Node root)
private boolean replaceGetCompilerOverridesCalls(List<TweakFunctionCall> calls)
private boolean stripAllCalls(Map<String, TweakInfo> tweakInfos)
private Node createCompilerDefaultValueOverridesVarNode(Node sourceInformationNode)
private void applyCompilerDefaultValueOverrides(Map<String, TweakInfo> tweakInfos)
private CollectTweaksResult collectTweaks(Node root)
public void visit(NodeTraversal t, Node n, Node parent)
 Node getIdNode()
 void emitAllWarnings()
 void emitAllTypeWarnings()
 void emitUnknownTweakErrors()
 void addRegisterCall(String sourceName, TweakFunction tweakFunc, Node callNode, Node defaultValueNode)
 void addOverrideDefaultValueCall(String sourceName, TweakFunction tweakFunc, Node callNode, Node defaultValueNode)
 void addGetterCall(String sourceName, TweakFunction tweakFunc, Node callNode)
 boolean isRegistered()
 Node getDefaultValueNode()
AbstractCompiler compiler
boolean stripTweaks
SortedMap<String, Node> compilerDefaultValueOverrides
CharMatcher ID_MATCHER=Optional[CharMatcher.inRange('a', 'z').or(CharMatcher.inRange('A', 'Z')).or(CharMatcher.anyOf("0123456789_."))]
DiagnosticType UNKNOWN_TWEAK_WARNING=Optional[DiagnosticType.warning("JSC_UNKNOWN_TWEAK_WARNING", "no tweak registered with ID {0}")]
DiagnosticType TWEAK_MULTIPLY_REGISTERED_ERROR=Optional[DiagnosticType.error("JSC_TWEAK_MULTIPLY_REGISTERED_ERROR", "Tweak {0} has already been registered.")]
DiagnosticType NON_LITERAL_TWEAK_ID_ERROR=Optional[DiagnosticType.error("JSC_NON_LITERAL_TWEAK_ID_ERROR", "tweak ID must be a string literal")]
DiagnosticType INVALID_TWEAK_DEFAULT_VALUE_WARNING=Optional[DiagnosticType.warning("JSC_INVALID_TWEAK_DEFAULT_VALUE_WARNING", "tweak {0} registered with {1} must have a default value that is a " + "literal of type {2}")]
DiagnosticType NON_GLOBAL_TWEAK_INIT_ERROR=Optional[DiagnosticType.error("JSC_NON_GLOBAL_TWEAK_INIT_ERROR", "tweak declaration {0} must occur in the global scope")]
DiagnosticType TWEAK_OVERRIDE_AFTER_REGISTERED_ERROR=Optional[DiagnosticType.error("JSC_TWEAK_OVERRIDE_AFTER_REGISTERED_ERROR", "Cannot override the default value of tweak {0} after it has been " + "registered")]
DiagnosticType TWEAK_WRONG_GETTER_TYPE_WARNING=Optional[DiagnosticType.warning("JSC_TWEAK_WRONG_GETTER_TYPE_WARNING", "tweak getter function {0} used for tweak registered using {1}")]
DiagnosticType INVALID_TWEAK_ID_ERROR=Optional[DiagnosticType.error("JSC_INVALID_TWEAK_ID_ERROR", "tweak ID contains illegal characters. Only letters, numbers, _ " + "and . are allowed")]
Map<String, TweakFunction> TWEAK_FUNCTIONS_MAP
