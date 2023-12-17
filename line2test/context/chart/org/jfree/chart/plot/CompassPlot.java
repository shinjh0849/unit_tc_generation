public CompassPlot()
public CompassPlot(ValueDataset dataset)
public int getLabelType()
public void setLabelType(int type)
public Font getLabelFont()
public void setLabelFont(Font font)
public Paint getRosePaint()
public void setRosePaint(Paint paint)
public Paint getRoseCenterPaint()
public void setRoseCenterPaint(Paint paint)
public Paint getRoseHighlightPaint()
public void setRoseHighlightPaint(Paint paint)
public boolean getDrawBorder()
public void setDrawBorder(boolean status)
public void setSeriesPaint(int series, Paint paint)
public void setSeriesOutlinePaint(int series, Paint p)
public void setSeriesOutlineStroke(int series, Stroke stroke)
public void setSeriesNeedle(int type)
public void setSeriesNeedle(int index, int type)
public void setSeriesNeedle(int index, MeterNeedle needle)
public ValueDataset[] getDatasets()
public void addDataset(ValueDataset dataset)
public void addDataset(ValueDataset dataset, MeterNeedle needle)
public void draw(Graphics2D g2, Rectangle2D area, Point2D anchor, PlotState parentState, PlotRenderingInfo info)
public String getPlotType()
public LegendItemCollection getLegendItems()
public void zoom(double percent)
protected Font getCompassFont(int radius)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
public void setRevolutionDistance(double size)
public double getRevolutionDistance()
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[6924382802125527395L]
Font DEFAULT_LABEL_FONT=Optional[new Font("Tahoma", Font.BOLD, 10)]
int NO_LABELS=Optional[0]
int VALUE_LABELS=Optional[1]
int labelType
Font labelFont
boolean drawBorder=Optional[false]
Paint roseHighlightPaint=Optional[Color.black]
Paint rosePaint=Optional[Color.yellow]
Paint roseCenterPaint=Optional[Color.white]
Font compassFont=Optional[new Font("Tahoma", Font.PLAIN, 10)]
Ellipse2D circle1
Ellipse2D circle2
Area a1
Area a2
Rectangle2D rect1
ValueDataset[] datasets=Optional[new ValueDataset[1]]
MeterNeedle[] seriesNeedle=Optional[new MeterNeedle[1]]
ResourceBundle localizationResources=Optional[ResourceBundleWrapper.getBundle("org.jfree.chart.plot.LocalizationBundle")]
double revolutionDistance=Optional[360]
