public ComparableObjectSeries(Comparable key)
public ComparableObjectSeries(Comparable key, boolean autoSort, boolean allowDuplicateXValues)
public boolean getAutoSort()
public boolean getAllowDuplicateXValues()
public int getItemCount()
public int getMaximumItemCount()
public void setMaximumItemCount(int maximum)
protected void add(Comparable x, Object y)
protected void add(Comparable x, Object y, boolean notify)
protected void add(ComparableObjectItem item, boolean notify)
public int indexOf(Comparable x)
protected void update(Comparable x, Object y)
protected void updateByIndex(int index, Object y)
protected ComparableObjectItem getDataItem(int index)
protected void delete(int start, int end)
public void clear()
protected ComparableObjectItem remove(int index)
public ComparableObjectItem remove(Comparable x)
public boolean equals(Object obj)
public int hashCode()
List data
int maximumItemCount=Optional[Integer.MAX_VALUE]
boolean autoSort
boolean allowDuplicateXValues
