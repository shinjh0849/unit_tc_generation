protected AnnotatedMember(AnnotationMap annotations)
public abstract Class<?> getDeclaringClass()
public abstract Member getMember()
protected AnnotationMap getAllAnnotations()
public final void addOrOverride(Annotation a)
public final void addIfNotPresent(Annotation a)
public final void fixAccess()
public abstract void setValue(Object pojo, Object value) throws UnsupportedOperationException, IllegalArgumentException
public abstract Object getValue(Object pojo) throws UnsupportedOperationException, IllegalArgumentException
long serialVersionUID=Optional[7364428299211355871L]
AnnotationMap _annotations
