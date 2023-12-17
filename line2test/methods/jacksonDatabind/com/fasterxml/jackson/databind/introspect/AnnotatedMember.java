protected AnnotatedMember(AnnotationMap annotations) { [EOL]     super(); [EOL]     _annotations = annotations; [EOL] } <line_num>: 26,29
public abstract Class<?> getDeclaringClass(); <line_num>: 31,31
public abstract Member getMember(); <line_num>: 33,33
@Override [EOL] protected AnnotationMap getAllAnnotations() { [EOL]     return _annotations; [EOL] } <line_num>: 35,38
public final void addOrOverride(Annotation a) { [EOL]     _annotations.add(a); [EOL] } <line_num>: 45,47
public final void addIfNotPresent(Annotation a) { [EOL]     _annotations.addIfNotPresent(a); [EOL] } <line_num>: 54,56
public final void fixAccess() { [EOL]     ClassUtil.checkAndFixAccess(getMember()); [EOL] } <line_num>: 63,65
public abstract void setValue(Object pojo, Object value) throws UnsupportedOperationException, IllegalArgumentException; <line_num>: 76,77
public abstract Object getValue(Object pojo) throws UnsupportedOperationException, IllegalArgumentException; <line_num>: 88,89
