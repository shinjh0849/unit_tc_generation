public DatasetChangeEvent(Object source, Dataset dataset, DatasetChangeInfo info) { [EOL]     super(source); [EOL]     if (info == null) { [EOL]         throw new IllegalArgumentException("Null 'info' argument."); [EOL]     } [EOL]     this.dataset = dataset; [EOL]     this.info = info; [EOL] } <line_num>: 85,93
public Dataset getDataset() { [EOL]     return this.dataset; [EOL] } <line_num>: 102,104
public DatasetChangeInfo getInfo() { [EOL]     return this.info; [EOL] } <line_num>: 113,115
