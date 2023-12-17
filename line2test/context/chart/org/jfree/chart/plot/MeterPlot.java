public MeterPlot()
public MeterPlot(ValueDataset dataset)
public DialShape getDialShape()
public void setDialShape(DialShape shape)
public int getMeterAngle()
public void setMeterAngle(int angle)
public Range getRange()
public void setRange(Range range)
public double getTickSize()
public void setTickSize(double size)
public Paint getTickPaint()
public void setTickPaint(Paint paint)
public String getUnits()
public void setUnits(String units)
public Paint getNeedlePaint()
public void setNeedlePaint(Paint paint)
public boolean getTickLabelsVisible()
public void setTickLabelsVisible(boolean visible)
public Font getTickLabelFont()
public void setTickLabelFont(Font font)
public Paint getTickLabelPaint()
public void setTickLabelPaint(Paint paint)
public NumberFormat getTickLabelFormat()
public void setTickLabelFormat(NumberFormat format)
public Font getValueFont()
public void setValueFont(Font font)
public Paint getValuePaint()
public void setValuePaint(Paint paint)
public Paint getDialBackgroundPaint()
public void setDialBackgroundPaint(Paint paint)
public boolean getDrawBorder()
public void setDrawBorder(boolean draw)
public Paint getDialOutlinePaint()
public void setDialOutlinePaint(Paint paint)
public ValueDataset getDataset()
public void setDataset(ValueDataset dataset)
public List getIntervals()
public void addInterval(MeterInterval interval)
public void clearIntervals()
public LegendItemCollection getLegendItems()
public void draw(Graphics2D g2, Rectangle2D area, Point2D anchor, PlotState parentState, PlotRenderingInfo info)
protected void drawArcForInterval(Graphics2D g2, Rectangle2D meterArea, MeterInterval interval)
protected void drawArc(Graphics2D g2, Rectangle2D area, double minValue, double maxValue, Paint paint, Stroke stroke)
protected void fillArc(Graphics2D g2, Rectangle2D area, double minValue, double maxValue, Paint paint, boolean dial)
public double valueToAngle(double value)
protected void drawTicks(Graphics2D g2, Rectangle2D meterArea, double minValue, double maxValue)
protected void drawTick(Graphics2D g2, Rectangle2D meterArea, double value)
protected void drawTick(Graphics2D g2, Rectangle2D meterArea, double value, boolean label)
protected void drawValueLabel(Graphics2D g2, Rectangle2D area)
public String getPlotType()
public void zoom(double percent)
public boolean equals(Object obj)
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
public Object clone() throws CloneNotSupportedException
long serialVersionUID=Optional[2987472457734470962L]
Paint DEFAULT_DIAL_BACKGROUND_PAINT=Optional[Color.black]
Paint DEFAULT_NEEDLE_PAINT=Optional[Color.green]
Font DEFAULT_VALUE_FONT=Optional[new Font("Tahoma", Font.BOLD, 12)]
Paint DEFAULT_VALUE_PAINT=Optional[Color.yellow]
int DEFAULT_METER_ANGLE=Optional[270]
float DEFAULT_BORDER_SIZE=Optional[3f]
float DEFAULT_CIRCLE_SIZE=Optional[10f]
Font DEFAULT_LABEL_FONT=Optional[new Font("Tahoma", Font.BOLD, 10)]
ValueDataset dataset
DialShape shape
int meterAngle
Range range
double tickSize
Paint tickPaint
String units
Font valueFont
Paint valuePaint
boolean drawBorder
Paint dialOutlinePaint
Paint dialBackgroundPaint
Paint needlePaint
boolean tickLabelsVisible
Font tickLabelFont
Paint tickLabelPaint
NumberFormat tickLabelFormat
ResourceBundle localizationResources=Optional[ResourceBundleWrapper.getBundle("org.jfree.chart.plot.LocalizationBundle")]
List intervals
