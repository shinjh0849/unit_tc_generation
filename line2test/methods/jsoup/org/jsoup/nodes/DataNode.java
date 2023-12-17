public DataNode(String data, String baseUri) { [EOL]     super(baseUri); [EOL]     attributes.put(DATA_KEY, data); [EOL] } <line_num>: 17,20
public String nodeName() { [EOL]     return "#data"; [EOL] } <line_num>: 22,24
public String getWholeData() { [EOL]     return attributes.get(DATA_KEY); [EOL] } <line_num>: 30,32
void outerHtml(StringBuilder accum) { [EOL]     accum.append(getWholeData()); [EOL] } <line_num>: 34,36
public String toString() { [EOL]     return outerHtml(); [EOL] } <line_num>: 38,40
public static DataNode createFromEncoded(String encodedData, String baseUri) { [EOL]     String data = StringEscapeUtils.unescapeHtml(encodedData); [EOL]     return new DataNode(data, baseUri); [EOL] } <line_num>: 48,51
