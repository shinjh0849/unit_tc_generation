public ObjectNavigatorFactory(ExclusionStrategy strategy, FieldNamingStrategy2 fieldNamingPolicy) { [EOL]     Preconditions.checkNotNull(fieldNamingPolicy); [EOL]     this.strategy = (strategy == null ? new NullExclusionStrategy() : strategy); [EOL]     this.fieldNamingPolicy = fieldNamingPolicy; [EOL] } <line_num>: 39,43
public ObjectNavigator create(ObjectTypePair objTypePair) { [EOL]     return new ObjectNavigator(objTypePair, strategy); [EOL] } <line_num>: 54,56
FieldNamingStrategy2 getFieldNamingPolicy() { [EOL]     return fieldNamingPolicy; [EOL] } <line_num>: 58,60
