public XYDifferenceRenderer()
public XYDifferenceRenderer(Paint positivePaint, Paint negativePaint, boolean shapes)
public Paint getPositivePaint()
public void setPositivePaint(Paint paint)
public Paint getNegativePaint()
public void setNegativePaint(Paint paint)
public boolean getShapesVisible()
public void setShapesVisible(boolean flag)
public Shape getLegendLine()
public void setLegendLine(Shape line)
public boolean getRoundXCoordinates()
public void setRoundXCoordinates(boolean round)
public XYItemRendererState initialise(Graphics2D g2, Rectangle2D dataArea, XYPlot plot, XYDataset data, PlotRenderingInfo info)
public int getPassCount()
public void drawItem(Graphics2D g2, XYItemRendererState state, Rectangle2D dataArea, XYPlot plot, ValueAxis domainAxis, ValueAxis rangeAxis, XYDataset dataset, int series, int item, boolean selected, int pass)
protected void drawItemPass0(Graphics2D x_graphics, XYItemRendererState state, Rectangle2D x_dataArea, XYPlot x_plot, ValueAxis x_domainAxis, ValueAxis x_rangeAxis, XYDataset x_dataset, int x_series, int x_item, boolean selected)
protected void drawItemPass1(Graphics2D x_graphics, XYItemRendererState state, Rectangle2D x_dataArea, XYPlot x_plot, ValueAxis x_domainAxis, ValueAxis x_rangeAxis, XYDataset x_dataset, int x_series, int x_item, boolean selected)
private boolean isEitherSeriesDegenerate(XYDataset x_dataset, boolean x_impliedZeroSubtrahend)
private boolean areSeriesDisjoint(XYDataset x_dataset)
private void createPolygon(Graphics2D x_graphics, Rectangle2D x_dataArea, XYPlot x_plot, ValueAxis x_domainAxis, ValueAxis x_rangeAxis, boolean x_positive, LinkedList x_xValues, LinkedList x_yValues)
public LegendItem getLegendItem(int datasetIndex, int series)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[-8447915602375584857L]
Paint positivePaint
Paint negativePaint
boolean shapesVisible
Shape legendLine
boolean roundXCoordinates
