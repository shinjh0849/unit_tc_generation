public DefaultOHLCDataset(Comparable key, OHLCDataItem[] data) { [EOL]     this.key = key; [EOL]     this.data = data; [EOL] } <line_num>: 72,75
public Comparable getSeriesKey(int series) { [EOL]     return this.key; [EOL] } <line_num>: 84,86
public Number getX(int series, int item) { [EOL]     return new Long(this.data[item].getDate().getTime()); [EOL] } <line_num>: 96,98
public Date getXDate(int series, int item) { [EOL]     return this.data[item].getDate(); [EOL] } <line_num>: 108,110
public Number getY(int series, int item) { [EOL]     return getClose(series, item); [EOL] } <line_num>: 120,122
public Number getHigh(int series, int item) { [EOL]     return this.data[item].getHigh(); [EOL] } <line_num>: 132,134
public double getHighValue(int series, int item) { [EOL]     double result = Double.NaN; [EOL]     Number high = getHigh(series, item); [EOL]     if (high != null) { [EOL]         result = high.doubleValue(); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 145,152
public Number getLow(int series, int item) { [EOL]     return this.data[item].getLow(); [EOL] } <line_num>: 162,164
public double getLowValue(int series, int item) { [EOL]     double result = Double.NaN; [EOL]     Number low = getLow(series, item); [EOL]     if (low != null) { [EOL]         result = low.doubleValue(); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 175,182
public Number getOpen(int series, int item) { [EOL]     return this.data[item].getOpen(); [EOL] } <line_num>: 192,194
public double getOpenValue(int series, int item) { [EOL]     double result = Double.NaN; [EOL]     Number open = getOpen(series, item); [EOL]     if (open != null) { [EOL]         result = open.doubleValue(); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 205,212
public Number getClose(int series, int item) { [EOL]     return this.data[item].getClose(); [EOL] } <line_num>: 222,224
public double getCloseValue(int series, int item) { [EOL]     double result = Double.NaN; [EOL]     Number close = getClose(series, item); [EOL]     if (close != null) { [EOL]         result = close.doubleValue(); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 235,242
public Number getVolume(int series, int item) { [EOL]     return this.data[item].getVolume(); [EOL] } <line_num>: 252,254
public double getVolumeValue(int series, int item) { [EOL]     double result = Double.NaN; [EOL]     Number volume = getVolume(series, item); [EOL]     if (volume != null) { [EOL]         result = volume.doubleValue(); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 265,272
public int getSeriesCount() { [EOL]     return 1; [EOL] } <line_num>: 279,281
public int getItemCount(int series) { [EOL]     return this.data.length; [EOL] } <line_num>: 290,292
public void sortDataByDate() { [EOL]     Arrays.sort(this.data); [EOL] } <line_num>: 297,299
public boolean equals(Object obj) { [EOL]     if (this == obj) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof DefaultOHLCDataset)) { [EOL]         return false; [EOL]     } [EOL]     DefaultOHLCDataset that = (DefaultOHLCDataset) obj; [EOL]     if (!this.key.equals(that.key)) { [EOL]         return false; [EOL]     } [EOL]     if (!Arrays.equals(this.data, that.data)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 308,323
public Object clone() throws CloneNotSupportedException { [EOL]     DefaultOHLCDataset clone = (DefaultOHLCDataset) super.clone(); [EOL]     clone.data = new OHLCDataItem[this.data.length]; [EOL]     System.arraycopy(this.data, 0, clone.data, 0, this.data.length); [EOL]     return clone; [EOL] } <line_num>: 332,337
