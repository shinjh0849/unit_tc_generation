 CSVFormat(char delimiter, char encapsulator, char commentStart, char escape, boolean surroundingSpacesIgnored, boolean emptyLinesIgnored, String lineSeparator, String[] header)
private static boolean isLineBreak(char c)
 void validate() throws IllegalArgumentException
public char getDelimiter()
public CSVFormat withDelimiter(char delimiter)
public char getEncapsulator()
public CSVFormat withEncapsulator(char encapsulator)
 boolean isEncapsulating()
public char getCommentStart()
public CSVFormat withCommentStart(char commentStart)
public boolean isCommentingEnabled()
public char getEscape()
public CSVFormat withEscape(char escape)
 boolean isEscaping()
public boolean isSurroundingSpacesIgnored()
public CSVFormat withSurroundingSpacesIgnored(boolean surroundingSpacesIgnored)
public boolean isEmptyLinesIgnored()
public CSVFormat withEmptyLinesIgnored(boolean emptyLinesIgnored)
public String getLineSeparator()
public CSVFormat withLineSeparator(String lineSeparator)
 String[] getHeader()
public CSVFormat withHeader(String... header)
public Iterable<CSVRecord> parse(Reader in) throws IOException
public String format(String... values)
public String toString()
String CRLF=Optional["\r\n"]
char delimiter
char encapsulator
char commentStart
char escape
boolean surroundingSpacesIgnored
boolean emptyLinesIgnored
String lineSeparator
String[] header
char DISABLED=Optional['\ufffe']
CSVFormat PRISTINE=Optional[new CSVFormat(DISABLED, DISABLED, DISABLED, DISABLED, false, false, null, null)]
CSVFormat DEFAULT=Optional[PRISTINE.withDelimiter(',').withEncapsulator('"').withEmptyLinesIgnored(true).withLineSeparator(CRLF)]
CSVFormat RFC4180=Optional[PRISTINE.withDelimiter(',').withEncapsulator('"').withLineSeparator(CRLF)]
CSVFormat EXCEL=Optional[PRISTINE.withDelimiter(',').withEncapsulator('"').withLineSeparator(CRLF)]
CSVFormat TDF=Optional[PRISTINE.withDelimiter('\t').withEncapsulator('"').withSurroundingSpacesIgnored(true).withEmptyLinesIgnored(true).withLineSeparator(CRLF)]
CSVFormat MYSQL=Optional[PRISTINE.withDelimiter('\t').withEscape('\\').withLineSeparator("\n")]
