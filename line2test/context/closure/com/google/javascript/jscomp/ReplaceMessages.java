 ReplaceMessages(AbstractCompiler compiler, MessageBundle bundle, boolean checkDuplicatedMessages, JsMessage.Style style, boolean strictReplacement)
 void processMessageFallback(Node callNode, JsMessage message1, JsMessage message2)
 void processJsMessage(JsMessage message, JsMessageDefinition definition)
private Node getNewValueNode(JsMessage message, Node origValueNode) throws MalformedException
private void updateFunctionNode(JsMessage message, Node functionNode) throws MalformedException
private Node constructAddOrStringNode(Iterator<CharSequence> partsIterator, Node argListNode) throws MalformedException
private Node replaceCallNode(JsMessage message, Node callNode) throws MalformedException
private Node constructStringExprNode(Iterator<CharSequence> parts, Node objLitNode) throws MalformedException
private void checkStringExprNode(@Nullable Node node)
MessageBundle bundle
boolean strictReplacement
DiagnosticType BUNDLE_DOES_NOT_HAVE_THE_MESSAGE=Optional[DiagnosticType.error("JSC_BUNDLE_DOES_NOT_HAVE_THE_MESSAGE", "Message with id = {0} could not be found in replacement bundle")]
