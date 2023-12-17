public AnnotatedParameter(AnnotatedWithParams owner, Type type, AnnotationMap annotations, int index) { [EOL]     super(annotations); [EOL]     _owner = owner; [EOL]     _type = type; [EOL]     _index = index; [EOL] } <line_num>: 49,56
@Override [EOL] public AnnotatedParameter withAnnotations(AnnotationMap ann) { [EOL]     if (ann == _annotations) { [EOL]         return this; [EOL]     } [EOL]     return _owner.replaceParameterAnnotations(_index, ann); [EOL] } <line_num>: 58,64
@Override [EOL] public AnnotatedElement getAnnotated() { [EOL]     return null; [EOL] } <line_num>: 76,77
@Override [EOL] public int getModifiers() { [EOL]     return _owner.getModifiers(); [EOL] } <line_num>: 83,84
@Override [EOL] public String getName() { [EOL]     return ""; [EOL] } <line_num>: 90,91
@Override [EOL] public <A extends Annotation> A getAnnotation(Class<A> acls) { [EOL]     return (_annotations == null) ? null : _annotations.get(acls); [EOL] } <line_num>: 97,101
@Override [EOL] public Type getGenericType() { [EOL]     return _type; [EOL] } <line_num>: 103,106
@Override [EOL] public Class<?> getRawType() { [EOL]     if (_type instanceof Class<?>) { [EOL]         return (Class<?>) _type; [EOL]     } [EOL]     JavaType t = TypeFactory.defaultInstance().constructType(_type); [EOL]     return t.getRawClass(); [EOL] } <line_num>: 108,117
@Override [EOL] public Class<?> getDeclaringClass() { [EOL]     return _owner.getDeclaringClass(); [EOL] } <line_num>: 125,128
@Override [EOL] public Member getMember() { [EOL]     return _owner.getMember(); [EOL] } <line_num>: 130,136
@Override [EOL] public void setValue(Object pojo, Object value) throws UnsupportedOperationException { [EOL]     throw new UnsupportedOperationException("Cannot call setValue() on constructor parameter of " + getDeclaringClass().getName()); [EOL] } <line_num>: 138,143
@Override [EOL] public Object getValue(Object pojo) throws UnsupportedOperationException { [EOL]     throw new UnsupportedOperationException("Cannot call getValue() on constructor parameter of " + getDeclaringClass().getName()); [EOL] } <line_num>: 145,150
public Type getParameterType() { [EOL]     return _type; [EOL] } <line_num>: 158,158
public AnnotatedWithParams getOwner() { [EOL]     return _owner; [EOL] } <line_num>: 166,166
public int getIndex() { [EOL]     return _index; [EOL] } <line_num>: 173,173
@Override [EOL] public String toString() { [EOL]     return "[parameter #" + getIndex() + ", annotations: " + _annotations + "]"; [EOL] } <line_num>: 181,185
