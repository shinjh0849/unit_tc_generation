public XmlDeclaration(String data, String baseUri, boolean isProcessingInstruction) { [EOL]     super(baseUri); [EOL]     attributes.put(DECL_KEY, data); [EOL]     this.isProcessingInstruction = isProcessingInstruction; [EOL] } <line_num>: 17,21
public String nodeName() { [EOL]     return "#declaration"; [EOL] } <line_num>: 23,25
public String getWholeDeclaration() { [EOL]     return attributes.get(DECL_KEY); [EOL] } <line_num>: 31,33
void outerHtml(StringBuilder accum) { [EOL]     accum.append(String.format("<%s%s>", isProcessingInstruction ? "!" : "?", getWholeDeclaration())); [EOL] } <line_num>: 35,37
public String toString() { [EOL]     return outerHtml(); [EOL] } <line_num>: 39,41
