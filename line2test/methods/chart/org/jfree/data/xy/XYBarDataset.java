public XYBarDataset(XYDataset underlying, double barWidth) { [EOL]     this.underlying = underlying; [EOL]     this.underlying.addChangeListener(this); [EOL]     this.barWidth = barWidth; [EOL] } <line_num>: 78,82
public XYDataset getUnderlyingDataset() { [EOL]     return this.underlying; [EOL] } <line_num>: 91,93
public double getBarWidth() { [EOL]     return this.barWidth; [EOL] } <line_num>: 103,105
public void setBarWidth(double barWidth) { [EOL]     this.barWidth = barWidth; [EOL]     fireDatasetChanged(new DatasetChangeInfo()); [EOL] } <line_num>: 116,120
public int getSeriesCount() { [EOL]     return this.underlying.getSeriesCount(); [EOL] } <line_num>: 127,129
public Comparable getSeriesKey(int series) { [EOL]     return this.underlying.getSeriesKey(series); [EOL] } <line_num>: 139,141
public int getItemCount(int series) { [EOL]     return this.underlying.getItemCount(series); [EOL] } <line_num>: 150,152
public Number getX(int series, int item) { [EOL]     return this.underlying.getX(series, item); [EOL] } <line_num>: 164,166
public double getXValue(int series, int item) { [EOL]     return this.underlying.getXValue(series, item); [EOL] } <line_num>: 178,180
public Number getY(int series, int item) { [EOL]     return this.underlying.getY(series, item); [EOL] } <line_num>: 192,194
public double getYValue(int series, int item) { [EOL]     return this.underlying.getYValue(series, item); [EOL] } <line_num>: 206,208
public Number getStartX(int series, int item) { [EOL]     Number result = null; [EOL]     Number xnum = this.underlying.getX(series, item); [EOL]     if (xnum != null) { [EOL]         result = new Double(xnum.doubleValue() - this.barWidth / 2.0); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 218,225
public double getStartXValue(int series, int item) { [EOL]     return getXValue(series, item) - this.barWidth / 2.0; [EOL] } <line_num>: 238,240
public Number getEndX(int series, int item) { [EOL]     Number result = null; [EOL]     Number xnum = this.underlying.getX(series, item); [EOL]     if (xnum != null) { [EOL]         result = new Double(xnum.doubleValue() + this.barWidth / 2.0); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 250,257
public double getEndXValue(int series, int item) { [EOL]     return getXValue(series, item) + this.barWidth / 2.0; [EOL] } <line_num>: 270,272
public Number getStartY(int series, int item) { [EOL]     return this.underlying.getY(series, item); [EOL] } <line_num>: 282,284
public double getStartYValue(int series, int item) { [EOL]     return getYValue(series, item); [EOL] } <line_num>: 297,299
public Number getEndY(int series, int item) { [EOL]     return this.underlying.getY(series, item); [EOL] } <line_num>: 309,311
public double getEndYValue(int series, int item) { [EOL]     return getYValue(series, item); [EOL] } <line_num>: 324,326
public void datasetChanged(DatasetChangeEvent event) { [EOL]     notifyListeners(event); [EOL] } <line_num>: 333,335
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof XYBarDataset)) { [EOL]         return false; [EOL]     } [EOL]     XYBarDataset that = (XYBarDataset) obj; [EOL]     if (!this.underlying.equals(that.underlying)) { [EOL]         return false; [EOL]     } [EOL]     if (this.barWidth != that.barWidth) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 344,359
public Object clone() throws CloneNotSupportedException { [EOL]     XYBarDataset clone = (XYBarDataset) super.clone(); [EOL]     if (this.underlying instanceof PublicCloneable) { [EOL]         PublicCloneable pc = (PublicCloneable) this.underlying; [EOL]         clone.underlying = (XYDataset) pc.clone(); [EOL]     } [EOL]     return clone; [EOL] } <line_num>: 375,382
