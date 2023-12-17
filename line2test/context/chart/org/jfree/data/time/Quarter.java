public Quarter()
public Quarter(int quarter, int year)
public Quarter(int quarter, Year year)
public Quarter(Date time)
public Quarter(Date time, TimeZone zone)
public Quarter(Date time, TimeZone zone, Locale locale)
public int getQuarter()
public Year getYear()
public int getYearValue()
public long getFirstMillisecond()
public long getLastMillisecond()
public void peg(Calendar calendar)
public RegularTimePeriod previous()
public RegularTimePeriod next()
public long getSerialIndex()
public boolean equals(Object obj)
public int hashCode()
public int compareTo(Object o1)
public String toString()
public long getFirstMillisecond(Calendar calendar)
public long getLastMillisecond(Calendar calendar)
public static Quarter parseQuarter(String s)
long serialVersionUID=Optional[3810061714380888671L]
int FIRST_QUARTER=Optional[1]
int LAST_QUARTER=Optional[4]
int[] FIRST_MONTH_IN_QUARTER=Optional[{ 0, MonthConstants.JANUARY, MonthConstants.APRIL, MonthConstants.JULY, MonthConstants.OCTOBER }]
int[] LAST_MONTH_IN_QUARTER=Optional[{ 0, MonthConstants.MARCH, MonthConstants.JUNE, MonthConstants.SEPTEMBER, MonthConstants.DECEMBER }]
short year
byte quarter
long firstMillisecond
long lastMillisecond
