public SubCategoryAxis(String label)
public void addSubCategory(Comparable subCategory)
public Font getSubLabelFont()
public void setSubLabelFont(Font font)
public Paint getSubLabelPaint()
public void setSubLabelPaint(Paint paint)
public AxisSpace reserveSpace(Graphics2D g2, Plot plot, Rectangle2D plotArea, RectangleEdge edge, AxisSpace space)
private double getMaxDim(Graphics2D g2, RectangleEdge edge)
public AxisState draw(Graphics2D g2, double cursor, Rectangle2D plotArea, Rectangle2D dataArea, RectangleEdge edge, PlotRenderingInfo plotState)
protected AxisState drawSubCategoryLabels(Graphics2D g2, Rectangle2D plotArea, Rectangle2D dataArea, RectangleEdge edge, AxisState state, PlotRenderingInfo plotState)
public boolean equals(Object obj)
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[-1279463299793228344L]
List subCategories
Font subLabelFont=Optional[new Font("Tahoma", Font.PLAIN, 10)]
Paint subLabelPaint=Optional[Color.black]
