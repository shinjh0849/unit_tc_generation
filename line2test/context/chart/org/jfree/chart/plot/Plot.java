protected Plot()
public DatasetGroup getDatasetGroup()
protected void setDatasetGroup(DatasetGroup group)
public String getNoDataMessage()
public void setNoDataMessage(String message)
public Font getNoDataMessageFont()
public void setNoDataMessageFont(Font font)
public Paint getNoDataMessagePaint()
public void setNoDataMessagePaint(Paint paint)
public abstract String getPlotType()
public Plot getParent()
public void setParent(Plot parent)
public Plot getRootPlot()
public boolean isSubplot()
public RectangleInsets getInsets()
public void setInsets(RectangleInsets insets)
public void setInsets(RectangleInsets insets, boolean notify)
public Paint getBackgroundPaint()
public void setBackgroundPaint(Paint paint)
public float getBackgroundAlpha()
public void setBackgroundAlpha(float alpha)
public DrawingSupplier getDrawingSupplier()
public void setDrawingSupplier(DrawingSupplier supplier)
public void setDrawingSupplier(DrawingSupplier supplier, boolean notify)
public Image getBackgroundImage()
public void setBackgroundImage(Image image)
public int getBackgroundImageAlignment()
public void setBackgroundImageAlignment(int alignment)
public float getBackgroundImageAlpha()
public void setBackgroundImageAlpha(float alpha)
public boolean isOutlineVisible()
public void setOutlineVisible(boolean visible)
public Stroke getOutlineStroke()
public void setOutlineStroke(Stroke stroke)
public Paint getOutlinePaint()
public void setOutlinePaint(Paint paint)
public float getForegroundAlpha()
public void setForegroundAlpha(float alpha)
public LegendItemCollection getLegendItems()
public boolean isNotify()
public void setNotify(boolean notify)
public void addChangeListener(PlotChangeListener listener)
public void removeChangeListener(PlotChangeListener listener)
public void notifyListeners(PlotChangeEvent event)
protected void fireChangeEvent()
public abstract void draw(Graphics2D g2, Rectangle2D area, Point2D anchor, PlotState parentState, PlotRenderingInfo info)
public void drawBackground(Graphics2D g2, Rectangle2D area)
protected void fillBackground(Graphics2D g2, Rectangle2D area)
protected void fillBackground(Graphics2D g2, Rectangle2D area, PlotOrientation orientation)
public void drawBackgroundImage(Graphics2D g2, Rectangle2D area)
public void drawOutline(Graphics2D g2, Rectangle2D area)
protected void drawNoDataMessage(Graphics2D g2, Rectangle2D area)
protected void createAndAddEntity(Rectangle2D dataArea, PlotRenderingInfo plotState, String toolTip, String urlText)
public void handleClick(int x, int y, PlotRenderingInfo info)
public void zoom(double percent)
public void annotationChanged(AnnotationChangeEvent event)
public void axisChanged(AxisChangeEvent event)
public void datasetChanged(DatasetChangeEvent event)
public void markerChanged(MarkerChangeEvent event)
protected double getRectX(double x, double w1, double w2, RectangleEdge edge)
protected double getRectY(double y, double h1, double h2, RectangleEdge edge)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
public static RectangleEdge resolveDomainAxisLocation(AxisLocation location, PlotOrientation orientation)
public static RectangleEdge resolveRangeAxisLocation(AxisLocation location, PlotOrientation orientation)
long serialVersionUID=Optional[-8831571430103671324L]
Number ZERO=Optional[new Integer(0)]
RectangleInsets DEFAULT_INSETS=Optional[new RectangleInsets(4.0, 8.0, 4.0, 8.0)]
Stroke DEFAULT_OUTLINE_STROKE=Optional[new BasicStroke(0.5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND)]
Paint DEFAULT_OUTLINE_PAINT=Optional[Color.gray]
float DEFAULT_FOREGROUND_ALPHA=Optional[1.0f]
float DEFAULT_BACKGROUND_ALPHA=Optional[1.0f]
Paint DEFAULT_BACKGROUND_PAINT=Optional[Color.LIGHT_GRAY]
int MINIMUM_WIDTH_TO_DRAW=Optional[10]
int MINIMUM_HEIGHT_TO_DRAW=Optional[10]
Shape DEFAULT_LEGEND_ITEM_BOX=Optional[new Rectangle2D.Double(-4.0, -4.0, 8.0, 8.0)]
Shape DEFAULT_LEGEND_ITEM_CIRCLE=Optional[new Ellipse2D.Double(-4.0, -4.0, 8.0, 8.0)]
Plot parent
DatasetGroup datasetGroup
String noDataMessage
Font noDataMessageFont
Paint noDataMessagePaint
RectangleInsets insets
boolean outlineVisible
Stroke outlineStroke
Paint outlinePaint
Paint backgroundPaint
Image backgroundImage
int backgroundImageAlignment=Optional[Align.FIT]
float backgroundImageAlpha=Optional[0.5f]
float foregroundAlpha
float backgroundAlpha
DrawingSupplier drawingSupplier
EventListenerList listenerList
boolean notify
