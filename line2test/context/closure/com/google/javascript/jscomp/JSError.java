private JSError(String sourceName, @Nullable Node node, int lineno, int charno, DiagnosticType type, CheckLevel level, String... arguments)
private JSError(String sourceName, @Nullable Node node, DiagnosticType type, String... arguments)
public static JSError make(DiagnosticType type, String... arguments)
public static JSError make(String sourceName, int lineno, int charno, DiagnosticType type, String... arguments)
public static JSError make(String sourceName, int lineno, int charno, CheckLevel level, DiagnosticType type, String... arguments)
public static JSError make(String sourceName, Node n, DiagnosticType type, String... arguments)
public static JSError make(Node n, DiagnosticType type, String... arguments)
public static JSError make(String sourceName, Node n, CheckLevel level, DiagnosticType type, String... arguments)
public DiagnosticType getType()
public String format(CheckLevel level, MessageFormatter formatter)
public String toString()
public int getCharno()
public int getLineNumber()
public int getNodeSourceOffset()
public int getNodeLength()
public CheckLevel getDefaultLevel()
public boolean equals(Object o)
public int hashCode()
DiagnosticType type
String description
String sourceName
Node node
int lineNumber
CheckLevel level
CheckLevel defaultLevel
int charno
