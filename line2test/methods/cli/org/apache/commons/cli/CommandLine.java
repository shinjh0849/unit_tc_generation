CommandLine() { [EOL] } <line_num>: 54,57
public boolean hasOption(String opt) { [EOL]     return options.contains(resolveOption(opt)); [EOL] } <line_num>: 65,68
public boolean hasOption(char opt) { [EOL]     return hasOption(String.valueOf(opt)); [EOL] } <line_num>: 76,79
public Object getOptionObject(String opt) { [EOL]     String res = getOptionValue(opt); [EOL]     Option option = resolveOption(opt); [EOL]     if (option == null) { [EOL]         return null; [EOL]     } [EOL]     Object type = option.getType(); [EOL]     return (res == null) ? null : TypeHandler.createValue(res, type); [EOL] } <line_num>: 87,100
public Object getOptionObject(char opt) { [EOL]     return getOptionObject(String.valueOf(opt)); [EOL] } <line_num>: 108,111
public String getOptionValue(String opt) { [EOL]     String[] values = getOptionValues(opt); [EOL]     return (values == null) ? null : values[0]; [EOL] } <line_num>: 120,125
public String getOptionValue(char opt) { [EOL]     return getOptionValue(String.valueOf(opt)); [EOL] } <line_num>: 134,137
public String[] getOptionValues(String opt) { [EOL]     Option key = resolveOption(opt); [EOL]     if (options.contains(key)) { [EOL]         return key.getValues(); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 146,156
private Option resolveOption(String opt) { [EOL]     opt = Util.stripLeadingHyphens(opt); [EOL]     for (Iterator it = options.iterator(); it.hasNext(); ) { [EOL]         Option option = (Option) it.next(); [EOL]         if (opt.equals(option.getOpt())) { [EOL]             return option; [EOL]         } [EOL]         if (opt.equals(option.getLongOpt())) { [EOL]             return option; [EOL]         } [EOL]     } [EOL]     return null; [EOL] } <line_num>: 163,180
public String[] getOptionValues(char opt) { [EOL]     return getOptionValues(String.valueOf(opt)); [EOL] } <line_num>: 189,192
public String getOptionValue(String opt, String defaultValue) { [EOL]     String answer = getOptionValue(opt); [EOL]     return (answer != null) ? answer : defaultValue; [EOL] } <line_num>: 203,208
public String getOptionValue(char opt, String defaultValue) { [EOL]     return getOptionValue(String.valueOf(opt), defaultValue); [EOL] } <line_num>: 219,222
public String[] getArgs() { [EOL]     String[] answer = new String[args.size()]; [EOL]     args.toArray(answer); [EOL]     return answer; [EOL] } <line_num>: 229,236
public List getArgList() { [EOL]     return args; [EOL] } <line_num>: 243,246
void addArg(String arg) { [EOL]     args.add(arg); [EOL] } <line_num>: 275,278
void addOption(Option opt) { [EOL]     options.add(opt); [EOL] } <line_num>: 286,289
public Iterator iterator() { [EOL]     return options.iterator(); [EOL] } <line_num>: 297,300
public Option[] getOptions() { [EOL]     Collection processed = options; [EOL]     Option[] optionsArray = new Option[processed.size()]; [EOL]     return (Option[]) processed.toArray(optionsArray); [EOL] } <line_num>: 307,316
