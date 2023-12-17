public PropertyBasedObjectIdGenerator(Class<?> scope) { [EOL]     super(scope); [EOL] } <line_num>: 12,14
@Override [EOL] public Object generateId(Object forPojo) { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 16,19
@Override [EOL] public ObjectIdGenerator<Object> forScope(Class<?> scope) { [EOL]     return (scope == _scope) ? this : new PropertyBasedObjectIdGenerator(scope); [EOL] } <line_num>: 21,24
@Override [EOL] public ObjectIdGenerator<Object> newForSerialization(Object context) { [EOL]     return this; [EOL] } <line_num>: 26,29
@Override [EOL] public com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey key(Object key) { [EOL]     return new IdKey(getClass(), _scope, key); [EOL] } <line_num>: 31,35
