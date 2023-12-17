public BeanPropertyWriter(BeanPropertyDefinition propDef, AnnotatedMember member, Annotations contextAnnotations, JavaType declaredType, JsonSerializer<?> ser, TypeSerializer typeSer, JavaType serType, boolean suppressNulls, Object suppressableValue)
protected BeanPropertyWriter(BeanPropertyWriter base)
protected BeanPropertyWriter(BeanPropertyWriter base, SerializedString name)
public BeanPropertyWriter rename(NameTransformer transformer)
public void assignSerializer(JsonSerializer<Object> ser)
public void assignNullSerializer(JsonSerializer<Object> nullSer)
public BeanPropertyWriter unwrappingWriter(NameTransformer unwrapper)
public void setNonTrivialBaseType(JavaType t)
public String getName()
public JavaType getType()
public PropertyName getWrapperName()
public boolean isRequired()
public A getAnnotation(Class<A> acls)
public A getContextAnnotation(Class<A> acls)
public AnnotatedMember getMember()
public void depositSchemaProperty(JsonObjectFormatVisitor objectVisitor) throws JsonMappingException
public Object getInternalSetting(Object key)
public Object setInternalSetting(Object key, Object value)
public Object removeInternalSetting(Object key)
public SerializedString getSerializedName()
public boolean hasSerializer()
public boolean hasNullSerializer()
public boolean willSuppressNulls()
public JsonSerializer<Object> getSerializer()
public JavaType getSerializationType()
public Class<?> getRawSerializationType()
public Class<?> getPropertyType()
public Type getGenericPropertyType()
public Class<?>[] getViews()
protected boolean isRequired(AnnotationIntrospector intr)
public void depositSchemaProperty(ObjectNode propertiesNode, SerializerProvider provider) throws JsonMappingException
public void serializeAsField(Object bean, JsonGenerator jgen, SerializerProvider prov) throws Exception
public void serializeAsColumn(Object bean, JsonGenerator jgen, SerializerProvider prov) throws Exception
public void serializeAsPlaceholder(Object bean, JsonGenerator jgen, SerializerProvider prov) throws Exception
protected JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap map, Class<?> type, SerializerProvider provider) throws JsonMappingException
public final Object get(Object bean) throws Exception
protected void _handleSelfReference(Object bean, JsonSerializer<?> ser) throws JsonMappingException
public String toString()
