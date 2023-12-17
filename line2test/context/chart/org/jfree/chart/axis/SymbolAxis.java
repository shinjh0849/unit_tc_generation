public SymbolAxis(String label, String[] sv)
public String[] getSymbols()
public boolean isGridBandsVisible()
public void setGridBandsVisible(boolean flag)
public Paint getGridBandPaint()
public void setGridBandPaint(Paint paint)
public Paint getGridBandAlternatePaint()
public void setGridBandAlternatePaint(Paint paint)
protected void selectAutoTickUnit(Graphics2D g2, Rectangle2D dataArea, RectangleEdge edge)
public AxisState draw(Graphics2D g2, double cursor, Rectangle2D plotArea, Rectangle2D dataArea, RectangleEdge edge, PlotRenderingInfo plotState)
protected void drawGridBands(Graphics2D g2, Rectangle2D plotArea, Rectangle2D dataArea, RectangleEdge edge, List ticks)
protected void drawGridBandsHorizontal(Graphics2D g2, Rectangle2D plotArea, Rectangle2D dataArea, boolean firstGridBandIsDark, List ticks)
protected void drawGridBandsVertical(Graphics2D g2, Rectangle2D drawArea, Rectangle2D plotArea, boolean firstGridBandIsDark, List ticks)
protected void autoAdjustRange()
public List refreshTicks(Graphics2D g2, AxisState state, Rectangle2D dataArea, RectangleEdge edge)
protected List refreshTicksHorizontal(Graphics2D g2, Rectangle2D dataArea, RectangleEdge edge)
protected List refreshTicksVertical(Graphics2D g2, Rectangle2D dataArea, RectangleEdge edge)
public String valueToString(double value)
public boolean equals(Object obj)
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[7216330468770619716L]
Paint DEFAULT_GRID_BAND_PAINT=Optional[new Color(232, 234, 232, 128)]
Paint DEFAULT_GRID_BAND_ALTERNATE_PAINT=Optional[// transparent
new Color(0, 0, 0, 0)]
List symbols
boolean gridBandsVisible
Paint gridBandPaint
Paint gridBandAlternatePaint
