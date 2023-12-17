protected DOMDeserializer(Class<T> cls) { [EOL]     super(cls); [EOL] } <line_num>: 30,30
public NodeDeserializer() { [EOL]     super(Node.class); [EOL] } <line_num>: 53,53
public DocumentDeserializer() { [EOL]     super(Document.class); [EOL] } <line_num>: 63,63
@Override [EOL] public abstract T _deserialize(String value, DeserializationContext ctxt); <line_num>: 32,33
protected final Document parse(String value) throws IllegalArgumentException { [EOL]     try { [EOL]         return _parserFactory.newDocumentBuilder().parse(new InputSource(new StringReader(value))); [EOL]     } catch (Exception e) { [EOL]         throw new IllegalArgumentException("Failed to parse JSON String as XML: " + e.getMessage(), e); [EOL]     } [EOL] } <line_num>: 35,42
@Override [EOL] public Node _deserialize(String value, DeserializationContext ctxt) throws IllegalArgumentException { [EOL]     return parse(value); [EOL] } <line_num>: 54,57
@Override [EOL] public Document _deserialize(String value, DeserializationContext ctxt) throws IllegalArgumentException { [EOL]     return parse(value); [EOL] } <line_num>: 64,67
