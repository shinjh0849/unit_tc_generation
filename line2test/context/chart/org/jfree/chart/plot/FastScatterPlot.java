public FastScatterPlot()
public FastScatterPlot(float[][] data, ValueAxis domainAxis, ValueAxis rangeAxis)
public String getPlotType()
public float[][] getData()
public void setData(float[][] data)
public PlotOrientation getOrientation()
public ValueAxis getDomainAxis()
public void setDomainAxis(ValueAxis axis)
public ValueAxis getRangeAxis()
public void setRangeAxis(ValueAxis axis)
public Paint getPaint()
public void setPaint(Paint paint)
public boolean isDomainGridlinesVisible()
public void setDomainGridlinesVisible(boolean visible)
public Stroke getDomainGridlineStroke()
public void setDomainGridlineStroke(Stroke stroke)
public Paint getDomainGridlinePaint()
public void setDomainGridlinePaint(Paint paint)
public boolean isRangeGridlinesVisible()
public void setRangeGridlinesVisible(boolean visible)
public Stroke getRangeGridlineStroke()
public void setRangeGridlineStroke(Stroke stroke)
public Paint getRangeGridlinePaint()
public void setRangeGridlinePaint(Paint paint)
public void draw(Graphics2D g2, Rectangle2D area, Point2D anchor, PlotState parentState, PlotRenderingInfo info)
public void render(Graphics2D g2, Rectangle2D dataArea, PlotRenderingInfo info, CrosshairState crosshairState)
protected void drawDomainGridlines(Graphics2D g2, Rectangle2D dataArea, List ticks)
protected void drawRangeGridlines(Graphics2D g2, Rectangle2D dataArea, List ticks)
public Range getDataRange(ValueAxis axis)
private Range calculateXDataRange(float[][] data)
private Range calculateYDataRange(float[][] data)
public void zoomDomainAxes(double factor, PlotRenderingInfo info, Point2D source)
public void zoomDomainAxes(double factor, PlotRenderingInfo info, Point2D source, boolean useAnchor)
public void zoomDomainAxes(double lowerPercent, double upperPercent, PlotRenderingInfo info, Point2D source)
public void zoomRangeAxes(double factor, PlotRenderingInfo info, Point2D source)
public void zoomRangeAxes(double factor, PlotRenderingInfo info, Point2D source, boolean useAnchor)
public void zoomRangeAxes(double lowerPercent, double upperPercent, PlotRenderingInfo info, Point2D source)
public boolean isDomainZoomable()
public boolean isRangeZoomable()
public boolean isDomainPannable()
public void setDomainPannable(boolean pannable)
public boolean isRangePannable()
public void setRangePannable(boolean pannable)
public void panDomainAxes(double percent, PlotRenderingInfo info, Point2D source)
public void panRangeAxes(double percent, PlotRenderingInfo info, Point2D source)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[7871545897358563521L]
Stroke DEFAULT_GRIDLINE_STROKE=Optional[new BasicStroke(0.5f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0.0f, new float[] { 2.0f, 2.0f }, 0.0f)]
Paint DEFAULT_GRIDLINE_PAINT=Optional[Color.lightGray]
float[][] data
Range xDataRange
Range yDataRange
ValueAxis domainAxis
ValueAxis rangeAxis
Paint paint
boolean domainGridlinesVisible
Stroke domainGridlineStroke
Paint domainGridlinePaint
boolean rangeGridlinesVisible
Stroke rangeGridlineStroke
Paint rangeGridlinePaint
boolean domainPannable
boolean rangePannable
ResourceBundle localizationResources=Optional[ResourceBundleWrapper.getBundle("org.jfree.chart.plot.LocalizationBundle")]
