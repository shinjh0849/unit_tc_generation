private ObjectUtilities()
public static String getClassLoaderSource()
public static void setClassLoaderSource(final String classLoaderSource)
public static boolean equal(final Object o1, final Object o2)
public static int hashCode(final Object object)
public static Object clone(final Object object) throws CloneNotSupportedException
public static Collection deepClone(final Collection collection) throws CloneNotSupportedException
public static synchronized void setClassLoader(final ClassLoader classLoader)
public static ClassLoader getClassLoader()
public static synchronized ClassLoader getClassLoader(final Class c)
public static URL getResource(final String name, final Class c)
public static URL getResourceRelative(final String name, final Class c)
private static String convertName(final String name, Class c)
public static InputStream getResourceAsStream(final String name, final Class context)
public static InputStream getResourceRelativeAsStream(final String name, final Class context)
public static Object loadAndInstantiate(final String className, final Class source)
public static Object loadAndInstantiate(String className, Class source, Class type)
public static boolean isJDK14()
private static String[] parseVersions(String version)
String THREAD_CONTEXT=Optional["ThreadContext"]
String CLASS_CONTEXT=Optional["ClassContext"]
String classLoaderSource=Optional[THREAD_CONTEXT]
ClassLoader classLoader
