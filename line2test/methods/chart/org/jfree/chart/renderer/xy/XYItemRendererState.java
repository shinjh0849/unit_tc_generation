public XYItemRendererState(PlotRenderingInfo info) { [EOL]     super(info); [EOL]     this.workingLine = new Line2D.Double(); [EOL]     this.processVisibleItemsOnly = true; [EOL]     this.crosshairState = null; [EOL] } <line_num>: 113,118
public boolean getProcessVisibleItemsOnly() { [EOL]     return this.processVisibleItemsOnly; [EOL] } <line_num>: 131,133
public void setProcessVisibleItemsOnly(boolean flag) { [EOL]     this.processVisibleItemsOnly = flag; [EOL] } <line_num>: 143,145
public int getFirstItemIndex() { [EOL]     return this.firstItemIndex; [EOL] } <line_num>: 155,157
public int getLastItemIndex() { [EOL]     return this.lastItemIndex; [EOL] } <line_num>: 167,169
public XYCrosshairState getCrosshairState() { [EOL]     return this.crosshairState; [EOL] } <line_num>: 180,182
public void setCrosshairState(XYCrosshairState state) { [EOL]     this.crosshairState = state; [EOL] } <line_num>: 193,195
public XYDatasetSelectionState getSelectionState() { [EOL]     return this.selectionState; [EOL] } <line_num>: 204,206
public void setSelectionState(XYDatasetSelectionState state) { [EOL]     this.selectionState = state; [EOL] } <line_num>: 215,217
public void startSeriesPass(XYDataset dataset, int series, int firstItem, int lastItem, int pass, int passCount) { [EOL]     this.firstItemIndex = firstItem; [EOL]     this.lastItemIndex = lastItem; [EOL] } <line_num>: 236,240
public void endSeriesPass(XYDataset dataset, int series, int firstItem, int lastItem, int pass, int passCount) { [EOL] } <line_num>: 259,262
