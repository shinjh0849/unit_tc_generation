private CachedDateTimeZone(DateTimeZone zone)
 Info(DateTimeZone zone, long periodStart)
public static CachedDateTimeZone forZone(DateTimeZone zone)
public DateTimeZone getUncachedZone()
public String getNameKey(long instant)
public int getOffset(long instant)
public int getStandardOffset(long instant)
public boolean isFixed()
public long nextTransition(long instant)
public long previousTransition(long instant)
public int hashCode()
public boolean equals(Object obj)
private Info getInfo(long millis)
private Info createInfo(long millis)
public String getNameKey(long millis)
public int getOffset(long millis)
public int getStandardOffset(long millis)
long serialVersionUID=Optional[5472298452022250685L]
int cInfoCacheMask
DateTimeZone iZone
Info[] iInfoCache=Optional[new Info[cInfoCacheMask + 1]]
