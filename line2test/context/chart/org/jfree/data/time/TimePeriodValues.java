public TimePeriodValues(Comparable name)
public TimePeriodValues(Comparable name, String domain, String range)
public String getDomainDescription()
public void setDomainDescription(String description)
public String getRangeDescription()
public void setRangeDescription(String description)
public int getItemCount()
public TimePeriodValue getDataItem(int index)
public TimePeriod getTimePeriod(int index)
public Number getValue(int index)
public void add(TimePeriodValue item)
private void updateBounds(TimePeriod period, int index)
private void recalculateBounds()
public void add(TimePeriod period, double value)
public void add(TimePeriod period, Number value)
public void update(int index, Number value)
public void delete(int start, int end)
public boolean equals(Object obj)
public int hashCode()
public Object clone() throws CloneNotSupportedException
public TimePeriodValues createCopy(int start, int end) throws CloneNotSupportedException
public int getMinStartIndex()
public int getMaxStartIndex()
public int getMinMiddleIndex()
public int getMaxMiddleIndex()
public int getMinEndIndex()
public int getMaxEndIndex()
long serialVersionUID=Optional[-2210593619794989709L]
String DEFAULT_DOMAIN_DESCRIPTION=Optional["Time"]
String DEFAULT_RANGE_DESCRIPTION=Optional["Value"]
String domain
String range
List data
int minStartIndex=Optional[-1]
int maxStartIndex=Optional[-1]
int minMiddleIndex=Optional[-1]
int maxMiddleIndex=Optional[-1]
int minEndIndex=Optional[-1]
int maxEndIndex=Optional[-1]
