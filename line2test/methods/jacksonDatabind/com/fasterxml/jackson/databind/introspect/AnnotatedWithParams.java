protected AnnotatedWithParams(AnnotationMap annotations, AnnotationMap[] paramAnnotations) { [EOL]     super(annotations); [EOL]     _paramAnnotations = paramAnnotations; [EOL] } <line_num>: 33,37
public final void addOrOverrideParam(int paramIndex, Annotation a) { [EOL]     AnnotationMap old = _paramAnnotations[paramIndex]; [EOL]     if (old == null) { [EOL]         old = new AnnotationMap(); [EOL]         _paramAnnotations[paramIndex] = old; [EOL]     } [EOL]     old.add(a); [EOL] } <line_num>: 45,53
protected AnnotatedParameter replaceParameterAnnotations(int index, AnnotationMap ann) { [EOL]     _paramAnnotations[index] = ann; [EOL]     return getParameter(index); [EOL] } <line_num>: 59,63
protected JavaType getType(TypeBindings bindings, TypeVariable<?>[] typeParams) { [EOL]     if (typeParams != null && typeParams.length > 0) { [EOL]         bindings = bindings.childInstance(); [EOL]         for (TypeVariable<?> var : typeParams) { [EOL]             String name = var.getName(); [EOL]             bindings._addPlaceholder(name); [EOL]             Type lowerBound = var.getBounds()[0]; [EOL]             JavaType type = (lowerBound == null) ? TypeFactory.unknownType() : bindings.resolveType(lowerBound); [EOL]             bindings.addBinding(var.getName(), type); [EOL]         } [EOL]     } [EOL]     return bindings.resolveType(getGenericType()); [EOL] } <line_num>: 71,88
@Override [EOL] public final <A extends Annotation> A getAnnotation(Class<A> acls) { [EOL]     return _annotations.get(acls); [EOL] } <line_num>: 96,100
public final AnnotationMap getParameterAnnotations(int index) { [EOL]     if (_paramAnnotations != null) { [EOL]         if (index >= 0 && index <= _paramAnnotations.length) { [EOL]             return _paramAnnotations[index]; [EOL]         } [EOL]     } [EOL]     return null; [EOL] } <line_num>: 108,116
public final AnnotatedParameter getParameter(int index) { [EOL]     return new AnnotatedParameter(this, getGenericParameterType(index), getParameterAnnotations(index), index); [EOL] } <line_num>: 118,121
public abstract int getParameterCount(); <line_num>: 123,123
public abstract Class<?> getRawParameterType(int index); <line_num>: 125,125
public abstract Type getGenericParameterType(int index); <line_num>: 127,127
public final JavaType resolveParameterType(int index, TypeBindings bindings) { [EOL]     return bindings.resolveType(getGenericParameterType(index)); [EOL] } <line_num>: 133,135
public final int getAnnotationCount() { [EOL]     return _annotations.size(); [EOL] } <line_num>: 137,137
public abstract Object call() throws Exception; <line_num>: 147,147
public abstract Object call(Object[] args) throws Exception; <line_num>: 157,157
public abstract Object call1(Object arg) throws Exception; <line_num>: 167,167
