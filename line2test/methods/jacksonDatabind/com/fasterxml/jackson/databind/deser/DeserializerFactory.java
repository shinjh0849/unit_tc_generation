public abstract DeserializerFactory withAdditionalDeserializers(Deserializers additional); <line_num>: 55,55
public abstract DeserializerFactory withAdditionalKeyDeserializers(KeyDeserializers additional); <line_num>: 61,61
public abstract DeserializerFactory withDeserializerModifier(BeanDeserializerModifier modifier); <line_num>: 67,67
public abstract DeserializerFactory withAbstractTypeResolver(AbstractTypeResolver resolver); <line_num>: 73,73
public abstract DeserializerFactory withValueInstantiators(ValueInstantiators instantiators); <line_num>: 79,79
public abstract JavaType mapAbstractType(DeserializationConfig config, JavaType type) throws JsonMappingException; <line_num>: 93,94
public abstract ValueInstantiator findValueInstantiator(DeserializationContext ctxt, BeanDescription beanDesc) throws JsonMappingException; <line_num>: 100,102
public abstract JsonDeserializer<Object> createBeanDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) throws JsonMappingException; <line_num>: 116,118
public abstract JsonDeserializer<Object> createBuilderBasedDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc, Class<?> builderClass) throws JsonMappingException; <line_num>: 126,129
public abstract JsonDeserializer<?> createArrayDeserializer(DeserializationContext ctxt, ArrayType type, BeanDescription beanDesc) throws JsonMappingException; <line_num>: 138,140
public abstract JsonDeserializer<?> createCollectionDeserializer(DeserializationContext ctxt, CollectionType type, BeanDescription beanDesc) throws JsonMappingException; <line_num>: 142,144
public abstract JsonDeserializer<?> createCollectionLikeDeserializer(DeserializationContext ctxt, CollectionLikeType type, BeanDescription beanDesc) throws JsonMappingException; <line_num>: 146,148
public abstract JsonDeserializer<?> createEnumDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) throws JsonMappingException; <line_num>: 150,152
public abstract JsonDeserializer<?> createMapDeserializer(DeserializationContext ctxt, MapType type, BeanDescription beanDesc) throws JsonMappingException; <line_num>: 154,156
public abstract JsonDeserializer<?> createMapLikeDeserializer(DeserializationContext ctxt, MapLikeType type, BeanDescription beanDesc) throws JsonMappingException; <line_num>: 158,160
public abstract JsonDeserializer<?> createTreeDeserializer(DeserializationConfig config, JavaType type, BeanDescription beanDesc) throws JsonMappingException; <line_num>: 166,168
public abstract KeyDeserializer createKeyDeserializer(DeserializationContext ctxt, JavaType type) throws JsonMappingException; <line_num>: 178,180
public abstract TypeDeserializer findTypeDeserializer(DeserializationConfig config, JavaType baseType) throws JsonMappingException; <line_num>: 195,197
