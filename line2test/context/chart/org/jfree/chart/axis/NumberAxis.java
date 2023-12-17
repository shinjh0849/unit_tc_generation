public NumberAxis()
public NumberAxis(String label)
public RangeType getRangeType()
public void setRangeType(RangeType rangeType)
public boolean getAutoRangeIncludesZero()
public void setAutoRangeIncludesZero(boolean flag)
public boolean getAutoRangeStickyZero()
public void setAutoRangeStickyZero(boolean flag)
public NumberTickUnit getTickUnit()
public void setTickUnit(NumberTickUnit unit)
public void setTickUnit(NumberTickUnit unit, boolean notify, boolean turnOffAutoSelect)
public NumberFormat getNumberFormatOverride()
public void setNumberFormatOverride(NumberFormat formatter)
public MarkerAxisBand getMarkerBand()
public void setMarkerBand(MarkerAxisBand band)
public void configure()
protected void autoAdjustRange()
public double valueToJava2D(double value, Rectangle2D area, RectangleEdge edge)
public double java2DToValue(double java2DValue, Rectangle2D area, RectangleEdge edge)
protected double calculateLowestVisibleTickValue()
protected double calculateHighestVisibleTickValue()
protected int calculateVisibleTickCount()
public AxisState draw(Graphics2D g2, double cursor, Rectangle2D plotArea, Rectangle2D dataArea, RectangleEdge edge, PlotRenderingInfo plotState)
public static TickUnitSource createStandardTickUnits()
public static TickUnitSource createIntegerTickUnits()
public static TickUnitSource createStandardTickUnits(Locale locale)
public static TickUnitSource createIntegerTickUnits(Locale locale)
protected double estimateMaximumTickLabelHeight(Graphics2D g2)
protected double estimateMaximumTickLabelWidth(Graphics2D g2, TickUnit unit)
protected void selectAutoTickUnit(Graphics2D g2, Rectangle2D dataArea, RectangleEdge edge)
protected void selectHorizontalAutoTickUnit(Graphics2D g2, Rectangle2D dataArea, RectangleEdge edge)
protected void selectVerticalAutoTickUnit(Graphics2D g2, Rectangle2D dataArea, RectangleEdge edge)
public List refreshTicks(Graphics2D g2, AxisState state, Rectangle2D dataArea, RectangleEdge edge)
protected List refreshTicksHorizontal(Graphics2D g2, Rectangle2D dataArea, RectangleEdge edge)
protected List refreshTicksVertical(Graphics2D g2, Rectangle2D dataArea, RectangleEdge edge)
public Object clone() throws CloneNotSupportedException
public boolean equals(Object obj)
public int hashCode()
long serialVersionUID=Optional[2805933088476185789L]
boolean DEFAULT_AUTO_RANGE_INCLUDES_ZERO=Optional[true]
boolean DEFAULT_AUTO_RANGE_STICKY_ZERO=Optional[true]
NumberTickUnit DEFAULT_TICK_UNIT=Optional[new NumberTickUnit(1.0, new DecimalFormat("0"))]
boolean DEFAULT_VERTICAL_TICK_LABELS=Optional[false]
RangeType rangeType
boolean autoRangeIncludesZero
boolean autoRangeStickyZero
NumberTickUnit tickUnit
NumberFormat numberFormatOverride
MarkerAxisBand markerBand
