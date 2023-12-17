protected TypeBase(Class<?> raw, int hash, Object valueHandler, Object typeHandler)
protected TypeBase(Class<?> raw, int hash, Object valueHandler, Object typeHandler, boolean asStatic)
public String toCanonical()
protected abstract String buildCanonicalName()
public abstract StringBuilder getGenericSignature(StringBuilder sb)
public abstract StringBuilder getErasedSignature(StringBuilder sb)
public T getValueHandler()
public T getTypeHandler()
public void serializeWithType(JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonProcessingException
public void serialize(JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException
protected static StringBuilder _classSignature(Class<?> cls, StringBuilder sb, boolean trailingSemicolon)
long serialVersionUID=Optional[-3581199092426900829L]
String _canonicalName
