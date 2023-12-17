public ClassUtils()
private static void addAbbreviation(final String primitive, final String abbreviation)
public static String getShortClassName(final Object object, final String valueIfNull)
public static String getShortClassName(final Class<?> cls)
public static String getShortClassName(String className)
public static String getSimpleName(final Class<?> cls)
public static String getSimpleName(final Object object, final String valueIfNull)
public static String getPackageName(final Object object, final String valueIfNull)
public static String getPackageName(final Class<?> cls)
public static String getPackageName(String className)
public static List<Class<?>> getAllSuperclasses(final Class<?> cls)
public static List<Class<?>> getAllInterfaces(final Class<?> cls)
private static void getAllInterfaces(Class<?> cls, final HashSet<Class<?>> interfacesFound)
public static List<Class<?>> convertClassNamesToClasses(final List<String> classNames)
public static List<String> convertClassesToClassNames(final List<Class<?>> classes)
public static boolean isAssignable(final Class<?>[] classArray, final Class<?>... toClassArray)
public static boolean isAssignable(Class<?>[] classArray, Class<?>[] toClassArray, final boolean autoboxing)
public static boolean isPrimitiveOrWrapper(final Class<?> type)
public static boolean isPrimitiveWrapper(final Class<?> type)
public static boolean isAssignable(final Class<?> cls, final Class<?> toClass)
public static boolean isAssignable(Class<?> cls, final Class<?> toClass, final boolean autoboxing)
public static Class<?> primitiveToWrapper(final Class<?> cls)
public static Class<?>[] primitivesToWrappers(final Class<?>... classes)
public static Class<?> wrapperToPrimitive(final Class<?> cls)
public static Class<?>[] wrappersToPrimitives(final Class<?>... classes)
public static boolean isInnerClass(final Class<?> cls)
public static Class<?> getClass(final ClassLoader classLoader, final String className, final boolean initialize) throws ClassNotFoundException
public static Class<?> getClass(final ClassLoader classLoader, final String className) throws ClassNotFoundException
public static Class<?> getClass(final String className) throws ClassNotFoundException
public static Class<?> getClass(final String className, final boolean initialize) throws ClassNotFoundException
public static Method getPublicMethod(final Class<?> cls, final String methodName, final Class<?>... parameterTypes) throws SecurityException, NoSuchMethodException
private static String toCanonicalName(String className)
public static Class<?>[] toClass(final Object... array)
public static String getShortCanonicalName(final Object object, final String valueIfNull)
public static String getShortCanonicalName(final Class<?> cls)
public static String getShortCanonicalName(final String canonicalName)
public static String getPackageCanonicalName(final Object object, final String valueIfNull)
public static String getPackageCanonicalName(final Class<?> cls)
public static String getPackageCanonicalName(final String canonicalName)
private static String getCanonicalName(String className)
char PACKAGE_SEPARATOR_CHAR=Optional['.']
String PACKAGE_SEPARATOR=Optional[String.valueOf(PACKAGE_SEPARATOR_CHAR)]
char INNER_CLASS_SEPARATOR_CHAR=Optional['$']
String INNER_CLASS_SEPARATOR=Optional[String.valueOf(INNER_CLASS_SEPARATOR_CHAR)]
Map<Class<?>, Class<?>> primitiveWrapperMap=Optional[new HashMap<Class<?>, Class<?>>()]
Map<Class<?>, Class<?>> wrapperPrimitiveMap=Optional[new HashMap<Class<?>, Class<?>>()]
Map<String, String> abbreviationMap=Optional[new HashMap<String, String>()]
Map<String, String> reverseAbbreviationMap=Optional[new HashMap<String, String>()]
