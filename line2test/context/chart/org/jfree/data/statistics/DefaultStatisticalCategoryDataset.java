public DefaultStatisticalCategoryDataset()
public Number getMeanValue(int row, int column)
public Number getValue(int row, int column)
public Number getValue(Comparable rowKey, Comparable columnKey)
public Number getMeanValue(Comparable rowKey, Comparable columnKey)
public Number getStdDevValue(int row, int column)
public Number getStdDevValue(Comparable rowKey, Comparable columnKey)
public int getColumnIndex(Comparable key)
public Comparable getColumnKey(int column)
public List getColumnKeys()
public int getRowIndex(Comparable key)
public Comparable getRowKey(int row)
public List getRowKeys()
public int getRowCount()
public int getColumnCount()
public void add(double mean, double standardDeviation, Comparable rowKey, Comparable columnKey)
public void add(Number mean, Number standardDeviation, Comparable rowKey, Comparable columnKey)
public void remove(Comparable rowKey, Comparable columnKey)
public void removeRow(int rowIndex)
public void removeRow(Comparable rowKey)
public void removeColumn(int columnIndex)
public void removeColumn(Comparable columnKey)
public void clear()
private void updateBounds()
public double getRangeLowerBound(boolean includeInterval)
public double getRangeUpperBound(boolean includeInterval)
public Range getRangeBounds(boolean includeInterval)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
KeyedObjects2D data
double minimumRangeValue
int minimumRangeValueRow
int minimumRangeValueColumn
double minimumRangeValueIncStdDev
int minimumRangeValueIncStdDevRow
int minimumRangeValueIncStdDevColumn
double maximumRangeValue
int maximumRangeValueRow
int maximumRangeValueColumn
double maximumRangeValueIncStdDev
int maximumRangeValueIncStdDevRow
int maximumRangeValueIncStdDevColumn
