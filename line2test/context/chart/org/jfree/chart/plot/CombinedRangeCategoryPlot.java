public CombinedRangeCategoryPlot()
public CombinedRangeCategoryPlot(ValueAxis rangeAxis)
public double getGap()
public void setGap(double gap)
public void add(CategoryPlot subplot)
public void add(CategoryPlot subplot, int weight)
public void remove(CategoryPlot subplot)
public List getSubplots()
protected AxisSpace calculateAxisSpace(Graphics2D g2, Rectangle2D plotArea)
public void draw(Graphics2D g2, Rectangle2D area, Point2D anchor, PlotState parentState, PlotRenderingInfo info)
public void setOrientation(PlotOrientation orientation)
public Range getDataRange(ValueAxis axis)
public LegendItemCollection getLegendItems()
protected void setFixedDomainAxisSpaceForSubplots(AxisSpace space)
public void handleClick(int x, int y, PlotRenderingInfo info)
public void plotChanged(PlotChangeEvent event)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[7260210007554504515L]
List subplots
double gap
Rectangle2D[] subplotArea
