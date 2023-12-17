public StringEscapeUtils()
public int translate(final CharSequence input, final int index, final Writer out) throws IOException
public int translate(final CharSequence input, final int index, final Writer out) throws IOException
public static final String escapeJava(final String input)
public static final String escapeEcmaScript(final String input)
public static final String escapeJson(final String input)
public static final String unescapeJava(final String input)
public static final String unescapeEcmaScript(final String input)
public static final String unescapeJson(final String input)
public static final String escapeHtml4(final String input)
public static final String escapeHtml3(final String input)
public static final String unescapeHtml4(final String input)
public static final String unescapeHtml3(final String input)
public static final String escapeXml(final String input)
public static final String unescapeXml(final String input)
public static final String escapeCsv(final String input)
public static final String unescapeCsv(final String input)
CharSequenceTranslator ESCAPE_JAVA=Optional[new LookupTranslator(new String[][] { { "\"", "\\\"" }, { "\\", "\\\\" } }).with(new LookupTranslator(EntityArrays.JAVA_CTRL_CHARS_ESCAPE())).with(JavaUnicodeEscaper.outsideOf(32, 0x7f))]
CharSequenceTranslator ESCAPE_ECMASCRIPT=Optional[new AggregateTranslator(new LookupTranslator(new String[][] { { "'", "\\'" }, { "\"", "\\\"" }, { "\\", "\\\\" }, { "/", "\\/" } }), new LookupTranslator(EntityArrays.JAVA_CTRL_CHARS_ESCAPE()), JavaUnicodeEscaper.outsideOf(32, 0x7f))]
CharSequenceTranslator ESCAPE_JSON=Optional[new AggregateTranslator(new LookupTranslator(new String[][] { { "\"", "\\\"" }, { "\\", "\\\\" }, { "/", "\\/" } }), new LookupTranslator(EntityArrays.JAVA_CTRL_CHARS_ESCAPE()), JavaUnicodeEscaper.outsideOf(32, 0x7f))]
CharSequenceTranslator ESCAPE_XML=Optional[new AggregateTranslator(new LookupTranslator(EntityArrays.BASIC_ESCAPE()), new LookupTranslator(EntityArrays.APOS_ESCAPE()))]
CharSequenceTranslator ESCAPE_HTML3=Optional[new AggregateTranslator(new LookupTranslator(EntityArrays.BASIC_ESCAPE()), new LookupTranslator(EntityArrays.ISO8859_1_ESCAPE()))]
CharSequenceTranslator ESCAPE_HTML4=Optional[new AggregateTranslator(new LookupTranslator(EntityArrays.BASIC_ESCAPE()), new LookupTranslator(EntityArrays.ISO8859_1_ESCAPE()), new LookupTranslator(EntityArrays.HTML40_EXTENDED_ESCAPE()))]
CharSequenceTranslator ESCAPE_CSV=Optional[new CsvEscaper()]
CharSequenceTranslator UNESCAPE_JAVA=Optional[new AggregateTranslator(// .between('\1', '\377'),
new OctalUnescaper(), new UnicodeUnescaper(), new LookupTranslator(EntityArrays.JAVA_CTRL_CHARS_UNESCAPE()), new LookupTranslator(new String[][] { { "\\\\", "\\" }, { "\\\"", "\"" }, { "\\'", "'" }, { "\\", "" } }))]
CharSequenceTranslator UNESCAPE_ECMASCRIPT=Optional[UNESCAPE_JAVA]
CharSequenceTranslator UNESCAPE_JSON=Optional[UNESCAPE_JAVA]
CharSequenceTranslator UNESCAPE_HTML3=Optional[new AggregateTranslator(new LookupTranslator(EntityArrays.BASIC_UNESCAPE()), new LookupTranslator(EntityArrays.ISO8859_1_UNESCAPE()), new NumericEntityUnescaper())]
CharSequenceTranslator UNESCAPE_HTML4=Optional[new AggregateTranslator(new LookupTranslator(EntityArrays.BASIC_UNESCAPE()), new LookupTranslator(EntityArrays.ISO8859_1_UNESCAPE()), new LookupTranslator(EntityArrays.HTML40_EXTENDED_UNESCAPE()), new NumericEntityUnescaper())]
CharSequenceTranslator UNESCAPE_XML=Optional[new AggregateTranslator(new LookupTranslator(EntityArrays.BASIC_UNESCAPE()), new LookupTranslator(EntityArrays.APOS_UNESCAPE()), new NumericEntityUnescaper())]
CharSequenceTranslator UNESCAPE_CSV=Optional[new CsvUnescaper()]
