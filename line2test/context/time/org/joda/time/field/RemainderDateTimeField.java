public RemainderDateTimeField(DateTimeField field, DateTimeFieldType type, int divisor)
public RemainderDateTimeField(DateTimeField field, DurationField rangeField, DateTimeFieldType type, int divisor)
public RemainderDateTimeField(DividedDateTimeField dividedField)
public RemainderDateTimeField(DividedDateTimeField dividedField, DateTimeFieldType type)
public RemainderDateTimeField(DividedDateTimeField dividedField, DurationField durationField, DateTimeFieldType type)
public int get(long instant)
public long addWrapField(long instant, int amount)
public long set(long instant, int value)
public DurationField getDurationField()
public DurationField getRangeDurationField()
public int getMinimumValue()
public int getMaximumValue()
public long roundFloor(long instant)
public long roundCeiling(long instant)
public long roundHalfFloor(long instant)
public long roundHalfCeiling(long instant)
public long roundHalfEven(long instant)
public long remainder(long instant)
public int getDivisor()
private int getDivided(int value)
long serialVersionUID=Optional[5708241235177666790L]
int iDivisor
DurationField iDurationField
DurationField iRangeField
