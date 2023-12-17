public StackedAreaRenderer()
public StackedAreaRenderer(boolean renderAsPercentages)
public boolean getRenderAsPercentages()
public void setRenderAsPercentages(boolean asPercentages)
public int getPassCount()
public Range findRangeBounds(CategoryDataset dataset)
public void drawItem(Graphics2D g2, CategoryItemRendererState state, Rectangle2D dataArea, CategoryPlot plot, CategoryAxis domainAxis, ValueAxis rangeAxis, CategoryDataset dataset, int row, int column, boolean selected, int pass)
protected double getPreviousHeight(CategoryDataset dataset, int series, int category)
protected double[] getStackValues(CategoryDataset dataset, int series, int index)
private double[] averageStackValues(double[] stack1, double[] stack2)
private double[] adjustedStackValues(double[] stack1, double[] stack2)
public boolean equals(Object obj)
long serialVersionUID=Optional[-3595635038460823663L]
boolean renderAsPercentages
