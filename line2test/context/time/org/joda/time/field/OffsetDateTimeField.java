public OffsetDateTimeField(DateTimeField field, int offset)
public OffsetDateTimeField(DateTimeField field, DateTimeFieldType type, int offset)
public OffsetDateTimeField(DateTimeField field, DateTimeFieldType type, int offset, int minValue, int maxValue)
public int get(long instant)
public long add(long instant, int amount)
public long add(long instant, long amount)
public long addWrapField(long instant, int amount)
public long set(long instant, int value)
public boolean isLeap(long instant)
public int getLeapAmount(long instant)
public DurationField getLeapDurationField()
public int getMinimumValue()
public int getMaximumValue()
public long roundFloor(long instant)
public long roundCeiling(long instant)
public long roundHalfFloor(long instant)
public long roundHalfCeiling(long instant)
public long roundHalfEven(long instant)
public long remainder(long instant)
public int getOffset()
long serialVersionUID=Optional[3145790132623583142L]
int iOffset
int iMin
int iMax
