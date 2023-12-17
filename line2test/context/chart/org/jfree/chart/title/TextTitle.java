public TextTitle()
public TextTitle(String text)
public TextTitle(String text, Font font)
public TextTitle(String text, Font font, Paint paint, RectangleEdge position, HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment, RectangleInsets padding)
public String getText()
public void setText(String text)
public HorizontalAlignment getTextAlignment()
public void setTextAlignment(HorizontalAlignment alignment)
public Font getFont()
public void setFont(Font font)
public Paint getPaint()
public void setPaint(Paint paint)
public Paint getBackgroundPaint()
public void setBackgroundPaint(Paint paint)
public String getToolTipText()
public void setToolTipText(String text)
public String getURLText()
public void setURLText(String text)
public boolean getExpandToFitSpace()
public void setExpandToFitSpace(boolean expand)
public int getMaximumLinesToDisplay()
public void setMaximumLinesToDisplay(int max)
public Size2D arrange(Graphics2D g2, RectangleConstraint constraint)
protected Size2D arrangeNN(Graphics2D g2)
protected Size2D arrangeFN(Graphics2D g2, double w)
protected Size2D arrangeRN(Graphics2D g2, Range widthRange)
protected Size2D arrangeRR(Graphics2D g2, Range widthRange, Range heightRange)
public void draw(Graphics2D g2, Rectangle2D area)
public Object draw(Graphics2D g2, Rectangle2D area, Object params)
protected void drawHorizontal(Graphics2D g2, Rectangle2D area)
protected void drawVertical(Graphics2D g2, Rectangle2D area)
public boolean equals(Object obj)
public int hashCode()
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[8372008692127477443L]
Font DEFAULT_FONT=Optional[new Font("Tahoma", Font.BOLD, 12)]
Paint DEFAULT_TEXT_PAINT=Optional[Color.black]
String text
Font font
HorizontalAlignment textAlignment
Paint paint
Paint backgroundPaint
String toolTipText
String urlText
TextBlock content
boolean expandToFitSpace=Optional[false]
int maximumLinesToDisplay=Optional[Integer.MAX_VALUE]
