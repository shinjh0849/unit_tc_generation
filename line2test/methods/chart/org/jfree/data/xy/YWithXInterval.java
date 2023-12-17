public YWithXInterval(double y, double xLow, double xHigh) { [EOL]     this.y = y; [EOL]     this.xLow = xLow; [EOL]     this.xHigh = xHigh; [EOL] } <line_num>: 73,77
public double getY() { [EOL]     return this.y; [EOL] } <line_num>: 84,86
public double getXLow() { [EOL]     return this.xLow; [EOL] } <line_num>: 93,95
public double getXHigh() { [EOL]     return this.xHigh; [EOL] } <line_num>: 102,104
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof YWithXInterval)) { [EOL]         return false; [EOL]     } [EOL]     YWithXInterval that = (YWithXInterval) obj; [EOL]     if (this.y != that.y) { [EOL]         return false; [EOL]     } [EOL]     if (this.xLow != that.xLow) { [EOL]         return false; [EOL]     } [EOL]     if (this.xHigh != that.xHigh) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 113,131
