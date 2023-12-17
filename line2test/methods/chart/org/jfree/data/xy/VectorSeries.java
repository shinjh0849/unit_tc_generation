public VectorSeries(Comparable key) { [EOL]     this(key, false, true); [EOL] } <line_num>: 66,68
public VectorSeries(Comparable key, boolean autoSort, boolean allowDuplicateXValues) { [EOL]     super(key, autoSort, allowDuplicateXValues); [EOL] } <line_num>: 80,83
public void add(double x, double y, double deltaX, double deltaY) { [EOL]     super.add(new VectorDataItem(x, y, deltaX, deltaY), true); [EOL] } <line_num>: 93,95
public ComparableObjectItem remove(int index) { [EOL]     VectorDataItem result = (VectorDataItem) this.data.remove(index); [EOL]     fireSeriesChanged(); [EOL]     return result; [EOL] } <line_num>: 105,109
public double getXValue(int index) { [EOL]     VectorDataItem item = (VectorDataItem) this.getDataItem(index); [EOL]     return item.getXValue(); [EOL] } <line_num>: 118,121
public double getYValue(int index) { [EOL]     VectorDataItem item = (VectorDataItem) getDataItem(index); [EOL]     return item.getYValue(); [EOL] } <line_num>: 130,133
public double getVectorXValue(int index) { [EOL]     VectorDataItem item = (VectorDataItem) getDataItem(index); [EOL]     return item.getVectorX(); [EOL] } <line_num>: 142,145
public double getVectorYValue(int index) { [EOL]     VectorDataItem item = (VectorDataItem) getDataItem(index); [EOL]     return item.getVectorY(); [EOL] } <line_num>: 154,157
public ComparableObjectItem getDataItem(int index) { [EOL]     return super.getDataItem(index); [EOL] } <line_num>: 166,169
