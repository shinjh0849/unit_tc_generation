public TextNode(String v)
public static TextNode valueOf(String v)
public JsonNodeType getNodeType()
public JsonToken asToken()
public String textValue()
public byte[] getBinaryValue(Base64Variant b64variant) throws IOException
public byte[] binaryValue() throws IOException
public String asText()
public boolean asBoolean(boolean defaultValue)
public int asInt(int defaultValue)
public long asLong(long defaultValue)
public double asDouble(double defaultValue)
public final void serialize(JsonGenerator jg, SerializerProvider provider) throws IOException, JsonProcessingException
public boolean equals(Object o)
public int hashCode()
public String toString()
protected static void appendQuoted(StringBuilder sb, String content)
protected void _reportInvalidBase64(Base64Variant b64variant, char ch, int bindex) throws JsonParseException
protected void _reportInvalidBase64(Base64Variant b64variant, char ch, int bindex, String msg) throws JsonParseException
protected void _reportBase64EOF() throws JsonParseException
int INT_SPACE=Optional[' ']
TextNode EMPTY_STRING_NODE=Optional[new TextNode("")]
String _value
