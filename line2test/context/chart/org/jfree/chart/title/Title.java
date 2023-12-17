protected Title()
protected Title(RectangleEdge position, HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment)
protected Title(RectangleEdge position, HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment, RectangleInsets padding)
public boolean isVisible()
public void setVisible(boolean visible)
public RectangleEdge getPosition()
public void setPosition(RectangleEdge position)
public HorizontalAlignment getHorizontalAlignment()
public void setHorizontalAlignment(HorizontalAlignment alignment)
public VerticalAlignment getVerticalAlignment()
public void setVerticalAlignment(VerticalAlignment alignment)
public boolean getNotify()
public void setNotify(boolean flag)
public abstract void draw(Graphics2D g2, Rectangle2D area)
public Object clone() throws CloneNotSupportedException
public void addChangeListener(TitleChangeListener listener)
public void removeChangeListener(TitleChangeListener listener)
protected void notifyListeners(TitleChangeEvent event)
public boolean equals(Object obj)
public int hashCode()
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[-6675162505277817221L]
RectangleEdge DEFAULT_POSITION=Optional[RectangleEdge.TOP]
HorizontalAlignment DEFAULT_HORIZONTAL_ALIGNMENT=Optional[HorizontalAlignment.CENTER]
VerticalAlignment DEFAULT_VERTICAL_ALIGNMENT=Optional[VerticalAlignment.CENTER]
RectangleInsets DEFAULT_PADDING=Optional[new RectangleInsets(1, 1, 1, 1)]
boolean visible
RectangleEdge position
HorizontalAlignment horizontalAlignment
VerticalAlignment verticalAlignment
EventListenerList listenerList
boolean notify
