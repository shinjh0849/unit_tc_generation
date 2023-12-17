public DefaultDrawingSupplier()
public DefaultDrawingSupplier(Paint[] paintSequence, Paint[] outlinePaintSequence, Stroke[] strokeSequence, Stroke[] outlineStrokeSequence, Shape[] shapeSequence)
public DefaultDrawingSupplier(Paint[] paintSequence, Paint[] fillPaintSequence, Paint[] outlinePaintSequence, Stroke[] strokeSequence, Stroke[] outlineStrokeSequence, Shape[] shapeSequence)
public Paint getNextPaint()
public Paint getNextOutlinePaint()
public Paint getNextFillPaint()
public Stroke getNextStroke()
public Stroke getNextOutlineStroke()
public Shape getNextShape()
public static Shape[] createStandardSeriesShapes()
public boolean equals(Object obj)
private boolean equalShapes(Shape[] s1, Shape[] s2)
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
private static int[] intArray(double a, double b, double c)
private static int[] intArray(double a, double b, double c, double d)
public Object clone() throws CloneNotSupportedException
