public Option(String opt, String description) throws IllegalArgumentException { [EOL]     this(opt, null, false, description); [EOL] } <line_num>: 89,93
public Option(String opt, boolean hasArg, String description) throws IllegalArgumentException { [EOL]     this(opt, null, hasArg, description); [EOL] } <line_num>: 105,109
public Option(String opt, String longOpt, boolean hasArg, String description) throws IllegalArgumentException { [EOL]     OptionValidator.validateOption(opt); [EOL]     this.opt = opt; [EOL]     this.longOpt = longOpt; [EOL]     if (hasArg) { [EOL]         this.numberOfArgs = 1; [EOL]     } [EOL]     this.hasArg = hasArg; [EOL]     this.description = description; [EOL] } <line_num>: 122,140
public int getId() { [EOL]     return getKey().charAt(0); [EOL] } <line_num>: 149,152
String getKey() { [EOL]     if (opt == null) { [EOL]         return this.longOpt; [EOL]     } [EOL]     return this.opt; [EOL] } <line_num>: 159,168
public String getOpt() { [EOL]     return this.opt; [EOL] } <line_num>: 180,183
public Object getType() { [EOL]     return this.type; [EOL] } <line_num>: 190,193
public void setType(Object type) { [EOL]     this.type = type; [EOL] } <line_num>: 200,203
public String getLongOpt() { [EOL]     return this.longOpt; [EOL] } <line_num>: 210,213
public void setLongOpt(String longOpt) { [EOL]     this.longOpt = longOpt; [EOL] } <line_num>: 220,223
public void setOptionalArg(boolean optionalArg) { [EOL]     this.optionalArg = optionalArg; [EOL] } <line_num>: 231,234
public boolean hasOptionalArg() { [EOL]     return this.optionalArg; [EOL] } <line_num>: 239,242
public boolean hasLongOpt() { [EOL]     return (this.longOpt != null); [EOL] } <line_num>: 249,252
public boolean hasArg() { [EOL]     return (this.numberOfArgs > 0) || (numberOfArgs == UNLIMITED_VALUES); [EOL] } <line_num>: 259,262
public String getDescription() { [EOL]     return this.description; [EOL] } <line_num>: 269,272
public void setDescription(String description) { [EOL]     this.description = description; [EOL] } <line_num>: 279,282
public boolean isRequired() { [EOL]     return this.required; [EOL] } <line_num>: 289,292
public void setRequired(boolean required) { [EOL]     this.required = required; [EOL] } <line_num>: 299,302
public void setArgName(String argName) { [EOL]     this.argName = argName; [EOL] } <line_num>: 309,312
public String getArgName() { [EOL]     return this.argName; [EOL] } <line_num>: 319,322
public boolean hasArgName() { [EOL]     return (this.argName != null && this.argName.length() > 0); [EOL] } <line_num>: 331,334
public boolean hasArgs() { [EOL]     return (this.numberOfArgs > 1) || (this.numberOfArgs == UNLIMITED_VALUES); [EOL] } <line_num>: 341,345
public void setArgs(int num) { [EOL]     this.numberOfArgs = num; [EOL] } <line_num>: 352,355
public void setValueSeparator(char sep) { [EOL]     this.valuesep = sep; [EOL] } <line_num>: 363,366
public char getValueSeparator() { [EOL]     return this.valuesep; [EOL] } <line_num>: 373,376
public boolean hasValueSeparator() { [EOL]     return (this.valuesep > 0); [EOL] } <line_num>: 383,386
public int getArgs() { [EOL]     return this.numberOfArgs; [EOL] } <line_num>: 393,396
void addValue(String value) { [EOL]     switch(numberOfArgs) { [EOL]         case UNINITIALIZED: [EOL]             throw new RuntimeException("NO_ARGS_ALLOWED"); [EOL]         default: [EOL]             processValue(value); [EOL]     } [EOL] } <line_num>: 403,413
private void processValue(String value) { [EOL]     if (hasValueSeparator()) { [EOL]         char sep = getValueSeparator(); [EOL]         int index = value.indexOf(sep); [EOL]         while (index != -1) { [EOL]             if (values.size() == (numberOfArgs - 1)) { [EOL]                 break; [EOL]             } [EOL]             add(value.substring(0, index)); [EOL]             value = value.substring(index + 1); [EOL]             index = value.indexOf(sep); [EOL]         } [EOL]     } [EOL]     add(value); [EOL] } <line_num>: 426,463
private void add(String value) { [EOL]     if ((numberOfArgs > 0) && (values.size() > (numberOfArgs - 1))) { [EOL]         throw new RuntimeException("Cannot add value, list full."); [EOL]     } [EOL]     this.values.add(value); [EOL] } <line_num>: 474,484
public String getValue() { [EOL]     return hasNoValues() ? null : (String) this.values.get(0); [EOL] } <line_num>: 493,496
public String getValue(int index) throws IndexOutOfBoundsException { [EOL]     return hasNoValues() ? null : (String) this.values.get(index); [EOL] } <line_num>: 510,514
public String getValue(String defaultValue) { [EOL]     String value = getValue(); [EOL]     return (value != null) ? value : defaultValue; [EOL] } <line_num>: 526,531
public String[] getValues() { [EOL]     return hasNoValues() ? null : (String[]) this.values.toArray(new String[] {}); [EOL] } <line_num>: 540,544
public java.util.List getValuesList() { [EOL]     return this.values; [EOL] } <line_num>: 550,553
public String toString() { [EOL]     StringBuffer buf = new StringBuffer().append("[ option: "); [EOL]     buf.append(this.opt); [EOL]     if (this.longOpt != null) { [EOL]         buf.append(" ").append(this.longOpt); [EOL]     } [EOL]     buf.append(" "); [EOL]     if (hasArg) { [EOL]         buf.append("+ARG"); [EOL]     } [EOL]     buf.append(" :: ").append(this.description); [EOL]     if (this.type != null) { [EOL]         buf.append(" :: ").append(this.type); [EOL]     } [EOL]     buf.append(" ]"); [EOL]     return buf.toString(); [EOL] } <line_num>: 560,588
private boolean hasNoValues() { [EOL]     return this.values.size() == 0; [EOL] } <line_num>: 595,598
public boolean equals(Object o) { [EOL]     if (this == o) { [EOL]         return true; [EOL]     } [EOL]     if (o == null || getClass() != o.getClass()) { [EOL]         return false; [EOL]     } [EOL]     Option option = (Option) o; [EOL]     if (opt != null ? !opt.equals(option.opt) : option.opt != null) { [EOL]         return false; [EOL]     } [EOL]     if (longOpt != null ? !longOpt.equals(option.longOpt) : option.longOpt != null) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 600,624
public int hashCode() { [EOL]     int result; [EOL]     result = (opt != null ? opt.hashCode() : 0); [EOL]     result = 31 * result + (longOpt != null ? longOpt.hashCode() : 0); [EOL]     return result; [EOL] } <line_num>: 626,632
