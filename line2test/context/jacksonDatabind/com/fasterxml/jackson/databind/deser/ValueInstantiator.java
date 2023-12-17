public abstract String getValueTypeDesc()
public boolean canInstantiate()
public boolean canCreateFromString()
public boolean canCreateFromInt()
public boolean canCreateFromLong()
public boolean canCreateFromDouble()
public boolean canCreateFromBoolean()
public boolean canCreateUsingDefault()
public boolean canCreateUsingDelegate()
public boolean canCreateFromObjectWith()
public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig config)
public JavaType getDelegateType(DeserializationConfig config)
public Object createUsingDefault(DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object createFromObjectWith(DeserializationContext ctxt, Object[] args) throws IOException, JsonProcessingException
public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) throws IOException, JsonProcessingException
public Object createFromString(DeserializationContext ctxt, String value) throws IOException, JsonProcessingException
public Object createFromInt(DeserializationContext ctxt, int value) throws IOException, JsonProcessingException
public Object createFromLong(DeserializationContext ctxt, long value) throws IOException, JsonProcessingException
public Object createFromDouble(DeserializationContext ctxt, double value) throws IOException, JsonProcessingException
public Object createFromBoolean(DeserializationContext ctxt, boolean value) throws IOException, JsonProcessingException
public AnnotatedWithParams getDefaultCreator()
public AnnotatedWithParams getDelegateCreator()
public AnnotatedWithParams getWithArgsCreator()
public AnnotatedParameter getIncompleteParameter()
