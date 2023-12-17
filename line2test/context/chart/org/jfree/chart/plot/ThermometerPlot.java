public ThermometerPlot()
public ThermometerPlot(ValueDataset dataset)
public ValueDataset getDataset()
public void setDataset(ValueDataset dataset)
public ValueAxis getRangeAxis()
public void setRangeAxis(ValueAxis axis)
public double getLowerBound()
public void setLowerBound(double lower)
public double getUpperBound()
public void setUpperBound(double upper)
public void setRange(double lower, double upper)
public RectangleInsets getPadding()
public void setPadding(RectangleInsets padding)
public Stroke getThermometerStroke()
public void setThermometerStroke(Stroke s)
public Paint getThermometerPaint()
public void setThermometerPaint(Paint paint)
public int getUnits()
public void setUnits(int u)
public int getValueLocation()
public void setValueLocation(int location)
public int getAxisLocation()
public void setAxisLocation(int location)
public Font getValueFont()
public void setValueFont(Font f)
public Paint getValuePaint()
public void setValuePaint(Paint paint)
public void setValueFormat(NumberFormat formatter)
public Paint getMercuryPaint()
public void setMercuryPaint(Paint paint)
public void setSubrangeInfo(int range, double low, double hi)
public void setSubrangeInfo(int range, double rangeLow, double rangeHigh, double displayLow, double displayHigh)
public void setSubrange(int range, double low, double high)
public void setDisplayRange(int range, double low, double high)
public Paint getSubrangePaint(int range)
public void setSubrangePaint(int range, Paint paint)
public boolean getFollowDataInSubranges()
public void setFollowDataInSubranges(boolean flag)
public boolean getUseSubrangePaint()
public void setUseSubrangePaint(boolean flag)
public int getBulbRadius()
public void setBulbRadius(int r)
public int getBulbDiameter()
public int getColumnRadius()
public void setColumnRadius(int r)
public int getColumnDiameter()
public int getGap()
public void setGap(int gap)
public void draw(Graphics2D g2, Rectangle2D area, Point2D anchor, PlotState parentState, PlotRenderingInfo info)
public void zoom(double percent)
public String getPlotType()
public void datasetChanged(DatasetChangeEvent event)
public Range getDataRange(ValueAxis axis)
protected void setAxisRange()
public LegendItemCollection getLegendItems()
public PlotOrientation getOrientation()
protected static boolean isValidNumber(double d)
private boolean inSubrange(int subrange, double value)
private Paint getCurrentPaint()
public boolean equals(Object obj)
private static boolean equal(double[][] array1, double[][] array2)
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
public void zoomDomainAxes(double factor, PlotRenderingInfo state, Point2D source)
public void zoomDomainAxes(double factor, PlotRenderingInfo state, Point2D source, boolean useAnchor)
public void zoomRangeAxes(double factor, PlotRenderingInfo state, Point2D source)
public void zoomRangeAxes(double factor, PlotRenderingInfo state, Point2D source, boolean useAnchor)
public void zoomDomainAxes(double lowerPercent, double upperPercent, PlotRenderingInfo state, Point2D source)
public void zoomRangeAxes(double lowerPercent, double upperPercent, PlotRenderingInfo state, Point2D source)
public boolean isDomainZoomable()
public boolean isRangeZoomable()
long serialVersionUID=Optional[4087093313147984390L]
int UNITS_NONE=Optional[0]
int UNITS_FAHRENHEIT=Optional[1]
int UNITS_CELCIUS=Optional[2]
int UNITS_KELVIN=Optional[3]
int NONE=Optional[0]
int RIGHT=Optional[1]
int LEFT=Optional[2]
int BULB=Optional[3]
int NORMAL=Optional[0]
int WARNING=Optional[1]
int CRITICAL=Optional[2]
int BULB_RADIUS=Optional[40]
int BULB_DIAMETER=Optional[BULB_RADIUS * 2]
int COLUMN_RADIUS=Optional[20]
int COLUMN_DIAMETER=Optional[COLUMN_RADIUS * 2]
int GAP_RADIUS=Optional[5]
int GAP_DIAMETER=Optional[GAP_RADIUS * 2]
int AXIS_GAP=Optional[10]
String[] UNITS=Optional[{ "", "\u00B0F", "\u00B0C", "\u00B0K" }]
int RANGE_LOW=Optional[0]
int RANGE_HIGH=Optional[1]
int DISPLAY_LOW=Optional[2]
int DISPLAY_HIGH=Optional[3]
double DEFAULT_LOWER_BOUND=Optional[0.0]
double DEFAULT_UPPER_BOUND=Optional[100.0]
int DEFAULT_BULB_RADIUS=Optional[40]
int DEFAULT_COLUMN_RADIUS=Optional[20]
int DEFAULT_GAP=Optional[5]
ValueDataset dataset
ValueAxis rangeAxis
double lowerBound=Optional[DEFAULT_LOWER_BOUND]
double upperBound=Optional[DEFAULT_UPPER_BOUND]
int bulbRadius=Optional[DEFAULT_BULB_RADIUS]
int columnRadius=Optional[DEFAULT_COLUMN_RADIUS]
int gap=Optional[DEFAULT_GAP]
RectangleInsets padding
Stroke thermometerStroke=Optional[new BasicStroke(1.0f)]
Paint thermometerPaint=Optional[Color.black]
int units=Optional[UNITS_CELCIUS]
int valueLocation=Optional[BULB]
int axisLocation=Optional[LEFT]
Font valueFont=Optional[new Font("Tahoma", Font.BOLD, 16)]
Paint valuePaint=Optional[Color.white]
NumberFormat valueFormat=Optional[new DecimalFormat()]
Paint mercuryPaint=Optional[Color.lightGray]
int subrange=Optional[-1]
double[][] subrangeInfo=Optional[{ { 0.0, 50.0, 0.0, 50.0 }, { 50.0, 75.0, 50.0, 75.0 }, { 75.0, 100.0, 75.0, 100.0 } }]
boolean followDataInSubranges=Optional[false]
boolean useSubrangePaint=Optional[true]
Paint[] subrangePaint=Optional[{ Color.green, Color.orange, Color.red }]
boolean subrangeIndicatorsVisible=Optional[true]
Stroke subrangeIndicatorStroke=Optional[new BasicStroke(2.0f)]
Stroke rangeIndicatorStroke=Optional[new BasicStroke(3.0f)]
ResourceBundle localizationResources=Optional[ResourceBundleWrapper.getBundle("org.jfree.chart.plot.LocalizationBundle")]
