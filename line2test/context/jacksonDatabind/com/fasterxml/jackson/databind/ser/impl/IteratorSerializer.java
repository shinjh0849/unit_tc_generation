public IteratorSerializer(JavaType elemType, boolean staticTyping, TypeSerializer vts, BeanProperty property)
public IteratorSerializer(IteratorSerializer src, BeanProperty property, TypeSerializer vts, JsonSerializer<?> valueSerializer)
public boolean isEmpty(Iterator<?> value)
public boolean hasSingleElement(Iterator<?> value)
public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer vts)
public IteratorSerializer withResolved(BeanProperty property, TypeSerializer vts, JsonSerializer<?> elementSerializer)
public void serializeContents(Iterator<?> value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
