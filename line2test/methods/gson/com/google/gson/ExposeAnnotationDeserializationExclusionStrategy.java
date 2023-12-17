public boolean shouldSkipClass(Class<?> clazz) { [EOL]     return false; [EOL] } <line_num>: 28,30
public boolean shouldSkipField(FieldAttributes f) { [EOL]     Expose annotation = f.getAnnotation(Expose.class); [EOL]     if (annotation == null) { [EOL]         return true; [EOL]     } [EOL]     return !annotation.deserialize(); [EOL] } <line_num>: 32,38
