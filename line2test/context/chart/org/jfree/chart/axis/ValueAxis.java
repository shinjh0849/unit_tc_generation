protected ValueAxis(String label, TickUnitSource standardTickUnits)
public boolean isVerticalTickLabels()
public void setVerticalTickLabels(boolean flag)
public boolean isPositiveArrowVisible()
public void setPositiveArrowVisible(boolean visible)
public boolean isNegativeArrowVisible()
public void setNegativeArrowVisible(boolean visible)
public Shape getUpArrow()
public void setUpArrow(Shape arrow)
public Shape getDownArrow()
public void setDownArrow(Shape arrow)
public Shape getLeftArrow()
public void setLeftArrow(Shape arrow)
public Shape getRightArrow()
public void setRightArrow(Shape arrow)
protected void drawAxisLine(Graphics2D g2, double cursor, Rectangle2D dataArea, RectangleEdge edge)
protected float[] calculateAnchorPoint(ValueTick tick, double cursor, Rectangle2D dataArea, RectangleEdge edge)
protected AxisState drawTickMarksAndLabels(Graphics2D g2, double cursor, Rectangle2D plotArea, Rectangle2D dataArea, RectangleEdge edge, PlotRenderingInfo info)
public AxisSpace reserveSpace(Graphics2D g2, Plot plot, Rectangle2D plotArea, RectangleEdge edge, AxisSpace space)
protected double findMaximumTickLabelHeight(List ticks, Graphics2D g2, Rectangle2D drawArea, boolean vertical)
protected double findMaximumTickLabelWidth(List ticks, Graphics2D g2, Rectangle2D drawArea, boolean vertical)
public boolean isInverted()
public void setInverted(boolean flag)
public boolean isAutoRange()
public void setAutoRange(boolean auto)
protected void setAutoRange(boolean auto, boolean notify)
public double getAutoRangeMinimumSize()
public void setAutoRangeMinimumSize(double size)
public void setAutoRangeMinimumSize(double size, boolean notify)
public Range getDefaultAutoRange()
public void setDefaultAutoRange(Range range)
public double getLowerMargin()
public void setLowerMargin(double margin)
public double getUpperMargin()
public void setUpperMargin(double margin)
public double getFixedAutoRange()
public void setFixedAutoRange(double length)
public double getLowerBound()
public void setLowerBound(double min)
public double getUpperBound()
public void setUpperBound(double max)
public Range getRange()
public void setRange(Range range)
public void setRange(Range range, boolean turnOffAutoRange, boolean notify)
public void setRange(double lower, double upper)
public void setRangeWithMargins(Range range)
public void setRangeWithMargins(Range range, boolean turnOffAutoRange, boolean notify)
public void setRangeWithMargins(double lower, double upper)
public void setRangeAboutValue(double value, double length)
public boolean isAutoTickUnitSelection()
public void setAutoTickUnitSelection(boolean flag)
public void setAutoTickUnitSelection(boolean flag, boolean notify)
public TickUnitSource getStandardTickUnits()
public void setStandardTickUnits(TickUnitSource source)
public int getMinorTickCount()
public void setMinorTickCount(int count)
public abstract double valueToJava2D(double value, Rectangle2D area, RectangleEdge edge)
public double lengthToJava2D(double length, Rectangle2D area, RectangleEdge edge)
public abstract double java2DToValue(double java2DValue, Rectangle2D area, RectangleEdge edge)
protected abstract void autoAdjustRange()
public void centerRange(double value)
public void resizeRange(double percent)
public void resizeRange(double percent, double anchorValue)
public void resizeRange2(double percent, double anchorValue)
public void zoomRange(double lowerPercent, double upperPercent)
public void pan(double percent)
protected int getAutoTickIndex()
protected void setAutoTickIndex(int index)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[3698345477322391456L]
Range DEFAULT_RANGE=Optional[new Range(0.0, 1.0)]
boolean DEFAULT_AUTO_RANGE=Optional[true]
boolean DEFAULT_INVERTED=Optional[false]
double DEFAULT_AUTO_RANGE_MINIMUM_SIZE=Optional[0.00000001]
double DEFAULT_LOWER_MARGIN=Optional[0.05]
double DEFAULT_UPPER_MARGIN=Optional[0.05]
boolean DEFAULT_AUTO_TICK_UNIT_SELECTION=Optional[true]
int MAXIMUM_TICK_COUNT=Optional[500]
boolean positiveArrowVisible
boolean negativeArrowVisible
Shape upArrow
Shape downArrow
Shape leftArrow
Shape rightArrow
boolean inverted
Range range
boolean autoRange
double autoRangeMinimumSize
Range defaultAutoRange
double upperMargin
double lowerMargin
double fixedAutoRange
boolean autoTickUnitSelection
TickUnitSource standardTickUnits
int autoTickIndex
int minorTickCount
boolean verticalTickLabels
