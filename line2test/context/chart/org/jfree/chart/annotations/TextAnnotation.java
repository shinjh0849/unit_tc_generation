protected TextAnnotation(String text)
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
public boolean equals(Object obj)
public int hashCode()
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[7008912287533127432L]
Font DEFAULT_FONT=Optional[new Font("Tahoma", Font.PLAIN, 10)]
Paint DEFAULT_PAINT=Optional[Color.black]
TextAnchor DEFAULT_TEXT_ANCHOR=Optional[TextAnchor.CENTER]
TextAnchor DEFAULT_ROTATION_ANCHOR=Optional[TextAnchor.CENTER]
double DEFAULT_ROTATION_ANGLE=Optional[0.0]
String text
Font font
Paint paint
TextAnchor textAnchor
TextAnchor rotationAnchor
double rotationAngle
