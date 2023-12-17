public SpiderWebPlot()
public SpiderWebPlot(CategoryDataset dataset)
public SpiderWebPlot(CategoryDataset dataset, TableOrder extract)
public String getPlotType()
public CategoryDataset getDataset()
public void setDataset(CategoryDataset dataset)
public boolean isWebFilled()
public void setWebFilled(boolean flag)
public TableOrder getDataExtractOrder()
public void setDataExtractOrder(TableOrder order)
public double getHeadPercent()
public void setHeadPercent(double percent)
public double getStartAngle()
public void setStartAngle(double angle)
public double getMaxValue()
public void setMaxValue(double value)
public Rotation getDirection()
public void setDirection(Rotation direction)
public double getInteriorGap()
public void setInteriorGap(double percent)
public double getAxisLabelGap()
public void setAxisLabelGap(double gap)
public Paint getAxisLinePaint()
public void setAxisLinePaint(Paint paint)
public Stroke getAxisLineStroke()
public void setAxisLineStroke(Stroke stroke)
public Paint getSeriesPaint()
public void setSeriesPaint(Paint paint)
public Paint getSeriesPaint(int series)
public void setSeriesPaint(int series, Paint paint)
public Paint getBaseSeriesPaint()
public void setBaseSeriesPaint(Paint paint)
public Paint getSeriesOutlinePaint()
public void setSeriesOutlinePaint(Paint paint)
public Paint getSeriesOutlinePaint(int series)
public void setSeriesOutlinePaint(int series, Paint paint)
public Paint getBaseSeriesOutlinePaint()
public void setBaseSeriesOutlinePaint(Paint paint)
public Stroke getSeriesOutlineStroke()
public void setSeriesOutlineStroke(Stroke stroke)
public Stroke getSeriesOutlineStroke(int series)
public void setSeriesOutlineStroke(int series, Stroke stroke)
public Stroke getBaseSeriesOutlineStroke()
public void setBaseSeriesOutlineStroke(Stroke stroke)
public Shape getLegendItemShape()
public void setLegendItemShape(Shape shape)
public Font getLabelFont()
public void setLabelFont(Font font)
public Paint getLabelPaint()
public void setLabelPaint(Paint paint)
public CategoryItemLabelGenerator getLabelGenerator()
public void setLabelGenerator(CategoryItemLabelGenerator generator)
public CategoryToolTipGenerator getToolTipGenerator()
public void setToolTipGenerator(CategoryToolTipGenerator generator)
public CategoryURLGenerator getURLGenerator()
public void setURLGenerator(CategoryURLGenerator generator)
public LegendItemCollection getLegendItems()
protected Point2D getWebPoint(Rectangle2D bounds, double angle, double length)
public void draw(Graphics2D g2, Rectangle2D area, Point2D anchor, PlotState parentState, PlotRenderingInfo info)
private void calculateMaxValue(int seriesCount, int catCount)
protected void drawRadarPoly(Graphics2D g2, Rectangle2D plotArea, Point2D centre, PlotRenderingInfo info, int series, int catCount, double headH, double headW)
protected Number getPlotValue(int series, int cat)
protected void drawLabel(Graphics2D g2, Rectangle2D plotArea, double value, int cat, double startAngle, double extent)
protected Point2D calculateLabelLocation(Rectangle2D labelBounds, double ascent, Rectangle2D plotArea, double startAngle)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[-5376340422031599463L]
double DEFAULT_HEAD=Optional[0.01]
double DEFAULT_AXIS_LABEL_GAP=Optional[0.10]
double DEFAULT_INTERIOR_GAP=Optional[0.25]
double MAX_INTERIOR_GAP=Optional[0.40]
double DEFAULT_START_ANGLE=Optional[90.0]
Font DEFAULT_LABEL_FONT=Optional[new Font("Tahoma", Font.PLAIN, 10)]
Paint DEFAULT_LABEL_PAINT=Optional[Color.black]
Paint DEFAULT_LABEL_BACKGROUND_PAINT=Optional[new Color(255, 255, 192)]
Paint DEFAULT_LABEL_OUTLINE_PAINT=Optional[Color.black]
Stroke DEFAULT_LABEL_OUTLINE_STROKE=Optional[new BasicStroke(0.5f)]
Paint DEFAULT_LABEL_SHADOW_PAINT=Optional[Color.lightGray]
double DEFAULT_MAX_VALUE=Optional[-1.0]
double headPercent
double interiorGap
double axisLabelGap
Paint axisLinePaint
Stroke axisLineStroke
CategoryDataset dataset
double maxValue
TableOrder dataExtractOrder
double startAngle
Rotation direction
Shape legendItemShape
Paint seriesPaint
PaintList seriesPaintList
Paint baseSeriesPaint
Paint seriesOutlinePaint
PaintList seriesOutlinePaintList
Paint baseSeriesOutlinePaint
Stroke seriesOutlineStroke
StrokeList seriesOutlineStrokeList
Stroke baseSeriesOutlineStroke
Font labelFont
Paint labelPaint
CategoryItemLabelGenerator labelGenerator
boolean webFilled=Optional[true]
CategoryToolTipGenerator toolTipGenerator
CategoryURLGenerator urlGenerator
