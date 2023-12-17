protected StrMatcher() { [EOL]     super(); [EOL] } <line_num>: 216,218
CharSetMatcher(final char[] chars) { [EOL]     super(); [EOL]     this.chars = chars.clone(); [EOL]     Arrays.sort(this.chars); [EOL] } <line_num>: 284,288
CharMatcher(final char ch) { [EOL]     super(); [EOL]     this.ch = ch; [EOL] } <line_num>: 318,321
StringMatcher(final String str) { [EOL]     super(); [EOL]     chars = str.toCharArray(); [EOL] } <line_num>: 351,354
NoMatcher() { [EOL]     super(); [EOL] } <line_num>: 389,391
TrimMatcher() { [EOL]     super(); [EOL] } <line_num>: 417,419
public static StrMatcher commaMatcher() { [EOL]     return COMMA_MATCHER; [EOL] } <line_num>: 80,82
public static StrMatcher tabMatcher() { [EOL]     return TAB_MATCHER; [EOL] } <line_num>: 89,91
public static StrMatcher spaceMatcher() { [EOL]     return SPACE_MATCHER; [EOL] } <line_num>: 98,100
public static StrMatcher splitMatcher() { [EOL]     return SPLIT_MATCHER; [EOL] } <line_num>: 108,110
public static StrMatcher trimMatcher() { [EOL]     return TRIM_MATCHER; [EOL] } <line_num>: 117,119
public static StrMatcher singleQuoteMatcher() { [EOL]     return SINGLE_QUOTE_MATCHER; [EOL] } <line_num>: 126,128
public static StrMatcher doubleQuoteMatcher() { [EOL]     return DOUBLE_QUOTE_MATCHER; [EOL] } <line_num>: 135,137
public static StrMatcher quoteMatcher() { [EOL]     return QUOTE_MATCHER; [EOL] } <line_num>: 144,146
public static StrMatcher noneMatcher() { [EOL]     return NONE_MATCHER; [EOL] } <line_num>: 153,155
public static StrMatcher charMatcher(final char ch) { [EOL]     return new CharMatcher(ch); [EOL] } <line_num>: 163,165
public static StrMatcher charSetMatcher(final char... chars) { [EOL]     if (chars == null || chars.length == 0) { [EOL]         return NONE_MATCHER; [EOL]     } [EOL]     if (chars.length == 1) { [EOL]         return new CharMatcher(chars[0]); [EOL]     } [EOL]     return new CharSetMatcher(chars); [EOL] } <line_num>: 173,181
public static StrMatcher charSetMatcher(final String chars) { [EOL]     if (StringUtils.isEmpty(chars)) { [EOL]         return NONE_MATCHER; [EOL]     } [EOL]     if (chars.length() == 1) { [EOL]         return new CharMatcher(chars.charAt(0)); [EOL]     } [EOL]     return new CharSetMatcher(chars.toCharArray()); [EOL] } <line_num>: 189,197
public static StrMatcher stringMatcher(final String str) { [EOL]     if (StringUtils.isEmpty(str)) { [EOL]         return NONE_MATCHER; [EOL]     } [EOL]     return new StringMatcher(str); [EOL] } <line_num>: 205,210
public abstract int isMatch(char[] buffer, int pos, int bufferStart, int bufferEnd); <line_num>: 245,245
public int isMatch(final char[] buffer, final int pos) { [EOL]     return isMatch(buffer, pos, 0, buffer.length); [EOL] } <line_num>: 267,269
@Override [EOL] public int isMatch(final char[] buffer, final int pos, final int bufferStart, final int bufferEnd) { [EOL]     return Arrays.binarySearch(chars, buffer[pos]) >= 0 ? 1 : 0; [EOL] } <line_num>: 299,302
@Override [EOL] public int isMatch(final char[] buffer, final int pos, final int bufferStart, final int bufferEnd) { [EOL]     return ch == buffer[pos] ? 1 : 0; [EOL] } <line_num>: 332,335
@Override [EOL] public int isMatch(final char[] buffer, int pos, final int bufferStart, final int bufferEnd) { [EOL]     final int len = chars.length; [EOL]     if (pos + len > bufferEnd) { [EOL]         return 0; [EOL]     } [EOL]     for (int i = 0; i < chars.length; i++, pos++) { [EOL]         if (chars[i] != buffer[pos]) { [EOL]             return 0; [EOL]         } [EOL]     } [EOL]     return len; [EOL] } <line_num>: 365,377
@Override [EOL] public int isMatch(final char[] buffer, final int pos, final int bufferStart, final int bufferEnd) { [EOL]     return 0; [EOL] } <line_num>: 402,405
@Override [EOL] public int isMatch(final char[] buffer, final int pos, final int bufferStart, final int bufferEnd) { [EOL]     return buffer[pos] <= 32 ? 1 : 0; [EOL] } <line_num>: 430,433
