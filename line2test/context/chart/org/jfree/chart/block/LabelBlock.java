public LabelBlock(String label)
public LabelBlock(String text, Font font)
public LabelBlock(String text, Font font, Paint paint)
public Font getFont()
public void setFont(Font font)
public Paint getPaint()
public void setPaint(Paint paint)
public String getToolTipText()
public void setToolTipText(String text)
public String getURLText()
public void setURLText(String text)
public TextBlockAnchor getContentAlignmentPoint()
public void setContentAlignmentPoint(TextBlockAnchor anchor)
public RectangleAnchor getTextAnchor()
public void setTextAnchor(RectangleAnchor anchor)
public Size2D arrange(Graphics2D g2, RectangleConstraint constraint)
public void draw(Graphics2D g2, Rectangle2D area)
public Object draw(Graphics2D g2, Rectangle2D area, Object params)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[249626098864178017L]
String text
TextBlock label
Font font
String toolTipText
String urlText
Paint DEFAULT_PAINT=Optional[Color.black]
Paint paint
TextBlockAnchor contentAlignmentPoint
RectangleAnchor textAnchor
