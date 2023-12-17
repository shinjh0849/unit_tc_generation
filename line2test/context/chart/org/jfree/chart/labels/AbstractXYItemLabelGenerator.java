protected AbstractXYItemLabelGenerator()
protected AbstractXYItemLabelGenerator(String formatString, NumberFormat xFormat, NumberFormat yFormat)
protected AbstractXYItemLabelGenerator(String formatString, DateFormat xFormat, NumberFormat yFormat)
protected AbstractXYItemLabelGenerator(String formatString, NumberFormat xFormat, DateFormat yFormat)
protected AbstractXYItemLabelGenerator(String formatString, DateFormat xFormat, DateFormat yFormat)
public String getFormatString()
public NumberFormat getXFormat()
public DateFormat getXDateFormat()
public NumberFormat getYFormat()
public DateFormat getYDateFormat()
public String generateLabelString(XYDataset dataset, int series, int item)
public String getNullYString()
protected Object[] createItemArray(XYDataset dataset, int series, int item)
public boolean equals(Object obj)
public int hashCode()
public Object clone() throws CloneNotSupportedException
long serialVersionUID=Optional[5869744396278660636L]
String formatString
NumberFormat xFormat
DateFormat xDateFormat
NumberFormat yFormat
DateFormat yDateFormat
String nullYString=Optional["null"]
