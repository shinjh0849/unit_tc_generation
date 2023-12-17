protected BaseInterval(long startInstant, long endInstant, Chronology chrono)
protected BaseInterval(ReadableInstant start, ReadableInstant end)
protected BaseInterval(ReadableInstant start, ReadableDuration duration)
protected BaseInterval(ReadableDuration duration, ReadableInstant end)
protected BaseInterval(ReadableInstant start, ReadablePeriod period)
protected BaseInterval(ReadablePeriod period, ReadableInstant end)
protected BaseInterval(Object interval, Chronology chrono)
public Chronology getChronology()
public long getStartMillis()
public long getEndMillis()
protected void setInterval(long startInstant, long endInstant, Chronology chrono)
long serialVersionUID=Optional[576586928732749278L]
Chronology iChronology
long iStartMillis
long iEndMillis
