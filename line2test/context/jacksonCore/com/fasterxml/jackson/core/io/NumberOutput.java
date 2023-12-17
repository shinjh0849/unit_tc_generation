public static int outputInt(int value, char[] buffer, int offset)
public static int outputInt(int value, byte[] buffer, int offset)
public static int outputLong(long value, char[] buffer, int offset)
public static int outputLong(long value, byte[] buffer, int offset)
public static String toString(int value)
public static String toString(long value)
public static String toString(double value)
private static int outputLeadingTriplet(int triplet, char[] buffer, int offset)
private static int outputLeadingTriplet(int triplet, byte[] buffer, int offset)
private static int outputFullTriplet(int triplet, char[] buffer, int offset)
private static int outputFullTriplet(int triplet, byte[] buffer, int offset)
private static int calcLongStrLength(long posValue)
char NULL_CHAR=Optional[(char) 0]
int MILLION=Optional[1000000]
int BILLION=Optional[1000000000]
long TEN_BILLION_L=Optional[10000000000L]
long THOUSAND_L=Optional[1000L]
long MIN_INT_AS_LONG=Optional[(long) Integer.MIN_VALUE]
long MAX_INT_AS_LONG=Optional[(long) Integer.MAX_VALUE]
String SMALLEST_LONG=Optional[String.valueOf(Long.MIN_VALUE)]
char[] LEADING_TRIPLETS=Optional[new char[4000]]
char[] FULL_TRIPLETS=Optional[new char[4000]]
byte[] FULL_TRIPLETS_B=Optional[new byte[4000]]
String[] sSmallIntStrs=Optional[new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }]
String[] sSmallIntStrs2=Optional[new String[] { "-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10" }]
