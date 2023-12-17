public static synchronized void setTypeConverter(TypeConverter converter) { [EOL]     typeConverter = converter; [EOL] } <line_num>: 31,33
public static TypeConverter getTypeConverter() { [EOL]     return typeConverter; [EOL] } <line_num>: 38,40
public static boolean canConvert(Object object, Class toType) { [EOL]     return typeConverter.canConvert(object, toType); [EOL] } <line_num>: 46,48
public static Object convert(Object object, Class toType) { [EOL]     return typeConverter.convert(object, toType); [EOL] } <line_num>: 54,56
