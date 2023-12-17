public DividedDateTimeField(DateTimeField field, DateTimeFieldType type, int divisor)
public DividedDateTimeField(DateTimeField field, DurationField rangeField, DateTimeFieldType type, int divisor)
public DividedDateTimeField(RemainderDateTimeField remainderField, DateTimeFieldType type)
public DividedDateTimeField(RemainderDateTimeField remainderField, DurationField rangeField, DateTimeFieldType type)
public DurationField getRangeDurationField()
public int get(long instant)
public long add(long instant, int amount)
public long add(long instant, long amount)
public long addWrapField(long instant, int amount)
public int getDifference(long minuendInstant, long subtrahendInstant)
public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant)
public long set(long instant, int value)
public DurationField getDurationField()
public int getMinimumValue()
public int getMaximumValue()
public long roundFloor(long instant)
public long remainder(long instant)
public int getDivisor()
private int getRemainder(int value)
long serialVersionUID=Optional[8318475124230605365L]
int iDivisor
DurationField iDurationField
DurationField iRangeDurationField
int iMin
int iMax
