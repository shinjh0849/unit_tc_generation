protected NonTypedScalarSerializerBase(Class<T> t) { [EOL]     super(t); [EOL] } <line_num>: 20,22
@Override [EOL] public final void serializeWithType(T value, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonGenerationException { [EOL]     serialize(value, jgen, provider); [EOL] } <line_num>: 24,31
