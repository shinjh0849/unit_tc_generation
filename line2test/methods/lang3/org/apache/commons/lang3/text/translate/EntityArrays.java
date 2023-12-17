public static String[][] ISO8859_1_ESCAPE() { [EOL]     return ISO8859_1_ESCAPE.clone(); [EOL] } <line_num>: 34,34
public static String[][] ISO8859_1_UNESCAPE() { [EOL]     return ISO8859_1_UNESCAPE.clone(); [EOL] } <line_num>: 138,138
public static String[][] HTML40_EXTENDED_ESCAPE() { [EOL]     return HTML40_EXTENDED_ESCAPE.clone(); [EOL] } <line_num>: 147,147
public static String[][] HTML40_EXTENDED_UNESCAPE() { [EOL]     return HTML40_EXTENDED_UNESCAPE.clone(); [EOL] } <line_num>: 349,349
public static String[][] BASIC_ESCAPE() { [EOL]     return BASIC_ESCAPE.clone(); [EOL] } <line_num>: 358,358
public static String[][] BASIC_UNESCAPE() { [EOL]     return BASIC_UNESCAPE.clone(); [EOL] } <line_num>: 370,370
public static String[][] APOS_ESCAPE() { [EOL]     return APOS_ESCAPE.clone(); [EOL] } <line_num>: 377,377
public static String[][] APOS_UNESCAPE() { [EOL]     return APOS_UNESCAPE.clone(); [EOL] } <line_num>: 386,386
public static String[][] JAVA_CTRL_CHARS_ESCAPE() { [EOL]     return JAVA_CTRL_CHARS_ESCAPE.clone(); [EOL] } <line_num>: 395,395
public static String[][] JAVA_CTRL_CHARS_UNESCAPE() { [EOL]     return JAVA_CTRL_CHARS_UNESCAPE.clone(); [EOL] } <line_num>: 408,408
public static String[][] invert(final String[][] array) { [EOL]     final String[][] newarray = new String[array.length][2]; [EOL]     for (int i = 0; i < array.length; i++) { [EOL]         newarray[i][0] = array[i][1]; [EOL]         newarray[i][1] = array[i][0]; [EOL]     } [EOL]     return newarray; [EOL] } <line_num>: 416,423
