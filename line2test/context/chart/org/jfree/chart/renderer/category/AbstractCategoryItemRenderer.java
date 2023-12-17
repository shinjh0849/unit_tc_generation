protected AbstractCategoryItemRenderer()
public int getPassCount()
public CategoryPlot getPlot()
public void setPlot(CategoryPlot plot)
public CategoryItemLabelGenerator getItemLabelGenerator(int row, int column, boolean selected)
public CategoryItemLabelGenerator getSeriesItemLabelGenerator(int series)
public void setSeriesItemLabelGenerator(int series, CategoryItemLabelGenerator generator)
public void setSeriesItemLabelGenerator(int series, CategoryItemLabelGenerator generator, boolean notify)
public CategoryItemLabelGenerator getBaseItemLabelGenerator()
public void setBaseItemLabelGenerator(CategoryItemLabelGenerator generator)
public void setBaseItemLabelGenerator(CategoryItemLabelGenerator generator, boolean notify)
public CategoryToolTipGenerator getToolTipGenerator(int row, int column, boolean selected)
public CategoryToolTipGenerator getSeriesToolTipGenerator(int series)
public void setSeriesToolTipGenerator(int series, CategoryToolTipGenerator generator)
public void setSeriesToolTipGenerator(int series, CategoryToolTipGenerator generator, boolean notify)
public CategoryToolTipGenerator getBaseToolTipGenerator()
public void setBaseToolTipGenerator(CategoryToolTipGenerator generator)
public void setBaseToolTipGenerator(CategoryToolTipGenerator generator, boolean notify)
public CategoryURLGenerator getURLGenerator(int row, int column, boolean selected)
public CategoryURLGenerator getSeriesURLGenerator(int series)
public void setSeriesURLGenerator(int series, CategoryURLGenerator generator)
public void setSeriesURLGenerator(int series, CategoryURLGenerator generator, boolean notify)
public CategoryURLGenerator getBaseURLGenerator()
public void setBaseURLGenerator(CategoryURLGenerator generator)
public void setBaseURLGenerator(CategoryURLGenerator generator, boolean notify)
public void addAnnotation(CategoryAnnotation annotation)
public void addAnnotation(CategoryAnnotation annotation, Layer layer)
public boolean removeAnnotation(CategoryAnnotation annotation)
public void removeAnnotations()
public CategorySeriesLabelGenerator getLegendItemLabelGenerator()
public void setLegendItemLabelGenerator(CategorySeriesLabelGenerator generator)
public CategorySeriesLabelGenerator getLegendItemToolTipGenerator()
public void setLegendItemToolTipGenerator(CategorySeriesLabelGenerator generator)
public CategorySeriesLabelGenerator getLegendItemURLGenerator()
public void setLegendItemURLGenerator(CategorySeriesLabelGenerator generator)
public int getRowCount()
public int getColumnCount()
protected CategoryItemRendererState createState(PlotRenderingInfo info)
public CategoryItemRendererState initialise(Graphics2D g2, Rectangle2D dataArea, CategoryPlot plot, CategoryDataset dataset, PlotRenderingInfo info)
public Range findRangeBounds(CategoryDataset dataset)
protected Range findRangeBounds(CategoryDataset dataset, boolean includeInterval)
public double getItemMiddle(Comparable rowKey, Comparable columnKey, CategoryDataset dataset, CategoryAxis axis, Rectangle2D area, RectangleEdge edge)
public void drawBackground(Graphics2D g2, CategoryPlot plot, Rectangle2D dataArea)
public void drawOutline(Graphics2D g2, CategoryPlot plot, Rectangle2D dataArea)
public void drawDomainLine(Graphics2D g2, CategoryPlot plot, Rectangle2D dataArea, double value, Paint paint, Stroke stroke)
public void drawRangeLine(Graphics2D g2, CategoryPlot plot, ValueAxis axis, Rectangle2D dataArea, double value, Paint paint, Stroke stroke)
public void drawDomainMarker(Graphics2D g2, CategoryPlot plot, CategoryAxis axis, CategoryMarker marker, Rectangle2D dataArea)
public void drawRangeMarker(Graphics2D g2, CategoryPlot plot, ValueAxis axis, Marker marker, Rectangle2D dataArea)
protected Point2D calculateDomainMarkerTextAnchorPoint(Graphics2D g2, PlotOrientation orientation, Rectangle2D dataArea, Rectangle2D markerArea, RectangleInsets markerOffset, LengthAdjustmentType labelOffsetType, RectangleAnchor anchor)
protected Point2D calculateRangeMarkerTextAnchorPoint(Graphics2D g2, PlotOrientation orientation, Rectangle2D dataArea, Rectangle2D markerArea, RectangleInsets markerOffset, LengthAdjustmentType labelOffsetType, RectangleAnchor anchor)
public LegendItem getLegendItem(int datasetIndex, int series)
public boolean equals(Object obj)
public int hashCode()
public DrawingSupplier getDrawingSupplier()
protected void updateCrosshairValues(CategoryCrosshairState crosshairState, Comparable rowKey, Comparable columnKey, double value, int datasetIndex, double transX, double transY, PlotOrientation orientation)
protected void drawItemLabel(Graphics2D g2, PlotOrientation orientation, CategoryDataset dataset, int row, int column, boolean selected, double x, double y, boolean negative)
public void drawAnnotations(Graphics2D g2, Rectangle2D dataArea, CategoryAxis domainAxis, ValueAxis rangeAxis, Layer layer, PlotRenderingInfo info)
public Object clone() throws CloneNotSupportedException
protected CategoryAxis getDomainAxis(CategoryPlot plot, CategoryDataset dataset)
protected ValueAxis getRangeAxis(CategoryPlot plot, int index)
public LegendItemCollection getLegendItems()
protected void addEntity(EntityCollection entities, Shape hotspot, CategoryDataset dataset, int row, int column, boolean selected)
protected void addEntity(EntityCollection entities, Shape hotspot, CategoryDataset dataset, int row, int column, boolean selected, double entityX, double entityY)
public Shape createHotSpotShape(Graphics2D g2, Rectangle2D dataArea, CategoryPlot plot, CategoryAxis domainAxis, ValueAxis rangeAxis, CategoryDataset dataset, int row, int column, boolean selected, CategoryItemRendererState state)
public Rectangle2D createHotSpotBounds(Graphics2D g2, Rectangle2D dataArea, CategoryPlot plot, CategoryAxis domainAxis, ValueAxis rangeAxis, CategoryDataset dataset, int row, int column, boolean selected, CategoryItemRendererState state, Rectangle2D result)
public boolean hitTest(double xx, double yy, Graphics2D g2, Rectangle2D dataArea, CategoryPlot plot, CategoryAxis domainAxis, ValueAxis rangeAxis, CategoryDataset dataset, int row, int column, boolean selected, CategoryItemRendererState state)
long serialVersionUID=Optional[1247553218442497391L]
CategoryPlot plot
ObjectList itemLabelGeneratorList
CategoryItemLabelGenerator baseItemLabelGenerator
ObjectList toolTipGeneratorList
CategoryToolTipGenerator baseToolTipGenerator
ObjectList urlGeneratorList
CategoryURLGenerator baseURLGenerator
CategorySeriesLabelGenerator legendItemLabelGenerator
CategorySeriesLabelGenerator legendItemToolTipGenerator
CategorySeriesLabelGenerator legendItemURLGenerator
List backgroundAnnotations
List foregroundAnnotations
int rowCount
int columnCount
