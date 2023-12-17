 ReplaceMessages(AbstractCompiler compiler, MessageBundle bundle, boolean checkDuplicatedMessages, JsMessage.Style style, boolean strictReplacement)
 void processMessageFallback(Node callNode, JsMessage message1, JsMessage message2)
 void processJsMessage(JsMessage message, JsMessageDefinition definition)
private Node getNewValueNode(JsMessage message, Node origValueNode) throws MalformedException
private void updateFunctionNode(JsMessage message, Node functionNode) throws MalformedException
private Node constructAddOrStringNode(Iterator<CharSequence> partsIterator, Node argListNode) throws MalformedException
private Node replaceCallNode(JsMessage message, Node callNode) throws MalformedException
private Node constructStringExprNode(Iterator<CharSequence> parts, Node objLitNode) throws MalformedException
private void checkStringExprNode(@Nullable Node node)
