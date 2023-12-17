public XYInterval(double xLow, double xHigh, double y, double yLow, double yHigh) { [EOL]     this.xLow = xLow; [EOL]     this.xHigh = xHigh; [EOL]     this.y = y; [EOL]     this.yLow = yLow; [EOL]     this.yHigh = yHigh; [EOL] } <line_num>: 77,84
public double getXLow() { [EOL]     return this.xLow; [EOL] } <line_num>: 91,93
public double getXHigh() { [EOL]     return this.xHigh; [EOL] } <line_num>: 100,102
public double getY() { [EOL]     return this.y; [EOL] } <line_num>: 109,111
public double getYLow() { [EOL]     return this.yLow; [EOL] } <line_num>: 118,120
public double getYHigh() { [EOL]     return this.yHigh; [EOL] } <line_num>: 127,129
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof XYInterval)) { [EOL]         return false; [EOL]     } [EOL]     XYInterval that = (XYInterval) obj; [EOL]     if (this.xLow != that.xLow) { [EOL]         return false; [EOL]     } [EOL]     if (this.xHigh != that.xHigh) { [EOL]         return false; [EOL]     } [EOL]     if (this.y != that.y) { [EOL]         return false; [EOL]     } [EOL]     if (this.yLow != that.yLow) { [EOL]         return false; [EOL]     } [EOL]     if (this.yHigh != that.yHigh) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 138,162
