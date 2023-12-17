public final String translateName(FieldAttributes f) { [EOL]     Preconditions.checkNotNull(f); [EOL]     return translateName(f.getName(), f.getDeclaredType(), f.getAnnotations()); [EOL] } <line_num>: 32,35
protected abstract String translateName(String target, Type fieldType, Collection<Annotation> annotations); <line_num>: 45,45
