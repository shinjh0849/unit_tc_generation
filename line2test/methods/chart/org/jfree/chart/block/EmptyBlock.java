public EmptyBlock(double width, double height) { [EOL]     setWidth(width); [EOL]     setHeight(height); [EOL] } <line_num>: 71,74
public Size2D arrange(Graphics2D g2, RectangleConstraint constraint) { [EOL]     Size2D base = new Size2D(calculateTotalWidth(getWidth()), calculateTotalHeight(getHeight())); [EOL]     return constraint.calculateConstrainedSize(base); [EOL] } <line_num>: 85,89
public void draw(Graphics2D g2, Rectangle2D area) { [EOL]     draw(g2, area, null); [EOL] } <line_num>: 98,100
public Object draw(Graphics2D g2, Rectangle2D area, Object params) { [EOL]     area = trimMargin(area); [EOL]     drawBorder(g2, area); [EOL]     return null; [EOL] } <line_num>: 112,116
public Object clone() throws CloneNotSupportedException { [EOL]     return super.clone(); [EOL] } <line_num>: 125,127
