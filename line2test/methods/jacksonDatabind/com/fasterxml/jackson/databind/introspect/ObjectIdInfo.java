public ObjectIdInfo(String prop, Class<?> scope, Class<? extends ObjectIdGenerator<?>> gen) { [EOL]     this(prop, scope, gen, false); [EOL] } <line_num>: 18,20
protected ObjectIdInfo(String prop, Class<?> scope, Class<? extends ObjectIdGenerator<?>> gen, boolean alwaysAsId) { [EOL]     _propertyName = prop; [EOL]     _scope = scope; [EOL]     _generator = gen; [EOL]     _alwaysAsId = alwaysAsId; [EOL] } <line_num>: 22,29
public ObjectIdInfo withAlwaysAsId(boolean state) { [EOL]     if (_alwaysAsId == state) { [EOL]         return this; [EOL]     } [EOL]     return new ObjectIdInfo(_propertyName, _scope, _generator, state); [EOL] } <line_num>: 31,36
public String getPropertyName() { [EOL]     return _propertyName; [EOL] } <line_num>: 38,38
public Class<?> getScope() { [EOL]     return _scope; [EOL] } <line_num>: 39,39
public Class<? extends ObjectIdGenerator<?>> getGeneratorType() { [EOL]     return _generator; [EOL] } <line_num>: 40,40
public boolean getAlwaysAsId() { [EOL]     return _alwaysAsId; [EOL] } <line_num>: 41,41
@Override [EOL] public String toString() { [EOL]     return "ObjectIdInfo: propName=" + _propertyName + ", scope=" + (_scope == null ? "null" : _scope.getName()) + ", generatorType=" + (_generator == null ? "null" : _generator.getName()) + ", alwaysAsId=" + _alwaysAsId; [EOL] } <line_num>: 43,49
