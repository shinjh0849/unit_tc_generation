public abstract JsonDeserializer<?> deserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> deserClass); <line_num>: 46,47
public abstract KeyDeserializer keyDeserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> keyDeserClass); <line_num>: 60,61
public abstract JsonSerializer<?> serializerInstance(SerializationConfig config, Annotated annotated, Class<?> serClass); <line_num>: 74,75
public abstract TypeResolverBuilder<?> typeResolverBuilderInstance(MapperConfig<?> config, Annotated annotated, Class<?> builderClass); <line_num>: 89,90
public abstract TypeIdResolver typeIdResolverInstance(MapperConfig<?> config, Annotated annotated, Class<?> resolverClass); <line_num>: 104,105
public ValueInstantiator valueInstantiatorInstance(MapperConfig<?> config, Annotated annotated, Class<?> resolverClass) { [EOL]     return null; [EOL] } <line_num>: 110,113
public ObjectIdGenerator<?> objectIdGeneratorInstance(MapperConfig<?> config, Annotated annotated, Class<?> implClass) { [EOL]     return null; [EOL] } <line_num>: 121,124
public PropertyNamingStrategy namingStrategyInstance(MapperConfig<?> config, Annotated annotated, Class<?> implClass) { [EOL]     return null; [EOL] } <line_num>: 132,135
public Converter<?, ?> converterInstance(MapperConfig<?> config, Annotated annotated, Class<?> implClass) { [EOL]     return null; [EOL] } <line_num>: 142,145
