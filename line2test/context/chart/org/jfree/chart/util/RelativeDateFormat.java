public RelativeDateFormat()
public RelativeDateFormat(Date time)
public RelativeDateFormat(long baseMillis)
public long getBaseMillis()
public void setBaseMillis(long baseMillis)
public boolean getShowZeroDays()
public void setShowZeroDays(boolean show)
public boolean getShowZeroHours()
public void setShowZeroHours(boolean show)
public String getPositivePrefix()
public void setPositivePrefix(String prefix)
public void setDayFormatter(NumberFormat formatter)
public String getDaySuffix()
public void setDaySuffix(String suffix)
public void setHourFormatter(NumberFormat formatter)
public String getHourSuffix()
public void setHourSuffix(String suffix)
public void setMinuteFormatter(NumberFormat formatter)
public String getMinuteSuffix()
public void setMinuteSuffix(String suffix)
public String getSecondSuffix()
public void setSecondSuffix(String suffix)
public void setSecondFormatter(NumberFormat formatter)
public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition)
public Date parse(String source, ParsePosition pos)
public boolean equals(Object obj)
public int hashCode()
public Object clone()
public static void main(String[] args)
long baseMillis
boolean showZeroDays
boolean showZeroHours
NumberFormat dayFormatter
String positivePrefix
String daySuffix
NumberFormat hourFormatter
String hourSuffix
NumberFormat minuteFormatter
String minuteSuffix
NumberFormat secondFormatter
String secondSuffix
long MILLISECONDS_IN_ONE_HOUR=Optional[60 * 60 * 1000L]
long MILLISECONDS_IN_ONE_DAY=Optional[24 * MILLISECONDS_IN_ONE_HOUR]
