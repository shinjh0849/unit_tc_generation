public AbstractRenderer()
public abstract DrawingSupplier getDrawingSupplier()
public RenderAttributes getSelectedItemAttributes()
public boolean getItemVisible(int series, int item)
public boolean isSeriesVisible(int series)
public Boolean getSeriesVisible(int series)
public void setSeriesVisible(int series, Boolean visible)
public void setSeriesVisible(int series, Boolean visible, boolean notify)
public boolean getBaseSeriesVisible()
public void setBaseSeriesVisible(boolean visible)
public void setBaseSeriesVisible(boolean visible, boolean notify)
public boolean isSeriesVisibleInLegend(int series)
public Boolean getSeriesVisibleInLegend(int series)
public void setSeriesVisibleInLegend(int series, Boolean visible)
public void setSeriesVisibleInLegend(int series, Boolean visible, boolean notify)
public boolean getBaseSeriesVisibleInLegend()
public void setBaseSeriesVisibleInLegend(boolean visible)
public void setBaseSeriesVisibleInLegend(boolean visible, boolean notify)
public Paint getItemPaint(int series, int item, boolean selected)
public Paint lookupSeriesPaint(int series)
public Paint getSeriesPaint(int series)
public void setSeriesPaint(int series, Paint paint)
public void setSeriesPaint(int series, Paint paint, boolean notify)
public void clearSeriesPaints(boolean notify)
public Paint getBasePaint()
public void setBasePaint(Paint paint)
public void setBasePaint(Paint paint, boolean notify)
public boolean getAutoPopulateSeriesPaint()
public void setAutoPopulateSeriesPaint(boolean auto)
public Paint getItemFillPaint(int series, int item, boolean selected)
public Paint lookupSeriesFillPaint(int series)
public Paint getSeriesFillPaint(int series)
public void setSeriesFillPaint(int series, Paint paint)
public void setSeriesFillPaint(int series, Paint paint, boolean notify)
public Paint getBaseFillPaint()
public void setBaseFillPaint(Paint paint)
public void setBaseFillPaint(Paint paint, boolean notify)
public boolean getAutoPopulateSeriesFillPaint()
public void setAutoPopulateSeriesFillPaint(boolean auto)
public Paint getItemOutlinePaint(int series, int item, boolean selected)
public Paint lookupSeriesOutlinePaint(int series)
public Paint getSeriesOutlinePaint(int series)
public void setSeriesOutlinePaint(int series, Paint paint)
public void setSeriesOutlinePaint(int series, Paint paint, boolean notify)
public Paint getBaseOutlinePaint()
public void setBaseOutlinePaint(Paint paint)
public void setBaseOutlinePaint(Paint paint, boolean notify)
public boolean getAutoPopulateSeriesOutlinePaint()
public void setAutoPopulateSeriesOutlinePaint(boolean auto)
public Stroke getItemStroke(int series, int item, boolean selected)
public Stroke lookupSeriesStroke(int series)
public Stroke getSeriesStroke(int series)
public void setSeriesStroke(int series, Stroke stroke)
public void setSeriesStroke(int series, Stroke stroke, boolean notify)
public void clearSeriesStrokes(boolean notify)
public Stroke getBaseStroke()
public void setBaseStroke(Stroke stroke)
public void setBaseStroke(Stroke stroke, boolean notify)
public boolean getAutoPopulateSeriesStroke()
public void setAutoPopulateSeriesStroke(boolean auto)
public Stroke getItemOutlineStroke(int series, int item, boolean selected)
public Stroke lookupSeriesOutlineStroke(int series)
public Stroke getSeriesOutlineStroke(int series)
public void setSeriesOutlineStroke(int series, Stroke stroke)
public void setSeriesOutlineStroke(int series, Stroke stroke, boolean notify)
public Stroke getBaseOutlineStroke()
public void setBaseOutlineStroke(Stroke stroke)
public void setBaseOutlineStroke(Stroke stroke, boolean notify)
public boolean getAutoPopulateSeriesOutlineStroke()
public void setAutoPopulateSeriesOutlineStroke(boolean auto)
public Shape getItemShape(int series, int item, boolean selected)
public Shape lookupSeriesShape(int series)
public Shape getSeriesShape(int series)
public void setSeriesShape(int series, Shape shape)
public void setSeriesShape(int series, Shape shape, boolean notify)
public Shape getBaseShape()
public void setBaseShape(Shape shape)
public void setBaseShape(Shape shape, boolean notify)
public boolean getAutoPopulateSeriesShape()
public void setAutoPopulateSeriesShape(boolean auto)
public boolean isItemLabelVisible(int series, int item, boolean selected)
public boolean isSeriesItemLabelsVisible(int series)
public Boolean getSeriesItemLabelsVisible(int series)
public void setSeriesItemLabelsVisible(int series, boolean visible)
public void setSeriesItemLabelsVisible(int series, Boolean visible)
public void setSeriesItemLabelsVisible(int series, Boolean visible, boolean notify)
public boolean getBaseItemLabelsVisible()
public void setBaseItemLabelsVisible(boolean visible)
public void setBaseItemLabelsVisible(boolean visible, boolean notify)
public Font getItemLabelFont(int series, int item, boolean selected)
public Font getSeriesItemLabelFont(int series)
public void setSeriesItemLabelFont(int series, Font font)
public void setSeriesItemLabelFont(int series, Font font, boolean notify)
public Font getBaseItemLabelFont()
public void setBaseItemLabelFont(Font font)
public void setBaseItemLabelFont(Font font, boolean notify)
public Paint getItemLabelPaint(int series, int item, boolean selected)
public Paint getSeriesItemLabelPaint(int series)
public void setSeriesItemLabelPaint(int series, Paint paint)
public void setSeriesItemLabelPaint(int series, Paint paint, boolean notify)
public Paint getBaseItemLabelPaint()
public void setBaseItemLabelPaint(Paint paint)
public void setBaseItemLabelPaint(Paint paint, boolean notify)
public ItemLabelPosition getPositiveItemLabelPosition(int series, int item, boolean selected)
public ItemLabelPosition getSeriesPositiveItemLabelPosition(int series)
public void setSeriesPositiveItemLabelPosition(int series, ItemLabelPosition position)
public void setSeriesPositiveItemLabelPosition(int series, ItemLabelPosition position, boolean notify)
public ItemLabelPosition getBasePositiveItemLabelPosition()
public void setBasePositiveItemLabelPosition(ItemLabelPosition position)
public void setBasePositiveItemLabelPosition(ItemLabelPosition position, boolean notify)
public ItemLabelPosition getNegativeItemLabelPosition(int series, int item, boolean selected)
public ItemLabelPosition getSeriesNegativeItemLabelPosition(int series)
public void setSeriesNegativeItemLabelPosition(int series, ItemLabelPosition position)
public void setSeriesNegativeItemLabelPosition(int series, ItemLabelPosition position, boolean notify)
public ItemLabelPosition getBaseNegativeItemLabelPosition()
public void setBaseNegativeItemLabelPosition(ItemLabelPosition position)
public void setBaseNegativeItemLabelPosition(ItemLabelPosition position, boolean notify)
public double getItemLabelAnchorOffset()
public void setItemLabelAnchorOffset(double offset)
public boolean getItemCreateEntity(int series, int item, boolean selected)
public Boolean getSeriesCreateEntities(int series)
public void setSeriesCreateEntities(int series, Boolean create)
public void setSeriesCreateEntities(int series, Boolean create, boolean notify)
public boolean getBaseCreateEntities()
public void setBaseCreateEntities(boolean create)
public void setBaseCreateEntities(boolean create, boolean notify)
public int getDefaultEntityRadius()
public void setDefaultEntityRadius(int radius)
public Shape lookupLegendShape(int series)
public Shape getLegendShape(int series)
public void setLegendShape(int series, Shape shape)
public Shape getBaseLegendShape()
public void setBaseLegendShape(Shape shape)
protected boolean getTreatLegendShapeAsLine()
protected void setTreatLegendShapeAsLine(boolean treatAsLine)
public Font lookupLegendTextFont(int series)
public Font getLegendTextFont(int series)
public void setLegendTextFont(int series, Font font)
public Font getBaseLegendTextFont()
public void setBaseLegendTextFont(Font font)
public Paint lookupLegendTextPaint(int series)
public Paint getLegendTextPaint(int series)
public void setLegendTextPaint(int series, Paint paint)
public Paint getBaseLegendTextPaint()
public void setBaseLegendTextPaint(Paint paint)
public boolean getDataBoundsIncludesVisibleSeriesOnly()
public void setDataBoundsIncludesVisibleSeriesOnly(boolean visibleOnly)
protected Point2D calculateLabelAnchorPoint(ItemLabelAnchor anchor, double x, double y, PlotOrientation orientation)
public void addChangeListener(RendererChangeListener listener)
public void removeChangeListener(RendererChangeListener listener)
public boolean hasListener(EventListener listener)
protected void fireChangeEvent()
public void notifyListeners(RendererChangeEvent event)
public boolean equals(Object obj)
public int hashCode()
protected Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[-828267569428206075L]
Double ZERO=Optional[new Double(0.0)]
Paint DEFAULT_PAINT=Optional[Color.blue]
Paint DEFAULT_OUTLINE_PAINT=Optional[Color.gray]
Stroke DEFAULT_STROKE=Optional[new BasicStroke(1.0f)]
Stroke DEFAULT_OUTLINE_STROKE=Optional[new BasicStroke(1.0f)]
Shape DEFAULT_SHAPE=Optional[new Rectangle2D.Double(-3.0, -3.0, 6.0, 6.0)]
Font DEFAULT_VALUE_LABEL_FONT=Optional[new Font("Tahoma", Font.PLAIN, 10)]
Paint DEFAULT_VALUE_LABEL_PAINT=Optional[Color.black]
BooleanList seriesVisibleList
boolean baseSeriesVisible
BooleanList seriesVisibleInLegendList
boolean baseSeriesVisibleInLegend
PaintList paintList
boolean autoPopulateSeriesPaint
Paint basePaint
PaintList fillPaintList
boolean autoPopulateSeriesFillPaint
Paint baseFillPaint
PaintList outlinePaintList
boolean autoPopulateSeriesOutlinePaint
Paint baseOutlinePaint
StrokeList strokeList
boolean autoPopulateSeriesStroke
Stroke baseStroke
StrokeList outlineStrokeList
Stroke baseOutlineStroke
boolean autoPopulateSeriesOutlineStroke
ShapeList shapeList
boolean autoPopulateSeriesShape
Shape baseShape
BooleanList itemLabelsVisibleList
boolean baseItemLabelsVisible
ObjectList itemLabelFontList
Font baseItemLabelFont
PaintList itemLabelPaintList
Paint baseItemLabelPaint
ObjectList positiveItemLabelPositionList
ItemLabelPosition basePositiveItemLabelPosition
ObjectList negativeItemLabelPositionList
ItemLabelPosition baseNegativeItemLabelPosition
double itemLabelAnchorOffset=Optional[2.0]
BooleanList createEntitiesList
boolean baseCreateEntities
ShapeList legendShapeList
Shape baseLegendShape
boolean treatLegendShapeAsLine
ObjectList legendTextFont
Font baseLegendTextFont
PaintList legendTextPaint
Paint baseLegendTextPaint
boolean dataBoundsIncludesVisibleSeriesOnly=Optional[true]
int defaultEntityRadius
EventListenerList listenerList
RenderAttributes selectedItemAttributes
double ADJ=Optional[Math.cos(Math.PI / 6.0)]
double OPP=Optional[Math.sin(Math.PI / 6.0)]
