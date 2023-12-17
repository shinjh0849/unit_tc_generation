public XYDataImageAnnotation(Image image, double x, double y, double w, double h)
public XYDataImageAnnotation(Image image, double x, double y, double w, double h, boolean includeInDataBounds)
public Image getImage()
public double getX()
public double getY()
public double getWidth()
public double getHeight()
public boolean getIncludeInDataBounds()
public Range getXRange()
public Range getYRange()
public void draw(Graphics2D g2, XYPlot plot, Rectangle2D dataArea, ValueAxis domainAxis, ValueAxis rangeAxis, int rendererIndex, PlotRenderingInfo info)
public boolean equals(Object obj)
public int hashCode()
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
