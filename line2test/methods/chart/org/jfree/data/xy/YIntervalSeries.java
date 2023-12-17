public YIntervalSeries(Comparable key) { [EOL]     this(key, true, true); [EOL] } <line_num>: 63,65
public YIntervalSeries(Comparable key, boolean autoSort, boolean allowDuplicateXValues) { [EOL]     super(key, autoSort, allowDuplicateXValues); [EOL] } <line_num>: 77,80
public void add(double x, double y, double yLow, double yHigh) { [EOL]     super.add(new YIntervalDataItem(x, y, yLow, yHigh), true); [EOL] } <line_num>: 90,92
public Number getX(int index) { [EOL]     YIntervalDataItem item = (YIntervalDataItem) getDataItem(index); [EOL]     return item.getX(); [EOL] } <line_num>: 101,104
public double getYValue(int index) { [EOL]     YIntervalDataItem item = (YIntervalDataItem) getDataItem(index); [EOL]     return item.getYValue(); [EOL] } <line_num>: 113,116
public double getYLowValue(int index) { [EOL]     YIntervalDataItem item = (YIntervalDataItem) getDataItem(index); [EOL]     return item.getYLowValue(); [EOL] } <line_num>: 128,131
public double getYHighValue(int index) { [EOL]     YIntervalDataItem item = (YIntervalDataItem) getDataItem(index); [EOL]     return item.getYHighValue(); [EOL] } <line_num>: 143,146
public ComparableObjectItem getDataItem(int index) { [EOL]     return super.getDataItem(index); [EOL] } <line_num>: 155,157
