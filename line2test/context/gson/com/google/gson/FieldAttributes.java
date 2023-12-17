 FieldAttributes(final Class<?> declaringClazz, final Field f)
private static int getMaxCacheSize()
public Class<?> getDeclaringClass()
public String getName()
public Type getDeclaredType()
public Class<?> getDeclaredClass()
public T getAnnotation(Class<T> annotation)
public Collection<Annotation> getAnnotations()
public boolean hasModifier(int modifier)
 void set(Object instance, Object value) throws IllegalAccessException
 Object get(Object instance) throws IllegalAccessException
 boolean isSynthetic()
 Field getFieldObject()
private static T getAnnotationFromArray(Collection<Annotation> annotations, Class<T> annotation)
String MAX_CACHE_PROPERTY_NAME=Optional["com.google.gson.annotation_cache_size_hint"]
Cache<Pair<Class<?>, String>, Collection<Annotation>> ANNOTATION_CACHE=Optional[new LruCache<Pair<Class<?>, String>, Collection<Annotation>>(getMaxCacheSize())]
Class<?> declaringClazz
Field field
Class<?> declaredType
boolean isSynthetic
int modifiers
String name
Type genericType
Collection<Annotation> annotations
