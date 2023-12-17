public Size2D() { [EOL]     this(0.0, 0.0); [EOL] } <line_num>: 71,73
public Size2D(double width, double height) { [EOL]     this.width = width; [EOL]     this.height = height; [EOL] } <line_num>: 81,84
public double getWidth() { [EOL]     return this.width; [EOL] } <line_num>: 91,93
public void setWidth(double width) { [EOL]     this.width = width; [EOL] } <line_num>: 100,102
public double getHeight() { [EOL]     return this.height; [EOL] } <line_num>: 109,111
public void setHeight(double height) { [EOL]     this.height = height; [EOL] } <line_num>: 118,120
public String toString() { [EOL]     return "Size2D[width=" + this.width + ", height=" + this.height + "]"; [EOL] } <line_num>: 128,130
public boolean equals(Object obj) { [EOL]     if (this == obj) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof Size2D)) { [EOL]         return false; [EOL]     } [EOL]     final Size2D that = (Size2D) obj; [EOL]     if (this.width != that.width) { [EOL]         return false; [EOL]     } [EOL]     if (this.height != that.height) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 139,154
public Object clone() throws CloneNotSupportedException { [EOL]     return super.clone(); [EOL] } <line_num>: 163,165
