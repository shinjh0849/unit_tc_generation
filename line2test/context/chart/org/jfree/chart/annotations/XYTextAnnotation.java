public XYTextAnnotation(String text, double x, double y)
public String getText()
public void setText(String text)
public Font getFont()
public void setFont(Font font)
public Paint getPaint()
public void setPaint(Paint paint)
public TextAnchor getTextAnchor()
public void setTextAnchor(TextAnchor anchor)
public TextAnchor getRotationAnchor()
public void setRotationAnchor(TextAnchor anchor)
public double getRotationAngle()
public void setRotationAngle(double angle)
public double getX()
public void setX(double x)
public double getY()
public void setY(double y)
public Paint getBackgroundPaint()
public void setBackgroundPaint(Paint paint)
public Paint getOutlinePaint()
public void setOutlinePaint(Paint paint)
public Stroke getOutlineStroke()
public void setOutlineStroke(Stroke stroke)
public boolean isOutlineVisible()
public void setOutlineVisible(boolean visible)
public void draw(Graphics2D g2, XYPlot plot, Rectangle2D dataArea, ValueAxis domainAxis, ValueAxis rangeAxis, int rendererIndex, PlotRenderingInfo info)
public boolean equals(Object obj)
public int hashCode()
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[-2946063342782506328L]
Font DEFAULT_FONT=Optional[new Font("Tahoma", Font.PLAIN, 10)]
Paint DEFAULT_PAINT=Optional[Color.black]
TextAnchor DEFAULT_TEXT_ANCHOR=Optional[TextAnchor.CENTER]
TextAnchor DEFAULT_ROTATION_ANCHOR=Optional[TextAnchor.CENTER]
double DEFAULT_ROTATION_ANGLE=Optional[0.0]
String text
Font font
Paint paint
double x
double y
TextAnchor textAnchor
TextAnchor rotationAnchor
double rotationAngle
Paint backgroundPaint
boolean outlineVisible
Paint outlinePaint
Stroke outlineStroke
