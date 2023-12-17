protected ObjectIdWriter(JavaType t, SerializedString propName, ObjectIdGenerator<?> gen, JsonSerializer<?> ser, boolean alwaysAsId)
public static ObjectIdWriter construct(JavaType idType, String propName, ObjectIdGenerator<?> generator, boolean alwaysAsId)
public ObjectIdWriter withSerializer(JsonSerializer<?> ser)
public ObjectIdWriter withAlwaysAsId(boolean newState)
