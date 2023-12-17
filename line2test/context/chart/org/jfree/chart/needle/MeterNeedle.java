public MeterNeedle()
public MeterNeedle(Paint outline, Paint fill, Paint highlight)
public Paint getOutlinePaint()
public void setOutlinePaint(Paint p)
public Stroke getOutlineStroke()
public void setOutlineStroke(Stroke s)
public Paint getFillPaint()
public void setFillPaint(Paint p)
public Paint getHighlightPaint()
public void setHighlightPaint(Paint p)
public double getRotateX()
public void setRotateX(double x)
public void setRotateY(double y)
public double getRotateY()
public void draw(Graphics2D g2, Rectangle2D plotArea)
public void draw(Graphics2D g2, Rectangle2D plotArea, double angle)
public void draw(Graphics2D g2, Rectangle2D plotArea, Point2D rotate, double angle)
protected abstract void drawNeedle(Graphics2D g2, Rectangle2D plotArea, Point2D rotate, double angle)
protected void defaultDisplay(Graphics2D g2, Shape shape)
public int getSize()
public void setSize(int pixels)
public AffineTransform getTransform()
public boolean equals(Object obj)
public int hashCode()
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[5203064851510951052L]
Paint outlinePaint=Optional[Color.black]
Stroke outlineStroke=Optional[new BasicStroke(2)]
Paint fillPaint=Optional[null]
Paint highlightPaint=Optional[null]
int size=Optional[5]
double rotateX=Optional[0.5]
double rotateY=Optional[0.5]
AffineTransform transform=Optional[new AffineTransform()]
