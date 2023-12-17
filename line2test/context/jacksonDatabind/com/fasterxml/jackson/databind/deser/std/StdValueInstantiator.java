public StdValueInstantiator(DeserializationConfig config, Class<?> valueType)
public StdValueInstantiator(DeserializationConfig config, JavaType valueType)
protected StdValueInstantiator(StdValueInstantiator src)
public void configureFromObjectSettings(AnnotatedWithParams defaultCreator, AnnotatedWithParams delegateCreator, JavaType delegateType, CreatorProperty[] delegateArgs, AnnotatedWithParams withArgsCreator, CreatorProperty[] constructorArgs)
public void configureFromStringCreator(AnnotatedWithParams creator)
public void configureFromIntCreator(AnnotatedWithParams creator)
public void configureFromLongCreator(AnnotatedWithParams creator)
public void configureFromDoubleCreator(AnnotatedWithParams creator)
public void configureFromBooleanCreator(AnnotatedWithParams creator)
public void configureIncompleteParameter(AnnotatedParameter parameter)
public String getValueTypeDesc()
public boolean canCreateFromString()
public boolean canCreateFromInt()
public boolean canCreateFromLong()
public boolean canCreateFromDouble()
public boolean canCreateFromBoolean()
public boolean canCreateUsingDefault()
public boolean canCreateUsingDelegate()
public boolean canCreateFromObjectWith()
public JavaType getDelegateType(DeserializationConfig config)
public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig config)
public Object createUsingDefault(DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object createFromObjectWith(DeserializationContext ctxt, Object[] args) throws IOException, JsonProcessingException
public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) throws IOException, JsonProcessingException
public Object createFromString(DeserializationContext ctxt, String value) throws IOException, JsonProcessingException
public Object createFromInt(DeserializationContext ctxt, int value) throws IOException, JsonProcessingException
public Object createFromLong(DeserializationContext ctxt, long value) throws IOException, JsonProcessingException
public Object createFromDouble(DeserializationContext ctxt, double value) throws IOException, JsonProcessingException
public Object createFromBoolean(DeserializationContext ctxt, boolean value) throws IOException, JsonProcessingException
public AnnotatedWithParams getDelegateCreator()
public AnnotatedWithParams getDefaultCreator()
public AnnotatedWithParams getWithArgsCreator()
public AnnotatedParameter getIncompleteParameter()
protected Object _createFromStringFallbacks(DeserializationContext ctxt, String value) throws IOException, JsonProcessingException
protected JsonMappingException wrapException(Throwable t)
long serialVersionUID=Optional[1L]
String _valueTypeDesc
boolean _cfgEmptyStringsAsObjects
AnnotatedWithParams _defaultCreator
AnnotatedWithParams _withArgsCreator
CreatorProperty[] _constructorArguments
JavaType _delegateType
AnnotatedWithParams _delegateCreator
CreatorProperty[] _delegateArguments
AnnotatedWithParams _fromStringCreator
AnnotatedWithParams _fromIntCreator
AnnotatedWithParams _fromLongCreator
AnnotatedWithParams _fromDoubleCreator
AnnotatedWithParams _fromBooleanCreator
AnnotatedParameter _incompleteParameter
