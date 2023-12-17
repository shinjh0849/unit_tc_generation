protected AbstractSeriesDataset() { [EOL]     super(); [EOL] } <line_num>: 65,67
public abstract int getSeriesCount(); <line_num>: 74,74
public abstract Comparable getSeriesKey(int series); <line_num>: 88,88
public int indexOf(Comparable seriesKey) { [EOL]     int seriesCount = getSeriesCount(); [EOL]     for (int s = 0; s < seriesCount; s++) { [EOL]         if (getSeriesKey(s).equals(seriesKey)) { [EOL]             return s; [EOL]         } [EOL]     } [EOL]     return -1; [EOL] } <line_num>: 97,105
public void seriesChanged(SeriesChangeEvent event) { [EOL]     fireDatasetChanged(new DatasetChangeInfo()); [EOL] } <line_num>: 112,116
