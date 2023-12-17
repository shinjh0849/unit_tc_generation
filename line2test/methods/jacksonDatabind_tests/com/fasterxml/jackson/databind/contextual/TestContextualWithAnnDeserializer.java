public StringValue(String v) { [EOL]     value = v; [EOL] } <line_num>: 27,27
public AnnotatedContextualDeserializer() { [EOL]     this(""); [EOL] } <line_num>: 43,43
public AnnotatedContextualDeserializer(String fieldName) { [EOL]     _fieldName = fieldName; [EOL] } <line_num>: 44,46
public MyContextualDeserializer() { [EOL]     this(""); [EOL] } <line_num>: 74,74
public MyContextualDeserializer(String fieldName) { [EOL]     _fieldName = fieldName; [EOL] } <line_num>: 75,77
@Override [EOL] public StringValue deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException { [EOL]     return new StringValue("" + _fieldName + "=" + jp.getText()); [EOL] } <line_num>: 48,52
@Override [EOL] public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException { [EOL]     Name ann = property.getAnnotation(Name.class); [EOL]     if (ann == null) { [EOL]         ann = property.getContextAnnotation(Name.class); [EOL]     } [EOL]     String propertyName = (ann == null) ? "UNKNOWN" : ann.value(); [EOL]     return new MyContextualDeserializer(propertyName); [EOL] } <line_num>: 54,65
@Override [EOL] public StringValue deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException { [EOL]     return new StringValue("" + _fieldName + "=" + jp.getText()); [EOL] } <line_num>: 79,83
@Override [EOL] public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException { [EOL]     String name = (property == null) ? "NULL" : property.getName(); [EOL]     return new MyContextualDeserializer(name); [EOL] } <line_num>: 85,92
public void testAnnotatedContextual() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     AnnotatedContextualClassBean bean = mapper.readValue("{\"value\":\"a\"}", AnnotatedContextualClassBean.class); [EOL]     assertNotNull(bean); [EOL]     assertEquals("xyz=a", bean.value.value); [EOL] } <line_num>: 97,105
