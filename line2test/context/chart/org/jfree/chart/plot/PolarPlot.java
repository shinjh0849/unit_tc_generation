public PolarPlot()
public PolarPlot(XYDataset dataset, ValueAxis radiusAxis, PolarItemRenderer renderer)
public void addCornerTextItem(String text)
public void removeCornerTextItem(String text)
public void clearCornerTextItems()
public String getPlotType()
public ValueAxis getAxis()
public void setAxis(ValueAxis axis)
public XYDataset getDataset()
public void setDataset(XYDataset dataset)
public PolarItemRenderer getRenderer()
public void setRenderer(PolarItemRenderer renderer)
public TickUnit getAngleTickUnit()
public void setAngleTickUnit(TickUnit unit)
public boolean isAngleLabelsVisible()
public void setAngleLabelsVisible(boolean visible)
public Font getAngleLabelFont()
public void setAngleLabelFont(Font font)
public Paint getAngleLabelPaint()
public void setAngleLabelPaint(Paint paint)
public boolean isAngleGridlinesVisible()
public void setAngleGridlinesVisible(boolean visible)
public Stroke getAngleGridlineStroke()
public void setAngleGridlineStroke(Stroke stroke)
public Paint getAngleGridlinePaint()
public void setAngleGridlinePaint(Paint paint)
public boolean isRadiusGridlinesVisible()
public void setRadiusGridlinesVisible(boolean visible)
public Stroke getRadiusGridlineStroke()
public void setRadiusGridlineStroke(Stroke stroke)
public Paint getRadiusGridlinePaint()
public void setRadiusGridlinePaint(Paint paint)
protected List refreshAngleTicks()
public void draw(Graphics2D g2, Rectangle2D area, Point2D anchor, PlotState parentState, PlotRenderingInfo info)
protected void drawCornerTextItems(Graphics2D g2, Rectangle2D area)
protected AxisState drawAxis(Graphics2D g2, Rectangle2D plotArea, Rectangle2D dataArea)
protected void render(Graphics2D g2, Rectangle2D dataArea, PlotRenderingInfo info)
protected void drawGridlines(Graphics2D g2, Rectangle2D dataArea, List angularTicks, List radialTicks)
public void zoom(double percent)
public Range getDataRange(ValueAxis axis)
public void datasetChanged(DatasetChangeEvent event)
public void rendererChanged(RendererChangeEvent event)
public int getSeriesCount()
public LegendItemCollection getLegendItems()
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
public void zoomDomainAxes(double factor, PlotRenderingInfo state, Point2D source)
public void zoomDomainAxes(double factor, PlotRenderingInfo state, Point2D source, boolean useAnchor)
public void zoomDomainAxes(double lowerPercent, double upperPercent, PlotRenderingInfo state, Point2D source)
public void zoomRangeAxes(double factor, PlotRenderingInfo state, Point2D source)
public void zoomRangeAxes(double factor, PlotRenderingInfo info, Point2D source, boolean useAnchor)
public void zoomRangeAxes(double lowerPercent, double upperPercent, PlotRenderingInfo state, Point2D source)
public boolean isDomainZoomable()
public boolean isRangeZoomable()
public PlotOrientation getOrientation()
public double getMaxRadius()
public Point translateValueThetaRadiusToJava2D(double angleDegrees, double radius, Rectangle2D dataArea)
long serialVersionUID=Optional[3794383185924179525L]
int MARGIN=Optional[20]
double ANNOTATION_MARGIN=Optional[7.0]
double DEFAULT_ANGLE_TICK_UNIT_SIZE=Optional[45.0]
Stroke DEFAULT_GRIDLINE_STROKE=Optional[new BasicStroke(0.5f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0.0f, new float[] { 2.0f, 2.0f }, 0.0f)]
Paint DEFAULT_GRIDLINE_PAINT=Optional[Color.gray]
ResourceBundle localizationResources=Optional[ResourceBundleWrapper.getBundle("org.jfree.chart.plot.LocalizationBundle")]
List angleTicks
ValueAxis axis
XYDataset dataset
PolarItemRenderer renderer
TickUnit angleTickUnit
boolean angleLabelsVisible=Optional[true]
Font angleLabelFont=Optional[new Font("Tahoma", Font.PLAIN, 12)]
Paint angleLabelPaint=Optional[Color.black]
boolean angleGridlinesVisible
Stroke angleGridlineStroke
Paint angleGridlinePaint
boolean radiusGridlinesVisible
Stroke radiusGridlineStroke
Paint radiusGridlinePaint
List cornerTextItems=Optional[new ArrayList()]
