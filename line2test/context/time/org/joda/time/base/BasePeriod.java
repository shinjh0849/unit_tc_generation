protected BasePeriod(int years, int months, int weeks, int days, int hours, int minutes, int seconds, int millis, PeriodType type)
protected BasePeriod(long startInstant, long endInstant, PeriodType type, Chronology chrono)
protected BasePeriod(ReadableInstant startInstant, ReadableInstant endInstant, PeriodType type)
protected BasePeriod(ReadablePartial start, ReadablePartial end, PeriodType type)
protected BasePeriod(ReadableInstant startInstant, ReadableDuration duration, PeriodType type)
protected BasePeriod(ReadableDuration duration, ReadableInstant endInstant, PeriodType type)
protected BasePeriod(long duration)
protected BasePeriod(long duration, PeriodType type, Chronology chrono)
protected BasePeriod(Object period, PeriodType type, Chronology chrono)
protected BasePeriod(int[] values, PeriodType type)
public int getValue(int index)
public PeriodType getPeriodType()
protected PeriodType checkPeriodType(PeriodType type)
public PeriodType getPeriodType()
public int getValue(int index)
public Duration toDurationFrom(ReadableInstant startInstant)
public Duration toDurationTo(ReadableInstant endInstant)
private void checkAndUpdate(DurationFieldType type, int[] values, int newValue)
protected void setPeriod(ReadablePeriod period)
private void setPeriodInternal(ReadablePeriod period)
protected void setPeriod(int years, int months, int weeks, int days, int hours, int minutes, int seconds, int millis)
private int[] setPeriodInternal(int years, int months, int weeks, int days, int hours, int minutes, int seconds, int millis)
protected void setField(DurationFieldType field, int value)
protected void setFieldInto(int[] values, DurationFieldType field, int value)
protected void addField(DurationFieldType field, int value)
protected void addFieldInto(int[] values, DurationFieldType field, int value)
protected void mergePeriod(ReadablePeriod period)
protected int[] mergePeriodInto(int[] values, ReadablePeriod period)
protected void addPeriod(ReadablePeriod period)
protected int[] addPeriodInto(int[] values, ReadablePeriod period)
protected void setValue(int index, int value)
protected void setValues(int[] values)
long serialVersionUID=Optional[-2110953284060001145L]
ReadablePeriod DUMMY_PERIOD=Optional[new AbstractPeriod() {

    public int getValue(int index) {
        return 0;
    }

    public PeriodType getPeriodType() {
        return PeriodType.time();
    }
}]
PeriodType iType
int[] iValues
