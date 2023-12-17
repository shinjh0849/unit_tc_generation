public PlotRenderingInfo(ChartRenderingInfo owner)
public ChartRenderingInfo getOwner()
public Rectangle2D getPlotArea()
public void setPlotArea(Rectangle2D area)
public Rectangle2D getDataArea()
public void setDataArea(Rectangle2D area)
public int getSubplotCount()
public void addSubplotInfo(PlotRenderingInfo info)
public PlotRenderingInfo getSubplotInfo(int index)
public int getSubplotIndex(Point2D source)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
