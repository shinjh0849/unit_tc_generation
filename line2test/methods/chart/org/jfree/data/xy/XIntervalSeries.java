public XIntervalSeries(Comparable key) { [EOL]     this(key, true, true); [EOL] } <line_num>: 63,65
public XIntervalSeries(Comparable key, boolean autoSort, boolean allowDuplicateXValues) { [EOL]     super(key, autoSort, allowDuplicateXValues); [EOL] } <line_num>: 77,80
public void add(double x, double xLow, double xHigh, double y) { [EOL]     super.add(new XIntervalDataItem(x, xLow, xHigh, y), true); [EOL] } <line_num>: 90,92
public Number getX(int index) { [EOL]     XIntervalDataItem item = (XIntervalDataItem) getDataItem(index); [EOL]     return item.getX(); [EOL] } <line_num>: 101,104
public double getXLowValue(int index) { [EOL]     XIntervalDataItem item = (XIntervalDataItem) getDataItem(index); [EOL]     return item.getXLowValue(); [EOL] } <line_num>: 115,118
public double getXHighValue(int index) { [EOL]     XIntervalDataItem item = (XIntervalDataItem) getDataItem(index); [EOL]     return item.getXHighValue(); [EOL] } <line_num>: 129,132
public double getYValue(int index) { [EOL]     XIntervalDataItem item = (XIntervalDataItem) getDataItem(index); [EOL]     return item.getYValue(); [EOL] } <line_num>: 141,144
public ComparableObjectItem getDataItem(int index) { [EOL]     return super.getDataItem(index); [EOL] } <line_num>: 153,155
