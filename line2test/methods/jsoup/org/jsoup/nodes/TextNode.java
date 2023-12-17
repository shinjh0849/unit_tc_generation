public TextNode(String text, String baseUri) { [EOL]     super(baseUri); [EOL]     attributes.put(TEXT_KEY, text); [EOL] } <line_num>: 21,24
public String nodeName() { [EOL]     return "#text"; [EOL] } <line_num>: 26,28
public String text() { [EOL]     return outerHtml(); [EOL] } <line_num>: 35,37
public TextNode text(String text) { [EOL]     attributes.put(TEXT_KEY, text); [EOL]     return this; [EOL] } <line_num>: 44,47
public String getWholeText() { [EOL]     return attributes.get(TEXT_KEY); [EOL] } <line_num>: 53,55
public boolean isBlank() { [EOL]     return StringUtils.isBlank(normaliseWhitespace(getWholeText())); [EOL] } <line_num>: 61,63
void outerHtml(StringBuilder accum) { [EOL]     String html = StringEscapeUtils.escapeHtml(getWholeText()); [EOL]     if (parent() instanceof Element && !((Element) parent()).preserveWhitespace()) { [EOL]         html = normaliseWhitespace(html); [EOL]     } [EOL]     if (!isBlank() && parentNode instanceof Element && ((Element) parentNode).tag().canContainBlock() && siblingIndex() == 0) [EOL]         indent(accum); [EOL]     accum.append(html); [EOL] } <line_num>: 65,74
public String toString() { [EOL]     return outerHtml(); [EOL] } <line_num>: 76,78
public static TextNode createFromEncoded(String encodedText, String baseUri) { [EOL]     String text = StringEscapeUtils.unescapeHtml(encodedText); [EOL]     return new TextNode(text, baseUri); [EOL] } <line_num>: 85,88
static String normaliseWhitespace(String text) { [EOL]     text = text.replaceAll("\\s{2,}|(\\r\\n|\\r|\\n)", " "); [EOL]     return text; [EOL] } <line_num>: 90,93
static String stripLeadingWhitespace(String text) { [EOL]     return text.replaceFirst("^\\s+", ""); [EOL] } <line_num>: 95,97
static boolean lastCharIsWhitespace(StringBuilder sb) { [EOL]     if (sb.length() == 0) [EOL]         return false; [EOL]     String lastChar = sb.substring(sb.length() - 1, sb.length()); [EOL]     Validate.isTrue(lastChar.length() == 1); [EOL]     return lastChar.equals(" "); [EOL] } <line_num>: 99,105
