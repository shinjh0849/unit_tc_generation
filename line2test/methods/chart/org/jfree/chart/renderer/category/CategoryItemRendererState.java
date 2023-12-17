public CategoryItemRendererState(PlotRenderingInfo info) { [EOL]     super(info); [EOL]     this.barWidth = 0.0; [EOL]     this.seriesRunningTotal = 0.0; [EOL] } <line_num>: 89,93
public double getBarWidth() { [EOL]     return this.barWidth; [EOL] } <line_num>: 102,104
public void setBarWidth(double width) { [EOL]     this.barWidth = width; [EOL] } <line_num>: 114,116
public double getSeriesRunningTotal() { [EOL]     return this.seriesRunningTotal; [EOL] } <line_num>: 125,127
void setSeriesRunningTotal(double total) { [EOL]     this.seriesRunningTotal = total; [EOL] } <line_num>: 137,139
public CategoryCrosshairState getCrosshairState() { [EOL]     return this.crosshairState; [EOL] } <line_num>: 150,152
public void setCrosshairState(CategoryCrosshairState state) { [EOL]     this.crosshairState = state; [EOL] } <line_num>: 163,165
public int getVisibleSeriesIndex(int rowIndex) { [EOL]     if (this.visibleSeries == null) { [EOL]         return rowIndex; [EOL]     } [EOL]     int index = -1; [EOL]     for (int vRow = 0; vRow < this.visibleSeries.length; vRow++) { [EOL]         if (this.visibleSeries[vRow] == rowIndex) { [EOL]             index = vRow; [EOL]             break; [EOL]         } [EOL]     } [EOL]     return index; [EOL] } <line_num>: 179,191
public int getVisibleSeriesCount() { [EOL]     if (this.visibleSeries == null) { [EOL]         return -1; [EOL]     } [EOL]     return this.visibleSeries.length; [EOL] } <line_num>: 201,206
public int[] getVisibleSeriesArray() { [EOL]     if (this.visibleSeries == null) { [EOL]         return null; [EOL]     } [EOL]     int[] result = new int[this.visibleSeries.length]; [EOL]     System.arraycopy(this.visibleSeries, 0, result, 0, this.visibleSeries.length); [EOL]     return result; [EOL] } <line_num>: 215,223
public void setVisibleSeriesArray(int[] visibleSeries) { [EOL]     this.visibleSeries = visibleSeries; [EOL] } <line_num>: 232,234
public CategoryDatasetSelectionState getSelectionState() { [EOL]     return this.selectionState; [EOL] } <line_num>: 243,245
public void setSelectionState(CategoryDatasetSelectionState state) { [EOL]     this.selectionState = state; [EOL] } <line_num>: 254,256
