public static KeyDeserializer constructStringKeyDeserializer(DeserializationConfig config, JavaType type)
public static KeyDeserializer constructEnumKeyDeserializer(EnumResolver<?> enumResolver)
public static KeyDeserializer constructEnumKeyDeserializer(EnumResolver<?> enumResolver, AnnotatedMethod factory)
public static KeyDeserializer constructDelegatingKeyDeserializer(DeserializationConfig config, JavaType type, JsonDeserializer<?> deser)
public static KeyDeserializer findStringBasedKeyDeserializer(DeserializationConfig config, JavaType type)
public KeyDeserializer findKeyDeserializer(JavaType type, DeserializationConfig config, BeanDescription beanDesc) throws JsonMappingException
