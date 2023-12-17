public Vector(double x, double y) { [EOL]     this.x = x; [EOL]     this.y = y; [EOL] } <line_num>: 67,70
public double getX() { [EOL]     return this.x; [EOL] } <line_num>: 77,79
public double getY() { [EOL]     return this.y; [EOL] } <line_num>: 86,88
public double getLength() { [EOL]     return Math.sqrt((this.x * this.x) + (this.y * this.y)); [EOL] } <line_num>: 95,97
public double getAngle() { [EOL]     return Math.atan2(this.y, this.x); [EOL] } <line_num>: 104,106
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof Vector)) { [EOL]         return false; [EOL]     } [EOL]     Vector that = (Vector) obj; [EOL]     if (this.x != that.x) { [EOL]         return false; [EOL]     } [EOL]     if (this.y != that.y) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 115,130
public int hashCode() { [EOL]     int result = 193; [EOL]     long temp = Double.doubleToLongBits(this.x); [EOL]     result = 37 * result + (int) (temp ^ (temp >>> 32)); [EOL]     temp = Double.doubleToLongBits(this.y); [EOL]     result = 37 * result + (int) (temp ^ (temp >>> 32)); [EOL]     return result; [EOL] } <line_num>: 137,144
