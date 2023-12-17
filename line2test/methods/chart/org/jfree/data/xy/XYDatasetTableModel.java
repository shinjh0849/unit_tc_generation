public XYDatasetTableModel() { [EOL]     super(); [EOL] } <line_num>: 74,76
public XYDatasetTableModel(TableXYDataset dataset) { [EOL]     this(); [EOL]     this.model = dataset; [EOL]     this.model.addChangeListener(this); [EOL] } <line_num>: 83,87
public void setModel(TableXYDataset dataset) { [EOL]     this.model = dataset; [EOL]     this.model.addChangeListener(this); [EOL]     fireTableDataChanged(); [EOL] } <line_num>: 94,98
public int getRowCount() { [EOL]     if (this.model == null) { [EOL]         return 0; [EOL]     } [EOL]     return this.model.getItemCount(); [EOL] } <line_num>: 105,110
public int getColumnCount() { [EOL]     if (this.model == null) { [EOL]         return 0; [EOL]     } [EOL]     return this.model.getSeriesCount() + 1; [EOL] } <line_num>: 117,122
public String getColumnName(int column) { [EOL]     if (this.model == null) { [EOL]         return super.getColumnName(column); [EOL]     } [EOL]     if (column < 1) { [EOL]         return "X Value"; [EOL]     } else { [EOL]         return this.model.getSeriesKey(column - 1).toString(); [EOL]     } [EOL] } <line_num>: 131,141
public Object getValueAt(int row, int column) { [EOL]     if (this.model == null) { [EOL]         return null; [EOL]     } [EOL]     if (column < 1) { [EOL]         return this.model.getX(0, row); [EOL]     } else { [EOL]         return this.model.getY(column - 1, row); [EOL]     } [EOL] } <line_num>: 152,162
public void datasetChanged(DatasetChangeEvent event) { [EOL]     fireTableDataChanged(); [EOL] } <line_num>: 171,173
public boolean isCellEditable(int row, int column) { [EOL]     return false; [EOL] } <line_num>: 183,185
public void setValueAt(Object value, int row, int column) { [EOL]     if (isCellEditable(row, column)) { [EOL]     } [EOL] } <line_num>: 194,198
