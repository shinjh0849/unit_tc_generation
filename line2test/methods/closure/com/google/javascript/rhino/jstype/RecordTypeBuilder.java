public RecordTypeBuilder(JSTypeRegistry registry) { [EOL]     this.registry = registry; [EOL] } <line_num>: 58,60
RecordProperty(JSType type, Node propertyNode) { [EOL]     this.type = type; [EOL]     this.propertyNode = propertyNode; [EOL] } <line_num>: 103,106
void setSynthesized(boolean synthesized) { [EOL]     isDeclared = !synthesized; [EOL] } <line_num>: 63,65
public RecordTypeBuilder addProperty(String name, JSType type, Node propertyNode) { [EOL]     isEmpty = false; [EOL]     if (properties.containsKey(name)) { [EOL]         return null; [EOL]     } [EOL]     properties.put(name, new RecordProperty(type, propertyNode)); [EOL]     return this; [EOL] } <line_num>: 75,83
public JSType build() { [EOL]     if (isEmpty) { [EOL]         return registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE); [EOL]     } [EOL]     return new RecordType(registry, Collections.unmodifiableMap(properties), isDeclared); [EOL] } <line_num>: 89,97
public JSType getType() { [EOL]     return type; [EOL] } <line_num>: 108,110
public Node getPropertyNode() { [EOL]     return propertyNode; [EOL] } <line_num>: 112,114
