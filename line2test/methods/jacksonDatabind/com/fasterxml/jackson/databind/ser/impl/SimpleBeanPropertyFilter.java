protected SimpleBeanPropertyFilter() { [EOL] } <line_num>: 26,26
public FilterExceptFilter(Set<String> properties) { [EOL]     _propertiesToInclude = properties; [EOL] } <line_num>: 114,116
public SerializeExceptFilter(Set<String> properties) { [EOL]     _propertiesToExclude = properties; [EOL] } <line_num>: 136,138
public static SimpleBeanPropertyFilter filterOutAllExcept(Set<String> properties) { [EOL]     return new FilterExceptFilter(properties); [EOL] } <line_num>: 32,34
public static SimpleBeanPropertyFilter filterOutAllExcept(String... propertyArray) { [EOL]     HashSet<String> properties = new HashSet<String>(propertyArray.length); [EOL]     Collections.addAll(properties, propertyArray); [EOL]     return new FilterExceptFilter(properties); [EOL] } <line_num>: 36,40
public static SimpleBeanPropertyFilter serializeAllExcept(Set<String> properties) { [EOL]     return new SerializeExceptFilter(properties); [EOL] } <line_num>: 42,44
public static SimpleBeanPropertyFilter serializeAllExcept(String... propertyArray) { [EOL]     HashSet<String> properties = new HashSet<String>(propertyArray.length); [EOL]     Collections.addAll(properties, propertyArray); [EOL]     return new SerializeExceptFilter(properties); [EOL] } <line_num>: 46,50
protected abstract boolean include(BeanPropertyWriter writer); <line_num>: 62,62
@Override [EOL] public void serializeAsField(Object bean, JsonGenerator jgen, SerializerProvider provider, BeanPropertyWriter writer) throws Exception { [EOL]     if (include(writer)) { [EOL]         writer.serializeAsField(bean, jgen, provider); [EOL]     } [EOL] } <line_num>: 64,71
@Override [EOL] public void depositSchemaProperty(BeanPropertyWriter writer, ObjectNode propertiesNode, SerializerProvider provider) throws JsonMappingException { [EOL]     if (include(writer)) { [EOL]         writer.depositSchemaProperty(propertiesNode, provider); [EOL]     } [EOL] } <line_num>: 73,81
@Override [EOL] public void depositSchemaProperty(BeanPropertyWriter writer, JsonObjectFormatVisitor objectVisitor, SerializerProvider provider) throws JsonMappingException { [EOL]     if (include(writer)) { [EOL]         writer.depositSchemaProperty(objectVisitor); [EOL]     } [EOL] } <line_num>: 83,91
@Override [EOL] protected boolean include(BeanPropertyWriter writer) { [EOL]     return _propertiesToInclude.contains(writer.getName()); [EOL] } <line_num>: 118,121
@Override [EOL] protected boolean include(BeanPropertyWriter writer) { [EOL]     return !_propertiesToExclude.contains(writer.getName()); [EOL] } <line_num>: 140,143
