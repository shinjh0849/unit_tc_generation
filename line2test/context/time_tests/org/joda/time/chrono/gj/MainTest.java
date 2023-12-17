public MainTest(int iterations, int mode, long seed)
public static void main(String[] args) throws Exception
public void testChronology()
private void testFields(long millis, int value, long millis2)
private void testField(DateTimeField fieldA, DateTimeField fieldB, long millis, int value, long millis2)
private int getWrappedValue(int value, int minValue, int maxValue)
private void testValue(DateTimeField fieldA, DateTimeField fieldB, String method, long millis, long valueA, long valueB)
private void testMillis(DateTimeField fieldA, DateTimeField fieldB, String method, long millis, long millisA, long millisB)
private void testMillis(DateTimeField fieldA, DateTimeField fieldB, String method, long millis, long millisA, long millisB, int valueA, int valueB)
private void testBoolean(DateTimeField fieldA, DateTimeField fieldB, String method, long millis, boolean boolA, boolean boolB)
private void failValue(DateTimeField fieldA, DateTimeField fieldB, String method, long millis, long valueA, long valueB)
private void failMillis(DateTimeField fieldA, DateTimeField fieldB, String method, long millis, long millisA, long millisB)
private void failMillis(DateTimeField fieldA, DateTimeField fieldB, String method, long millis, long millisA, long millisB, int valueA, int valueB)
private void failBoolean(DateTimeField fieldA, DateTimeField fieldB, String method, long millis, boolean boolA, boolean boolB)
private String makeName(DateTimeField fieldA, DateTimeField fieldB)
private String makeDatetime(long millis)
private String makeDatetime(long millis, Chronology chrono)
private String makeDate(long millis)
private String makeDate(long millis, Chronology chrono)
private static long randomMillis(Random rnd)
private static void dump(Chronology chrono, long millis)
int GREGORIAN_MODE=Optional[0]
int JULIAN_MODE=Optional[1]
long MILLIS_PER_YEAR=Optional[(long) 365.2425 * 24 * 60 * 60 * 1000]
long _1000_YEARS=Optional[1000 * MILLIS_PER_YEAR]
long _500_YEARS=Optional[500 * MILLIS_PER_YEAR]
long MAX_MILLIS=Optional[(10000 - 1970) * MILLIS_PER_YEAR]
long MIN_MILLIS=Optional[(-10000 - 1970) * MILLIS_PER_YEAR]
long UPDATE_INTERVAL=Optional[5000]
int iIterations
int iMode
long iSeed
Chronology iTest
Chronology iActual
