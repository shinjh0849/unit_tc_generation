private Base64() { [EOL] } <line_num>: 28,28
public static char toBase64(int value) { [EOL]     assert (value <= 63 && value >= 0) : "value out of range:" + value; [EOL]     return BASE64_MAP.charAt(value); [EOL] } <line_num>: 54,57
public static int fromBase64(char c) { [EOL]     int result = BASE64_DECODE_MAP[c]; [EOL]     assert (result != -1) : "invalid char"; [EOL]     return BASE64_DECODE_MAP[c]; [EOL] } <line_num>: 63,67
public static String base64EncodeInt(int value) { [EOL]     char[] c = new char[6]; [EOL]     for (int i = 0; i < 5; i++) { [EOL]         c[i] = Base64.toBase64((value >> (26 - i * 6)) & 0x3f); [EOL]     } [EOL]     c[5] = Base64.toBase64((value << 4) & 0x3f); [EOL]     return new String(c); [EOL] } <line_num>: 73,80
