public AnnotatedField(Field field, AnnotationMap annMap) { [EOL]     super(annMap); [EOL]     _field = field; [EOL] } <line_num>: 39,43
protected AnnotatedField(Serialization ser) { [EOL]     super(null); [EOL]     _field = null; [EOL]     _serialization = ser; [EOL] } <line_num>: 53,58
public Serialization(Field f) { [EOL]     clazz = f.getDeclaringClass(); [EOL]     name = f.getName(); [EOL] } <line_num>: 180,184
@Override [EOL] public AnnotatedField withAnnotations(AnnotationMap ann) { [EOL]     return new AnnotatedField(_field, ann); [EOL] } <line_num>: 45,48
@Override [EOL] public Field getAnnotated() { [EOL]     return _field; [EOL] } <line_num>: 66,67
@Override [EOL] public int getModifiers() { [EOL]     return _field.getModifiers(); [EOL] } <line_num>: 69,70
@Override [EOL] public String getName() { [EOL]     return _field.getName(); [EOL] } <line_num>: 72,73
@Override [EOL] public <A extends Annotation> A getAnnotation(Class<A> acls) { [EOL]     return (_annotations == null) ? null : _annotations.get(acls); [EOL] } <line_num>: 75,79
@Override [EOL] public Type getGenericType() { [EOL]     return _field.getGenericType(); [EOL] } <line_num>: 81,84
@Override [EOL] public Class<?> getRawType() { [EOL]     return _field.getType(); [EOL] } <line_num>: 86,89
@Override [EOL] public Class<?> getDeclaringClass() { [EOL]     return _field.getDeclaringClass(); [EOL] } <line_num>: 97,98
@Override [EOL] public Member getMember() { [EOL]     return _field; [EOL] } <line_num>: 100,101
@Override [EOL] public void setValue(Object pojo, Object value) throws IllegalArgumentException { [EOL]     try { [EOL]         _field.set(pojo, value); [EOL]     } catch (IllegalAccessException e) { [EOL]         throw new IllegalArgumentException("Failed to setValue() for field " + getFullName() + ": " + e.getMessage(), e); [EOL]     } [EOL] } <line_num>: 103,112
@Override [EOL] public Object getValue(Object pojo) throws IllegalArgumentException { [EOL]     try { [EOL]         return _field.get(pojo); [EOL]     } catch (IllegalAccessException e) { [EOL]         throw new IllegalArgumentException("Failed to getValue() for field " + getFullName() + ": " + e.getMessage(), e); [EOL]     } [EOL] } <line_num>: 114,123
public String getFullName() { [EOL]     return getDeclaringClass().getName() + "#" + getName(); [EOL] } <line_num>: 131,133
public int getAnnotationCount() { [EOL]     return _annotations.size(); [EOL] } <line_num>: 135,135
@Override [EOL] public String toString() { [EOL]     return "[field " + getFullName() + "]"; [EOL] } <line_num>: 137,141
Object writeReplace() { [EOL]     return new AnnotatedField(new Serialization(_field)); [EOL] } <line_num>: 149,151
Object readResolve() { [EOL]     Class<?> clazz = _serialization.clazz; [EOL]     try { [EOL]         Field f = clazz.getDeclaredField(_serialization.name); [EOL]         if (!f.isAccessible()) { [EOL]             ClassUtil.checkAndFixAccess(f); [EOL]         } [EOL]         return new AnnotatedField(f, null); [EOL]     } catch (Exception e) { [EOL]         throw new IllegalArgumentException("Could not find method '" + _serialization.name + "' from Class '" + clazz.getName()); [EOL]     } [EOL] } <line_num>: 153,166
