public Gson()
 Gson(ExclusionStrategy serializationStrategy, ExclusionStrategy deserializationStrategy, FieldNamingStrategy2 fieldNamingPolicy, MappedObjectConstructor objectConstructor, boolean serializeNulls, ParameterizedTypeHandlerMap<JsonSerializer<?>> serializers, ParameterizedTypeHandlerMap<JsonDeserializer<?>> deserializers, boolean generateNonExecutableGson, boolean htmlSafe, boolean prettyPrinting)
private ObjectNavigatorFactory createDefaultObjectNavigatorFactory(ExclusionStrategy strategy)
private static ExclusionStrategy createExclusionStrategy(double version)
public JsonElement toJsonTree(Object src)
public JsonElement toJsonTree(Object src, Type typeOfSrc)
public String toJson(Object src)
public String toJson(Object src, Type typeOfSrc)
public void toJson(Object src, Appendable writer)
public void toJson(Object src, Type typeOfSrc, Appendable writer)
public void toJson(Object src, Type typeOfSrc, JsonWriter writer)
public String toJson(JsonElement jsonElement)
public void toJson(JsonElement jsonElement, Appendable writer)
public void toJson(JsonElement jsonElement, JsonWriter writer)
public T fromJson(String json, Class<T> classOfT) throws JsonParseException
public T fromJson(String json, Type typeOfT) throws JsonParseException
public T fromJson(Reader json, Class<T> classOfT) throws JsonParseException
public T fromJson(Reader json, Type typeOfT) throws JsonParseException
public T fromJson(JsonReader reader, Type typeOfT) throws JsonParseException
public T fromJson(JsonElement json, Class<T> classOfT) throws JsonParseException
public T fromJson(JsonElement json, Type typeOfT) throws JsonParseException
private void writeOutNullString(Appendable writer) throws IOException
public String toString()
