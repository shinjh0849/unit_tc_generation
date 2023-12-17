public OHLCItem(RegularTimePeriod period, double open, double high, double low, double close) { [EOL]     super(period, new OHLC(open, high, low, close)); [EOL] } <line_num>: 62,65
public RegularTimePeriod getPeriod() { [EOL]     return (RegularTimePeriod) getComparable(); [EOL] } <line_num>: 72,74
public double getYValue() { [EOL]     return getCloseValue(); [EOL] } <line_num>: 81,83
public double getOpenValue() { [EOL]     OHLC ohlc = (OHLC) getObject(); [EOL]     if (ohlc != null) { [EOL]         return ohlc.getOpen(); [EOL]     } else { [EOL]         return Double.NaN; [EOL]     } [EOL] } <line_num>: 90,98
public double getHighValue() { [EOL]     OHLC ohlc = (OHLC) getObject(); [EOL]     if (ohlc != null) { [EOL]         return ohlc.getHigh(); [EOL]     } else { [EOL]         return Double.NaN; [EOL]     } [EOL] } <line_num>: 105,113
public double getLowValue() { [EOL]     OHLC ohlc = (OHLC) getObject(); [EOL]     if (ohlc != null) { [EOL]         return ohlc.getLow(); [EOL]     } else { [EOL]         return Double.NaN; [EOL]     } [EOL] } <line_num>: 120,128
public double getCloseValue() { [EOL]     OHLC ohlc = (OHLC) getObject(); [EOL]     if (ohlc != null) { [EOL]         return ohlc.getClose(); [EOL]     } else { [EOL]         return Double.NaN; [EOL]     } [EOL] } <line_num>: 135,143
