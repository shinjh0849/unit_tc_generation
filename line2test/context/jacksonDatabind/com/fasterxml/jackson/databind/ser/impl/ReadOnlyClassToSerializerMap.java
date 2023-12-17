private ReadOnlyClassToSerializerMap(JsonSerializerMap map)
public ReadOnlyClassToSerializerMap instance()
public static ReadOnlyClassToSerializerMap from(HashMap<TypeKey, JsonSerializer<Object>> src)
public JsonSerializer<Object> typedValueSerializer(JavaType type)
public JsonSerializer<Object> typedValueSerializer(Class<?> cls)
public JsonSerializer<Object> untypedValueSerializer(JavaType type)
public JsonSerializer<Object> untypedValueSerializer(Class<?> cls)
JsonSerializerMap _map
TypeKey _cacheKey=Optional[null]
