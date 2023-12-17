public JsMessageExtractor(JsMessage.IdGenerator idGenerator, JsMessage.Style style)
public JsMessageExtractor(JsMessage.IdGenerator idGenerator, JsMessage.Style style, CompilerOptions options)
private ExtractMessagesVisitor(AbstractCompiler compiler)
 void processJsMessage(JsMessage message, JsMessageDefinition definition)
public Collection<JsMessage> getMessages()
public Collection<JsMessage> extractMessages(SourceFile... inputs) throws IOException
public Collection<JsMessage> extractMessages(Iterable<T> inputs) throws IOException
JsMessage.Style style
JsMessage.IdGenerator idGenerator
CompilerOptions options
