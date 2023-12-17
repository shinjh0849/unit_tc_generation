public boolean shouldSkipField(FieldAttributes f) { [EOL]     return isInnerClass(f.getDeclaredClass()); [EOL] } <line_num>: 28,30
public boolean shouldSkipClass(Class<?> clazz) { [EOL]     return isInnerClass(clazz); [EOL] } <line_num>: 32,34
private boolean isInnerClass(Class<?> clazz) { [EOL]     return clazz.isMemberClass() && !isStatic(clazz); [EOL] } <line_num>: 36,38
private boolean isStatic(Class<?> clazz) { [EOL]     return (clazz.getModifiers() & Modifier.STATIC) != 0; [EOL] } <line_num>: 40,42
