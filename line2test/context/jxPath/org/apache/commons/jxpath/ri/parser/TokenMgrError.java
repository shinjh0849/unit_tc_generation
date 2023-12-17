public TokenMgrError()
public TokenMgrError(String message, int reason)
public TokenMgrError(boolean EOFSeen, int lexState, int errorLine, int errorColumn, String errorAfter, char curChar, int reason)
public static final String addEscapes(String str)
protected static String LexicalError(boolean EOFSeen, int lexState, int errorLine, int errorColumn, String errorAfter, char curChar)
public String getMessage()
public int getPosition()
public char getCharacter()
int LEXICAL_ERROR=Optional[0]
int STATIC_LEXER_ERROR=Optional[1]
int INVALID_LEXICAL_STATE=Optional[2]
int LOOP_DETECTED=Optional[3]
int errorCode
int position
char character
