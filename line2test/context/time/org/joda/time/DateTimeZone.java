protected DateTimeZone(String id)
 Stub(String id)
public static DateTimeZone getDefault()
public static void setDefault(DateTimeZone zone) throws SecurityException
public static DateTimeZone forID(String id)
public static DateTimeZone forOffsetHours(int hoursOffset) throws IllegalArgumentException
public static DateTimeZone forOffsetHoursMinutes(int hoursOffset, int minutesOffset) throws IllegalArgumentException
public static DateTimeZone forOffsetMillis(int millisOffset)
public static DateTimeZone forTimeZone(TimeZone zone)
private static synchronized DateTimeZone fixedOffsetZone(String id, int offset)
public static Set<String> getAvailableIDs()
public static Provider getProvider()
public static void setProvider(Provider provider) throws SecurityException
private static void setProvider0(Provider provider)
private static Provider getDefaultProvider()
public static NameProvider getNameProvider()
public static void setNameProvider(NameProvider nameProvider) throws SecurityException
private static void setNameProvider0(NameProvider nameProvider)
private static NameProvider getDefaultNameProvider()
private static synchronized String getConvertedId(String id)
public DateTimeZone getZone()
public Chronology withUTC()
public Chronology withZone(DateTimeZone zone)
public String toString()
private static int parseOffset(String str)
private static String printOffset(int offset)
private static synchronized DateTimeFormatter offsetFormatter()
public final String getID()
public abstract String getNameKey(long instant)
public final String getShortName(long instant)
public String getShortName(long instant, Locale locale)
public final String getName(long instant)
public String getName(long instant, Locale locale)
public abstract int getOffset(long instant)
public final int getOffset(ReadableInstant instant)
public abstract int getStandardOffset(long instant)
public boolean isStandardOffset(long instant)
public int getOffsetFromLocal(long instantLocal)
public long convertUTCToLocal(long instantUTC)
public long convertLocalToUTC(long instantLocal, boolean strict, long originalInstantUTC)
public long convertLocalToUTC(long instantLocal, boolean strict)
public long getMillisKeepLocal(DateTimeZone newZone, long oldInstant)
public boolean isLocalDateTimeGap(LocalDateTime localDateTime)
public long adjustOffset(long instant, boolean earlierOrLater)
public abstract boolean isFixed()
public abstract long nextTransition(long instant)
public abstract long previousTransition(long instant)
public java.util.TimeZone toTimeZone()
public abstract boolean equals(Object object)
public int hashCode()
public String toString()
protected Object writeReplace() throws ObjectStreamException
private void writeObject(ObjectOutputStream out) throws IOException
private void readObject(ObjectInputStream in) throws IOException
private Object readResolve() throws ObjectStreamException
long serialVersionUID=Optional[5546345482340108586L]
DateTimeZone UTC=Optional[new FixedDateTimeZone("UTC", "UTC", 0, 0)]
int MAX_MILLIS=Optional[(86400 * 1000) - 1]
Provider cProvider
NameProvider cNameProvider
Set<String> cAvailableIDs
DateTimeZone cDefault
DateTimeFormatter cOffsetFormatter
Map<String, SoftReference<DateTimeZone>> iFixedOffsetCache
Map<String, String> cZoneIdConversion
String iID
