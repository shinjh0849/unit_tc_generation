public Outlier(double xCoord, double yCoord, double radius) { [EOL]     this.point = new Point2D.Double(xCoord - radius, yCoord - radius); [EOL]     this.radius = radius; [EOL] } <line_num>: 73,76
public Point2D getPoint() { [EOL]     return this.point; [EOL] } <line_num>: 84,86
public void setPoint(Point2D point) { [EOL]     this.point = point; [EOL] } <line_num>: 94,96
public double getX() { [EOL]     return getPoint().getX(); [EOL] } <line_num>: 104,106
public double getY() { [EOL]     return getPoint().getY(); [EOL] } <line_num>: 114,116
public double getRadius() { [EOL]     return this.radius; [EOL] } <line_num>: 123,125
public void setRadius(double radius) { [EOL]     this.radius = radius; [EOL] } <line_num>: 132,134
public int compareTo(Object o) { [EOL]     Outlier outlier = (Outlier) o; [EOL]     Point2D p1 = getPoint(); [EOL]     Point2D p2 = outlier.getPoint(); [EOL]     if (p1.equals(p2)) { [EOL]         return 0; [EOL]     } else if ((p1.getX() < p2.getX()) || (p1.getY() < p2.getY())) { [EOL]         return -1; [EOL]     } else { [EOL]         return 1; [EOL]     } [EOL] } <line_num>: 145,158
public boolean overlaps(Outlier other) { [EOL]     return ((other.getX() >= getX() - (this.radius * 1.1)) && (other.getX() <= getX() + (this.radius * 1.1)) && (other.getY() >= getY() - (this.radius * 1.1)) && (other.getY() <= getY() + (this.radius * 1.1))); [EOL] } <line_num>: 170,175
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof Outlier)) { [EOL]         return false; [EOL]     } [EOL]     Outlier that = (Outlier) obj; [EOL]     if (!this.point.equals(that.point)) { [EOL]         return false; [EOL]     } [EOL]     if (this.radius != that.radius) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 184,199
public String toString() { [EOL]     return "{" + getX() + "," + getY() + "}"; [EOL] } <line_num>: 206,208
