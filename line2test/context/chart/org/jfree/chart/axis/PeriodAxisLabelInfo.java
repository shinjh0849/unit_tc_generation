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
long serialVersionUID=Optional[5710451740920277357L]
RectangleInsets DEFAULT_INSETS=Optional[new RectangleInsets(2, 2, 2, 2)]
Font DEFAULT_FONT=Optional[new Font("Tahoma", Font.PLAIN, 10)]
Paint DEFAULT_LABEL_PAINT=Optional[Color.black]
Stroke DEFAULT_DIVIDER_STROKE=Optional[new BasicStroke(0.5f)]
Paint DEFAULT_DIVIDER_PAINT=Optional[Color.gray]
Class periodClass
RectangleInsets padding
DateFormat dateFormat
Font labelFont
Paint labelPaint
boolean drawDividers
Stroke dividerStroke
Paint dividerPaint
