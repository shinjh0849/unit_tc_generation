public PiePlot()
public PiePlot(PieDataset dataset)
public PieDataset getDataset()
public void setDataset(PieDataset dataset)
public int getPieIndex()
public void setPieIndex(int index)
public double getStartAngle()
public void setStartAngle(double angle)
public Rotation getDirection()
public void setDirection(Rotation direction)
public double getInteriorGap()
public void setInteriorGap(double percent)
public boolean isCircular()
public void setCircular(boolean flag)
public void setCircular(boolean circular, boolean notify)
public boolean getIgnoreNullValues()
public void setIgnoreNullValues(boolean flag)
public boolean getIgnoreZeroValues()
public void setIgnoreZeroValues(boolean flag)
protected Paint lookupSectionPaint(Comparable key, boolean selected)
protected Paint lookupSectionPaint(Comparable key, boolean selected, boolean autoPopulate)
protected Comparable getSectionKey(int section)
public Paint getSectionPaint(Comparable key, boolean selected)
public void setSectionPaint(Comparable key, Paint paint)
public void clearSectionPaints(boolean notify)
public Paint getBaseSectionPaint()
public void setBaseSectionPaint(Paint paint)
public boolean getAutoPopulateSectionPaint()
public void setAutoPopulateSectionPaint(boolean auto)
public boolean getSectionOutlinesVisible()
public void setSectionOutlinesVisible(boolean visible)
protected Paint lookupSectionOutlinePaint(Comparable key, boolean selected)
protected Paint lookupSectionOutlinePaint(Comparable key, boolean selected, boolean autoPopulate)
public Paint getSectionOutlinePaint(Comparable key)
public void setSectionOutlinePaint(Comparable key, Paint paint)
public void clearSectionOutlinePaints(boolean notify)
public Paint getBaseSectionOutlinePaint()
public void setBaseSectionOutlinePaint(Paint paint)
public boolean getAutoPopulateSectionOutlinePaint()
public void setAutoPopulateSectionOutlinePaint(boolean auto)
protected Stroke lookupSectionOutlineStroke(Comparable key, boolean selected)
protected Stroke lookupSectionOutlineStroke(Comparable key, boolean selected, boolean autoPopulate)
public Stroke getSectionOutlineStroke(Comparable key)
public void setSectionOutlineStroke(Comparable key, Stroke stroke)
public void clearSectionOutlineStrokes(boolean notify)
public Stroke getBaseSectionOutlineStroke()
public void setBaseSectionOutlineStroke(Stroke stroke)
public boolean getAutoPopulateSectionOutlineStroke()
public void setAutoPopulateSectionOutlineStroke(boolean auto)
public Paint getShadowPaint()
public void setShadowPaint(Paint paint)
public double getShadowXOffset()
public void setShadowXOffset(double offset)
public double getShadowYOffset()
public void setShadowYOffset(double offset)
public double getExplodePercent(Comparable key)
public void setExplodePercent(Comparable key, double percent)
public double getMaximumExplodePercent()
public PieSectionLabelGenerator getLabelGenerator()
public void setLabelGenerator(PieSectionLabelGenerator generator)
public double getLabelGap()
public void setLabelGap(double gap)
public double getMaximumLabelWidth()
public void setMaximumLabelWidth(double width)
public boolean getLabelLinksVisible()
public void setLabelLinksVisible(boolean visible)
public PieLabelLinkStyle getLabelLinkStyle()
public void setLabelLinkStyle(PieLabelLinkStyle style)
public double getLabelLinkMargin()
public void setLabelLinkMargin(double margin)
public Paint getLabelLinkPaint()
public void setLabelLinkPaint(Paint paint)
public Stroke getLabelLinkStroke()
public void setLabelLinkStroke(Stroke stroke)
protected double getLabelLinkDepth()
public Font getLabelFont()
public void setLabelFont(Font font)
public Paint getLabelPaint()
public void setLabelPaint(Paint paint)
public Paint getLabelBackgroundPaint()
public void setLabelBackgroundPaint(Paint paint)
public Paint getLabelOutlinePaint()
public void setLabelOutlinePaint(Paint paint)
public Stroke getLabelOutlineStroke()
public void setLabelOutlineStroke(Stroke stroke)
public Paint getLabelShadowPaint()
public void setLabelShadowPaint(Paint paint)
public RectangleInsets getLabelPadding()
public void setLabelPadding(RectangleInsets padding)
public boolean getSimpleLabels()
public void setSimpleLabels(boolean simple)
public RectangleInsets getSimpleLabelOffset()
public void setSimpleLabelOffset(RectangleInsets offset)
public AbstractPieLabelDistributor getLabelDistributor()
public void setLabelDistributor(AbstractPieLabelDistributor distributor)
public PieToolTipGenerator getToolTipGenerator()
public void setToolTipGenerator(PieToolTipGenerator generator)
public PieURLGenerator getURLGenerator()
public void setURLGenerator(PieURLGenerator generator)
public double getMinimumArcAngleToDraw()
public void setMinimumArcAngleToDraw(double angle)
public Shape getLegendItemShape()
public void setLegendItemShape(Shape shape)
public PieSectionLabelGenerator getLegendLabelGenerator()
public void setLegendLabelGenerator(PieSectionLabelGenerator generator)
public PieSectionLabelGenerator getLegendLabelToolTipGenerator()
public void setLegendLabelToolTipGenerator(PieSectionLabelGenerator generator)
public PieURLGenerator getLegendLabelURLGenerator()
public void setLegendLabelURLGenerator(PieURLGenerator generator)
public ShadowGenerator getShadowGenerator()
public void setShadowGenerator(ShadowGenerator generator)
public void handleMouseWheelRotation(int rotateClicks)
public PiePlotState initialise(Graphics2D g2, Rectangle2D plotArea, PiePlot plot, Integer index, PlotRenderingInfo info)
public void draw(Graphics2D g2, Rectangle2D area, Point2D anchor, PlotState parentState, PlotRenderingInfo info)
private Rectangle2D[] calculateLinkAndExplodeAreas(Graphics2D g2, Rectangle2D plotArea)
protected void drawPie(Graphics2D g2, Rectangle2D plotArea, PlotRenderingInfo info)
protected void drawItem(Graphics2D g2, int section, boolean selected, Rectangle2D dataArea, PiePlotState state, int currentPass)
protected void drawSimpleLabels(Graphics2D g2, List keys, double totalValue, Rectangle2D plotArea, Rectangle2D pieArea, PiePlotState state)
protected void drawLabels(Graphics2D g2, List keys, double totalValue, Rectangle2D plotArea, Rectangle2D linkArea, PiePlotState state)
protected void drawLeftLabels(KeyedValues leftKeys, Graphics2D g2, Rectangle2D plotArea, Rectangle2D linkArea, float maxLabelWidth, PiePlotState state)
protected void drawRightLabels(KeyedValues keys, Graphics2D g2, Rectangle2D plotArea, Rectangle2D linkArea, float maxLabelWidth, PiePlotState state)
public LegendItemCollection getLegendItems()
public String getPlotType()
protected Rectangle2D getArcBounds(Rectangle2D unexploded, Rectangle2D exploded, double angle, double extent, double explodePercent)
protected void drawLeftLabel(Graphics2D g2, PiePlotState state, PieLabelRecord record)
protected void drawRightLabel(Graphics2D g2, PiePlotState state, PieLabelRecord record)
private PieDatasetSelectionState findSelectionStateForDataset(PieDataset dataset, Object source)
public boolean canSelectByPoint()
public boolean canSelectByRegion()
public void select(double x, double y, Rectangle2D dataArea, RenderingSource source)
private double calculateAngleForValue(double value, double total)
public void select(GeneralPath region, Rectangle2D dataArea, RenderingSource source)
public void clearSelection()
public Shape createHotSpotShape(Graphics2D g2, Rectangle2D dataArea, int section, boolean selected)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
public PieSelectionAttributes getSelectedItemAttributes()
long serialVersionUID=Optional[-795612466005590431L]
double DEFAULT_INTERIOR_GAP=Optional[0.08]
double MAX_INTERIOR_GAP=Optional[0.40]
double DEFAULT_START_ANGLE=Optional[90.0]
Font DEFAULT_LABEL_FONT=Optional[new Font("Tahoma", Font.PLAIN, 10)]
Paint DEFAULT_LABEL_PAINT=Optional[Color.black]
Paint DEFAULT_LABEL_BACKGROUND_PAINT=Optional[new Color(255, 255, 192)]
Paint DEFAULT_LABEL_OUTLINE_PAINT=Optional[Color.black]
Stroke DEFAULT_LABEL_OUTLINE_STROKE=Optional[new BasicStroke(0.5f)]
Paint DEFAULT_LABEL_SHADOW_PAINT=Optional[new Color(151, 151, 151, 128)]
double DEFAULT_MINIMUM_ARC_ANGLE_TO_DRAW=Optional[0.00001]
PieDataset dataset
int pieIndex
double interiorGap
boolean circular
double startAngle
Rotation direction
PaintMap sectionPaintMap
Paint baseSectionPaint
boolean autoPopulateSectionPaint
boolean sectionOutlinesVisible
PaintMap sectionOutlinePaintMap
Paint baseSectionOutlinePaint
boolean autoPopulateSectionOutlinePaint
StrokeMap sectionOutlineStrokeMap
Stroke baseSectionOutlineStroke
boolean autoPopulateSectionOutlineStroke
Paint shadowPaint=Optional[Color.gray]
double shadowXOffset=Optional[4.0f]
double shadowYOffset=Optional[4.0f]
Map explodePercentages
PieSectionLabelGenerator labelGenerator
Font labelFont
Paint labelPaint
Paint labelBackgroundPaint
Paint labelOutlinePaint
Stroke labelOutlineStroke
Paint labelShadowPaint
boolean simpleLabels=Optional[true]
RectangleInsets labelPadding
RectangleInsets simpleLabelOffset
double maximumLabelWidth=Optional[0.14]
double labelGap=Optional[0.025]
boolean labelLinksVisible
PieLabelLinkStyle labelLinkStyle=Optional[PieLabelLinkStyle.STANDARD]
double labelLinkMargin=Optional[0.025]
Paint labelLinkPaint=Optional[Color.black]
Stroke labelLinkStroke=Optional[new BasicStroke(0.5f)]
AbstractPieLabelDistributor labelDistributor
PieToolTipGenerator toolTipGenerator
PieURLGenerator urlGenerator
PieSectionLabelGenerator legendLabelGenerator
PieSectionLabelGenerator legendLabelToolTipGenerator
PieURLGenerator legendLabelURLGenerator
boolean ignoreNullValues
boolean ignoreZeroValues
Shape legendItemShape
double minimumArcAngleToDraw
ShadowGenerator shadowGenerator
ResourceBundle localizationResources=Optional[ResourceBundleWrapper.getBundle("org.jfree.chart.plot.LocalizationBundle")]
PieSelectionAttributes selectedItemAttributes
boolean DEBUG_DRAW_INTERIOR=Optional[false]
boolean DEBUG_DRAW_LINK_AREA=Optional[false]
boolean DEBUG_DRAW_PIE_AREA=Optional[false]
