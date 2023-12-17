public AbstractCategoryDataset() { [EOL]     super(); [EOL] } <line_num>: 63,65
public CategoryDatasetSelectionState getSelectionState() { [EOL]     return this.selectionState; [EOL] } <line_num>: 75,77
public void setSelectionState(CategoryDatasetSelectionState state) { [EOL]     this.selectionState = state; [EOL]     fireDatasetChanged(new DatasetChangeInfo()); [EOL] } <line_num>: 86,90
