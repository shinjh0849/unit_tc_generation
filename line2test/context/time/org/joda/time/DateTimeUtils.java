protected DateTimeUtils()
 FixedMillisProvider(long fixedMillis)
 OffsetMillisProvider(long offsetMillis)
private static void put(Map<String, DateTimeZone> map, String name, String id)
public static final long currentTimeMillis()
public static final void setCurrentMillisSystem() throws SecurityException
public static final void setCurrentMillisFixed(long fixedMillis) throws SecurityException
public static final void setCurrentMillisOffset(long offsetMillis) throws SecurityException
public static final void setCurrentMillisProvider(MillisProvider millisProvider) throws SecurityException
private static void checkPermission() throws SecurityException
public static final long getInstantMillis(ReadableInstant instant)
public static final Chronology getInstantChronology(ReadableInstant instant)
public static final Chronology getIntervalChronology(ReadableInstant start, ReadableInstant end)
public static final Chronology getIntervalChronology(ReadableInterval interval)
public static final ReadableInterval getReadableInterval(ReadableInterval interval)
public static final Chronology getChronology(Chronology chrono)
public static final DateTimeZone getZone(DateTimeZone zone)
public static final PeriodType getPeriodType(PeriodType type)
public static final long getDurationMillis(ReadableDuration duration)
public static final boolean isContiguous(ReadablePartial partial)
public static final DateFormatSymbols getDateFormatSymbols(Locale locale)
public static final Map<String, DateTimeZone> getDefaultTimeZoneNames()
public static final void setDefaultTimeZoneNames(Map<String, DateTimeZone> names)
public static final double toJulianDay(long epochMillis)
public static final long toJulianDayNumber(long epochMillis)
public static final long fromJulianDay(double julianDay)
 long getMillis()
public long getMillis()
public long getMillis()
public long getMillis()
SystemMillisProvider SYSTEM_MILLIS_PROVIDER=Optional[new SystemMillisProvider()]
MillisProvider cMillisProvider=Optional[SYSTEM_MILLIS_PROVIDER]
Map<String, DateTimeZone> cZoneNames
