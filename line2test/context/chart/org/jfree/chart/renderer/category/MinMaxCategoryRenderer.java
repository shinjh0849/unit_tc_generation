public MinMaxCategoryRenderer()
public boolean isDrawLines()
public void setDrawLines(boolean draw)
public Paint getGroupPaint()
public void setGroupPaint(Paint paint)
public Stroke getGroupStroke()
public void setGroupStroke(Stroke stroke)
public Icon getObjectIcon()
public void setObjectIcon(Icon icon)
public Icon getMaxIcon()
public void setMaxIcon(Icon icon)
public Icon getMinIcon()
public void setMinIcon(Icon icon)
public void drawItem(Graphics2D g2, CategoryItemRendererState state, Rectangle2D dataArea, CategoryPlot plot, CategoryAxis domainAxis, ValueAxis rangeAxis, CategoryDataset dataset, int row, int column, boolean selected, int pass)
public boolean equals(Object obj)
public void paintIcon(Component c, Graphics g, int x, int y)
public int getIconWidth()
public int getIconHeight()
private Icon getIcon(Shape shape, final Paint fillPaint, final Paint outlinePaint)
public void paintIcon(Component c, Graphics g, int x, int y)
public int getIconWidth()
public int getIconHeight()
private Icon getIcon(Shape shape, final boolean fill, final boolean outline)
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[2935615937671064911L]
boolean plotLines=Optional[false]
Paint groupPaint=Optional[Color.black]
Stroke groupStroke=Optional[new BasicStroke(1.0f)]
Icon minIcon=Optional[getIcon(new Arc2D.Double(-4, -4, 8, 8, 0, 360, Arc2D.OPEN), null, Color.black)]
Icon maxIcon=Optional[getIcon(new Arc2D.Double(-4, -4, 8, 8, 0, 360, Arc2D.OPEN), null, Color.black)]
Icon objectIcon=Optional[getIcon(new Line2D.Double(-4, 0, 4, 0), false, true)]
int lastCategory=Optional[-1]
double min
double max
