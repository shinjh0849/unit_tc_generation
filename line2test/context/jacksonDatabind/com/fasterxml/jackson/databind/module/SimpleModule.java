public SimpleModule()
public SimpleModule(String name)
public SimpleModule(Version version)
public SimpleModule(String name, Version version)
public SimpleModule(String name, Version version, Map<Class<?>, JsonDeserializer<?>> deserializers)
public SimpleModule(String name, Version version, List<JsonSerializer<?>> serializers)
public SimpleModule(String name, Version version, Map<Class<?>, JsonDeserializer<?>> deserializers, List<JsonSerializer<?>> serializers)
public void setSerializers(SimpleSerializers s)
public void setDeserializers(SimpleDeserializers d)
public void setKeySerializers(SimpleSerializers ks)
public void setKeyDeserializers(SimpleKeyDeserializers kd)
public void setAbstractTypes(SimpleAbstractTypeResolver atr)
public void setValueInstantiators(SimpleValueInstantiators svi)
public SimpleModule setDeserializerModifier(BeanDeserializerModifier mod)
public SimpleModule setSerializerModifier(BeanSerializerModifier mod)
public SimpleModule addSerializer(JsonSerializer<?> ser)
public SimpleModule addSerializer(Class<? extends T> type, JsonSerializer<T> ser)
public SimpleModule addKeySerializer(Class<? extends T> type, JsonSerializer<T> ser)
public SimpleModule addDeserializer(Class<T> type, JsonDeserializer<? extends T> deser)
public SimpleModule addKeyDeserializer(Class<?> type, KeyDeserializer deser)
public SimpleModule addAbstractTypeMapping(Class<T> superType, Class<? extends T> subType)
public SimpleModule addValueInstantiator(Class<?> beanType, ValueInstantiator inst)
public SimpleModule registerSubtypes(Class<?>... subtypes)
public SimpleModule registerSubtypes(NamedType... subtypes)
public SimpleModule setMixInAnnotation(Class<?> targetType, Class<?> mixinClass)
public String getModuleName()
public void setupModule(SetupContext context)
public Version version()
long serialVersionUID=Optional[3132264350026957446L]
String _name
Version _version
SimpleSerializers _serializers=Optional[null]
SimpleDeserializers _deserializers=Optional[null]
SimpleSerializers _keySerializers=Optional[null]
SimpleKeyDeserializers _keyDeserializers=Optional[null]
SimpleAbstractTypeResolver _abstractTypes=Optional[null]
SimpleValueInstantiators _valueInstantiators=Optional[null]
BeanDeserializerModifier _deserializerModifier=Optional[null]
BeanSerializerModifier _serializerModifier=Optional[null]
HashMap<Class<?>, Class<?>> _mixins=Optional[null]
LinkedHashSet<NamedType> _subtypes=Optional[null]
