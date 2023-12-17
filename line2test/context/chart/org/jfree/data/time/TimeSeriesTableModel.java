public TimeSeriesTableModel()
public TimeSeriesTableModel(TimeSeries series)
public TimeSeriesTableModel(TimeSeries series, boolean editable)
public int getColumnCount()
public Class getColumnClass(int column)
public String getColumnName(int column)
public int getRowCount()
public Object getValueAt(int row, int column)
public boolean isCellEditable(int row, int column)
public void setValueAt(Object value, int row, int column)
public void seriesChanged(SeriesChangeEvent event)
TimeSeries series
boolean editable
RegularTimePeriod newTimePeriod
Number newValue
