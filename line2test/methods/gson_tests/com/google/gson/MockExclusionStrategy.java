public MockExclusionStrategy(boolean skipClass, boolean skipField) { [EOL]     this.skipClass = skipClass; [EOL]     this.skipField = skipField; [EOL] } <line_num>: 30,33
public boolean shouldSkipField(FieldAttributes f) { [EOL]     return skipField; [EOL] } <line_num>: 35,37
public boolean shouldSkipClass(Class<?> clazz) { [EOL]     return skipClass; [EOL] } <line_num>: 39,41
