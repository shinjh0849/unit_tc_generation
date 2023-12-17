protected ArraySerializerBase(Class<T> cls)
protected ArraySerializerBase(Class<T> cls, BeanProperty property)
protected ArraySerializerBase(ArraySerializerBase<?> src)
protected ArraySerializerBase(ArraySerializerBase<?> src, BeanProperty property)
public final void serialize(T value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public final void serializeWithType(T value, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonGenerationException
protected abstract void serializeContents(T value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
BeanProperty _property
