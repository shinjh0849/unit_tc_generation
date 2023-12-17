protected PropertyValue(PropertyValue next, Object value) { [EOL]     this.next = next; [EOL]     this.value = value; [EOL] } <line_num>: 23,27
public Regular(PropertyValue next, Object value, SettableBeanProperty prop) { [EOL]     super(next, value); [EOL]     _property = prop; [EOL] } <line_num>: 51,56
public Any(PropertyValue next, Object value, SettableAnyProperty prop, String propName) { [EOL]     super(next, value); [EOL]     _property = prop; [EOL]     _propertyName = propName; [EOL] } <line_num>: 78,85
public Map(PropertyValue next, Object value, Object key) { [EOL]     super(next, value); [EOL]     _key = key; [EOL] } <line_num>: 104,108
public abstract void assign(Object bean) throws IOException, JsonProcessingException; <line_num>: 33,34
@Override [EOL] public void assign(Object bean) throws IOException, JsonProcessingException { [EOL]     _property.set(bean, value); [EOL] } <line_num>: 58,63
@Override [EOL] public void assign(Object bean) throws IOException, JsonProcessingException { [EOL]     _property.set(bean, _propertyName, value); [EOL] } <line_num>: 87,92
@SuppressWarnings("unchecked") [EOL] @Override [EOL] public void assign(Object bean) throws IOException, JsonProcessingException { [EOL]     ((java.util.Map<Object, Object>) bean).put(_key, value); [EOL] } <line_num>: 110,116
