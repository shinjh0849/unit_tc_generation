public IterableSerializer(JavaType elemType, boolean staticTyping, TypeSerializer vts, BeanProperty property)
public IterableSerializer(IterableSerializer src, BeanProperty property, TypeSerializer vts, JsonSerializer<?> valueSerializer)
public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer vts)
public IterableSerializer withResolved(BeanProperty property, TypeSerializer vts, JsonSerializer<?> elementSerializer)
public boolean isEmpty(Iterable<?> value)
public boolean hasSingleElement(Iterable<?> value)
public void serializeContents(Iterable<?> value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
