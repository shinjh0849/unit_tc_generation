protected PeriodType(String name, DurationFieldType[] types, int[] indices)
public static PeriodType standard()
public static PeriodType yearMonthDayTime()
public static PeriodType yearMonthDay()
public static PeriodType yearWeekDayTime()
public static PeriodType yearWeekDay()
public static PeriodType yearDayTime()
public static PeriodType yearDay()
public static PeriodType dayTime()
public static PeriodType time()
public static PeriodType years()
public static PeriodType months()
public static PeriodType weeks()
public static PeriodType days()
public static PeriodType hours()
public static PeriodType minutes()
public static PeriodType seconds()
public static PeriodType millis()
public static synchronized PeriodType forFields(DurationFieldType[] types)
public String getName()
public int size()
public DurationFieldType getFieldType(int index)
public boolean isSupported(DurationFieldType type)
public int indexOf(DurationFieldType type)
public String toString()
 int getIndexedField(ReadablePeriod period, int index)
 boolean setIndexedField(ReadablePeriod period, int index, int[] values, int newValue)
 boolean addIndexedField(ReadablePeriod period, int index, int[] values, int valueToAdd)
public PeriodType withYearsRemoved()
public PeriodType withMonthsRemoved()
public PeriodType withWeeksRemoved()
public PeriodType withDaysRemoved()
public PeriodType withHoursRemoved()
public PeriodType withMinutesRemoved()
public PeriodType withSecondsRemoved()
public PeriodType withMillisRemoved()
private PeriodType withFieldRemoved(int indicesIndex, String name)
public boolean equals(Object obj)
public int hashCode()
long serialVersionUID=Optional[2274324892792009998L]
Map<PeriodType, Object> cTypes=Optional[new HashMap<PeriodType, Object>(32)]
int YEAR_INDEX=Optional[0]
int MONTH_INDEX=Optional[1]
int WEEK_INDEX=Optional[2]
int DAY_INDEX=Optional[3]
int HOUR_INDEX=Optional[4]
int MINUTE_INDEX=Optional[5]
int SECOND_INDEX=Optional[6]
int MILLI_INDEX=Optional[7]
PeriodType cStandard
PeriodType cYMDTime
PeriodType cYMD
PeriodType cYWDTime
PeriodType cYWD
PeriodType cYDTime
PeriodType cYD
PeriodType cDTime
PeriodType cTime
PeriodType cYears
PeriodType cMonths
PeriodType cWeeks
PeriodType cDays
PeriodType cHours
PeriodType cMinutes
PeriodType cSeconds
PeriodType cMillis
String iName
DurationFieldType[] iTypes
int[] iIndices
