protected ContainerSerializer(Class<T> t) { [EOL]     super(t); [EOL] } <line_num>: 23,25
protected ContainerSerializer(Class<?> t, boolean dummy) { [EOL]     super(t, dummy); [EOL] } <line_num>: 33,35
protected ContainerSerializer(ContainerSerializer<?> src) { [EOL]     super(src._handledType, false); [EOL] } <line_num>: 37,39
public ContainerSerializer<?> withValueTypeSerializer(TypeSerializer vts) { [EOL]     if (vts == null) [EOL]         return this; [EOL]     return _withValueTypeSerializer(vts); [EOL] } <line_num>: 51,54
public abstract JavaType getContentType(); <line_num>: 66,66
public abstract JsonSerializer<?> getContentSerializer(); <line_num>: 77,77
@Override [EOL] public abstract boolean isEmpty(T value); <line_num>: 88,89
public abstract boolean hasSingleElement(T value); <line_num>: 100,100
protected abstract ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer vts); <line_num>: 107,107
protected boolean hasContentTypeAnnotation(SerializerProvider provider, BeanProperty property) { [EOL]     if (property != null) { [EOL]         AnnotationIntrospector intr = provider.getAnnotationIntrospector(); [EOL]         if (intr != null) { [EOL]             if (intr.findSerializationContentType(property.getMember(), property.getType()) != null) { [EOL]                 return true; [EOL]             } [EOL]         } [EOL]     } [EOL]     return false; [EOL] } <line_num>: 122,134
