private Range(final T element1, final T element2, Comparator<T> comparator)
public static Range<T> is(final T element)
public static Range<T> is(final T element, final Comparator<T> comparator)
public static Range<T> between(final T fromInclusive, final T toInclusive)
public static Range<T> between(final T fromInclusive, final T toInclusive, final Comparator<T> comparator)
public T getMinimum()
public T getMaximum()
public Comparator<T> getComparator()
public boolean isNaturalOrdering()
public boolean contains(final T element)
public boolean isAfter(final T element)
public boolean isStartedBy(final T element)
public boolean isEndedBy(final T element)
public boolean isBefore(final T element)
public int elementCompareTo(final T element)
public boolean containsRange(final Range<T> otherRange)
public boolean isAfterRange(final Range<T> otherRange)
public boolean isOverlappedBy(final Range<T> otherRange)
public boolean isBeforeRange(final Range<T> otherRange)
public Range<T> intersectionWith(final Range<T> other)
public boolean equals(final Object obj)
public int hashCode()
public String toString()
public String toString(final String format)
public int compare(final Object obj1, final Object obj2)
long serialVersionUID=Optional[1L]
Comparator<T> comparator
T minimum
T maximum
int hashCode
String toString
