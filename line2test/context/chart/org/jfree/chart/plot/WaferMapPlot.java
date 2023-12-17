public WaferMapPlot()
public WaferMapPlot(WaferMapDataset dataset)
public WaferMapPlot(WaferMapDataset dataset, WaferMapRenderer renderer)
public String getPlotType()
public WaferMapDataset getDataset()
public void setDataset(WaferMapDataset dataset)
public void setRenderer(WaferMapRenderer renderer)
public void draw(Graphics2D g2, Rectangle2D area, Point2D anchor, PlotState state, PlotRenderingInfo info)
protected void drawChipGrid(Graphics2D g2, Rectangle2D plotArea)
protected Ellipse2D getWaferEdge(Rectangle2D plotArea)
protected void drawWaferEdge(Graphics2D g2, Rectangle2D plotArea)
public LegendItemCollection getLegendItems()
public void rendererChanged(RendererChangeEvent event)
long serialVersionUID=Optional[4668320403707308155L]
Stroke DEFAULT_GRIDLINE_STROKE=Optional[new BasicStroke(0.5f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0.0f, new float[] { 2.0f, 2.0f }, 0.0f)]
Paint DEFAULT_GRIDLINE_PAINT=Optional[Color.lightGray]
boolean DEFAULT_CROSSHAIR_VISIBLE=Optional[false]
Stroke DEFAULT_CROSSHAIR_STROKE=Optional[DEFAULT_GRIDLINE_STROKE]
Paint DEFAULT_CROSSHAIR_PAINT=Optional[Color.blue]
ResourceBundle localizationResources=Optional[ResourceBundleWrapper.getBundle("org.jfree.chart.plot.LocalizationBundle")]
PlotOrientation orientation
WaferMapDataset dataset
WaferMapRenderer renderer
