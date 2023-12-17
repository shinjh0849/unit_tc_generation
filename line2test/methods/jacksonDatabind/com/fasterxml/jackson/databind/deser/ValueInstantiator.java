public abstract String getValueTypeDesc(); <line_num>: 44,44
public boolean canInstantiate() { [EOL]     return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean(); [EOL] } <line_num>: 51,62
public boolean canCreateFromString() { [EOL]     return false; [EOL] } <line_num>: 68,70
public boolean canCreateFromInt() { [EOL]     return false; [EOL] } <line_num>: 76,78
public boolean canCreateFromLong() { [EOL]     return false; [EOL] } <line_num>: 84,86
public boolean canCreateFromDouble() { [EOL]     return false; [EOL] } <line_num>: 92,94
public boolean canCreateFromBoolean() { [EOL]     return false; [EOL] } <line_num>: 100,102
public boolean canCreateUsingDefault() { [EOL]     return getDefaultCreator() != null; [EOL] } <line_num>: 109,111
public boolean canCreateUsingDelegate() { [EOL]     return false; [EOL] } <line_num>: 118,120
public boolean canCreateFromObjectWith() { [EOL]     return false; [EOL] } <line_num>: 127,129
public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig config) { [EOL]     return null; [EOL] } <line_num>: 141,143
public JavaType getDelegateType(DeserializationConfig config) { [EOL]     return null; [EOL] } <line_num>: 152,154
public Object createUsingDefault(DeserializationContext ctxt) throws IOException, JsonProcessingException { [EOL]     throw new JsonMappingException("Can not instantiate value of type " + getValueTypeDesc() + "; no default creator found"); [EOL] } <line_num>: 172,176
public Object createFromObjectWith(DeserializationContext ctxt, Object[] args) throws IOException, JsonProcessingException { [EOL]     throw new JsonMappingException("Can not instantiate value of type " + getValueTypeDesc() + " with arguments"); [EOL] } <line_num>: 186,190
public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) throws IOException, JsonProcessingException { [EOL]     throw new JsonMappingException("Can not instantiate value of type " + getValueTypeDesc() + " using delegate"); [EOL] } <line_num>: 196,201
public Object createFromString(DeserializationContext ctxt, String value) throws IOException, JsonProcessingException { [EOL]     throw new JsonMappingException("Can not instantiate value of type " + getValueTypeDesc() + " from String value"); [EOL] } <line_num>: 210,214
public Object createFromInt(DeserializationContext ctxt, int value) throws IOException, JsonProcessingException { [EOL]     throw new JsonMappingException("Can not instantiate value of type " + getValueTypeDesc() + " from Integer number (int)"); [EOL] } <line_num>: 216,220
public Object createFromLong(DeserializationContext ctxt, long value) throws IOException, JsonProcessingException { [EOL]     throw new JsonMappingException("Can not instantiate value of type " + getValueTypeDesc() + " from Integer number (long)"); [EOL] } <line_num>: 222,226
public Object createFromDouble(DeserializationContext ctxt, double value) throws IOException, JsonProcessingException { [EOL]     throw new JsonMappingException("Can not instantiate value of type " + getValueTypeDesc() + " from Floating-point number (double)"); [EOL] } <line_num>: 228,232
public Object createFromBoolean(DeserializationContext ctxt, boolean value) throws IOException, JsonProcessingException { [EOL]     throw new JsonMappingException("Can not instantiate value of type " + getValueTypeDesc() + " from Boolean value"); [EOL] } <line_num>: 234,238
public AnnotatedWithParams getDefaultCreator() { [EOL]     return null; [EOL] } <line_num>: 256,258
public AnnotatedWithParams getDelegateCreator() { [EOL]     return null; [EOL] } <line_num>: 268,270
public AnnotatedWithParams getWithArgsCreator() { [EOL]     return null; [EOL] } <line_num>: 281,283
public AnnotatedParameter getIncompleteParameter() { [EOL]     return null; [EOL] } <line_num>: 289,291
