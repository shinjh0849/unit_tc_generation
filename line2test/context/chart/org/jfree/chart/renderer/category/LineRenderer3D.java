public LineRenderer3D()
public double getXOffset()
public double getYOffset()
public void setXOffset(double xOffset)
public void setYOffset(double yOffset)
public Paint getWallPaint()
public void setWallPaint(Paint paint)
public void drawBackground(Graphics2D g2, CategoryPlot plot, Rectangle2D dataArea)
public void drawOutline(Graphics2D g2, CategoryPlot plot, Rectangle2D dataArea)
public void drawDomainGridline(Graphics2D g2, CategoryPlot plot, Rectangle2D dataArea, double value)
public void drawRangeGridline(Graphics2D g2, CategoryPlot plot, ValueAxis axis, Rectangle2D dataArea, double value)
public void drawRangeMarker(Graphics2D g2, CategoryPlot plot, ValueAxis axis, Marker marker, Rectangle2D dataArea)
public void drawItem(Graphics2D g2, CategoryItemRendererState state, Rectangle2D dataArea, CategoryPlot plot, CategoryAxis domainAxis, ValueAxis rangeAxis, CategoryDataset dataset, int row, int column, boolean selected, int pass)
public boolean equals(Object obj)
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[5467931468380928736L]
double DEFAULT_X_OFFSET=Optional[12.0]
double DEFAULT_Y_OFFSET=Optional[8.0]
Paint DEFAULT_WALL_PAINT=Optional[new Color(0xDD, 0xDD, 0xDD)]
double xOffset
double yOffset
Paint wallPaint
