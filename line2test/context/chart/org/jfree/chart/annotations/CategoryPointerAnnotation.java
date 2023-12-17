public CategoryPointerAnnotation(String label, Comparable key, double value, double angle)
public double getAngle()
public void setAngle(double angle)
public double getTipRadius()
public void setTipRadius(double radius)
public double getBaseRadius()
public void setBaseRadius(double radius)
public double getLabelOffset()
public void setLabelOffset(double offset)
public double getArrowLength()
public void setArrowLength(double length)
public double getArrowWidth()
public void setArrowWidth(double width)
public Stroke getArrowStroke()
public void setArrowStroke(Stroke stroke)
public Paint getArrowPaint()
public void setArrowPaint(Paint paint)
public void draw(Graphics2D g2, CategoryPlot plot, Rectangle2D dataArea, CategoryAxis domainAxis, ValueAxis rangeAxis)
public boolean equals(Object obj)
public int hashCode()
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[-4031161445009858551L]
double DEFAULT_TIP_RADIUS=Optional[10.0]
double DEFAULT_BASE_RADIUS=Optional[30.0]
double DEFAULT_LABEL_OFFSET=Optional[3.0]
double DEFAULT_ARROW_LENGTH=Optional[5.0]
double DEFAULT_ARROW_WIDTH=Optional[3.0]
double angle
double tipRadius
double baseRadius
double arrowLength
double arrowWidth
Stroke arrowStroke
Paint arrowPaint
double labelOffset
