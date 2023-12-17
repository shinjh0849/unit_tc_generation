public PaintScaleLegend(PaintScale scale, ValueAxis axis)
public PaintScale getScale()
public void setScale(PaintScale scale)
public ValueAxis getAxis()
public void setAxis(ValueAxis axis)
public AxisLocation getAxisLocation()
public void setAxisLocation(AxisLocation location)
public double getAxisOffset()
public void setAxisOffset(double offset)
public double getStripWidth()
public void setStripWidth(double width)
public boolean isStripOutlineVisible()
public void setStripOutlineVisible(boolean visible)
public Paint getStripOutlinePaint()
public void setStripOutlinePaint(Paint paint)
public Stroke getStripOutlineStroke()
public void setStripOutlineStroke(Stroke stroke)
public Paint getBackgroundPaint()
public void setBackgroundPaint(Paint paint)
public int getSubdivisionCount()
public void setSubdivisionCount(int count)
public void axisChanged(AxisChangeEvent event)
public Size2D arrange(Graphics2D g2, RectangleConstraint constraint)
protected Size2D arrangeRR(Graphics2D g2, Range widthRange, Range heightRange)
public void draw(Graphics2D g2, Rectangle2D area)
public Object draw(Graphics2D g2, Rectangle2D area, Object params)
public boolean equals(Object obj)
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[-1365146490993227503L]
PaintScale scale
ValueAxis axis
AxisLocation axisLocation
double axisOffset
double stripWidth
boolean stripOutlineVisible
Paint stripOutlinePaint
Stroke stripOutlineStroke
Paint backgroundPaint
int subdivisions
