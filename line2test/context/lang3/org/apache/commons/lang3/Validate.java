public Validate()
public static void isTrue(final boolean expression, final String message, final long value)
public static void isTrue(final boolean expression, final String message, final double value)
public static void isTrue(final boolean expression, final String message, final Object... values)
public static void isTrue(final boolean expression)
public static T notNull(final T object)
public static T notNull(final T object, final String message, final Object... values)
public static T[] notEmpty(final T[] array, final String message, final Object... values)
public static T[] notEmpty(final T[] array)
public static T notEmpty(final T collection, final String message, final Object... values)
public static T notEmpty(final T collection)
public static T notEmpty(final T map, final String message, final Object... values)
public static T notEmpty(final T map)
public static T notEmpty(final T chars, final String message, final Object... values)
public static T notEmpty(final T chars)
public static T notBlank(final T chars, final String message, final Object... values)
public static T notBlank(final T chars)
public static T[] noNullElements(final T[] array, final String message, final Object... values)
public static T[] noNullElements(final T[] array)
public static T noNullElements(final T iterable, final String message, final Object... values)
public static T noNullElements(final T iterable)
public static T[] validIndex(final T[] array, final int index, final String message, final Object... values)
public static T[] validIndex(final T[] array, final int index)
public static T validIndex(final T collection, final int index, final String message, final Object... values)
public static T validIndex(final T collection, final int index)
public static T validIndex(final T chars, final int index, final String message, final Object... values)
public static T validIndex(final T chars, final int index)
public static void validState(final boolean expression)
public static void validState(final boolean expression, final String message, final Object... values)
public static void matchesPattern(final CharSequence input, final String pattern)
public static void matchesPattern(final CharSequence input, final String pattern, final String message, final Object... values)
public static void inclusiveBetween(final T start, final T end, final Comparable<T> value)
public static void inclusiveBetween(final T start, final T end, final Comparable<T> value, final String message, final Object... values)
public static void exclusiveBetween(final T start, final T end, final Comparable<T> value)
public static void exclusiveBetween(final T start, final T end, final Comparable<T> value, final String message, final Object... values)
public static void isInstanceOf(final Class<?> type, final Object obj)
public static void isInstanceOf(final Class<?> type, final Object obj, final String message, final Object... values)
public static void isAssignableFrom(final Class<?> superType, final Class<?> type)
public static void isAssignableFrom(final Class<?> superType, final Class<?> type, final String message, final Object... values)
String DEFAULT_EXCLUSIVE_BETWEEN_EX_MESSAGE=Optional["The value %s is not in the specified exclusive range of %s to %s"]
String DEFAULT_INCLUSIVE_BETWEEN_EX_MESSAGE=Optional["The value %s is not in the specified inclusive range of %s to %s"]
String DEFAULT_MATCHES_PATTERN_EX=Optional["The string %s does not match the pattern %s"]
String DEFAULT_IS_NULL_EX_MESSAGE=Optional["The validated object is null"]
String DEFAULT_IS_TRUE_EX_MESSAGE=Optional["The validated expression is false"]
String DEFAULT_NO_NULL_ELEMENTS_ARRAY_EX_MESSAGE=Optional["The validated array contains null element at index: %d"]
String DEFAULT_NO_NULL_ELEMENTS_COLLECTION_EX_MESSAGE=Optional["The validated collection contains null element at index: %d"]
String DEFAULT_NOT_BLANK_EX_MESSAGE=Optional["The validated character sequence is blank"]
String DEFAULT_NOT_EMPTY_ARRAY_EX_MESSAGE=Optional["The validated array is empty"]
String DEFAULT_NOT_EMPTY_CHAR_SEQUENCE_EX_MESSAGE=Optional["The validated character sequence is empty"]
String DEFAULT_NOT_EMPTY_COLLECTION_EX_MESSAGE=Optional["The validated collection is empty"]
String DEFAULT_NOT_EMPTY_MAP_EX_MESSAGE=Optional["The validated map is empty"]
String DEFAULT_VALID_INDEX_ARRAY_EX_MESSAGE=Optional["The validated array index is invalid: %d"]
String DEFAULT_VALID_INDEX_CHAR_SEQUENCE_EX_MESSAGE=Optional["The validated character sequence index is invalid: %d"]
String DEFAULT_VALID_INDEX_COLLECTION_EX_MESSAGE=Optional["The validated collection index is invalid: %d"]
String DEFAULT_VALID_STATE_EX_MESSAGE=Optional["The validated state is false"]
String DEFAULT_IS_ASSIGNABLE_EX_MESSAGE=Optional["Cannot assign a %s to a %s"]
String DEFAULT_IS_INSTANCE_OF_EX_MESSAGE=Optional["Expected type: %s, actual: %s"]
