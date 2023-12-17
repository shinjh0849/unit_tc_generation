public BlockBorder()
public BlockBorder(Paint paint)
public BlockBorder(double top, double left, double bottom, double right)
public BlockBorder(double top, double left, double bottom, double right, Paint paint)
public BlockBorder(RectangleInsets insets, Paint paint)
public RectangleInsets getInsets()
public Paint getPaint()
public void draw(Graphics2D g2, Rectangle2D area)
public boolean equals(Object obj)
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[4961579220410228283L]
BlockBorder NONE=Optional[new BlockBorder(RectangleInsets.ZERO_INSETS, Color.white)]
RectangleInsets insets
Paint paint
