public LineFunction2D(double a, double b) { [EOL]     this.a = a; [EOL]     this.b = b; [EOL] } <line_num>: 65,68
public double getIntercept() { [EOL]     return this.a; [EOL] } <line_num>: 77,79
public double getSlope() { [EOL]     return this.b; [EOL] } <line_num>: 88,90
public double getValue(double x) { [EOL]     return this.a + this.b * x; [EOL] } <line_num>: 99,101
public boolean equals(Object obj) { [EOL]     if (!(obj instanceof LineFunction2D)) { [EOL]         return false; [EOL]     } [EOL]     LineFunction2D that = (LineFunction2D) obj; [EOL]     if (this.a != that.a) { [EOL]         return false; [EOL]     } [EOL]     if (this.b != that.b) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 110,122
public int hashCode() { [EOL]     int result = 29; [EOL]     result = HashUtilities.hashCode(result, this.a); [EOL]     result = HashUtilities.hashCode(result, this.b); [EOL]     return result; [EOL] } <line_num>: 129,134
