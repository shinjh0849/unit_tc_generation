public OHLCSeries(Comparable key) { [EOL]     super(key, true, false); [EOL] } <line_num>: 64,66
public RegularTimePeriod getPeriod(int index) { [EOL]     OHLCItem item = (OHLCItem) getDataItem(index); [EOL]     return item.getPeriod(); [EOL] } <line_num>: 75,78
public ComparableObjectItem getDataItem(int index) { [EOL]     return super.getDataItem(index); [EOL] } <line_num>: 87,89
public void add(RegularTimePeriod period, double open, double high, double low, double close) { [EOL]     if (getItemCount() > 0) { [EOL]         OHLCItem item0 = (OHLCItem) this.getDataItem(0); [EOL]         if (!period.getClass().equals(item0.getPeriod().getClass())) { [EOL]             throw new IllegalArgumentException("Can't mix RegularTimePeriod class types."); [EOL]         } [EOL]     } [EOL]     super.add(new OHLCItem(period, open, high, low, close), true); [EOL] } <line_num>: 100,110
public ComparableObjectItem remove(int index) { [EOL]     return super.remove(index); [EOL] } <line_num>: 119,121
