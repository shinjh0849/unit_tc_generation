public LineAndShapeRenderer()
public LineAndShapeRenderer(boolean lines, boolean shapes)
public boolean getItemLineVisible(int series, int item)
public Boolean getSeriesLinesVisible(int series)
public void setSeriesLinesVisible(int series, Boolean flag)
public void setSeriesLinesVisible(int series, boolean visible)
public boolean getBaseLinesVisible()
public void setBaseLinesVisible(boolean flag)
public boolean getItemShapeVisible(int series, int item)
public Boolean getSeriesShapesVisible(int series)
public void setSeriesShapesVisible(int series, boolean visible)
public void setSeriesShapesVisible(int series, Boolean flag)
public boolean getBaseShapesVisible()
public void setBaseShapesVisible(boolean flag)
public boolean getDrawOutlines()
public void setDrawOutlines(boolean flag)
public boolean getUseOutlinePaint()
public void setUseOutlinePaint(boolean use)
public boolean getItemShapeFilled(int series, int item)
public Boolean getSeriesShapesFilled(int series)
public void setSeriesShapesFilled(int series, Boolean filled)
public void setSeriesShapesFilled(int series, boolean filled)
public boolean getBaseShapesFilled()
public void setBaseShapesFilled(boolean flag)
public boolean getUseFillPaint()
public void setUseFillPaint(boolean flag)
public boolean getUseSeriesOffset()
public void setUseSeriesOffset(boolean offset)
public double getItemMargin()
public void setItemMargin(double margin)
public LegendItem getLegendItem(int datasetIndex, int series)
public int getPassCount()
public void drawItem(Graphics2D g2, CategoryItemRendererState state, Rectangle2D dataArea, CategoryPlot plot, CategoryAxis domainAxis, ValueAxis rangeAxis, CategoryDataset dataset, int row, int column, boolean selected, int pass)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
long serialVersionUID=Optional[-197749519869226398L]
BooleanList seriesLinesVisible
boolean baseLinesVisible
BooleanList seriesShapesVisible
boolean baseShapesVisible
BooleanList seriesShapesFilled
boolean baseShapesFilled
boolean useFillPaint
boolean drawOutlines
boolean useOutlinePaint
boolean useSeriesOffset
double itemMargin
