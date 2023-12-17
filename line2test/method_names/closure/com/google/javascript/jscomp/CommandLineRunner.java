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
