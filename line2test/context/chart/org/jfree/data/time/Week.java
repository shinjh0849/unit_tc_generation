public Week()
public Week(int week, int year)
public Week(int week, Year year)
public Week(Date time)
public Week(Date time, TimeZone zone)
public Week(Date time, TimeZone zone, Locale locale)
public Year getYear()
public int getYearValue()
public int getWeek()
public long getFirstMillisecond()
public long getLastMillisecond()
public void peg(Calendar calendar)
public RegularTimePeriod previous()
public RegularTimePeriod next()
public long getSerialIndex()
public long getFirstMillisecond(Calendar calendar)
public long getLastMillisecond(Calendar calendar)
public String toString()
public boolean equals(Object obj)
public int hashCode()
public int compareTo(Object o1)
public static Week parseWeek(String s)
private static int findSeparator(String s)
private static Year evaluateAsYear(String s)
private static int stringToWeek(String s)
long serialVersionUID=Optional[1856387786939865061L]
int FIRST_WEEK_IN_YEAR=Optional[1]
int LAST_WEEK_IN_YEAR=Optional[53]
short year
byte week
long firstMillisecond
long lastMillisecond
