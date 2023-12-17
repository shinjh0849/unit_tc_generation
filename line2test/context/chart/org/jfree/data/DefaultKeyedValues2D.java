public DefaultKeyedValues2D()
public DefaultKeyedValues2D(boolean sortRowKeys)
public int getRowCount()
public int getColumnCount()
public Number getValue(int row, int column)
public Comparable getRowKey(int row)
public int getRowIndex(Comparable key)
public List getRowKeys()
public Comparable getColumnKey(int column)
public int getColumnIndex(Comparable key)
public List getColumnKeys()
public Number getValue(Comparable rowKey, Comparable columnKey)
public void addValue(Number value, Comparable rowKey, Comparable columnKey)
public void setValue(Number value, Comparable rowKey, Comparable columnKey)
public void removeValue(Comparable rowKey, Comparable columnKey)
public void removeRow(int rowIndex)
public void removeRow(Comparable rowKey)
public void removeColumn(int columnIndex)
public void removeColumn(Comparable columnKey)
public void clear()
public boolean equals(Object o)
public int hashCode()
public Object clone() throws CloneNotSupportedException
long serialVersionUID=Optional[-5514169970951994748L]
List rowKeys
List columnKeys
List rows
boolean sortRowKeys
