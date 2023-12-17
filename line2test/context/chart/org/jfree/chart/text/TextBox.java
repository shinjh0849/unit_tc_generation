public TextBox()
public TextBox(String text)
public TextBox(TextBlock block)
public Paint getOutlinePaint()
public void setOutlinePaint(Paint paint)
public Stroke getOutlineStroke()
public void setOutlineStroke(Stroke stroke)
public RectangleInsets getInteriorGap()
public void setInteriorGap(RectangleInsets gap)
public Paint getBackgroundPaint()
public void setBackgroundPaint(Paint paint)
public Paint getShadowPaint()
public void setShadowPaint(Paint paint)
public double getShadowXOffset()
public void setShadowXOffset(double offset)
public double getShadowYOffset()
public void setShadowYOffset(double offset)
public TextBlock getTextBlock()
public void setTextBlock(TextBlock block)
public void draw(Graphics2D g2, float x, float y, RectangleAnchor anchor)
public double getHeight(Graphics2D g2)
public boolean equals(Object obj)
public int hashCode()
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[3360220213180203706L]
Paint outlinePaint
Stroke outlineStroke
RectangleInsets interiorGap
Paint backgroundPaint
Paint shadowPaint
double shadowXOffset=Optional[2.0]
double shadowYOffset=Optional[2.0]
TextBlock textBlock
