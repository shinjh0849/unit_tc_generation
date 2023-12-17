public boolean shouldSkipField(FieldAttributes f) { [EOL]     return isAnonymousOrLocal(f.getDeclaredClass()); [EOL] } <line_num>: 27,29
public boolean shouldSkipClass(Class<?> clazz) { [EOL]     return isAnonymousOrLocal(clazz); [EOL] } <line_num>: 31,33
private boolean isAnonymousOrLocal(Class<?> clazz) { [EOL]     return !Enum.class.isAssignableFrom(clazz) && (clazz.isAnonymousClass() || clazz.isLocalClass()); [EOL] } <line_num>: 35,38
