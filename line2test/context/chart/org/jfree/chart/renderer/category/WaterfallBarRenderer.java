public WaterfallBarRenderer()
public WaterfallBarRenderer(Paint firstBarPaint, Paint positiveBarPaint, Paint negativeBarPaint, Paint lastBarPaint)
public Paint getFirstBarPaint()
public void setFirstBarPaint(Paint paint)
public Paint getLastBarPaint()
public void setLastBarPaint(Paint paint)
public Paint getPositiveBarPaint()
public void setPositiveBarPaint(Paint paint)
public Paint getNegativeBarPaint()
public void setNegativeBarPaint(Paint paint)
public Range findRangeBounds(CategoryDataset dataset)
public void drawItem(Graphics2D g2, CategoryItemRendererState state, Rectangle2D dataArea, CategoryPlot plot, CategoryAxis domainAxis, ValueAxis rangeAxis, CategoryDataset dataset, int row, int column, boolean selected, int pass)
public boolean equals(Object obj)
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[-2482910643727230911L]
Paint firstBarPaint
Paint lastBarPaint
Paint positiveBarPaint
Paint negativeBarPaint
