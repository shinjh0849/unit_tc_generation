public Base() { [EOL] } <line_num>: 34,34
public Base(SerializerProvider p) { [EOL]     _provider = p; [EOL] } <line_num>: 35,35
public void property(BeanProperty writer) throws JsonMappingException; <line_num>: 10,10
public void property(String name, JsonFormatVisitable handler, JavaType propertyTypeHint) throws JsonMappingException; <line_num>: 11,11
@Deprecated [EOL] public void property(String name) throws JsonMappingException; <line_num>: 13,14
public void optionalProperty(BeanProperty writer) throws JsonMappingException; <line_num>: 16,16
public void optionalProperty(String name, JsonFormatVisitable handler, JavaType propertyTypeHint) throws JsonMappingException; <line_num>: 17,19
@Deprecated [EOL] public void optionalProperty(String name) throws JsonMappingException; <line_num>: 21,22
@Override [EOL] public SerializerProvider getProvider() { [EOL]     return _provider; [EOL] } <line_num>: 37,38
@Override [EOL] public void setProvider(SerializerProvider p) { [EOL]     _provider = p; [EOL] } <line_num>: 40,41
@Override [EOL] public void property(BeanProperty writer) throws JsonMappingException { [EOL] } <line_num>: 43,44
@Override [EOL] public void property(String name, JsonFormatVisitable handler, JavaType propertyTypeHint) throws JsonMappingException { [EOL] } <line_num>: 46,48
@Deprecated [EOL] @Override [EOL] public void property(String name) throws JsonMappingException { [EOL] } <line_num>: 50,52
@Override [EOL] public void optionalProperty(BeanProperty writer) throws JsonMappingException { [EOL] } <line_num>: 54,56
@Override [EOL] public void optionalProperty(String name, JsonFormatVisitable handler, JavaType propertyTypeHint) throws JsonMappingException { [EOL] } <line_num>: 58,60
@Deprecated [EOL] @Override [EOL] public void optionalProperty(String name) throws JsonMappingException { [EOL] } <line_num>: 62,64
