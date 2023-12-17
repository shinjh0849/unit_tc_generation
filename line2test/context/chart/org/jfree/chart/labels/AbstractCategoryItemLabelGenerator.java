protected AbstractCategoryItemLabelGenerator(String labelFormat, NumberFormat formatter)
protected AbstractCategoryItemLabelGenerator(String labelFormat, NumberFormat formatter, NumberFormat percentFormatter)
protected AbstractCategoryItemLabelGenerator(String labelFormat, DateFormat formatter)
public String generateRowLabel(CategoryDataset dataset, int row)
public String generateColumnLabel(CategoryDataset dataset, int column)
public String getLabelFormat()
public NumberFormat getNumberFormat()
public DateFormat getDateFormat()
protected String generateLabelString(CategoryDataset dataset, int row, int column)
protected Object[] createItemArray(CategoryDataset dataset, int row, int column)
public boolean equals(Object obj)
public int hashCode()
public Object clone() throws CloneNotSupportedException
long serialVersionUID=Optional[-7108591260223293197L]
String labelFormat
String nullValueString
NumberFormat numberFormat
DateFormat dateFormat
NumberFormat percentFormat
