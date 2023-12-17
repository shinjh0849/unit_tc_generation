public ChartEntity(Shape area)
public ChartEntity(Shape area, String toolTipText)
public ChartEntity(Shape area, String toolTipText, String urlText)
public Shape getArea()
public void setArea(Shape area)
public String getToolTipText()
public void setToolTipText(String text)
public String getURLText()
public void setURLText(String text)
public String getShapeType()
public String getShapeCoords()
private String getRectCoords(Rectangle2D rectangle)
private String getPolyCoords(Shape shape)
public String getImageMapAreaTag(ToolTipTagFragmentGenerator toolTipTagFragmentGenerator, URLTagFragmentGenerator urlTagFragmentGenerator)
public String toString()
public boolean equals(Object obj)
public int hashCode()
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[-4445994133561919083L]
Shape area
String toolTipText
String urlText
