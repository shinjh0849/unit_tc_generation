public AnnotatedMethod(Method method, AnnotationMap classAnn, AnnotationMap[] paramAnnotations)
protected AnnotatedMethod(Serialization ser)
public Serialization(Method setter)
public AnnotatedMethod withMethod(Method m)
public AnnotatedMethod withAnnotations(AnnotationMap ann)
public Method getAnnotated()
public int getModifiers()
public String getName()
public Type getGenericType()
public Class<?> getRawType()
public JavaType getType(TypeBindings bindings)
public final Object call() throws Exception
public final Object call(Object[] args) throws Exception
public final Object call1(Object arg) throws Exception
public Class<?> getDeclaringClass()
public Method getMember()
public void setValue(Object pojo, Object value) throws IllegalArgumentException
public Object getValue(Object pojo) throws IllegalArgumentException
public int getParameterCount()
public String getFullName()
public Class<?>[] getRawParameterTypes()
public Type[] getGenericParameterTypes()
public Class<?> getRawParameterType(int index)
public Type getGenericParameterType(int index)
public Class<?> getRawReturnType()
public Type getGenericReturnType()
public String toString()
 Object writeReplace()
 Object readResolve()
