 VariableMap(Map<String, String> map)
public String lookupNewName(String sourceName)
public String lookupSourceName(String newName)
private synchronized void initReverseMap()
public Map<String, String> getOriginalNameToNewNameMap()
public Map<String, String> getNewNameToOriginalNameMap()
public void save(String filename) throws IOException
public static VariableMap load(String filename) throws IOException
public byte[] toBytes()
public static VariableMap fromBytes(byte[] bytes) throws ParseException
private static String escape(String value)
private static int findIndexOfChar(String value, char stopChar)
private static String unescape(CharSequence value)
public static VariableMap fromMap(Map<String, String> map)
 Map<String, String> toMap()
