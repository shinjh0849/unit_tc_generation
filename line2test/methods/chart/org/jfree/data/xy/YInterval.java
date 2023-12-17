public YInterval(double y, double yLow, double yHigh) { [EOL]     this.y = y; [EOL]     this.yLow = yLow; [EOL]     this.yHigh = yHigh; [EOL] } <line_num>: 69,73
public double getY() { [EOL]     return this.y; [EOL] } <line_num>: 80,82
public double getYLow() { [EOL]     return this.yLow; [EOL] } <line_num>: 89,91
public double getYHigh() { [EOL]     return this.yHigh; [EOL] } <line_num>: 98,100
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof YInterval)) { [EOL]         return false; [EOL]     } [EOL]     YInterval that = (YInterval) obj; [EOL]     if (this.y != that.y) { [EOL]         return false; [EOL]     } [EOL]     if (this.yLow != that.yLow) { [EOL]         return false; [EOL]     } [EOL]     if (this.yHigh != that.yHigh) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 109,127
