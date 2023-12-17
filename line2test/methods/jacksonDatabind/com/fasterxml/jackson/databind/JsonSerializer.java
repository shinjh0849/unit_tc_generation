public JsonSerializer<T> unwrappingSerializer(NameTransformer unwrapper) { [EOL]     return this; [EOL] } <line_num>: 72,74
public JsonSerializer<T> replaceDelegatee(JsonSerializer<?> delegatee) { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 85,87
public abstract void serialize(T value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException; <line_num>: 104,105
public void serializeWithType(T value, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonProcessingException { [EOL]     Class<?> clz = handledType(); [EOL]     if (clz == null) { [EOL]         clz = value.getClass(); [EOL]     } [EOL]     throw new UnsupportedOperationException("Type id handling not implemented for type " + clz.getName()); [EOL] } <line_num>: 134,143
public Class<T> handledType() { [EOL]     return null; [EOL] } <line_num>: 162,162
public boolean isEmpty(T value) { [EOL]     return (value == null); [EOL] } <line_num>: 173,175
public boolean usesObjectId() { [EOL]     return false; [EOL] } <line_num>: 181,183
public boolean isUnwrappingSerializer() { [EOL]     return false; [EOL] } <line_num>: 191,193
public JsonSerializer<?> getDelegatee() { [EOL]     return null; [EOL] } <line_num>: 206,208
@Override [EOL] public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType type) throws JsonMappingException { [EOL]     if (visitor != null) [EOL]         visitor.expectAnyFormat(type); [EOL] } <line_num>: 221,226
