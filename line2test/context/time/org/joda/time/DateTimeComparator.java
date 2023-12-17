protected DateTimeComparator(DateTimeFieldType lowerLimit, DateTimeFieldType upperLimit)
public static DateTimeComparator getInstance()
public static DateTimeComparator getInstance(DateTimeFieldType lowerLimit)
public static DateTimeComparator getInstance(DateTimeFieldType lowerLimit, DateTimeFieldType upperLimit)
public static DateTimeComparator getDateOnlyInstance()
public static DateTimeComparator getTimeOnlyInstance()
public DateTimeFieldType getLowerLimit()
public DateTimeFieldType getUpperLimit()
public int compare(Object lhsObj, Object rhsObj)
private Object readResolve()
public boolean equals(Object object)
public int hashCode()
public String toString()
long serialVersionUID=Optional[-6097339773320178364L]
DateTimeComparator ALL_INSTANCE=Optional[new DateTimeComparator(null, null)]
DateTimeComparator DATE_INSTANCE=Optional[new DateTimeComparator(DateTimeFieldType.dayOfYear(), null)]
DateTimeComparator TIME_INSTANCE=Optional[new DateTimeComparator(null, DateTimeFieldType.dayOfYear())]
DateTimeFieldType iLowerLimit
DateTimeFieldType iUpperLimit
