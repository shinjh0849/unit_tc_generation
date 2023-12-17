public CombinedDomainCategoryPlot()
public CombinedDomainCategoryPlot(CategoryAxis domainAxis)
public double getGap()
public void setGap(double gap)
public void add(CategoryPlot subplot)
public void add(CategoryPlot subplot, int weight)
public void remove(CategoryPlot subplot)
public List getSubplots()
public CategoryPlot findSubplot(PlotRenderingInfo info, Point2D source)
public void zoomRangeAxes(double factor, PlotRenderingInfo info, Point2D source)
public void zoomRangeAxes(double factor, PlotRenderingInfo info, Point2D source, boolean useAnchor)
public void zoomRangeAxes(double lowerPercent, double upperPercent, PlotRenderingInfo info, Point2D source)
protected AxisSpace calculateAxisSpace(Graphics2D g2, Rectangle2D plotArea)
public void draw(Graphics2D g2, Rectangle2D area, Point2D anchor, PlotState parentState, PlotRenderingInfo info)
protected void setFixedRangeAxisSpaceForSubplots(AxisSpace space)
public void setOrientation(PlotOrientation orientation)
public Range getDataRange(ValueAxis axis)
public LegendItemCollection getLegendItems()
public List getCategories()
public List getCategoriesForAxis(CategoryAxis axis)
public void handleClick(int x, int y, PlotRenderingInfo info)
public void plotChanged(PlotChangeEvent event)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
long serialVersionUID=Optional[8207194522653701572L]
List subplots
double gap
Rectangle2D[] subplotAreas
