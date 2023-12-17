public BasicClassIntrospector()
public BasicBeanDescription forSerialization(SerializationConfig cfg, JavaType type, MixInResolver r)
public BasicBeanDescription forDeserialization(DeserializationConfig cfg, JavaType type, MixInResolver r)
public BasicBeanDescription forDeserializationWithBuilder(DeserializationConfig cfg, JavaType type, MixInResolver r)
public BasicBeanDescription forCreation(DeserializationConfig cfg, JavaType type, MixInResolver r)
public BasicBeanDescription forClassAnnotations(MapperConfig<?> cfg, JavaType type, MixInResolver r)
public BasicBeanDescription forDirectClassAnnotations(MapperConfig<?> cfg, JavaType type, MixInResolver r)
protected POJOPropertiesCollector collectProperties(MapperConfig<?> config, JavaType type, MixInResolver r, boolean forSerialization, String mutatorPrefix)
protected POJOPropertiesCollector collectPropertiesWithBuilder(MapperConfig<?> config, JavaType type, MixInResolver r, boolean forSerialization)
protected POJOPropertiesCollector constructPropertyCollector(MapperConfig<?> config, AnnotatedClass ac, JavaType type, boolean forSerialization, String mutatorPrefix)
protected BasicBeanDescription _findCachedDesc(JavaType type)
long serialVersionUID=Optional[1L]
BasicBeanDescription STRING_DESC
BasicBeanDescription BOOLEAN_DESC
BasicBeanDescription INT_DESC
BasicBeanDescription LONG_DESC
BasicClassIntrospector instance=Optional[new BasicClassIntrospector()]
