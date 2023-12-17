 ErrorWithLevel(JSError error, CheckLevel level)
public void report(CheckLevel level, JSError error)
public void generateReport()
public abstract void println(CheckLevel level, JSError error)
protected abstract void printSummary()
public int getErrorCount()
public int getWarningCount()
public JSError[] getErrors()
public JSError[] getWarnings()
public void setTypedPercent(double typedPercent)
public double getTypedPercent()
private JSError[] toArray(CheckLevel level)
public int compare(ErrorWithLevel p1, ErrorWithLevel p2)
SortedSet<ErrorWithLevel> messages=Optional[Sets.newTreeSet(new LeveledJSErrorComparator())]
int errorCount=Optional[0]
int warningCount=Optional[0]
double typedPercent=Optional[0.0]
