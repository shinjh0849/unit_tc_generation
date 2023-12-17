public abstract DeserializerFactory withAdditionalDeserializers(Deserializers additional)
public abstract DeserializerFactory withAdditionalKeyDeserializers(KeyDeserializers additional)
public abstract DeserializerFactory withDeserializerModifier(BeanDeserializerModifier modifier)
public abstract DeserializerFactory withAbstractTypeResolver(AbstractTypeResolver resolver)
public abstract DeserializerFactory withValueInstantiators(ValueInstantiators instantiators)
public abstract JavaType mapAbstractType(DeserializationConfig config, JavaType type) throws JsonMappingException
public abstract ValueInstantiator findValueInstantiator(DeserializationContext ctxt, BeanDescription beanDesc) throws JsonMappingException
public abstract JsonDeserializer<Object> createBeanDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) throws JsonMappingException
public abstract JsonDeserializer<Object> createBuilderBasedDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc, Class<?> builderClass) throws JsonMappingException
public abstract JsonDeserializer<?> createArrayDeserializer(DeserializationContext ctxt, ArrayType type, BeanDescription beanDesc) throws JsonMappingException
public abstract JsonDeserializer<?> createCollectionDeserializer(DeserializationContext ctxt, CollectionType type, BeanDescription beanDesc) throws JsonMappingException
public abstract JsonDeserializer<?> createCollectionLikeDeserializer(DeserializationContext ctxt, CollectionLikeType type, BeanDescription beanDesc) throws JsonMappingException
public abstract JsonDeserializer<?> createEnumDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) throws JsonMappingException
public abstract JsonDeserializer<?> createMapDeserializer(DeserializationContext ctxt, MapType type, BeanDescription beanDesc) throws JsonMappingException
public abstract JsonDeserializer<?> createMapLikeDeserializer(DeserializationContext ctxt, MapLikeType type, BeanDescription beanDesc) throws JsonMappingException
public abstract JsonDeserializer<?> createTreeDeserializer(DeserializationConfig config, JavaType type, BeanDescription beanDesc) throws JsonMappingException
public abstract KeyDeserializer createKeyDeserializer(DeserializationContext ctxt, JavaType type) throws JsonMappingException
public abstract TypeDeserializer findTypeDeserializer(DeserializationConfig config, JavaType baseType) throws JsonMappingException
