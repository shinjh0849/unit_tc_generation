public AbstractPieDataset() { [EOL]     super(); [EOL] } <line_num>: 64,66
public PieDatasetSelectionState getSelectionState() { [EOL]     return this.selectionState; [EOL] } <line_num>: 76,78
public void setSelectionState(PieDatasetSelectionState state) { [EOL]     this.selectionState = state; [EOL]     fireDatasetChanged(new DatasetChangeInfo()); [EOL] } <line_num>: 87,91
