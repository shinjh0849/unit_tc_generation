public AnnotatedMethod(Method method, AnnotationMap classAnn, AnnotationMap[] paramAnnotations) { [EOL]     super(classAnn, paramAnnotations); [EOL]     if (method == null) { [EOL]         throw new IllegalArgumentException("Can not construct AnnotatedMethod with null Method"); [EOL]     } [EOL]     _method = method; [EOL] } <line_num>: 35,42
protected AnnotatedMethod(Serialization ser) { [EOL]     super(null, null); [EOL]     _method = null; [EOL]     _serialization = ser; [EOL] } <line_num>: 48,53
public Serialization(Method setter) { [EOL]     clazz = setter.getDeclaringClass(); [EOL]     name = setter.getName(); [EOL]     args = setter.getParameterTypes(); [EOL] } <line_num>: 270,274
public AnnotatedMethod withMethod(Method m) { [EOL]     return new AnnotatedMethod(m, _annotations, _paramAnnotations); [EOL] } <line_num>: 59,62
@Override [EOL] public AnnotatedMethod withAnnotations(AnnotationMap ann) { [EOL]     return new AnnotatedMethod(_method, ann, _paramAnnotations); [EOL] } <line_num>: 64,67
@Override [EOL] public Method getAnnotated() { [EOL]     return _method; [EOL] } <line_num>: 75,76
@Override [EOL] public int getModifiers() { [EOL]     return _method.getModifiers(); [EOL] } <line_num>: 78,79
@Override [EOL] public String getName() { [EOL]     return _method.getName(); [EOL] } <line_num>: 81,82
@Override [EOL] public Type getGenericType() { [EOL]     return _method.getGenericReturnType(); [EOL] } <line_num>: 89,92
@Override [EOL] public Class<?> getRawType() { [EOL]     return _method.getReturnType(); [EOL] } <line_num>: 99,102
@Override [EOL] public JavaType getType(TypeBindings bindings) { [EOL]     return getType(bindings, _method.getTypeParameters()); [EOL] } <line_num>: 108,111
@Override [EOL] public final Object call() throws Exception { [EOL]     return _method.invoke(null); [EOL] } <line_num>: 113,116
@Override [EOL] public final Object call(Object[] args) throws Exception { [EOL]     return _method.invoke(null, args); [EOL] } <line_num>: 118,121
@Override [EOL] public final Object call1(Object arg) throws Exception { [EOL]     return _method.invoke(null, arg); [EOL] } <line_num>: 123,126
@Override [EOL] public Class<?> getDeclaringClass() { [EOL]     return _method.getDeclaringClass(); [EOL] } <line_num>: 134,135
@Override [EOL] public Method getMember() { [EOL]     return _method; [EOL] } <line_num>: 137,138
@Override [EOL] public void setValue(Object pojo, Object value) throws IllegalArgumentException { [EOL]     try { [EOL]         _method.invoke(pojo, value); [EOL]     } catch (IllegalAccessException e) { [EOL]         throw new IllegalArgumentException("Failed to setValue() with method " + getFullName() + ": " + e.getMessage(), e); [EOL]     } catch (InvocationTargetException e) { [EOL]         throw new IllegalArgumentException("Failed to setValue() with method " + getFullName() + ": " + e.getMessage(), e); [EOL]     } [EOL] } <line_num>: 140,153
@Override [EOL] public Object getValue(Object pojo) throws IllegalArgumentException { [EOL]     try { [EOL]         return _method.invoke(pojo); [EOL]     } catch (IllegalAccessException e) { [EOL]         throw new IllegalArgumentException("Failed to getValue() with method " + getFullName() + ": " + e.getMessage(), e); [EOL]     } catch (InvocationTargetException e) { [EOL]         throw new IllegalArgumentException("Failed to getValue() with method " + getFullName() + ": " + e.getMessage(), e); [EOL]     } [EOL] } <line_num>: 155,167
@Override [EOL] public int getParameterCount() { [EOL]     return getRawParameterTypes().length; [EOL] } <line_num>: 175,178
public String getFullName() { [EOL]     return getDeclaringClass().getName() + "#" + getName() + "(" + getParameterCount() + " params)"; [EOL] } <line_num>: 180,183
public Class<?>[] getRawParameterTypes() { [EOL]     if (_paramClasses == null) { [EOL]         _paramClasses = _method.getParameterTypes(); [EOL]     } [EOL]     return _paramClasses; [EOL] } <line_num>: 185,191
public Type[] getGenericParameterTypes() { [EOL]     return _method.getGenericParameterTypes(); [EOL] } <line_num>: 193,195
@Override [EOL] public Class<?> getRawParameterType(int index) { [EOL]     Class<?>[] types = getRawParameterTypes(); [EOL]     return (index >= types.length) ? null : types[index]; [EOL] } <line_num>: 197,202
@Override [EOL] public Type getGenericParameterType(int index) { [EOL]     Type[] types = _method.getGenericParameterTypes(); [EOL]     return (index >= types.length) ? null : types[index]; [EOL] } <line_num>: 204,209
public Class<?> getRawReturnType() { [EOL]     return _method.getReturnType(); [EOL] } <line_num>: 211,213
public Type getGenericReturnType() { [EOL]     return _method.getGenericReturnType(); [EOL] } <line_num>: 215,217
@Override [EOL] public String toString() { [EOL]     return "[method " + getFullName() + "]"; [EOL] } <line_num>: 225,229
Object writeReplace() { [EOL]     return new AnnotatedMethod(new Serialization(_method)); [EOL] } <line_num>: 237,239
Object readResolve() { [EOL]     Class<?> clazz = _serialization.clazz; [EOL]     try { [EOL]         Method m = clazz.getDeclaredMethod(_serialization.name, _serialization.args); [EOL]         if (!m.isAccessible()) { [EOL]             ClassUtil.checkAndFixAccess(m); [EOL]         } [EOL]         return new AnnotatedMethod(m, null, null); [EOL]     } catch (Exception e) { [EOL]         throw new IllegalArgumentException("Could not find method '" + _serialization.name + "' from Class '" + clazz.getName()); [EOL]     } [EOL] } <line_num>: 241,255
