public TextFragment(String text)
public TextFragment(String text, Font font)
public TextFragment(String text, Font font, Paint paint)
public TextFragment(String text, Font font, Paint paint, float baselineOffset)
public String getText()
public Font getFont()
public Paint getPaint()
public float getBaselineOffset()
public void draw(Graphics2D g2, float anchorX, float anchorY, TextAnchor anchor, float rotateX, float rotateY, double angle)
public Size2D calculateDimensions(Graphics2D g2)
public float calculateBaselineOffset(Graphics2D g2, TextAnchor anchor)
public boolean equals(Object obj)
public int hashCode()
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[4465945952903143262L]
Font DEFAULT_FONT=Optional[new Font("Serif", Font.PLAIN, 12)]
Paint DEFAULT_PAINT=Optional[Color.black]
String text
Font font
Paint paint
float baselineOffset
