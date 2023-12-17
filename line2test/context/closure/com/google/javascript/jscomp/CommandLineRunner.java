public BooleanOptionHandler(CmdLineParser parser, OptionDef option, Setter<? super Boolean> setter)
public WarningGuardErrorOptionHandler(CmdLineParser parser, OptionDef option, Setter<? super String> setter)
public WarningGuardWarningOptionHandler(CmdLineParser parser, OptionDef option, Setter<? super String> setter)
public WarningGuardOffOptionHandler(CmdLineParser parser, OptionDef option, Setter<? super String> setter)
private WarningGuardSetter(Setter<? super String> proxy, CheckLevel level)
protected CommandLineRunner(String[] args)
protected CommandLineRunner(String[] args, PrintStream out, PrintStream err)
 List<String> getJsFiles()
public int parseArguments(Parameters params) throws CmdLineException
public String getDefaultMetaVariable()
public boolean isMultiValued()
public Class<String> getType()
public void addValue(String value) throws CmdLineException
private void applyToOptions(CompilerOptions options)
private List<String> tokenizeKeepingQuotedStrings(List<String> lines)
private List<String> processArgs(String[] args)
private void processFlagFile(PrintStream err) throws CmdLineException, IOException
private void initConfigFromFlags(String[] args, PrintStream err)
protected CompilerOptions createOptions()
protected Compiler createCompiler()
protected List<SourceFile> createExterns() throws FlagUsageException, IOException
public static List<SourceFile> getDefaultExterns() throws IOException
public boolean shouldRunCompiler()
public static void main(String[] args)
Flags flags=Optional[new Flags()]
boolean isConfigValid=Optional[false]
List<String> DEFAULT_EXTERNS_NAMES=Optional[ImmutableList.of(// JS externs
"es3.js", "es5.js", // Event APIs
"w3c_event.js", "w3c_event3.js", "gecko_event.js", "ie_event.js", "webkit_event.js", // DOM apis
"w3c_dom1.js", "w3c_dom2.js", "w3c_dom3.js", "gecko_dom.js", "ie_dom.js", "webkit_dom.js", // CSS apis
"w3c_css.js", "gecko_css.js", "ie_css.js", "webkit_css.js", // Top-level namespaces
"google.js", "deprecated.js", "fileapi.js", "flash.js", "gears_symbols.js", "gears_types.js", "gecko_xml.js", "html5.js", "ie_vml.js", "iphone.js", "webstorage.js", "w3c_anim_timing.js", "w3c_css3d.js", "w3c_elementtraversal.js", "w3c_geolocation.js", "w3c_indexeddb.js", "w3c_navigation_timing.js", "w3c_range.js", "w3c_selectors.js", "w3c_xml.js", "window.js", "webkit_notifications.js", "webgl.js")]
