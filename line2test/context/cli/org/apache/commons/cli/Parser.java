protected abstract String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption)
public CommandLine parse(Options options, String[] arguments) throws ParseException
public CommandLine parse(Options options, String[] arguments, Properties properties) throws ParseException
public CommandLine parse(Options options, String[] arguments, boolean stopAtNonOption) throws ParseException
public CommandLine parse(Options options, String[] arguments, Properties properties, boolean stopAtNonOption) throws ParseException
private void processProperties(Properties properties)
private void checkRequiredOptions() throws MissingOptionException
public void processArgs(Option opt, ListIterator iter) throws ParseException
private void processOption(String arg, ListIterator iter) throws ParseException
CommandLine cmd
Options options
List requiredOptions
