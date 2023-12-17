private Jsoup() { [EOL] } <line_num>: 17,17
public static Document parse(String html, String baseUri) { [EOL]     return Parser.parse(html, baseUri); [EOL] } <line_num>: 27,29
public static Document parse(String html) { [EOL]     return Parser.parse(html, ""); [EOL] } <line_num>: 40,42
public static Document parse(URL url, int timeoutMillis) throws IOException { [EOL]     String html = DataUtil.load(url, timeoutMillis); [EOL]     return parse(html, url.toExternalForm()); [EOL] } <line_num>: 54,57
public static Document parse(File in, String charsetName, String baseUri) throws IOException { [EOL]     String html = DataUtil.load(in, charsetName); [EOL]     return parse(html, baseUri); [EOL] } <line_num>: 69,72
public static Document parse(File in, String charsetName) throws IOException { [EOL]     String html = DataUtil.load(in, charsetName); [EOL]     return parse(html, in.getAbsolutePath()); [EOL] } <line_num>: 84,87
public static Document parseBodyFragment(String bodyHtml, String baseUri) { [EOL]     return Parser.parseBodyFragment(bodyHtml, baseUri); [EOL] } <line_num>: 98,100
public static Document parseBodyFragment(String bodyHtml) { [EOL]     return Parser.parseBodyFragment(bodyHtml, ""); [EOL] } <line_num>: 110,112
public static String clean(String bodyHtml, String baseUri, Whitelist whitelist) { [EOL]     Document dirty = parseBodyFragment(bodyHtml, baseUri); [EOL]     Cleaner cleaner = new Cleaner(whitelist); [EOL]     Document clean = cleaner.clean(dirty); [EOL]     return clean.body().html(); [EOL] } <line_num>: 125,130
public static String clean(String bodyHtml, Whitelist whitelist) { [EOL]     return clean(bodyHtml, "", whitelist); [EOL] } <line_num>: 142,144
public static boolean isValid(String bodyHtml, Whitelist whitelist) { [EOL]     Document dirty = parseBodyFragment(bodyHtml, ""); [EOL]     Cleaner cleaner = new Cleaner(whitelist); [EOL]     return cleaner.isValid(dirty); [EOL] } <line_num>: 154,158
