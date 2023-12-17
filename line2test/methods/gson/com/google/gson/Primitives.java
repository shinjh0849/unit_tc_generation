private Primitives() { [EOL] } <line_num>: 30,30
private static void add(Map<Class<?>, Class<?>> forward, Map<Class<?>, Class<?>> backward, Class<?> key, Class<?> value) { [EOL]     forward.put(key, value); [EOL]     backward.put(value, key); [EOL] } <line_num>: 58,62
public static boolean isWrapperType(Class<?> type) { [EOL]     return WRAPPER_TO_PRIMITIVE_TYPE.containsKey(checkNotNull(type)); [EOL] } <line_num>: 70,72
private static Class<?> checkNotNull(Class<?> type) { [EOL]     Preconditions.checkNotNull(type); [EOL]     return type; [EOL] } <line_num>: 74,77
public static <T> Class<T> wrap(Class<T> type) { [EOL]     checkNotNull(type); [EOL]     @SuppressWarnings("unchecked") [EOL]     Class<T> wrapped = (Class<T>) PRIMITIVE_TO_WRAPPER_TYPE.get(type); [EOL]     return (wrapped == null) ? type : wrapped; [EOL] } <line_num>: 88,95
public static <T> Class<T> unwrap(Class<T> type) { [EOL]     checkNotNull(type); [EOL]     @SuppressWarnings("unchecked") [EOL]     Class<T> unwrapped = (Class<T>) WRAPPER_TO_PRIMITIVE_TYPE.get(type); [EOL]     return (unwrapped == null) ? type : unwrapped; [EOL] } <line_num>: 106,113
