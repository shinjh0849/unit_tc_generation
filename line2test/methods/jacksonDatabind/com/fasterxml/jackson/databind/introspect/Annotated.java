protected Annotated() { [EOL] } <line_num>: 18,18
public abstract <A extends Annotation> A getAnnotation(Class<A> acls); <line_num>: 20,20
public final <A extends Annotation> boolean hasAnnotation(Class<A> acls) { [EOL]     return getAnnotation(acls) != null; [EOL] } <line_num>: 22,25
public abstract Annotated withAnnotations(AnnotationMap fallback); <line_num>: 31,31
public final Annotated withFallBackAnnotationsFrom(Annotated annotated) { [EOL]     return withAnnotations(AnnotationMap.merge(getAllAnnotations(), annotated.getAllAnnotations())); [EOL] } <line_num>: 37,39
public abstract AnnotatedElement getAnnotated(); <line_num>: 46,46
protected abstract int getModifiers(); <line_num>: 48,48
public final boolean isPublic() { [EOL]     return Modifier.isPublic(getModifiers()); [EOL] } <line_num>: 50,52
public abstract String getName(); <line_num>: 54,54
public JavaType getType(TypeBindings context) { [EOL]     return context.resolveType(getGenericType()); [EOL] } <line_num>: 60,62
public abstract Type getGenericType(); <line_num>: 68,68
public abstract Class<?> getRawType(); <line_num>: 74,74
protected abstract AnnotationMap getAllAnnotations(); <line_num>: 76,76
