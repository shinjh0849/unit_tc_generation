public CategoryTableXYDataset() { [EOL]     this.values = new DefaultKeyedValues2D(true); [EOL]     this.intervalDelegate = new IntervalXYDelegate(this); [EOL]     addChangeListener(this.intervalDelegate); [EOL] } <line_num>: 87,91
public void add(double x, double y, String seriesName) { [EOL]     add(new Double(x), new Double(y), seriesName, true); [EOL] } <line_num>: 101,103
public void add(Number x, Number y, String seriesName, boolean notify) { [EOL]     this.values.addValue(y, (Comparable) x, seriesName); [EOL]     if (notify) { [EOL]         fireDatasetChanged(new DatasetChangeInfo()); [EOL]     } [EOL] } <line_num>: 114,120
public void remove(double x, String seriesName) { [EOL]     remove(new Double(x), seriesName, true); [EOL] } <line_num>: 128,130
public void remove(Number x, String seriesName, boolean notify) { [EOL]     this.values.removeValue((Comparable) x, seriesName); [EOL]     if (notify) { [EOL]         fireDatasetChanged(new DatasetChangeInfo()); [EOL]     } [EOL] } <line_num>: 139,145
public int getSeriesCount() { [EOL]     return this.values.getColumnCount(); [EOL] } <line_num>: 153,155
public Comparable getSeriesKey(int series) { [EOL]     return this.values.getColumnKey(series); [EOL] } <line_num>: 164,166
public int getItemCount() { [EOL]     return this.values.getRowCount(); [EOL] } <line_num>: 173,175
public int getItemCount(int series) { [EOL]     return getItemCount(); [EOL] } <line_num>: 185,188
public Number getX(int series, int item) { [EOL]     return (Number) this.values.getRowKey(item); [EOL] } <line_num>: 198,200
public Number getStartX(int series, int item) { [EOL]     return this.intervalDelegate.getStartX(series, item); [EOL] } <line_num>: 210,212
public Number getEndX(int series, int item) { [EOL]     return this.intervalDelegate.getEndX(series, item); [EOL] } <line_num>: 222,224
public Number getY(int series, int item) { [EOL]     return this.values.getValue(item, series); [EOL] } <line_num>: 234,236
public Number getStartY(int series, int item) { [EOL]     return getY(series, item); [EOL] } <line_num>: 246,248
public Number getEndY(int series, int item) { [EOL]     return getY(series, item); [EOL] } <line_num>: 258,260
public double getDomainLowerBound(boolean includeInterval) { [EOL]     return this.intervalDelegate.getDomainLowerBound(includeInterval); [EOL] } <line_num>: 270,272
public double getDomainUpperBound(boolean includeInterval) { [EOL]     return this.intervalDelegate.getDomainUpperBound(includeInterval); [EOL] } <line_num>: 282,284
public Range getDomainBounds(boolean includeInterval) { [EOL]     if (includeInterval) { [EOL]         return this.intervalDelegate.getDomainBounds(includeInterval); [EOL]     } else { [EOL]         return DatasetUtilities.iterateDomainBounds(this, includeInterval); [EOL]     } [EOL] } <line_num>: 294,301
public double getIntervalPositionFactor() { [EOL]     return this.intervalDelegate.getIntervalPositionFactor(); [EOL] } <line_num>: 308,310
public void setIntervalPositionFactor(double d) { [EOL]     this.intervalDelegate.setIntervalPositionFactor(d); [EOL]     fireDatasetChanged(new DatasetChangeInfo()); [EOL] } <line_num>: 320,324
public double getIntervalWidth() { [EOL]     return this.intervalDelegate.getIntervalWidth(); [EOL] } <line_num>: 331,333
public void setIntervalWidth(double d) { [EOL]     this.intervalDelegate.setFixedIntervalWidth(d); [EOL]     fireDatasetChanged(new DatasetChangeInfo()); [EOL] } <line_num>: 341,345
public boolean isAutoWidth() { [EOL]     return this.intervalDelegate.isAutoWidth(); [EOL] } <line_num>: 352,354
public void setAutoWidth(boolean b) { [EOL]     this.intervalDelegate.setAutoWidth(b); [EOL]     fireDatasetChanged(new DatasetChangeInfo()); [EOL] } <line_num>: 362,366
public boolean equals(Object obj) { [EOL]     if (!(obj instanceof CategoryTableXYDataset)) { [EOL]         return false; [EOL]     } [EOL]     CategoryTableXYDataset that = (CategoryTableXYDataset) obj; [EOL]     if (!this.intervalDelegate.equals(that.intervalDelegate)) { [EOL]         return false; [EOL]     } [EOL]     if (!this.values.equals(that.values)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 375,387
public Object clone() throws CloneNotSupportedException { [EOL]     CategoryTableXYDataset clone = (CategoryTableXYDataset) super.clone(); [EOL]     clone.values = (DefaultKeyedValues2D) this.values.clone(); [EOL]     clone.intervalDelegate = new IntervalXYDelegate(clone); [EOL]     clone.intervalDelegate.setFixedIntervalWidth(getIntervalWidth()); [EOL]     clone.intervalDelegate.setAutoWidth(isAutoWidth()); [EOL]     clone.intervalDelegate.setIntervalPositionFactor(getIntervalPositionFactor()); [EOL]     return clone; [EOL] } <line_num>: 397,407
