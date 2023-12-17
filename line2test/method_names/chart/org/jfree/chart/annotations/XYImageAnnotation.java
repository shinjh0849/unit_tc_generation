public XYImageAnnotation(double x, double y, Image image)
public XYImageAnnotation(double x, double y, Image image, RectangleAnchor anchor)
public double getX()
public double getY()
public Image getImage()
public RectangleAnchor getImageAnchor()
public void draw(Graphics2D g2, XYPlot plot, Rectangle2D dataArea, ValueAxis domainAxis, ValueAxis rangeAxis, int rendererIndex, PlotRenderingInfo info)
public boolean equals(Object obj)
public int hashCode()
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
