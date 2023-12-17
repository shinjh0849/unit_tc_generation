public AnnotatedConstructor(Constructor<?> constructor, AnnotationMap classAnn, AnnotationMap[] paramAnn) { [EOL]     super(classAnn, paramAnn); [EOL]     if (constructor == null) { [EOL]         throw new IllegalArgumentException("Null constructor not allowed"); [EOL]     } [EOL]     _constructor = constructor; [EOL] } <line_num>: 31,39
protected AnnotatedConstructor(Serialization ser) { [EOL]     super(null, null); [EOL]     _constructor = null; [EOL]     _serialization = ser; [EOL] } <line_num>: 45,50
public Serialization(Constructor<?> ctor) { [EOL]     clazz = ctor.getDeclaringClass(); [EOL]     args = ctor.getParameterTypes(); [EOL] } <line_num>: 209,212
@Override [EOL] public AnnotatedConstructor withAnnotations(AnnotationMap ann) { [EOL]     return new AnnotatedConstructor(_constructor, ann, _paramAnnotations); [EOL] } <line_num>: 52,55
@Override [EOL] public Constructor<?> getAnnotated() { [EOL]     return _constructor; [EOL] } <line_num>: 63,64
@Override [EOL] public int getModifiers() { [EOL]     return _constructor.getModifiers(); [EOL] } <line_num>: 66,67
@Override [EOL] public String getName() { [EOL]     return _constructor.getName(); [EOL] } <line_num>: 69,70
@Override [EOL] public Type getGenericType() { [EOL]     return getRawType(); [EOL] } <line_num>: 72,75
@Override [EOL] public Class<?> getRawType() { [EOL]     return _constructor.getDeclaringClass(); [EOL] } <line_num>: 77,80
@Override [EOL] public JavaType getType(TypeBindings bindings) { [EOL]     return getType(bindings, _constructor.getTypeParameters()); [EOL] } <line_num>: 87,91
@Override [EOL] public int getParameterCount() { [EOL]     return _constructor.getParameterTypes().length; [EOL] } <line_num>: 99,102
@Override [EOL] public Class<?> getRawParameterType(int index) { [EOL]     Class<?>[] types = _constructor.getParameterTypes(); [EOL]     return (index >= types.length) ? null : types[index]; [EOL] } <line_num>: 104,109
@Override [EOL] public Type getGenericParameterType(int index) { [EOL]     Type[] types = _constructor.getGenericParameterTypes(); [EOL]     return (index >= types.length) ? null : types[index]; [EOL] } <line_num>: 111,116
@Override [EOL] public final Object call() throws Exception { [EOL]     return _constructor.newInstance(); [EOL] } <line_num>: 118,121
@Override [EOL] public final Object call(Object[] args) throws Exception { [EOL]     return _constructor.newInstance(args); [EOL] } <line_num>: 123,126
@Override [EOL] public final Object call1(Object arg) throws Exception { [EOL]     return _constructor.newInstance(arg); [EOL] } <line_num>: 128,131
@Override [EOL] public Class<?> getDeclaringClass() { [EOL]     return _constructor.getDeclaringClass(); [EOL] } <line_num>: 139,140
@Override [EOL] public Member getMember() { [EOL]     return _constructor; [EOL] } <line_num>: 142,143
@Override [EOL] public void setValue(Object pojo, Object value) throws UnsupportedOperationException { [EOL]     throw new UnsupportedOperationException("Cannot call setValue() on constructor of " + getDeclaringClass().getName()); [EOL] } <line_num>: 145,151
@Override [EOL] public Object getValue(Object pojo) throws UnsupportedOperationException { [EOL]     throw new UnsupportedOperationException("Cannot call getValue() on constructor of " + getDeclaringClass().getName()); [EOL] } <line_num>: 153,159
@Override [EOL] public String toString() { [EOL]     return "[constructor for " + getName() + ", annotations: " + _annotations + "]"; [EOL] } <line_num>: 167,170
Object writeReplace() { [EOL]     return new AnnotatedConstructor(new Serialization(_constructor)); [EOL] } <line_num>: 178,180
Object readResolve() { [EOL]     Class<?> clazz = _serialization.clazz; [EOL]     try { [EOL]         Constructor<?> ctor = clazz.getDeclaredConstructor(_serialization.args); [EOL]         if (!ctor.isAccessible()) { [EOL]             ClassUtil.checkAndFixAccess(ctor); [EOL]         } [EOL]         return new AnnotatedConstructor(ctor, null, null); [EOL]     } catch (Exception e) { [EOL]         throw new IllegalArgumentException("Could not find constructor with " + _serialization.args.length + " args from Class '" + clazz.getName()); [EOL]     } [EOL] } <line_num>: 182,195
