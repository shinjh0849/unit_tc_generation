public static void checkNotNull(Object obj) { [EOL]     checkArgument(obj != null); [EOL] } <line_num>: 33,35
public static void checkArgument(boolean condition) { [EOL]     if (!condition) { [EOL]         throw new IllegalArgumentException("condition failed: " + condition); [EOL]     } [EOL] } <line_num>: 37,41
public static void checkState(boolean condition) { [EOL]     if (!condition) { [EOL]         throw new IllegalArgumentException("condition failed: " + condition); [EOL]     } [EOL] } <line_num>: 43,47
