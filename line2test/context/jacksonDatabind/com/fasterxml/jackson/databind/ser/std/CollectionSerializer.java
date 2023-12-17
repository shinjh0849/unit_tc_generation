public CollectionSerializer(JavaType elemType, boolean staticTyping, TypeSerializer vts, BeanProperty property, JsonSerializer<Object> valueSerializer)
public CollectionSerializer(CollectionSerializer src, BeanProperty property, TypeSerializer vts, JsonSerializer<?> valueSerializer)
public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer vts)
public CollectionSerializer withResolved(BeanProperty property, TypeSerializer vts, JsonSerializer<?> elementSerializer)
public boolean isEmpty(Collection<?> value)
public boolean hasSingleElement(Collection<?> value)
public void serializeContents(Collection<?> value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public void serializeContentsUsing(Collection<?> value, JsonGenerator jgen, SerializerProvider provider, JsonSerializer<Object> ser) throws IOException, JsonGenerationException
