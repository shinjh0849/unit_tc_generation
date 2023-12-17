public boolean shouldSkipClass(Class<?> clazz) { [EOL]     return false; [EOL] } <line_num>: 29,31
public boolean shouldSkipField(FieldAttributes f) { [EOL]     Expose annotation = f.getAnnotation(Expose.class); [EOL]     if (annotation == null) { [EOL]         return true; [EOL]     } [EOL]     return !annotation.serialize(); [EOL] } <line_num>: 33,39
