public Day()
public Day(int day, int month, int year)
public Day(SerialDate serialDate)
public Day(Date time)
public Day(Date time, TimeZone zone)
public SerialDate getSerialDate()
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
public int hashCode()
public int compareTo(Object o1)
public String toString()
public static Day parseDay(String s)
long serialVersionUID=Optional[-7082667380758962755L]
DateFormat DATE_FORMAT=Optional[new SimpleDateFormat("yyyy-MM-dd")]
DateFormat DATE_FORMAT_SHORT=Optional[DateFormat.getDateInstance(DateFormat.SHORT)]
DateFormat DATE_FORMAT_MEDIUM=Optional[DateFormat.getDateInstance(DateFormat.MEDIUM)]
DateFormat DATE_FORMAT_LONG=Optional[DateFormat.getDateInstance(DateFormat.LONG)]
SerialDate serialDate
long firstMillisecond
long lastMillisecond
