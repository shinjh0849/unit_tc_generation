 JsMessageVisitor(AbstractCompiler compiler, boolean needToCheckDuplications, JsMessage.Style style, JsMessage.IdGenerator idGenerator)
 MalformedException(String message, Node node)
private MessageLocation(JsMessage message, Node messageNode)
public void process(Node externs, Node root)
public void visit(NodeTraversal traversal, Node node, Node parent)
private void trackMessage(NodeTraversal t, JsMessage message, String msgName, Node msgNode, boolean isUnnamedMessage)
private JsMessage getTrackedMessage(NodeTraversal t, String msgName)
private void checkIfMessageDuplicated(String msgName, Node msgNode)
private void extractMessageFromVariable(Builder builder, Node nameNode, Node parentNode, @Nullable Node grandParentNode) throws MalformedException
private void extractMessageFromProperty(Builder builder, Node getPropNode, Node assignNode) throws MalformedException
private void maybeInitMetaDataFromJsDocOrHelpVar(Builder builder, Node varNode, @Nullable Node parentOfVarNode) throws MalformedException
private boolean maybeInitMetaDataFromHelpVar(Builder builder, @Nullable Node sibling) throws MalformedException
private boolean maybeInitMetaDataFromJsDoc(Builder builder, Node node)
private static String extractStringFromStringExprNode(Node node) throws MalformedException
private void extractFromFunctionNode(Builder builder, Node node) throws MalformedException
private void extractFromReturnDescendant(Builder builder, Node node) throws MalformedException
private void extractFromCallNode(Builder builder, Node node) throws MalformedException
private void parseMessageTextNode(Builder builder, Node node) throws MalformedException
private void visitFallbackFunctionCall(NodeTraversal t, Node call)
 abstract void processJsMessage(JsMessage message, JsMessageDefinition definition)
 void processMessageFallback(Node callNode, JsMessage message1, JsMessage message2)
 boolean isMessageName(String identifier, boolean isNewStyleMessage)
private static boolean isUnnamedMessageName(String identifier)
 static boolean isLowerCamelCaseWithNumericSuffixes(String input)
private static String getReadableTokenName(Node node)
 static String toLowerCamelCaseWithNumericSuffixes(String input)
protected void checkNode(@Nullable Node node, int type) throws MalformedException
 Node getNode()
String MSG_FUNCTION_NAME=Optional["goog.getMsg"]
String MSG_FALLBACK_FUNCTION_NAME=Optional["goog.getMsgWithFallback"]
DiagnosticType MESSAGE_HAS_NO_DESCRIPTION=Optional[DiagnosticType.warning("JSC_MSG_HAS_NO_DESCRIPTION", "Message {0} has no description. Add @desc JsDoc tag.")]
DiagnosticType MESSAGE_HAS_NO_TEXT=Optional[DiagnosticType.warning("JSC_MSG_HAS_NO_TEXT", "Message value of {0} is just an empty string. " + "Empty messages are forbidden.")]
DiagnosticType MESSAGE_TREE_MALFORMED=Optional[DiagnosticType.error("JSC_MSG_TREE_MALFORMED", "Message parse tree malformed. {0}")]
DiagnosticType MESSAGE_HAS_NO_VALUE=Optional[DiagnosticType.error("JSC_MSG_HAS_NO_VALUE", "message node {0} has no value")]
DiagnosticType MESSAGE_DUPLICATE_KEY=Optional[DiagnosticType.error("JSC_MSG_KEY_DUPLICATED", "duplicate message variable name found for {0}, " + "initial definition {1}:{2}")]
DiagnosticType MESSAGE_NODE_IS_ORPHANED=Optional[DiagnosticType.warning("JSC_MSG_ORPHANED_NODE", MSG_FUNCTION_NAME + "() function could be used only with MSG_* property or variable")]
DiagnosticType MESSAGE_NOT_INITIALIZED_USING_NEW_SYNTAX=Optional[DiagnosticType.error("JSC_MSG_NOT_INITIALIZED_USING_NEW_SYNTAX", "message not initialized using " + MSG_FUNCTION_NAME)]
DiagnosticType BAD_FALLBACK_SYNTAX=Optional[DiagnosticType.error("JSC_MSG_BAD_FALLBACK_SYNTAX", String.format("Bad syntax. " + "Expected syntax: goog.getMsgWithFallback(MSG_1, MSG_2)", MSG_FALLBACK_FUNCTION_NAME))]
DiagnosticType FALLBACK_ARG_ERROR=Optional[DiagnosticType.error("JSC_MSG_FALLBACK_ARG_ERROR", "Could not find message entry for fallback argument {0}")]
String PH_JS_PREFIX=Optional["{$"]
String PH_JS_SUFFIX=Optional["}"]
String MSG_PREFIX=Optional["MSG_"]
Pattern MSG_UNNAMED_PATTERN=Optional[Pattern.compile("MSG_UNNAMED_\\d+")]
Pattern CAMELCASE_PATTERN=Optional[Pattern.compile("[a-z][a-zA-Z\\d]*[_\\d]*")]
String HIDDEN_DESC_PREFIX=Optional["@hidden"]
String DESC_SUFFIX=Optional["_HELP"]
boolean needToCheckDuplications
JsMessage.Style style
JsMessage.IdGenerator idGenerator
AbstractCompiler compiler
Map<String, MessageLocation> messageNames=Optional[Maps.newHashMap()]
Map<Var, JsMessage> unnamedMessages=Optional[Maps.newHashMap()]
Map<Node, String> googMsgNodes=Optional[Maps.newHashMap()]
CheckLevel checkLevel
