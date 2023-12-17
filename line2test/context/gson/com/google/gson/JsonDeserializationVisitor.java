public JsonDeserializationVisitor(JsonElement json, Type targetType, ObjectNavigatorFactory factory, ObjectConstructor objectConstructor, ParameterizedTypeHandlerMap<JsonDeserializer<?>> deserializers, JsonDeserializationContext context)
public T getTarget()
protected abstract T constructTarget()
public void start(ObjectTypePair node)
public void end(ObjectTypePair node)
public final boolean visitUsingCustomHandler(ObjectTypePair objTypePair)
protected Object invokeCustomDeserializer(JsonElement element, Pair<JsonDeserializer<?>, ObjectTypePair> pair)
 final Object visitChildAsObject(Type childType, JsonElement jsonChild)
 final Object visitChildAsArray(Type childType, JsonArray jsonChild)
private Object visitChild(Type type, JsonDeserializationVisitor<?> childVisitor)
ObjectNavigatorFactory factory
ObjectConstructor objectConstructor
ParameterizedTypeHandlerMap<JsonDeserializer<?>> deserializers
T target
JsonElement json
Type targetType
JsonDeserializationContext context
boolean constructed
