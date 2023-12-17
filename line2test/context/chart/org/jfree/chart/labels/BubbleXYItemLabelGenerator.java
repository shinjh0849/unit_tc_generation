public BubbleXYItemLabelGenerator()
public BubbleXYItemLabelGenerator(String formatString, NumberFormat xFormat, NumberFormat yFormat, NumberFormat zFormat)
public BubbleXYItemLabelGenerator(String formatString, DateFormat xFormat, DateFormat yFormat, DateFormat zFormat)
public NumberFormat getZFormat()
public DateFormat getZDateFormat()
public String generateLabel(XYDataset dataset, int series, int item)
public String generateLabelString(XYDataset dataset, int series, int item)
protected Object[] createItemArray(XYZDataset dataset, int series, int item)
public boolean equals(Object obj)
public int hashCode()
long serialVersionUID=Optional[-8458568928021240922L]
String DEFAULT_FORMAT_STRING=Optional["{3}"]
NumberFormat zFormat
DateFormat zDateFormat
