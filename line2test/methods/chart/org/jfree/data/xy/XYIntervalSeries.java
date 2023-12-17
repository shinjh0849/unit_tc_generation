public XYIntervalSeries(Comparable key) { [EOL]     this(key, true, true); [EOL] } <line_num>: 63,65
public XYIntervalSeries(Comparable key, boolean autoSort, boolean allowDuplicateXValues) { [EOL]     super(key, autoSort, allowDuplicateXValues); [EOL] } <line_num>: 77,80
public void add(double x, double xLow, double xHigh, double y, double yLow, double yHigh) { [EOL]     super.add(new XYIntervalDataItem(x, xLow, xHigh, y, yLow, yHigh), true); [EOL] } <line_num>: 92,95
public Number getX(int index) { [EOL]     XYIntervalDataItem item = (XYIntervalDataItem) getDataItem(index); [EOL]     return item.getX(); [EOL] } <line_num>: 104,107
public double getXLowValue(int index) { [EOL]     XYIntervalDataItem item = (XYIntervalDataItem) getDataItem(index); [EOL]     return item.getXLowValue(); [EOL] } <line_num>: 119,122
public double getXHighValue(int index) { [EOL]     XYIntervalDataItem item = (XYIntervalDataItem) getDataItem(index); [EOL]     return item.getXHighValue(); [EOL] } <line_num>: 134,137
public double getYValue(int index) { [EOL]     XYIntervalDataItem item = (XYIntervalDataItem) getDataItem(index); [EOL]     return item.getYValue(); [EOL] } <line_num>: 146,149
public double getYLowValue(int index) { [EOL]     XYIntervalDataItem item = (XYIntervalDataItem) getDataItem(index); [EOL]     return item.getYLowValue(); [EOL] } <line_num>: 161,164
public double getYHighValue(int index) { [EOL]     XYIntervalDataItem item = (XYIntervalDataItem) getDataItem(index); [EOL]     return item.getYHighValue(); [EOL] } <line_num>: 176,179
public ComparableObjectItem getDataItem(int index) { [EOL]     return super.getDataItem(index); [EOL] } <line_num>: 188,190
