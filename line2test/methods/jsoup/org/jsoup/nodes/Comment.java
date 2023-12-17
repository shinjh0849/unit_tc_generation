public Comment(String data, String baseUri) { [EOL]     super(baseUri); [EOL]     attributes.put(COMMENT_KEY, data); [EOL] } <line_num>: 15,18
public String nodeName() { [EOL]     return "#comment"; [EOL] } <line_num>: 20,22
public String getData() { [EOL]     return attributes.get(COMMENT_KEY); [EOL] } <line_num>: 28,30
void outerHtml(StringBuilder accum) { [EOL]     indent(accum); [EOL]     accum.append(String.format("<!--%s-->", getData())); [EOL] } <line_num>: 32,35
public String toString() { [EOL]     return outerHtml(); [EOL] } <line_num>: 37,39
