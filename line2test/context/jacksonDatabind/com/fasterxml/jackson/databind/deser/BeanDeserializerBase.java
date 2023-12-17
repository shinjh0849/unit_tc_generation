protected BeanDeserializerBase(BeanDeserializerBuilder builder, BeanDescription beanDesc, BeanPropertyMap properties, Map<String, SettableBeanProperty> backRefs, HashSet<String> ignorableProps, boolean ignoreAllUnknown, boolean hasViews)
protected BeanDeserializerBase(BeanDeserializerBase src)
protected BeanDeserializerBase(BeanDeserializerBase src, boolean ignoreAllUnknown)
protected BeanDeserializerBase(BeanDeserializerBase src, NameTransformer unwrapper)
public BeanDeserializerBase(BeanDeserializerBase src, ObjectIdReader oir)
public BeanDeserializerBase(BeanDeserializerBase src, HashSet<String> ignorableProps)
public abstract JsonDeserializer<Object> unwrappingDeserializer(NameTransformer unwrapper)
public abstract BeanDeserializerBase withObjectIdReader(ObjectIdReader oir)
public abstract BeanDeserializerBase withIgnorableProperties(HashSet<String> ignorableProps)
protected abstract BeanDeserializerBase asArrayDeserializer()
public void resolve(DeserializationContext ctxt) throws JsonMappingException
protected JsonDeserializer<Object> findConvertingDeserializer(DeserializationContext ctxt, SettableBeanProperty prop) throws JsonMappingException
public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException
protected SettableBeanProperty _resolveManagedReferenceProperty(DeserializationContext ctxt, SettableBeanProperty prop)
protected SettableBeanProperty _resolveUnwrappedProperty(DeserializationContext ctxt, SettableBeanProperty prop)
protected SettableBeanProperty _resolveInnerClassValuedProperty(DeserializationContext ctxt, SettableBeanProperty prop)
public boolean isCachable()
public ObjectIdReader getObjectIdReader()
public boolean hasProperty(String propertyName)
public boolean hasViews()
public int getPropertyCount()
public Collection<Object> getKnownPropertyNames()
public final Class<?> getBeanClass()
public JavaType getValueType()
public Iterator<SettableBeanProperty> properties()
public Iterator<SettableBeanProperty> creatorProperties()
public SettableBeanProperty findProperty(String propertyName)
public SettableBeanProperty findBackReference(String logicalName)
public ValueInstantiator getValueInstantiator()
public void replaceProperty(SettableBeanProperty original, SettableBeanProperty replacement)
public abstract Object deserializeFromObject(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public final Object deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException, JsonProcessingException
protected Object deserializeWithObjectId(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected Object deserializeFromObjectId(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected Object deserializeFromObjectUsingNonDefault(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected abstract Object _deserializeUsingPropertyBased(final JsonParser jp, final DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object deserializeFromNumber(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object deserializeFromString(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object deserializeFromDouble(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object deserializeFromBoolean(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object deserializeFromArray(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected void injectValues(DeserializationContext ctxt, Object bean) throws IOException, JsonProcessingException
protected void handleUnknownProperty(JsonParser jp, DeserializationContext ctxt, Object beanOrClass, String propName) throws IOException, JsonProcessingException
protected Object handleUnknownProperties(DeserializationContext ctxt, Object bean, TokenBuffer unknownTokens) throws IOException, JsonProcessingException
protected void handleUnknownVanilla(JsonParser jp, DeserializationContext ctxt, Object bean, String propName) throws IOException, JsonProcessingException
protected Object handlePolymorphic(JsonParser jp, DeserializationContext ctxt, Object bean, TokenBuffer unknownTokens) throws IOException, JsonProcessingException
protected JsonDeserializer<Object> _findSubclassDeserializer(DeserializationContext ctxt, Object bean, TokenBuffer unknownTokens) throws IOException, JsonProcessingException
public void wrapAndThrow(Throwable t, Object bean, String fieldName, DeserializationContext ctxt) throws IOException
public void wrapAndThrow(Throwable t, Object bean, int index, DeserializationContext ctxt) throws IOException
protected void wrapInstantiationProblem(Throwable t, DeserializationContext ctxt) throws IOException
long serialVersionUID=Optional[-2038793552422727904L]
Annotations _classAnnotations
JavaType _beanType
JsonFormat.Shape _serializationShape
ValueInstantiator _valueInstantiator
JsonDeserializer<Object> _delegateDeserializer
PropertyBasedCreator _propertyBasedCreator
boolean _nonStandardCreation
boolean _vanillaProcessing
BeanPropertyMap _beanProperties
ValueInjector[] _injectables
SettableAnyProperty _anySetter
HashSet<String> _ignorableProps
boolean _ignoreAllUnknown
boolean _needViewProcesing
Map<String, SettableBeanProperty> _backRefs
HashMap<ClassKey, JsonDeserializer<Object>> _subDeserializers
UnwrappedPropertyHandler _unwrappedPropertyHandler
ExternalTypeHandler _externalTypeIdHandler
ObjectIdReader _objectIdReader
