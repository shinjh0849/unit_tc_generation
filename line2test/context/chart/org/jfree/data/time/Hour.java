public Hour()
public Hour(int hour, Day day)
public Hour(int hour, int day, int month, int year)
public Hour(Date time)
public Hour(Date time, TimeZone zone)
public int getHour()
public Day getDay()
public int getYear()
public int getMonth()
public int getDayOfMonth()
public long getFirstMillisecond()
public long getLastMillisecond()
public void peg(Calendar calendar)
public RegularTimePeriod previous()
public RegularTimePeriod next()
public long getSerialIndex()
public long getFirstMillisecond(Calendar calendar)
public long getLastMillisecond(Calendar calendar)
public boolean equals(Object obj)
public String toString()
public int hashCode()
public int compareTo(Object o1)
public static Hour parseHour(String s)
long serialVersionUID=Optional[-835471579831937652L]
int FIRST_HOUR_IN_DAY=Optional[0]
int LAST_HOUR_IN_DAY=Optional[23]
Day day
byte hour
long firstMillisecond
long lastMillisecond
