public XYAreaRendererState(PlotRenderingInfo info)
public XYAreaRenderer()
public XYAreaRenderer(int type)
public XYAreaRenderer(int type, XYToolTipGenerator toolTipGenerator, XYURLGenerator urlGenerator)
public boolean getPlotShapes()
public boolean getPlotLines()
public boolean getPlotArea()
public boolean isOutline()
public void setOutline(boolean show)
public Shape getLegendArea()
public void setLegendArea(Shape area)
public boolean getUseFillPaint()
public void setUseFillPaint(boolean use)
public GradientPaintTransformer getGradientTransformer()
public void setGradientTransformer(GradientPaintTransformer transformer)
public XYItemRendererState initialise(Graphics2D g2, Rectangle2D dataArea, XYPlot plot, XYDataset data, PlotRenderingInfo info)
public LegendItem getLegendItem(int datasetIndex, int series)
public void drawItem(Graphics2D g2, XYItemRendererState state, Rectangle2D dataArea, XYPlot plot, ValueAxis domainAxis, ValueAxis rangeAxis, XYDataset dataset, int series, int item, boolean selected, int pass)
public Object clone() throws CloneNotSupportedException
public boolean equals(Object obj)
public int hashCode()
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
private void writeObject(ObjectOutputStream stream) throws IOException
long serialVersionUID=Optional[-4481971353973876747L]
int SHAPES=Optional[1]
int LINES=Optional[2]
int SHAPES_AND_LINES=Optional[3]
int AREA=Optional[4]
int AREA_AND_SHAPES=Optional[5]
boolean plotShapes
boolean plotLines
boolean plotArea
boolean showOutline
Shape legendArea
boolean useFillPaint
GradientPaintTransformer gradientTransformer
