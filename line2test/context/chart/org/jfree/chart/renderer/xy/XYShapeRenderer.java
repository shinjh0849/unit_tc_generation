public XYShapeRenderer()
public PaintScale getPaintScale()
public void setPaintScale(PaintScale scale)
public boolean getDrawOutlines()
public void setDrawOutlines(boolean flag)
public boolean getUseFillPaint()
public void setUseFillPaint(boolean flag)
public boolean getUseOutlinePaint()
public void setUseOutlinePaint(boolean use)
public boolean isGuideLinesVisible()
public void setGuideLinesVisible(boolean visible)
public Paint getGuideLinePaint()
public void setGuideLinePaint(Paint paint)
public Stroke getGuideLineStroke()
public void setGuideLineStroke(Stroke stroke)
public Range findDomainBounds(XYDataset dataset)
public Range findRangeBounds(XYDataset dataset)
public int getPassCount()
public void drawItem(Graphics2D g2, XYItemRendererState state, Rectangle2D dataArea, XYPlot plot, ValueAxis domainAxis, ValueAxis rangeAxis, XYDataset dataset, int series, int item, boolean selected, int pass)
protected Paint getPaint(XYDataset dataset, int series, int item, boolean selected)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
private void writeObject(ObjectOutputStream stream) throws IOException
long serialVersionUID=Optional[8320552104211173221L]
PaintScale paintScale
boolean drawOutlines
boolean useOutlinePaint
boolean useFillPaint
boolean guideLinesVisible
Paint guideLinePaint
Stroke guideLineStroke
