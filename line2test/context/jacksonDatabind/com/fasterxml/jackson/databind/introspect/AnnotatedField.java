public AnnotatedField(Field field, AnnotationMap annMap)
protected AnnotatedField(Serialization ser)
public Serialization(Field f)
public AnnotatedField withAnnotations(AnnotationMap ann)
public Field getAnnotated()
public int getModifiers()
public String getName()
public A getAnnotation(Class<A> acls)
public Type getGenericType()
public Class<?> getRawType()
public Class<?> getDeclaringClass()
public Member getMember()
public void setValue(Object pojo, Object value) throws IllegalArgumentException
public Object getValue(Object pojo) throws IllegalArgumentException
public String getFullName()
public int getAnnotationCount()
public String toString()
 Object writeReplace()
 Object readResolve()
long serialVersionUID=Optional[7364428299211355871L]
Field _field
Serialization _serialization
