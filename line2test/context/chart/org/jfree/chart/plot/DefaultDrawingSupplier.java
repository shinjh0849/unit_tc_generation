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
long serialVersionUID=Optional[-7339847061039422538L]
Paint[] DEFAULT_PAINT_SEQUENCE=Optional[ChartColor.createDefaultPaintArray()]
Paint[] DEFAULT_OUTLINE_PAINT_SEQUENCE=Optional[new Paint[] { Color.lightGray }]
Paint[] DEFAULT_FILL_PAINT_SEQUENCE=Optional[new Paint[] { Color.white }]
Stroke[] DEFAULT_STROKE_SEQUENCE=Optional[new Stroke[] { new BasicStroke(1.0f, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_BEVEL) }]
Stroke[] DEFAULT_OUTLINE_STROKE_SEQUENCE=Optional[new Stroke[] { new BasicStroke(1.0f, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_BEVEL) }]
Shape[] DEFAULT_SHAPE_SEQUENCE=Optional[createStandardSeriesShapes()]
Paint[] paintSequence
int paintIndex
Paint[] outlinePaintSequence
int outlinePaintIndex
Paint[] fillPaintSequence
int fillPaintIndex
Stroke[] strokeSequence
int strokeIndex
Stroke[] outlineStrokeSequence
int outlineStrokeIndex
Shape[] shapeSequence
int shapeIndex
