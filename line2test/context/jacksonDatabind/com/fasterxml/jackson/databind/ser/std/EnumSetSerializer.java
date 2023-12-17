public EnumSetSerializer(JavaType elemType, BeanProperty property)
public EnumSetSerializer(EnumSetSerializer src, BeanProperty property, TypeSerializer vts, JsonSerializer<?> valueSerializer)
public EnumSetSerializer _withValueTypeSerializer(TypeSerializer vts)
public EnumSetSerializer withResolved(BeanProperty property, TypeSerializer vts, JsonSerializer<?> elementSerializer)
public boolean isEmpty(EnumSet<? extends Enum<?>> value)
public boolean hasSingleElement(EnumSet<? extends Enum<?>> value)
public void serializeContents(EnumSet<? extends Enum<?>> value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
