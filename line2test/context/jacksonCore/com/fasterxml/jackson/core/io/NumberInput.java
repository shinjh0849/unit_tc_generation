public static int parseInt(char[] digitChars, int offset, int len)
public static int parseInt(String str)
public static long parseLong(char[] digitChars, int offset, int len)
public static long parseLong(String str)
public static boolean inLongRange(char[] digitChars, int offset, int len, boolean negative)
public static boolean inLongRange(String numberStr, boolean negative)
public static int parseAsInt(String input, int defaultValue)
public static long parseAsLong(String input, long defaultValue)
public static double parseAsDouble(String input, double defaultValue)
public static double parseDouble(String numStr) throws NumberFormatException
public static BigDecimal parseBigDecimal(String numStr) throws NumberFormatException
public static BigDecimal parseBigDecimal(char[] buffer) throws NumberFormatException
public static BigDecimal parseBigDecimal(char[] buffer, int offset, int len) throws NumberFormatException
private static NumberFormatException _badBigDecimal(String str)
String NASTY_SMALL_DOUBLE=Optional["2.2250738585072012e-308"]
long L_BILLION=Optional[1000000000]
String MIN_LONG_STR_NO_SIGN=Optional[String.valueOf(Long.MIN_VALUE).substring(1)]
String MAX_LONG_STR=Optional[String.valueOf(Long.MAX_VALUE)]
