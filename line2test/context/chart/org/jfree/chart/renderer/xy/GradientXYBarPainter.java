public GradientXYBarPainter()
public GradientXYBarPainter(double g1, double g2, double g3)
public void paintBar(Graphics2D g2, XYBarRenderer renderer, int row, int column, boolean selected, RectangularShape bar, RectangleEdge base)
public void paintBarShadow(Graphics2D g2, XYBarRenderer renderer, int row, int column, boolean selected, RectangularShape bar, RectangleEdge base, boolean pegShadow)
private Rectangle2D createShadow(RectangularShape bar, double xOffset, double yOffset, RectangleEdge base, boolean pegShadow)
private Rectangle2D[] splitVerticalBar(RectangularShape bar, double a, double b, double c)
private Rectangle2D[] splitHorizontalBar(RectangularShape bar, double a, double b, double c)
public boolean equals(Object obj)
public int hashCode()
double g1
double g2
double g3
