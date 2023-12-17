public PeriodAxisLabelInfo(Class periodClass, DateFormat dateFormat)
public PeriodAxisLabelInfo(Class periodClass, DateFormat dateFormat, RectangleInsets padding, Font labelFont, Paint labelPaint, boolean drawDividers, Stroke dividerStroke, Paint dividerPaint)
public Class getPeriodClass()
public DateFormat getDateFormat()
public RectangleInsets getPadding()
public Font getLabelFont()
public Paint getLabelPaint()
public boolean getDrawDividers()
public Stroke getDividerStroke()
public Paint getDividerPaint()
public RegularTimePeriod createInstance(Date millisecond, TimeZone zone, Locale locale)
public boolean equals(Object obj)
public int hashCode()
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
