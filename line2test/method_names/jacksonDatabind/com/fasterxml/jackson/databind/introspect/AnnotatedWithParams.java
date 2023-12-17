protected AnnotatedWithParams(AnnotationMap annotations, AnnotationMap[] paramAnnotations)
public final void addOrOverrideParam(int paramIndex, Annotation a)
protected AnnotatedParameter replaceParameterAnnotations(int index, AnnotationMap ann)
protected JavaType getType(TypeBindings bindings, TypeVariable<?>[] typeParams)
public final A getAnnotation(Class<A> acls)
public final AnnotationMap getParameterAnnotations(int index)
public final AnnotatedParameter getParameter(int index)
public abstract int getParameterCount()
public abstract Class<?> getRawParameterType(int index)
public abstract Type getGenericParameterType(int index)
public final JavaType resolveParameterType(int index, TypeBindings bindings)
public final int getAnnotationCount()
public abstract Object call() throws Exception
public abstract Object call(Object[] args) throws Exception
public abstract Object call1(Object arg) throws Exception
