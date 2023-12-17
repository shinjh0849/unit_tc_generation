public EnumUtils()
public static Map<String, E> getEnumMap(final Class<E> enumClass)
public static List<E> getEnumList(final Class<E> enumClass)
public static boolean isValidEnum(final Class<E> enumClass, final String enumName)
public static E getEnum(final Class<E> enumClass, final String enumName)
public static long generateBitVector(final Class<E> enumClass, final Iterable<E> values)
public static long[] generateBitVectors(final Class<E> enumClass, final Iterable<E> values)
public static long generateBitVector(final Class<E> enumClass, final E... values)
public static long[] generateBitVectors(final Class<E> enumClass, final E... values)
public static EnumSet<E> processBitVector(final Class<E> enumClass, final long value)
public static EnumSet<E> processBitVectors(final Class<E> enumClass, long... values)
private static Class<E> checkBitVectorable(final Class<E> enumClass)
private static Class<E> asEnum(final Class<E> enumClass)
String NULL_ELEMENTS_NOT_PERMITTED=Optional["null elements not permitted"]
String CANNOT_STORE_S_S_VALUES_IN_S_BITS=Optional["Cannot store %s %s values in %s bits"]
String S_DOES_NOT_SEEM_TO_BE_AN_ENUM_TYPE=Optional["%s does not seem to be an Enum type"]
String ENUM_CLASS_MUST_BE_DEFINED=Optional["EnumClass must be defined."]
