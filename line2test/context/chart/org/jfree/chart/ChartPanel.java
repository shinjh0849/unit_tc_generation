public ChartPanel(JFreeChart chart)
public ChartPanel(JFreeChart chart, boolean useBuffer)
public ChartPanel(JFreeChart chart, boolean properties, boolean save, boolean print, boolean zoom, boolean tooltips)
public ChartPanel(JFreeChart chart, int width, int height, int minimumDrawWidth, int minimumDrawHeight, int maximumDrawWidth, int maximumDrawHeight, boolean useBuffer, boolean properties, boolean save, boolean print, boolean zoom, boolean tooltips)
public ChartPanel(JFreeChart chart, int width, int height, int minimumDrawWidth, int minimumDrawHeight, int maximumDrawWidth, int maximumDrawHeight, boolean useBuffer, boolean properties, boolean copy, boolean save, boolean print, boolean zoom, boolean tooltips)
public JFreeChart getChart()
public void setChart(JFreeChart chart)
public int getMinimumDrawWidth()
public void setMinimumDrawWidth(int width)
public int getMaximumDrawWidth()
public void setMaximumDrawWidth(int width)
public int getMinimumDrawHeight()
public void setMinimumDrawHeight(int height)
public int getMaximumDrawHeight()
public void setMaximumDrawHeight(int height)
public double getScaleX()
public double getScaleY()
public Point2D getAnchor()
protected void setAnchor(Point2D anchor)
public JPopupMenu getPopupMenu()
public void setPopupMenu(JPopupMenu popup)
public ChartRenderingInfo getChartRenderingInfo()
public void setMouseZoomable(boolean flag)
public void setMouseZoomable(boolean flag, boolean fillRectangle)
public boolean isDomainZoomable()
public void setDomainZoomable(boolean flag)
public boolean isRangeZoomable()
public void setRangeZoomable(boolean flag)
public boolean getFillZoomRectangle()
public void setFillZoomRectangle(boolean flag)
public int getZoomTriggerDistance()
public void setZoomTriggerDistance(int distance)
public File getDefaultDirectoryForSaveAs()
public void setDefaultDirectoryForSaveAs(File directory)
public boolean isEnforceFileExtensions()
public void setEnforceFileExtensions(boolean enforce)
public boolean getZoomAroundAnchor()
public void setZoomAroundAnchor(boolean zoomAroundAnchor)
public Paint getZoomFillPaint()
public void setZoomFillPaint(Paint paint)
public Paint getZoomOutlinePaint()
public void setZoomOutlinePaint(Paint paint)
public boolean isMouseWheelEnabled()
public void setMouseWheelEnabled(boolean flag)
public void addOverlay(Overlay overlay)
public void removeOverlay(Overlay overlay)
public void overlayChanged(OverlayChangeEvent event)
public boolean getUseBuffer()
public PlotOrientation getOrientation()
public void addMouseHandler(AbstractMouseHandler handler)
public boolean removeMouseHandler(AbstractMouseHandler handler)
public void clearLiveMouseHandler()
public ZoomHandler getZoomHandler()
public Rectangle2D getZoomRectangle()
public void setZoomRectangle(Rectangle2D rect)
public void setDisplayToolTips(boolean flag)
public String getToolTipText(MouseEvent e)
public Point translateJava2DToScreen(Point2D java2DPoint)
public Point2D translateScreenToJava2D(Point screenPoint)
public Rectangle2D scale(Rectangle2D rect)
public ChartEntity getEntityForPoint(int viewX, int viewY)
public boolean getRefreshBuffer()
public void setRefreshBuffer(boolean flag)
public void paintComponent(Graphics g)
public void chartChanged(ChartChangeEvent event)
public void chartProgress(ChartProgressEvent event)
public void actionPerformed(ActionEvent event)
public void mouseEntered(MouseEvent e)
public void mouseExited(MouseEvent e)
public void mousePressed(MouseEvent e)
public void mouseDragged(MouseEvent e)
public void mouseReleased(MouseEvent e)
public void mouseClicked(MouseEvent event)
public void mouseMoved(MouseEvent e)
public void zoomInBoth(double x, double y)
public void zoomInDomain(double x, double y)
public void zoomInRange(double x, double y)
public void zoomOutBoth(double x, double y)
public void zoomOutDomain(double x, double y)
public void zoomOutRange(double x, double y)
public void zoom(Rectangle2D selection)
public void restoreAutoBounds()
public void restoreAutoDomainBounds()
public void restoreAutoRangeBounds()
public Rectangle2D getScreenDataArea()
public Rectangle2D getScreenDataArea(int x, int y)
public int getInitialDelay()
public int getReshowDelay()
public int getDismissDelay()
public void setInitialDelay(int delay)
public void setReshowDelay(int delay)
public void setDismissDelay(int delay)
public double getZoomInFactor()
public void setZoomInFactor(double factor)
public double getZoomOutFactor()
public void setZoomOutFactor(double factor)
private void drawZoomRectangle(Graphics2D g2, boolean xor)
private void drawSelectionShape(Graphics2D g2, boolean xor)
public void doEditChartProperties()
public void doCopy()
public void doSaveAs() throws IOException
public void createChartPrintJob()
public int print(Graphics g, PageFormat pf, int pageIndex)
public void addChartMouseListener(ChartMouseListener listener)
public void removeChartMouseListener(ChartMouseListener listener)
public EventListener[] getListeners(Class listenerType)
protected JPopupMenu createPopupMenu(boolean properties, boolean save, boolean print, boolean zoom)
protected JPopupMenu createPopupMenu(boolean properties, boolean copy, boolean save, boolean print, boolean zoom)
protected void displayPopupMenu(int x, int y)
public void updateUI()
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
public Shape getSelectionShape()
public void setSelectionShape(Shape shape)
public Paint getSelectionFillPaint()
public void setSelectionFillPaint(Paint paint)
public Paint getSelectionOutlinePaint()
public void setSelectionOutlinePaint(Paint paint)
public Stroke getSelectionOutlineStroke()
public void setSelectionOutlineStroke(Stroke stroke)
public DatasetSelectionState getSelectionState(Dataset dataset)
public void putSelectionState(Dataset dataset, DatasetSelectionState state)
public Graphics2D createGraphics2D()
long serialVersionUID=Optional[6046366297214274674L]
boolean DEFAULT_BUFFER_USED=Optional[true]
int DEFAULT_WIDTH=Optional[680]
int DEFAULT_HEIGHT=Optional[420]
int DEFAULT_MINIMUM_DRAW_WIDTH=Optional[300]
int DEFAULT_MINIMUM_DRAW_HEIGHT=Optional[200]
int DEFAULT_MAXIMUM_DRAW_WIDTH=Optional[1024]
int DEFAULT_MAXIMUM_DRAW_HEIGHT=Optional[768]
int DEFAULT_ZOOM_TRIGGER_DISTANCE=Optional[10]
String PROPERTIES_COMMAND=Optional["PROPERTIES"]
String COPY_COMMAND=Optional["COPY"]
String SAVE_COMMAND=Optional["SAVE"]
String PRINT_COMMAND=Optional["PRINT"]
String ZOOM_IN_BOTH_COMMAND=Optional["ZOOM_IN_BOTH"]
String ZOOM_IN_DOMAIN_COMMAND=Optional["ZOOM_IN_DOMAIN"]
String ZOOM_IN_RANGE_COMMAND=Optional["ZOOM_IN_RANGE"]
String ZOOM_OUT_BOTH_COMMAND=Optional["ZOOM_OUT_BOTH"]
String ZOOM_OUT_DOMAIN_COMMAND=Optional["ZOOM_DOMAIN_BOTH"]
String ZOOM_OUT_RANGE_COMMAND=Optional["ZOOM_RANGE_BOTH"]
String ZOOM_RESET_BOTH_COMMAND=Optional["ZOOM_RESET_BOTH"]
String ZOOM_RESET_DOMAIN_COMMAND=Optional["ZOOM_RESET_DOMAIN"]
String ZOOM_RESET_RANGE_COMMAND=Optional["ZOOM_RESET_RANGE"]
JFreeChart chart
EventListenerList chartMouseListeners
boolean useBuffer
boolean refreshBuffer
Image chartBuffer
int chartBufferHeight
int chartBufferWidth
int minimumDrawWidth
int minimumDrawHeight
int maximumDrawWidth
int maximumDrawHeight
JPopupMenu popup
ChartRenderingInfo info
Point2D anchor
double scaleX
double scaleY
PlotOrientation orientation=Optional[PlotOrientation.VERTICAL]
boolean domainZoomable=Optional[false]
boolean rangeZoomable=Optional[false]
Point2D zoomPoint=Optional[null]
Rectangle2D zoomRectangle=Optional[null]
boolean fillZoomRectangle=Optional[true]
int zoomTriggerDistance
JMenuItem zoomInBothMenuItem
JMenuItem zoomInDomainMenuItem
JMenuItem zoomInRangeMenuItem
JMenuItem zoomOutBothMenuItem
JMenuItem zoomOutDomainMenuItem
JMenuItem zoomOutRangeMenuItem
JMenuItem zoomResetBothMenuItem
JMenuItem zoomResetDomainMenuItem
JMenuItem zoomResetRangeMenuItem
File defaultDirectoryForSaveAs
boolean enforceFileExtensions
boolean ownToolTipDelaysActive
int originalToolTipInitialDelay
int originalToolTipReshowDelay
int originalToolTipDismissDelay
int ownToolTipInitialDelay
int ownToolTipReshowDelay
int ownToolTipDismissDelay
double zoomInFactor=Optional[0.5]
double zoomOutFactor=Optional[2.0]
boolean zoomAroundAnchor
Paint zoomOutlinePaint
Paint zoomFillPaint
ResourceBundle localizationResources=Optional[ResourceBundleWrapper.getBundle("org.jfree.chart.LocalizationBundle")]
List overlays
List availableMouseHandlers
AbstractMouseHandler liveMouseHandler
List auxiliaryMouseHandlers
ZoomHandler zoomHandler
List selectionStates=Optional[new java.util.ArrayList()]
Shape selectionShape
Paint selectionFillPaint
Paint selectionOutlinePaint=Optional[Color.darkGray]
Stroke selectionOutlineStroke=Optional[new BasicStroke(1.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 4.0f, new float[] { 3.0f, 3.0f }, 0.0f)]
MouseWheelHandler mouseWheelHandler
