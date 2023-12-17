public abstract MapperConfig<?> getConfig()
public abstract AnnotationIntrospector getAnnotationIntrospector()
public final boolean isEnabled(MapperFeature feature)
public final boolean canOverrideAccessModifiers()
public abstract Class<?> getActiveView()
public JavaType constructType(Type type)
public JavaType constructSpecializedType(JavaType baseType, Class<?> subclass)
public abstract TypeFactory getTypeFactory()
public ObjectIdGenerator<?> objectIdGeneratorInstance(Annotated annotated, ObjectIdInfo objectIdInfo) throws JsonMappingException
public Converter<Object, Object> converterInstance(Annotated annotated, Object converterDef) throws JsonMappingException
