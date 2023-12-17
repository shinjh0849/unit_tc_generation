public LogFormat()
public LogFormat(double base, String baseLabel, boolean showBase)
public LogFormat(double base, String baseLabel, String powerLabel, boolean showBase)
public NumberFormat getExponentFormat()
public void setExponentFormat(NumberFormat format)
private double calculateLog(double value)
public StringBuffer format(double number, StringBuffer toAppendTo, FieldPosition pos)
public StringBuffer format(long number, StringBuffer toAppendTo, FieldPosition pos)
public Number parse(String source, ParsePosition parsePosition)
public boolean equals(Object obj)
public Object clone()
double base
double baseLog
String baseLabel
String powerLabel
boolean showBase
NumberFormat formatter=Optional[new DecimalFormat("0.0#")]
