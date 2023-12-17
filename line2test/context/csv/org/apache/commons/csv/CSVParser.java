public CSVParser(Reader input) throws IOException
public CSVParser(Reader input, CSVFormat format) throws IOException
public CSVParser(String input, CSVFormat format) throws IOException
public List<CSVRecord> getRecords() throws IOException
 CSVRecord getRecord() throws IOException
private Map<String, Integer> initializeHeader(CSVFormat format) throws IOException
public boolean hasNext()
public CSVRecord next()
private CSVRecord getNextRecord()
public void remove()
public Iterator<CSVRecord> iterator()
public int getLineNumber()
Lexer lexer
Map<String, Integer> headerMapping
List<String> record=Optional[new ArrayList<String>()]
Token reusableToken=Optional[new Token()]
