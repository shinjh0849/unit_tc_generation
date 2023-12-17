public XYPlot()
public XYPlot(XYDataset dataset, ValueAxis domainAxis, ValueAxis rangeAxis, XYItemRenderer renderer)
public String getPlotType()
public PlotOrientation getOrientation()
public void setOrientation(PlotOrientation orientation)
public RectangleInsets getAxisOffset()
public void setAxisOffset(RectangleInsets offset)
public ValueAxis getDomainAxis()
public ValueAxis getDomainAxis(int index)
public void setDomainAxis(ValueAxis axis)
public void setDomainAxis(int index, ValueAxis axis)
public void setDomainAxis(int index, ValueAxis axis, boolean notify)
public void setDomainAxes(ValueAxis[] axes)
public AxisLocation getDomainAxisLocation()
public void setDomainAxisLocation(AxisLocation location)
public void setDomainAxisLocation(AxisLocation location, boolean notify)
public RectangleEdge getDomainAxisEdge()
public int getDomainAxisCount()
public void clearDomainAxes()
public void configureDomainAxes()
public AxisLocation getDomainAxisLocation(int index)
public void setDomainAxisLocation(int index, AxisLocation location)
public void setDomainAxisLocation(int index, AxisLocation location, boolean notify)
public RectangleEdge getDomainAxisEdge(int index)
public ValueAxis getRangeAxis()
public void setRangeAxis(ValueAxis axis)
public AxisLocation getRangeAxisLocation()
public void setRangeAxisLocation(AxisLocation location)
public void setRangeAxisLocation(AxisLocation location, boolean notify)
public RectangleEdge getRangeAxisEdge()
public ValueAxis getRangeAxis(int index)
public void setRangeAxis(int index, ValueAxis axis)
public void setRangeAxis(int index, ValueAxis axis, boolean notify)
public void setRangeAxes(ValueAxis[] axes)
public int getRangeAxisCount()
public void clearRangeAxes()
public void configureRangeAxes()
public AxisLocation getRangeAxisLocation(int index)
public void setRangeAxisLocation(int index, AxisLocation location)
public void setRangeAxisLocation(int index, AxisLocation location, boolean notify)
public RectangleEdge getRangeAxisEdge(int index)
public XYDataset getDataset()
public XYDataset getDataset(int index)
public void setDataset(XYDataset dataset)
public void setDataset(int index, XYDataset dataset)
public int getDatasetCount()
public int indexOf(XYDataset dataset)
public void mapDatasetToDomainAxis(int index, int axisIndex)
public void mapDatasetToDomainAxes(int index, List axisIndices)
public void mapDatasetToRangeAxis(int index, int axisIndex)
public void mapDatasetToRangeAxes(int index, List axisIndices)
private void checkAxisIndices(List indices)
public int getRendererCount()
public XYItemRenderer getRenderer()
public XYItemRenderer getRenderer(int index)
public void setRenderer(XYItemRenderer renderer)
public void setRenderer(int index, XYItemRenderer renderer)
public void setRenderer(int index, XYItemRenderer renderer, boolean notify)
public void setRenderers(XYItemRenderer[] renderers)
public DatasetRenderingOrder getDatasetRenderingOrder()
public void setDatasetRenderingOrder(DatasetRenderingOrder order)
public SeriesRenderingOrder getSeriesRenderingOrder()
public void setSeriesRenderingOrder(SeriesRenderingOrder order)
public int getIndexOf(XYItemRenderer renderer)
public XYItemRenderer getRendererForDataset(XYDataset dataset)
public int getWeight()
public void setWeight(int weight)
public boolean isDomainGridlinesVisible()
public void setDomainGridlinesVisible(boolean visible)
public boolean isDomainMinorGridlinesVisible()
public void setDomainMinorGridlinesVisible(boolean visible)
public Stroke getDomainGridlineStroke()
public void setDomainGridlineStroke(Stroke stroke)
public Stroke getDomainMinorGridlineStroke()
public void setDomainMinorGridlineStroke(Stroke stroke)
public Paint getDomainGridlinePaint()
public void setDomainGridlinePaint(Paint paint)
public Paint getDomainMinorGridlinePaint()
public void setDomainMinorGridlinePaint(Paint paint)
public boolean isRangeGridlinesVisible()
public void setRangeGridlinesVisible(boolean visible)
public Stroke getRangeGridlineStroke()
public void setRangeGridlineStroke(Stroke stroke)
public Paint getRangeGridlinePaint()
public void setRangeGridlinePaint(Paint paint)
public boolean isRangeMinorGridlinesVisible()
public void setRangeMinorGridlinesVisible(boolean visible)
public Stroke getRangeMinorGridlineStroke()
public void setRangeMinorGridlineStroke(Stroke stroke)
public Paint getRangeMinorGridlinePaint()
public void setRangeMinorGridlinePaint(Paint paint)
public boolean isDomainZeroBaselineVisible()
public void setDomainZeroBaselineVisible(boolean visible)
public Stroke getDomainZeroBaselineStroke()
public void setDomainZeroBaselineStroke(Stroke stroke)
public Paint getDomainZeroBaselinePaint()
public void setDomainZeroBaselinePaint(Paint paint)
public boolean isRangeZeroBaselineVisible()
public void setRangeZeroBaselineVisible(boolean visible)
public Stroke getRangeZeroBaselineStroke()
public void setRangeZeroBaselineStroke(Stroke stroke)
public Paint getRangeZeroBaselinePaint()
public void setRangeZeroBaselinePaint(Paint paint)
public Paint getDomainTickBandPaint()
public void setDomainTickBandPaint(Paint paint)
public Paint getRangeTickBandPaint()
public void setRangeTickBandPaint(Paint paint)
public Point2D getQuadrantOrigin()
public void setQuadrantOrigin(Point2D origin)
public Paint getQuadrantPaint(int index)
public void setQuadrantPaint(int index, Paint paint)
public void addDomainMarker(Marker marker)
public void addDomainMarker(Marker marker, Layer layer)
public void clearDomainMarkers()
public void clearDomainMarkers(int index)
public void addDomainMarker(int index, Marker marker, Layer layer)
public void addDomainMarker(int index, Marker marker, Layer layer, boolean notify)
public boolean removeDomainMarker(Marker marker)
public boolean removeDomainMarker(Marker marker, Layer layer)
public boolean removeDomainMarker(int index, Marker marker, Layer layer)
public boolean removeDomainMarker(int index, Marker marker, Layer layer, boolean notify)
public void addRangeMarker(Marker marker)
public void addRangeMarker(Marker marker, Layer layer)
public void clearRangeMarkers()
public void addRangeMarker(int index, Marker marker, Layer layer)
public void addRangeMarker(int index, Marker marker, Layer layer, boolean notify)
public void clearRangeMarkers(int index)
public boolean removeRangeMarker(Marker marker)
public boolean removeRangeMarker(Marker marker, Layer layer)
public boolean removeRangeMarker(int index, Marker marker, Layer layer)
public boolean removeRangeMarker(int index, Marker marker, Layer layer, boolean notify)
public void addAnnotation(XYAnnotation annotation)
public void addAnnotation(XYAnnotation annotation, boolean notify)
public boolean removeAnnotation(XYAnnotation annotation)
public boolean removeAnnotation(XYAnnotation annotation, boolean notify)
public List getAnnotations()
public void clearAnnotations()
public ShadowGenerator getShadowGenerator()
public void setShadowGenerator(ShadowGenerator generator)
protected AxisSpace calculateAxisSpace(Graphics2D g2, Rectangle2D plotArea)
protected AxisSpace calculateDomainAxisSpace(Graphics2D g2, Rectangle2D plotArea, AxisSpace space)
protected AxisSpace calculateRangeAxisSpace(Graphics2D g2, Rectangle2D plotArea, AxisSpace space)
private Rectangle integerise(Rectangle2D rect)
public void draw(Graphics2D g2, Rectangle2D area, Point2D anchor, PlotState parentState, PlotRenderingInfo info)
public void drawBackground(Graphics2D g2, Rectangle2D area)
protected void drawQuadrants(Graphics2D g2, Rectangle2D area)
public void drawDomainTickBands(Graphics2D g2, Rectangle2D dataArea, List ticks)
public void drawRangeTickBands(Graphics2D g2, Rectangle2D dataArea, List ticks)
protected Map drawAxes(Graphics2D g2, Rectangle2D plotArea, Rectangle2D dataArea, PlotRenderingInfo plotState)
public boolean render(Graphics2D g2, Rectangle2D dataArea, int index, PlotRenderingInfo info, CrosshairState crosshairState)
public ValueAxis getDomainAxisForDataset(int index)
public ValueAxis getRangeAxisForDataset(int index)
protected void drawDomainGridlines(Graphics2D g2, Rectangle2D dataArea, List ticks)
protected void drawRangeGridlines(Graphics2D g2, Rectangle2D area, List ticks)
protected void drawZeroDomainBaseline(Graphics2D g2, Rectangle2D area)
protected void drawZeroRangeBaseline(Graphics2D g2, Rectangle2D area)
public void drawAnnotations(Graphics2D g2, Rectangle2D dataArea, PlotRenderingInfo info)
protected void drawDomainMarkers(Graphics2D g2, Rectangle2D dataArea, int index, Layer layer)
protected void drawRangeMarkers(Graphics2D g2, Rectangle2D dataArea, int index, Layer layer)
public Collection getDomainMarkers(Layer layer)
public Collection getRangeMarkers(Layer layer)
public Collection getDomainMarkers(int index, Layer layer)
public Collection getRangeMarkers(int index, Layer layer)
protected void drawHorizontalLine(Graphics2D g2, Rectangle2D dataArea, double value, Stroke stroke, Paint paint)
protected void drawDomainCrosshair(Graphics2D g2, Rectangle2D dataArea, PlotOrientation orientation, double value, ValueAxis axis, Stroke stroke, Paint paint)
protected void drawVerticalLine(Graphics2D g2, Rectangle2D dataArea, double value, Stroke stroke, Paint paint)
protected void drawRangeCrosshair(Graphics2D g2, Rectangle2D dataArea, PlotOrientation orientation, double value, ValueAxis axis, Stroke stroke, Paint paint)
public void handleClick(int x, int y, PlotRenderingInfo info)
private List getDatasetsMappedToDomainAxis(Integer axisIndex)
private List getDatasetsMappedToRangeAxis(Integer axisIndex)
public int getDomainAxisIndex(ValueAxis axis)
public int getRangeAxisIndex(ValueAxis axis)
public Range getDataRange(ValueAxis axis)
public void annotationChanged(AnnotationChangeEvent event)
public void datasetChanged(DatasetChangeEvent event)
public void rendererChanged(RendererChangeEvent event)
public boolean isDomainCrosshairVisible()
public void setDomainCrosshairVisible(boolean flag)
public boolean isDomainCrosshairLockedOnData()
public void setDomainCrosshairLockedOnData(boolean flag)
public double getDomainCrosshairValue()
public void setDomainCrosshairValue(double value)
public void setDomainCrosshairValue(double value, boolean notify)
public Stroke getDomainCrosshairStroke()
public void setDomainCrosshairStroke(Stroke stroke)
public Paint getDomainCrosshairPaint()
public void setDomainCrosshairPaint(Paint paint)
public boolean isRangeCrosshairVisible()
public void setRangeCrosshairVisible(boolean flag)
public boolean isRangeCrosshairLockedOnData()
public void setRangeCrosshairLockedOnData(boolean flag)
public double getRangeCrosshairValue()
public void setRangeCrosshairValue(double value)
public void setRangeCrosshairValue(double value, boolean notify)
public Stroke getRangeCrosshairStroke()
public void setRangeCrosshairStroke(Stroke stroke)
public Paint getRangeCrosshairPaint()
public void setRangeCrosshairPaint(Paint paint)
public AxisSpace getFixedDomainAxisSpace()
public void setFixedDomainAxisSpace(AxisSpace space)
public void setFixedDomainAxisSpace(AxisSpace space, boolean notify)
public AxisSpace getFixedRangeAxisSpace()
public void setFixedRangeAxisSpace(AxisSpace space)
public void setFixedRangeAxisSpace(AxisSpace space, boolean notify)
public boolean isDomainPannable()
public void setDomainPannable(boolean pannable)
public boolean isRangePannable()
public void setRangePannable(boolean pannable)
public void panDomainAxes(double percent, PlotRenderingInfo info, Point2D source)
public void panRangeAxes(double percent, PlotRenderingInfo info, Point2D source)
public void zoomDomainAxes(double factor, PlotRenderingInfo info, Point2D source)
public void zoomDomainAxes(double factor, PlotRenderingInfo info, Point2D source, boolean useAnchor)
public void zoomDomainAxes(double lowerPercent, double upperPercent, PlotRenderingInfo info, Point2D source)
public void zoomRangeAxes(double factor, PlotRenderingInfo info, Point2D source)
public void zoomRangeAxes(double factor, PlotRenderingInfo info, Point2D source, boolean useAnchor)
public void zoomRangeAxes(double lowerPercent, double upperPercent, PlotRenderingInfo info, Point2D source)
public boolean isDomainZoomable()
public boolean isRangeZoomable()
public int getSeriesCount()
public LegendItemCollection getFixedLegendItems()
public void setFixedLegendItems(LegendItemCollection items)
public LegendItemCollection getLegendItems()
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
public boolean canSelectByPoint()
public boolean canSelectByRegion()
public void select(double xx, double yy, Rectangle2D dataArea, RenderingSource source)
public void select(GeneralPath region, Rectangle2D dataArea, RenderingSource source)
private XYDatasetSelectionState findSelectionStateForDataset(XYDataset dataset, Object source)
private GeneralPath convertToDataSpace(GeneralPath path, Rectangle2D dataArea, XYDataset dataset)
public void clearSelection()
long serialVersionUID=Optional[7044148245716569264L]
Stroke DEFAULT_GRIDLINE_STROKE=Optional[new BasicStroke(0.5f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0.0f, new float[] { 2.0f, 2.0f }, 0.0f)]
Paint DEFAULT_GRIDLINE_PAINT=Optional[Color.WHITE]
boolean DEFAULT_CROSSHAIR_VISIBLE=Optional[false]
Stroke DEFAULT_CROSSHAIR_STROKE=Optional[DEFAULT_GRIDLINE_STROKE]
Paint DEFAULT_CROSSHAIR_PAINT=Optional[Color.blue]
ResourceBundle localizationResources=Optional[ResourceBundleWrapper.getBundle("org.jfree.chart.plot.LocalizationBundle")]
PlotOrientation orientation
RectangleInsets axisOffset
ObjectList domainAxes
ObjectList domainAxisLocations
ObjectList rangeAxes
ObjectList rangeAxisLocations
ObjectList datasets
ObjectList renderers
Map datasetToDomainAxesMap
Map datasetToRangeAxesMap
Point2D quadrantOrigin=Optional[new Point2D.Double(0.0, 0.0)]
Paint[] quadrantPaint=Optional[new Paint[] { null, null, null, null }]
boolean domainGridlinesVisible
Stroke domainGridlineStroke
Paint domainGridlinePaint
boolean rangeGridlinesVisible
Stroke rangeGridlineStroke
Paint rangeGridlinePaint
boolean domainMinorGridlinesVisible
Stroke domainMinorGridlineStroke
Paint domainMinorGridlinePaint
boolean rangeMinorGridlinesVisible
Stroke rangeMinorGridlineStroke
Paint rangeMinorGridlinePaint
boolean domainZeroBaselineVisible
Stroke domainZeroBaselineStroke
Paint domainZeroBaselinePaint
boolean rangeZeroBaselineVisible
Stroke rangeZeroBaselineStroke
Paint rangeZeroBaselinePaint
boolean domainCrosshairVisible
double domainCrosshairValue
Stroke domainCrosshairStroke
Paint domainCrosshairPaint
boolean domainCrosshairLockedOnData=Optional[true]
boolean rangeCrosshairVisible
double rangeCrosshairValue
Stroke rangeCrosshairStroke
Paint rangeCrosshairPaint
boolean rangeCrosshairLockedOnData=Optional[true]
Map foregroundDomainMarkers
Map backgroundDomainMarkers
Map foregroundRangeMarkers
Map backgroundRangeMarkers
List annotations
Paint domainTickBandPaint
Paint rangeTickBandPaint
AxisSpace fixedDomainAxisSpace
AxisSpace fixedRangeAxisSpace
DatasetRenderingOrder datasetRenderingOrder=Optional[DatasetRenderingOrder.REVERSE]
SeriesRenderingOrder seriesRenderingOrder=Optional[SeriesRenderingOrder.REVERSE]
int weight
LegendItemCollection fixedLegendItems
boolean domainPannable
boolean rangePannable
ShadowGenerator shadowGenerator
