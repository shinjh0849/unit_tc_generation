public XYPolygonAnnotation(double[] polygon)
public XYPolygonAnnotation(double[] polygon, Stroke stroke, Paint outlinePaint)
public XYPolygonAnnotation(double[] polygon, Stroke stroke, Paint outlinePaint, Paint fillPaint)
public double[] getPolygonCoordinates()
public Paint getFillPaint()
public Stroke getOutlineStroke()
public Paint getOutlinePaint()
public void draw(Graphics2D g2, XYPlot plot, Rectangle2D dataArea, ValueAxis domainAxis, ValueAxis rangeAxis, int rendererIndex, PlotRenderingInfo info)
public boolean equals(Object obj)
public int hashCode()
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
