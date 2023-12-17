public DefaultHighLowDataset(Comparable seriesKey, Date[] date, double[] high, double[] low, double[] open, double[] close, double[] volume)
public Comparable getSeriesKey(int series)
public Number getX(int series, int item)
public Date getXDate(int series, int item)
public Number getY(int series, int item)
public Number getHigh(int series, int item)
public double getHighValue(int series, int item)
public Number getLow(int series, int item)
public double getLowValue(int series, int item)
public Number getOpen(int series, int item)
public double getOpenValue(int series, int item)
public Number getClose(int series, int item)
public double getCloseValue(int series, int item)
public Number getVolume(int series, int item)
public double getVolumeValue(int series, int item)
public int getSeriesCount()
public int getItemCount(int series)
public boolean equals(Object obj)
public static Number[] createNumberArray(double[] data)
public boolean isSelected(int series, int item)
public void setSelected(int series, int item, boolean selected)
public void setSelected(int series, int item, boolean selected, boolean notify)
public void fireSelectionEvent()
public void clearSelection()
Comparable seriesKey
Date[] date
Number[] high
Number[] low
Number[] open
Number[] close
Number[] volume
boolean[] selected
