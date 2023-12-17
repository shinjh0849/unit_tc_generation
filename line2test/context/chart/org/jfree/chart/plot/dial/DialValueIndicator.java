public DialValueIndicator()
public DialValueIndicator(int datasetIndex)
public int getDatasetIndex()
public void setDatasetIndex(int index)
public double getAngle()
public void setAngle(double angle)
public double getRadius()
public void setRadius(double radius)
public RectangleAnchor getFrameAnchor()
public void setFrameAnchor(RectangleAnchor anchor)
public Number getTemplateValue()
public void setTemplateValue(Number value)
public Number getMaxTemplateValue()
public void setMaxTemplateValue(Number value)
public NumberFormat getNumberFormat()
public void setNumberFormat(NumberFormat formatter)
public Font getFont()
public void setFont(Font font)
public Paint getPaint()
public void setPaint(Paint paint)
public Paint getBackgroundPaint()
public void setBackgroundPaint(Paint paint)
public Stroke getOutlineStroke()
public void setOutlineStroke(Stroke stroke)
public Paint getOutlinePaint()
public void setOutlinePaint(Paint paint)
public RectangleInsets getInsets()
public void setInsets(RectangleInsets insets)
public RectangleAnchor getValueAnchor()
public void setValueAnchor(RectangleAnchor anchor)
public TextAnchor getTextAnchor()
public void setTextAnchor(TextAnchor anchor)
public boolean isClippedToWindow()
public void draw(Graphics2D g2, DialPlot plot, Rectangle2D frame, Rectangle2D view)
private double fixToRange(double x, double minX, double maxX)
public boolean equals(Object obj)
public int hashCode()
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[803094354130942585L]
int datasetIndex
double angle
double radius
RectangleAnchor frameAnchor
Number templateValue
Number maxTemplateValue
NumberFormat formatter
Font font
Paint paint
Paint backgroundPaint
Stroke outlineStroke
Paint outlinePaint
RectangleInsets insets
RectangleAnchor valueAnchor
TextAnchor textAnchor
