public AnnotatedConstructor(Constructor<?> constructor, AnnotationMap classAnn, AnnotationMap[] paramAnn)
protected AnnotatedConstructor(Serialization ser)
public Serialization(Constructor<?> ctor)
public AnnotatedConstructor withAnnotations(AnnotationMap ann)
public Constructor<?> getAnnotated()
public int getModifiers()
public String getName()
public Type getGenericType()
public Class<?> getRawType()
public JavaType getType(TypeBindings bindings)
public int getParameterCount()
public Class<?> getRawParameterType(int index)
public Type getGenericParameterType(int index)
public final Object call() throws Exception
public final Object call(Object[] args) throws Exception
public final Object call1(Object arg) throws Exception
public Class<?> getDeclaringClass()
public Member getMember()
public void setValue(Object pojo, Object value) throws UnsupportedOperationException
public Object getValue(Object pojo) throws UnsupportedOperationException
public String toString()
 Object writeReplace()
 Object readResolve()
long serialVersionUID=Optional[1L]
Constructor<?> _constructor
Serialization _serialization
