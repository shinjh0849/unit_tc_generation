public Minute()
public Minute(int minute, Hour hour)
public Minute(Date time)
public Minute(Date time, TimeZone zone)
public Minute(int minute, int hour, int day, int month, int year)
public Day getDay()
public Hour getHour()
public int getHourValue()
public int getMinute()
public long getFirstMillisecond()
public long getLastMillisecond()
public void peg(Calendar calendar)
public RegularTimePeriod previous()
public RegularTimePeriod next()
public long getSerialIndex()
public long getFirstMillisecond(Calendar calendar)
public long getLastMillisecond(Calendar calendar)
public boolean equals(Object obj)
public int hashCode()
public int compareTo(Object o1)
public static Minute parseMinute(String s)
long serialVersionUID=Optional[2144572840034842871L]
int FIRST_MINUTE_IN_HOUR=Optional[0]
int LAST_MINUTE_IN_HOUR=Optional[59]
Day day
byte hour
byte minute
long firstMillisecond
long lastMillisecond
