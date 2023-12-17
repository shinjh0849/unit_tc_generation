public StdTypeResolverBuilder()
public static StdTypeResolverBuilder noTypeInfoBuilder()
public StdTypeResolverBuilder init(JsonTypeInfo.Id idType, TypeIdResolver idRes)
public TypeSerializer buildTypeSerializer(SerializationConfig config, JavaType baseType, Collection<NamedType> subtypes)
public TypeDeserializer buildTypeDeserializer(DeserializationConfig config, JavaType baseType, Collection<NamedType> subtypes)
public StdTypeResolverBuilder inclusion(JsonTypeInfo.As includeAs)
public StdTypeResolverBuilder typeProperty(String typeIdPropName)
public StdTypeResolverBuilder defaultImpl(Class<?> defaultImpl)
public StdTypeResolverBuilder typeIdVisibility(boolean isVisible)
public String getTypeProperty()
public Class<?> getDefaultImpl()
public boolean isTypeIdVisible()
protected TypeIdResolver idResolver(MapperConfig<?> config, JavaType baseType, Collection<NamedType> subtypes, boolean forSer, boolean forDeser)
JsonTypeInfo.Id _idType
JsonTypeInfo.As _includeAs
String _typeProperty
boolean _typeIdVisible=Optional[false]
Class<?> _defaultImpl
TypeIdResolver _customIdResolver
