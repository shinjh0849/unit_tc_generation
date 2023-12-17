protected StrMatcher()
 CharSetMatcher(final char[] chars)
 CharMatcher(final char ch)
 StringMatcher(final String str)
 NoMatcher()
 TrimMatcher()
public static StrMatcher commaMatcher()
public static StrMatcher tabMatcher()
public static StrMatcher spaceMatcher()
public static StrMatcher splitMatcher()
public static StrMatcher trimMatcher()
public static StrMatcher singleQuoteMatcher()
public static StrMatcher doubleQuoteMatcher()
public static StrMatcher quoteMatcher()
public static StrMatcher noneMatcher()
public static StrMatcher charMatcher(final char ch)
public static StrMatcher charSetMatcher(final char... chars)
public static StrMatcher charSetMatcher(final String chars)
public static StrMatcher stringMatcher(final String str)
public abstract int isMatch(char[] buffer, int pos, int bufferStart, int bufferEnd)
public int isMatch(final char[] buffer, final int pos)
public int isMatch(final char[] buffer, final int pos, final int bufferStart, final int bufferEnd)
public int isMatch(final char[] buffer, final int pos, final int bufferStart, final int bufferEnd)
public int isMatch(final char[] buffer, int pos, final int bufferStart, final int bufferEnd)
public int isMatch(final char[] buffer, final int pos, final int bufferStart, final int bufferEnd)
public int isMatch(final char[] buffer, final int pos, final int bufferStart, final int bufferEnd)
StrMatcher COMMA_MATCHER=Optional[new CharMatcher(',')]
StrMatcher TAB_MATCHER=Optional[new CharMatcher('\t')]
StrMatcher SPACE_MATCHER=Optional[new CharMatcher(' ')]
StrMatcher SPLIT_MATCHER=Optional[new CharSetMatcher(" \t\n\r\f".toCharArray())]
StrMatcher TRIM_MATCHER=Optional[new TrimMatcher()]
StrMatcher SINGLE_QUOTE_MATCHER=Optional[new CharMatcher('\'')]
StrMatcher DOUBLE_QUOTE_MATCHER=Optional[new CharMatcher('"')]
StrMatcher QUOTE_MATCHER=Optional[new CharSetMatcher("'\"".toCharArray())]
StrMatcher NONE_MATCHER=Optional[new NoMatcher()]
