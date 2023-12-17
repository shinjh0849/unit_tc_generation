public Millisecond()
public Millisecond(int millisecond, Second second)
public Millisecond(int millisecond, int second, int minute, int hour, int day, int month, int year)
public Millisecond(Date time)
public Millisecond(Date time, TimeZone zone)
public Second getSecond()
public long getMillisecond()
public long getFirstMillisecond()
public long getLastMillisecond()
public void peg(Calendar calendar)
public RegularTimePeriod previous()
public RegularTimePeriod next()
public long getSerialIndex()
public boolean equals(Object obj)
public int hashCode()
public int compareTo(Object obj)
public long getFirstMillisecond(Calendar calendar)
public long getLastMillisecond(Calendar calendar)
long serialVersionUID=Optional[-5316836467277638485L]
int FIRST_MILLISECOND_IN_SECOND=Optional[0]
int LAST_MILLISECOND_IN_SECOND=Optional[999]
Day day
byte hour
byte minute
byte second
int millisecond
long firstMillisecond
