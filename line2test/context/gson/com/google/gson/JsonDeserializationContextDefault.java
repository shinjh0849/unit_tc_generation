 JsonDeserializationContextDefault(ObjectNavigatorFactory navigatorFactory, ParameterizedTypeHandlerMap<JsonDeserializer<?>> deserializers, MappedObjectConstructor objectConstructor)
 ObjectConstructor getObjectConstructor()
public T deserialize(JsonElement json, Type typeOfT) throws JsonParseException
private T fromJsonArray(Type arrayType, JsonArray jsonArray, JsonDeserializationContext context) throws JsonParseException
private T fromJsonObject(Type typeOfT, JsonObject jsonObject, JsonDeserializationContext context) throws JsonParseException
private T fromJsonPrimitive(Type typeOfT, JsonPrimitive json, JsonDeserializationContext context) throws JsonParseException
ObjectNavigatorFactory navigatorFactory
ParameterizedTypeHandlerMap<JsonDeserializer<?>> deserializers
MappedObjectConstructor objectConstructor
