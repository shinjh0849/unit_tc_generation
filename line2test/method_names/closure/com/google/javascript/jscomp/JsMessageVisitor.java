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
