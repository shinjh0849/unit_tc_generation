public IndexedListSerializer(JavaType elemType, boolean staticTyping, TypeSerializer vts, BeanProperty property, JsonSerializer<Object> valueSerializer)
public IndexedListSerializer(IndexedListSerializer src, BeanProperty property, TypeSerializer vts, JsonSerializer<?> valueSerializer)
public IndexedListSerializer withResolved(BeanProperty property, TypeSerializer vts, JsonSerializer<?> elementSerializer)
public boolean isEmpty(List<?> value)
public boolean hasSingleElement(List<?> value)
public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer vts)
public void serializeContents(List<?> value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public void serializeContentsUsing(List<?> value, JsonGenerator jgen, SerializerProvider provider, JsonSerializer<Object> ser) throws IOException, JsonGenerationException
public void serializeTypedContents(List<?> value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
