public Option(String opt, String description) throws IllegalArgumentException
public Option(String opt, boolean hasArg, String description) throws IllegalArgumentException
public Option(String opt, String longOpt, boolean hasArg, String description) throws IllegalArgumentException
public int getId()
 String getKey()
public String getOpt()
public Object getType()
public void setType(Object type)
public String getLongOpt()
public void setLongOpt(String longOpt)
public void setOptionalArg(boolean optionalArg)
public boolean hasOptionalArg()
public boolean hasLongOpt()
public boolean hasArg()
public String getDescription()
public void setDescription(String description)
public boolean isRequired()
public void setRequired(boolean required)
public void setArgName(String argName)
public String getArgName()
public boolean hasArgName()
public boolean hasArgs()
public void setArgs(int num)
public void setValueSeparator(char sep)
public char getValueSeparator()
public boolean hasValueSeparator()
public int getArgs()
 void addValue(String value)
private void processValue(String value)
private void add(String value)
public String getValue()
public String getValue(int index) throws IndexOutOfBoundsException
public String getValue(String defaultValue)
public String[] getValues()
public java.util.List getValuesList()
public String toString()
private boolean hasNoValues()
public boolean equals(Object o)
public int hashCode()
int UNINITIALIZED=Optional[-1]
int UNLIMITED_VALUES=Optional[-2]
String opt
String longOpt
boolean hasArg
String argName=Optional["arg"]
String description
boolean required
boolean optionalArg
int numberOfArgs=Optional[UNINITIALIZED]
Object type
ArrayList values=Optional[new ArrayList()]
char valuesep
