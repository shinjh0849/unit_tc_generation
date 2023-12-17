public void setWidth(int width)
public int getWidth()
public void setLeftPadding(int padding)
public int getLeftPadding()
public void setDescPadding(int padding)
public int getDescPadding()
public void setSyntaxPrefix(String prefix)
public String getSyntaxPrefix()
public void setNewLine(String newline)
public String getNewLine()
public void setOptPrefix(String prefix)
public String getOptPrefix()
public void setLongOptPrefix(String prefix)
public String getLongOptPrefix()
public void setArgName(String name)
public String getArgName()
public void printHelp(String cmdLineSyntax, Options options)
public void printHelp(String cmdLineSyntax, Options options, boolean autoUsage)
public void printHelp(String cmdLineSyntax, String header, Options options, String footer)
public void printHelp(String cmdLineSyntax, String header, Options options, String footer, boolean autoUsage)
public void printHelp(int width, String cmdLineSyntax, String header, Options options, String footer)
public void printHelp(int width, String cmdLineSyntax, String header, Options options, String footer, boolean autoUsage)
public void printHelp(PrintWriter pw, int width, String cmdLineSyntax, String header, Options options, int leftPad, int descPad, String footer)
public void printHelp(PrintWriter pw, int width, String cmdLineSyntax, String header, Options options, int leftPad, int descPad, String footer, boolean autoUsage)
public void printUsage(PrintWriter pw, int width, String app, Options options)
private static void appendOptionGroup(final StringBuffer buff, final OptionGroup group)
private static void appendOption(final StringBuffer buff, final Option option, final boolean required)
public void printUsage(PrintWriter pw, int width, String cmdLineSyntax)
public void printOptions(PrintWriter pw, int width, Options options, int leftPad, int descPad)
public void printWrapped(PrintWriter pw, int width, String text)
public void printWrapped(PrintWriter pw, int width, int nextLineTabStop, String text)
protected StringBuffer renderOptions(StringBuffer sb, int width, Options options, int leftPad, int descPad)
protected StringBuffer renderWrappedText(StringBuffer sb, int width, int nextLineTabStop, String text)
protected int findWrapPos(String text, int width, int startPos)
protected String createPadding(int len)
protected String rtrim(String s)
public int compare(Object o1, Object o2)
int DEFAULT_WIDTH=Optional[74]
int DEFAULT_LEFT_PAD=Optional[1]
int DEFAULT_DESC_PAD=Optional[3]
String DEFAULT_SYNTAX_PREFIX=Optional["usage: "]
String DEFAULT_OPT_PREFIX=Optional["-"]
String DEFAULT_LONG_OPT_PREFIX=Optional["--"]
String DEFAULT_ARG_NAME=Optional["arg"]
int defaultWidth=Optional[DEFAULT_WIDTH]
int defaultLeftPad=Optional[DEFAULT_LEFT_PAD]
int defaultDescPad=Optional[DEFAULT_DESC_PAD]
String defaultSyntaxPrefix=Optional[DEFAULT_SYNTAX_PREFIX]
String defaultNewLine=Optional[System.getProperty("line.separator")]
String defaultOptPrefix=Optional[DEFAULT_OPT_PREFIX]
String defaultLongOptPrefix=Optional[DEFAULT_LONG_OPT_PREFIX]
String defaultArgName=Optional[DEFAULT_ARG_NAME]
