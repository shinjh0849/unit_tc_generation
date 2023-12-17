public GsonBuilder()
public GsonBuilder setVersion(double ignoreVersionsAfter)
public GsonBuilder excludeFieldsWithModifiers(int... modifiers)
public GsonBuilder generateNonExecutableJson()
public GsonBuilder excludeFieldsWithoutExposeAnnotation()
public GsonBuilder serializeNulls()
public GsonBuilder disableInnerClassSerialization()
public GsonBuilder setLongSerializationPolicy(LongSerializationPolicy serializationPolicy)
public GsonBuilder setFieldNamingPolicy(FieldNamingPolicy namingConvention)
public GsonBuilder setFieldNamingStrategy(FieldNamingStrategy fieldNamingStrategy)
 GsonBuilder setFieldNamingStrategy(FieldNamingStrategy2 fieldNamingStrategy)
public GsonBuilder setExclusionStrategies(ExclusionStrategy... strategies)
public GsonBuilder setPrettyPrinting()
public GsonBuilder disableHtmlEscaping()
public GsonBuilder setDateFormat(String pattern)
public GsonBuilder setDateFormat(int style)
public GsonBuilder setDateFormat(int dateStyle, int timeStyle)
public GsonBuilder registerTypeAdapter(Type type, Object typeAdapter)
private GsonBuilder registerInstanceCreator(Type typeOfT, InstanceCreator<? extends T> instanceCreator)
private GsonBuilder registerSerializer(Type typeOfT, final JsonSerializer<T> serializer)
private GsonBuilder registerDeserializer(Type typeOfT, JsonDeserializer<T> deserializer)
public GsonBuilder registerTypeHierarchyAdapter(Class<?> baseType, Object typeAdapter)
private GsonBuilder registerInstanceCreatorForTypeHierarchy(Class<?> classOfT, InstanceCreator<? extends T> instanceCreator)
private GsonBuilder registerSerializerForTypeHierarchy(Class<?> classOfT, final JsonSerializer<T> serializer)
private GsonBuilder registerDeserializerForTypeHierarchy(Class<?> classOfT, JsonDeserializer<T> deserializer)
public GsonBuilder serializeSpecialFloatingPointValues()
public Gson create()
private static void addTypeAdaptersForDate(String datePattern, int dateStyle, int timeStyle, ParameterizedTypeHandlerMap<JsonSerializer<?>> serializers, ParameterizedTypeHandlerMap<JsonDeserializer<?>> deserializers)
InnerClassExclusionStrategy innerClassExclusionStrategy=Optional[new InnerClassExclusionStrategy()]
ExposeAnnotationSerializationExclusionStrategy exposeAnnotationSerializationExclusionStrategy=Optional[new ExposeAnnotationSerializationExclusionStrategy()]
ExposeAnnotationDeserializationExclusionStrategy exposeAnnotationDeserializationExclusionStrategy=Optional[new ExposeAnnotationDeserializationExclusionStrategy()]
Collection<ExclusionStrategy> exclusionStrategies=Optional[new HashSet<ExclusionStrategy>()]
double ignoreVersionsAfter
ModifierBasedExclusionStrategy modifierBasedExclusionStrategy
boolean serializeInnerClasses
boolean excludeFieldsWithoutExposeAnnotation
LongSerializationPolicy longSerializationPolicy
FieldNamingStrategy2 fieldNamingPolicy
ParameterizedTypeHandlerMap<InstanceCreator<?>> instanceCreators
ParameterizedTypeHandlerMap<JsonSerializer<?>> serializers
ParameterizedTypeHandlerMap<JsonDeserializer<?>> deserializers
boolean serializeNulls
String datePattern
int dateStyle
int timeStyle
boolean serializeSpecialFloatingPointValues
boolean escapeHtmlChars
boolean prettyPrinting
boolean generateNonExecutableJson
