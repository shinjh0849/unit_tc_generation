public static int[] getInputCodeLatin1() { [EOL]     return sInputCodes; [EOL] } <line_num>: 169,169
public static int[] getInputCodeUtf8() { [EOL]     return sInputCodesUtf8; [EOL] } <line_num>: 170,170
public static int[] getInputCodeLatin1JsNames() { [EOL]     return sInputCodesJsNames; [EOL] } <line_num>: 172,172
public static int[] getInputCodeUtf8JsNames() { [EOL]     return sInputCodesUtf8JsNames; [EOL] } <line_num>: 173,173
public static int[] getInputCodeComment() { [EOL]     return sInputCodesComment; [EOL] } <line_num>: 175,175
public static int[] get7BitOutputEscapes() { [EOL]     return sOutputEscapes128; [EOL] } <line_num>: 184,184
public static int charToHex(int ch) { [EOL]     return (ch > 127) ? -1 : sHexValues[ch]; [EOL] } <line_num>: 186,189
public static void appendQuoted(StringBuilder sb, String content) { [EOL]     final int[] escCodes = sOutputEscapes128; [EOL]     int escLen = escCodes.length; [EOL]     for (int i = 0, len = content.length(); i < len; ++i) { [EOL]         char c = content.charAt(i); [EOL]         if (c >= escLen || escCodes[c] == 0) { [EOL]             sb.append(c); [EOL]             continue; [EOL]         } [EOL]         sb.append('\\'); [EOL]         int escCode = escCodes[c]; [EOL]         if (escCode < 0) { [EOL]             sb.append('u'); [EOL]             sb.append('0'); [EOL]             sb.append('0'); [EOL]             int value = c; [EOL]             sb.append(HEX_CHARS[value >> 4]); [EOL]             sb.append(HEX_CHARS[value & 0xF]); [EOL]         } else { [EOL]             sb.append((char) escCode); [EOL]         } [EOL]     } [EOL] } <line_num>: 191,222
public static char[] copyHexChars() { [EOL]     return (char[]) HEX_CHARS.clone(); [EOL] } <line_num>: 224,227
public static byte[] copyHexBytes() { [EOL]     return (byte[]) HEX_BYTES.clone(); [EOL] } <line_num>: 229,232
