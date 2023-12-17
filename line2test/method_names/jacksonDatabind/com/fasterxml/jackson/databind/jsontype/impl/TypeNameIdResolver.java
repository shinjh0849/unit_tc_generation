protected TypeNameIdResolver(MapperConfig<?> config, JavaType baseType, HashMap<String, String> typeToId, HashMap<String, JavaType> idToType)
public static TypeNameIdResolver construct(MapperConfig<?> config, JavaType baseType, Collection<NamedType> subtypes, boolean forSer, boolean forDeser)
public JsonTypeInfo.Id getMechanism()
public String idFromValue(Object value)
public String idFromValueAndType(Object value, Class<?> type)
public JavaType typeFromId(String id) throws IllegalArgumentException
public String toString()
protected static String _defaultTypeId(Class<?> cls)
