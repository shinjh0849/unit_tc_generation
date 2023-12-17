private FormatUtils()
public static void appendPaddedInteger(StringBuffer buf, int value, int size)
public static void appendPaddedInteger(StringBuffer buf, long value, int size)
public static void writePaddedInteger(Writer out, int value, int size) throws IOException
public static void writePaddedInteger(Writer out, long value, int size) throws IOException
public static void appendUnpaddedInteger(StringBuffer buf, int value)
public static void appendUnpaddedInteger(StringBuffer buf, long value)
public static void writeUnpaddedInteger(Writer out, int value) throws IOException
public static void writeUnpaddedInteger(Writer out, long value) throws IOException
public static int calculateDigitCount(long value)
 static int parseTwoDigits(String text, int position)
 static String createErrorMessage(final String text, final int errorPos)
