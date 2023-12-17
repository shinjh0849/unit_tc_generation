public XYTaskDataset(TaskSeriesCollection tasks) { [EOL]     if (tasks == null) { [EOL]         throw new IllegalArgumentException("Null 'tasks' argument."); [EOL]     } [EOL]     this.underlying = tasks; [EOL]     this.seriesWidth = 0.8; [EOL]     this.underlying.addChangeListener(this); [EOL] } <line_num>: 81,88
public TaskSeriesCollection getTasks() { [EOL]     return this.underlying; [EOL] } <line_num>: 96,98
public double getSeriesWidth() { [EOL]     return this.seriesWidth; [EOL] } <line_num>: 107,109
public void setSeriesWidth(double w) { [EOL]     if (w <= 0.0) { [EOL]         throw new IllegalArgumentException("Requires 'w' > 0.0."); [EOL]     } [EOL]     this.seriesWidth = w; [EOL]     fireDatasetChanged(new DatasetChangeInfo()); [EOL] } <line_num>: 119,126
public boolean isTransposed() { [EOL]     return this.transposed; [EOL] } <line_num>: 139,141
public void setTransposed(boolean transposed) { [EOL]     this.transposed = transposed; [EOL]     fireDatasetChanged(new DatasetChangeInfo()); [EOL] } <line_num>: 151,155
public int getSeriesCount() { [EOL]     return this.underlying.getSeriesCount(); [EOL] } <line_num>: 162,164
public Comparable getSeriesKey(int series) { [EOL]     return this.underlying.getSeriesKey(series); [EOL] } <line_num>: 173,175
public int getItemCount(int series) { [EOL]     return this.underlying.getSeries(series).getItemCount(); [EOL] } <line_num>: 184,186
public double getXValue(int series, int item) { [EOL]     if (!this.transposed) { [EOL]         return getSeriesValue(series); [EOL]     } else { [EOL]         return getItemValue(series, item); [EOL]     } [EOL] } <line_num>: 196,203
public double getStartXValue(int series, int item) { [EOL]     if (!this.transposed) { [EOL]         return getSeriesStartValue(series); [EOL]     } else { [EOL]         return getItemStartValue(series, item); [EOL]     } [EOL] } <line_num>: 215,222
public double getEndXValue(int series, int item) { [EOL]     if (!this.transposed) { [EOL]         return getSeriesEndValue(series); [EOL]     } else { [EOL]         return getItemEndValue(series, item); [EOL]     } [EOL] } <line_num>: 234,241
public Number getX(int series, int item) { [EOL]     return new Double(getXValue(series, item)); [EOL] } <line_num>: 251,253
public Number getStartX(int series, int item) { [EOL]     return new Double(getStartXValue(series, item)); [EOL] } <line_num>: 265,267
public Number getEndX(int series, int item) { [EOL]     return new Double(getEndXValue(series, item)); [EOL] } <line_num>: 279,281
public double getYValue(int series, int item) { [EOL]     if (!this.transposed) { [EOL]         return getItemValue(series, item); [EOL]     } else { [EOL]         return getSeriesValue(series); [EOL]     } [EOL] } <line_num>: 291,298
public double getStartYValue(int series, int item) { [EOL]     if (!this.transposed) { [EOL]         return getItemStartValue(series, item); [EOL]     } else { [EOL]         return getSeriesStartValue(series); [EOL]     } [EOL] } <line_num>: 309,316
public double getEndYValue(int series, int item) { [EOL]     if (!this.transposed) { [EOL]         return getItemEndValue(series, item); [EOL]     } else { [EOL]         return getSeriesEndValue(series); [EOL]     } [EOL] } <line_num>: 327,334
public Number getY(int series, int item) { [EOL]     return new Double(getYValue(series, item)); [EOL] } <line_num>: 346,348
public Number getStartY(int series, int item) { [EOL]     return new Double(getStartYValue(series, item)); [EOL] } <line_num>: 359,361
public Number getEndY(int series, int item) { [EOL]     return new Double(getEndYValue(series, item)); [EOL] } <line_num>: 372,374
private double getSeriesValue(int series) { [EOL]     return series; [EOL] } <line_num>: 376,378
private double getSeriesStartValue(int series) { [EOL]     return series - this.seriesWidth / 2.0; [EOL] } <line_num>: 380,382
private double getSeriesEndValue(int series) { [EOL]     return series + this.seriesWidth / 2.0; [EOL] } <line_num>: 384,386
private double getItemValue(int series, int item) { [EOL]     TaskSeries s = this.underlying.getSeries(series); [EOL]     Task t = s.get(item); [EOL]     TimePeriod duration = t.getDuration(); [EOL]     Date start = duration.getStart(); [EOL]     Date end = duration.getEnd(); [EOL]     return (start.getTime() + end.getTime()) / 2.0; [EOL] } <line_num>: 388,395
private double getItemStartValue(int series, int item) { [EOL]     TaskSeries s = this.underlying.getSeries(series); [EOL]     Task t = s.get(item); [EOL]     TimePeriod duration = t.getDuration(); [EOL]     Date start = duration.getStart(); [EOL]     return start.getTime(); [EOL] } <line_num>: 397,403
private double getItemEndValue(int series, int item) { [EOL]     TaskSeries s = this.underlying.getSeries(series); [EOL]     Task t = s.get(item); [EOL]     TimePeriod duration = t.getDuration(); [EOL]     Date end = duration.getEnd(); [EOL]     return end.getTime(); [EOL] } <line_num>: 405,411
public void datasetChanged(DatasetChangeEvent event) { [EOL]     fireDatasetChanged(new DatasetChangeInfo()); [EOL] } <line_num>: 420,423
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof XYTaskDataset)) { [EOL]         return false; [EOL]     } [EOL]     XYTaskDataset that = (XYTaskDataset) obj; [EOL]     if (this.seriesWidth != that.seriesWidth) { [EOL]         return false; [EOL]     } [EOL]     if (this.transposed != that.transposed) { [EOL]         return false; [EOL]     } [EOL]     if (!this.underlying.equals(that.underlying)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 432,450
public Object clone() throws CloneNotSupportedException { [EOL]     XYTaskDataset clone = (XYTaskDataset) super.clone(); [EOL]     clone.underlying = (TaskSeriesCollection) this.underlying.clone(); [EOL]     return clone; [EOL] } <line_num>: 459,463
