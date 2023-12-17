protected AbstractBlock()
public String getID()
public void setID(String id)
public double getWidth()
public void setWidth(double width)
public double getHeight()
public void setHeight(double height)
public RectangleInsets getMargin()
public void setMargin(RectangleInsets margin)
public void setMargin(double top, double left, double bottom, double right)
public BlockFrame getFrame()
public void setFrame(BlockFrame frame)
public RectangleInsets getPadding()
public void setPadding(RectangleInsets padding)
public void setPadding(double top, double left, double bottom, double right)
public double getContentXOffset()
public double getContentYOffset()
public Size2D arrange(Graphics2D g2)
public Size2D arrange(Graphics2D g2, RectangleConstraint constraint)
public Rectangle2D getBounds()
public void setBounds(Rectangle2D bounds)
protected double trimToContentWidth(double fixedWidth)
protected double trimToContentHeight(double fixedHeight)
protected RectangleConstraint toContentConstraint(RectangleConstraint c)
private Range trimToContentWidth(Range r)
private Range trimToContentHeight(Range r)
protected double calculateTotalWidth(double contentWidth)
protected double calculateTotalHeight(double contentHeight)
protected Rectangle2D trimMargin(Rectangle2D area)
protected Rectangle2D trimBorder(Rectangle2D area)
protected Rectangle2D trimPadding(Rectangle2D area)
protected void drawBorder(Graphics2D g2, Rectangle2D area)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[7689852412141274563L]
String id
RectangleInsets margin
BlockFrame frame
RectangleInsets padding
double width
double height
Rectangle2D bounds
