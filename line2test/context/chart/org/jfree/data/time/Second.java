public Second()
public Second(int second, Minute minute)
public Second(int second, int minute, int hour, int day, int month, int year)
public Second(Date time)
public Second(Date time, TimeZone zone)
public int getSecond()
public Minute getMinute()
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
public static Second parseSecond(String s)
long serialVersionUID=Optional[-6536564190712383466L]
int FIRST_SECOND_IN_MINUTE=Optional[0]
int LAST_SECOND_IN_MINUTE=Optional[59]
Day day
byte hour
byte minute
byte second
long firstMillisecond
