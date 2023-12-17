public JFreeChart(Plot plot)
public JFreeChart(String title, Plot plot)
public JFreeChart(String title, Font titleFont, Plot plot, boolean createLegend)
public JFreeChartInfo()
public RenderingHints getRenderingHints()
public void setRenderingHints(RenderingHints renderingHints)
public boolean isBorderVisible()
public void setBorderVisible(boolean visible)
public Stroke getBorderStroke()
public void setBorderStroke(Stroke stroke)
public Paint getBorderPaint()
public void setBorderPaint(Paint paint)
public RectangleInsets getPadding()
public void setPadding(RectangleInsets padding)
public TextTitle getTitle()
public void setTitle(TextTitle title)
public void setTitle(String text)
public void addLegend(LegendTitle legend)
public LegendTitle getLegend()
public LegendTitle getLegend(int index)
public void removeLegend()
public List getSubtitles()
public void setSubtitles(List subtitles)
public int getSubtitleCount()
public Title getSubtitle(int index)
public void addSubtitle(Title subtitle)
public void addSubtitle(int index, Title subtitle)
public void clearSubtitles()
public void removeSubtitle(Title title)
public Plot getPlot()
public CategoryPlot getCategoryPlot()
public XYPlot getXYPlot()
public boolean getAntiAlias()
public void setAntiAlias(boolean flag)
public Object getTextAntiAlias()
public void setTextAntiAlias(boolean flag)
public void setTextAntiAlias(Object val)
public Paint getBackgroundPaint()
public void setBackgroundPaint(Paint paint)
public Image getBackgroundImage()
public void setBackgroundImage(Image image)
public int getBackgroundImageAlignment()
public void setBackgroundImageAlignment(int alignment)
public float getBackgroundImageAlpha()
public void setBackgroundImageAlpha(float alpha)
public boolean isNotify()
public void setNotify(boolean notify)
public void draw(Graphics2D g2, Rectangle2D area)
public void draw(Graphics2D g2, Rectangle2D area, ChartRenderingInfo info)
public void draw(Graphics2D g2, Rectangle2D chartArea, Point2D anchor, ChartRenderingInfo info)
private Rectangle2D createAlignedRectangle2D(Size2D dimensions, Rectangle2D frame, HorizontalAlignment hAlign, VerticalAlignment vAlign)
protected EntityCollection drawTitle(Title t, Graphics2D g2, Rectangle2D area, boolean entities)
public BufferedImage createBufferedImage(int width, int height)
public BufferedImage createBufferedImage(int width, int height, ChartRenderingInfo info)
public BufferedImage createBufferedImage(int width, int height, int imageType, ChartRenderingInfo info)
public BufferedImage createBufferedImage(int imageWidth, int imageHeight, double drawWidth, double drawHeight, ChartRenderingInfo info)
public void handleClick(int x, int y, ChartRenderingInfo info)
public void addChangeListener(ChartChangeListener listener)
public void removeChangeListener(ChartChangeListener listener)
public void fireChartChanged()
protected void notifyListeners(ChartChangeEvent event)
public void addProgressListener(ChartProgressListener listener)
public void removeProgressListener(ChartProgressListener listener)
protected void notifyListeners(ChartProgressEvent event)
public void titleChanged(TitleChangeEvent event)
public void plotChanged(PlotChangeEvent event)
public boolean equals(Object obj)
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
public static void main(String[] args)
public Object clone() throws CloneNotSupportedException
public Image getLogo()
long serialVersionUID=Optional[-3470703747817429120L]
ProjectInfo INFO=Optional[new JFreeChartInfo()]
Font DEFAULT_TITLE_FONT=Optional[new Font("Tahoma", Font.BOLD, 18)]
Paint DEFAULT_BACKGROUND_PAINT=Optional[Color.WHITE]
Image DEFAULT_BACKGROUND_IMAGE=Optional[null]
int DEFAULT_BACKGROUND_IMAGE_ALIGNMENT=Optional[Align.FIT]
float DEFAULT_BACKGROUND_IMAGE_ALPHA=Optional[0.5f]
RenderingHints renderingHints
boolean borderVisible
Stroke borderStroke
Paint borderPaint
RectangleInsets padding
TextTitle title
List subtitles
Plot plot
Paint backgroundPaint
Image backgroundImage
int backgroundImageAlignment=Optional[Align.FIT]
float backgroundImageAlpha=Optional[0.5f]
EventListenerList changeListeners
EventListenerList progressListeners
boolean notify
