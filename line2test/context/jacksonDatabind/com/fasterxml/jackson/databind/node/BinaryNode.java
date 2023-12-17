public BinaryNode(byte[] data)
public BinaryNode(byte[] data, int offset, int length)
public static BinaryNode valueOf(byte[] data)
public static BinaryNode valueOf(byte[] data, int offset, int length)
public JsonNodeType getNodeType()
public JsonToken asToken()
public byte[] binaryValue()
public String asText()
public final void serialize(JsonGenerator jg, SerializerProvider provider) throws IOException, JsonProcessingException
public boolean equals(Object o)
public int hashCode()
public String toString()
BinaryNode EMPTY_BINARY_NODE=Optional[new BinaryNode(new byte[0])]
byte[] _data
