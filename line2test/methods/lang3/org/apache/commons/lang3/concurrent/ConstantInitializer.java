public ConstantInitializer(final T obj) { [EOL]     object = obj; [EOL] } <line_num>: 57,59
public final T getObject() { [EOL]     return object; [EOL] } <line_num>: 68,70
@Override [EOL] public T get() throws ConcurrentException { [EOL]     return getObject(); [EOL] } <line_num>: 79,82
@Override [EOL] public int hashCode() { [EOL]     return getObject() != null ? getObject().hashCode() : 0; [EOL] } <line_num>: 90,93
@Override [EOL] public boolean equals(final Object obj) { [EOL]     if (this == obj) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof ConstantInitializer<?>)) { [EOL]         return false; [EOL]     } [EOL]     final ConstantInitializer<?> c = (ConstantInitializer<?>) obj; [EOL]     return ObjectUtils.equals(getObject(), c.getObject()); [EOL] } <line_num>: 104,115
@Override [EOL] public String toString() { [EOL]     return String.format(FMT_TO_STRING, Integer.valueOf(System.identityHashCode(this)), String.valueOf(getObject())); [EOL] } <line_num>: 124,128
