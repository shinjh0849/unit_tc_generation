public DomainOrder getDomainOrder() { [EOL]     return DomainOrder.NONE; [EOL] } <line_num>: 63,65
public double getXValue(int series, int item) { [EOL]     double result = Double.NaN; [EOL]     Number x = getX(series, item); [EOL]     if (x != null) { [EOL]         result = x.doubleValue(); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 75,82
public double getYValue(int series, int item) { [EOL]     double result = Double.NaN; [EOL]     Number y = getY(series, item); [EOL]     if (y != null) { [EOL]         result = y.doubleValue(); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 92,99
public XYDatasetSelectionState getSelectionState() { [EOL]     return this.selectionState; [EOL] } <line_num>: 116,118
public void setSelectionState(XYDatasetSelectionState state) { [EOL]     this.selectionState = state; [EOL]     fireDatasetChanged(new DatasetChangeInfo()); [EOL] } <line_num>: 127,131
