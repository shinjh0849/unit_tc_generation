public StackedXYAreaRendererState(PlotRenderingInfo info)
public StackedXYAreaRenderer()
public StackedXYAreaRenderer(int type)
public StackedXYAreaRenderer(int type, XYToolTipGenerator labelGenerator, XYURLGenerator urlGenerator)
public Polygon getSeriesArea()
public void setSeriesArea(Polygon area)
public Line2D getLine()
public Stack getCurrentSeriesPoints()
public void setCurrentSeriesPoints(Stack points)
public Stack getLastSeriesPoints()
public void setLastSeriesPoints(Stack points)
public Paint getShapePaint()
public void setShapePaint(Paint shapePaint)
public Stroke getShapeStroke()
public void setShapeStroke(Stroke shapeStroke)
public XYItemRendererState initialise(Graphics2D g2, Rectangle2D dataArea, XYPlot plot, XYDataset data, PlotRenderingInfo info)
public int getPassCount()
public Range findRangeBounds(XYDataset dataset)
public void drawItem(Graphics2D g2, XYItemRendererState state, Rectangle2D dataArea, XYPlot plot, ValueAxis domainAxis, ValueAxis rangeAxis, XYDataset dataset, int series, int item, boolean selected, int pass)
protected double getPreviousHeight(TableXYDataset dataset, int series, int index)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
private void writeObject(ObjectOutputStream stream) throws IOException
long serialVersionUID=Optional[5217394318178570889L]
Paint shapePaint=Optional[null]
Stroke shapeStroke=Optional[null]
