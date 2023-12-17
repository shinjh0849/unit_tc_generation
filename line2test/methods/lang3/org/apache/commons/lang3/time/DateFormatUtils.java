public DateFormatUtils() { [EOL]     super(); [EOL] } <line_num>: 119,121
public static String formatUTC(final long millis, final String pattern) { [EOL]     return format(new Date(millis), pattern, UTC_TIME_ZONE, null); [EOL] } <line_num>: 130,132
public static String formatUTC(final Date date, final String pattern) { [EOL]     return format(date, pattern, UTC_TIME_ZONE, null); [EOL] } <line_num>: 141,143
public static String formatUTC(final long millis, final String pattern, final Locale locale) { [EOL]     return format(new Date(millis), pattern, UTC_TIME_ZONE, locale); [EOL] } <line_num>: 153,155
public static String formatUTC(final Date date, final String pattern, final Locale locale) { [EOL]     return format(date, pattern, UTC_TIME_ZONE, locale); [EOL] } <line_num>: 165,167
public static String format(final long millis, final String pattern) { [EOL]     return format(new Date(millis), pattern, null, null); [EOL] } <line_num>: 176,178
public static String format(final Date date, final String pattern) { [EOL]     return format(date, pattern, null, null); [EOL] } <line_num>: 187,189
public static String format(final Calendar calendar, final String pattern) { [EOL]     return format(calendar, pattern, null, null); [EOL] } <line_num>: 200,202
public static String format(final long millis, final String pattern, final TimeZone timeZone) { [EOL]     return format(new Date(millis), pattern, timeZone, null); [EOL] } <line_num>: 212,214
public static String format(final Date date, final String pattern, final TimeZone timeZone) { [EOL]     return format(date, pattern, timeZone, null); [EOL] } <line_num>: 224,226
public static String format(final Calendar calendar, final String pattern, final TimeZone timeZone) { [EOL]     return format(calendar, pattern, timeZone, null); [EOL] } <line_num>: 238,240
public static String format(final long millis, final String pattern, final Locale locale) { [EOL]     return format(new Date(millis), pattern, null, locale); [EOL] } <line_num>: 250,252
public static String format(final Date date, final String pattern, final Locale locale) { [EOL]     return format(date, pattern, null, locale); [EOL] } <line_num>: 262,264
public static String format(final Calendar calendar, final String pattern, final Locale locale) { [EOL]     return format(calendar, pattern, null, locale); [EOL] } <line_num>: 276,278
public static String format(final long millis, final String pattern, final TimeZone timeZone, final Locale locale) { [EOL]     return format(new Date(millis), pattern, timeZone, locale); [EOL] } <line_num>: 289,291
public static String format(final Date date, final String pattern, final TimeZone timeZone, final Locale locale) { [EOL]     final FastDateFormat df = FastDateFormat.getInstance(pattern, timeZone, locale); [EOL]     return df.format(date); [EOL] } <line_num>: 302,305
public static String format(final Calendar calendar, final String pattern, final TimeZone timeZone, final Locale locale) { [EOL]     final FastDateFormat df = FastDateFormat.getInstance(pattern, timeZone, locale); [EOL]     return df.format(calendar); [EOL] } <line_num>: 318,321
