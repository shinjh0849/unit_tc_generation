 JsDocTokenStream(String sourceString)
 JsDocTokenStream(String sourceString, int lineno)
 JsDocTokenStream(String sourceString, int lineno, int initCharno)
 final JsDocToken getJsDocToken()
 String getRemainingJSDocLine()
 final int getLineno()
 final int getCharno()
 final String getString()
 final boolean eof()
private String getStringFromBuffer()
private void addToString(int c)
 void ungetChar(int c)
private boolean matchChar(int test)
private static boolean isAlpha(int c)
private boolean isJSDocString(int c)
 static boolean isJSSpace(int c)
private static boolean isJSFormatChar(int c)
 void update()
private int peekChar()
protected int getChar()
private int getCharIgnoreLineEnd()
private void ungetCharIgnoreLineEnd(int c)
 final int getOffset()
int EOF_CHAR=Optional[-1]
String string=Optional[""]
char[] stringBuffer=Optional[new char[128]]
int stringBufferTop
int[] ungetBuffer=Optional[new int[3]]
int ungetCursor
boolean hitEOF=Optional[false]
int lineStart=Optional[0]
int lineEndChar=Optional[-1]
int lineno
int charno=Optional[-1]
int initCharno
int initLineno
String sourceString
int sourceEnd
int sourceCursor
int cursor
int tokenBeg
int tokenEnd
