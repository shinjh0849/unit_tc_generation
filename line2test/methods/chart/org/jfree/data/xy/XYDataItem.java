public XYDataItem(Number x, Number y) { [EOL]     if (x == null) { [EOL]         throw new IllegalArgumentException("Null 'x' argument."); [EOL]     } [EOL]     this.x = x; [EOL]     this.y = y; [EOL]     this.selected = false; [EOL] } <line_num>: 83,90
public XYDataItem(double x, double y) { [EOL]     this(new Double(x), new Double(y)); [EOL] } <line_num>: 98,100
public Number getX() { [EOL]     return this.x; [EOL] } <line_num>: 107,109
public double getXValue() { [EOL]     return this.x.doubleValue(); [EOL] } <line_num>: 121,124
public Number getY() { [EOL]     return this.y; [EOL] } <line_num>: 131,133
public double getYValue() { [EOL]     double result = Double.NaN; [EOL]     if (this.y != null) { [EOL]         result = this.y.doubleValue(); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 145,151
public void setY(double y) { [EOL]     setY(new Double(y)); [EOL] } <line_num>: 159,161
public void setY(Number y) { [EOL]     this.y = y; [EOL] } <line_num>: 169,171
public boolean isSelected() { [EOL]     return this.selected; [EOL] } <line_num>: 183,185
public void setSelected(boolean selected) { [EOL]     this.selected = selected; [EOL] } <line_num>: 196,198
public int compareTo(Object o1) { [EOL]     int result; [EOL]     if (o1 instanceof XYDataItem) { [EOL]         XYDataItem dataItem = (XYDataItem) o1; [EOL]         double compare = this.x.doubleValue() - dataItem.getX().doubleValue(); [EOL]         if (compare > 0.0) { [EOL]             result = 1; [EOL]         } else { [EOL]             if (compare < 0.0) { [EOL]                 result = -1; [EOL]             } else { [EOL]                 result = 0; [EOL]             } [EOL]         } [EOL]     } else { [EOL]         result = 1; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 212,244
public Object clone() { [EOL]     Object clone = null; [EOL]     try { [EOL]         clone = super.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     return clone; [EOL] } <line_num>: 251,260
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof XYDataItem)) { [EOL]         return false; [EOL]     } [EOL]     XYDataItem that = (XYDataItem) obj; [EOL]     if (!this.x.equals(that.x)) { [EOL]         return false; [EOL]     } [EOL]     if (!ObjectUtilities.equal(this.y, that.y)) { [EOL]         return false; [EOL]     } [EOL]     if (this.selected != that.selected) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 270,288
public int hashCode() { [EOL]     int result; [EOL]     result = this.x.hashCode(); [EOL]     result = 29 * result + (this.y != null ? this.y.hashCode() : 0); [EOL]     result = HashUtilities.hashCode(result, this.selected); [EOL]     return result; [EOL] } <line_num>: 295,301
public String toString() { [EOL]     return "[" + getXValue() + ", " + getYValue() + "]"; [EOL] } <line_num>: 309,311
