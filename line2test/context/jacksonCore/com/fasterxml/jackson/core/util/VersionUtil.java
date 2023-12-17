protected VersionUtil()
public Version version()
public static Version versionFor(Class<?> cls)
public static Version packageVersionFor(Class<?> cls)
private static Version doReadVersion(final Reader reader)
public static Version mavenVersionFor(ClassLoader classLoader, String groupId, String artifactId)
public static Version parseVersion(String versionStr)
public static Version parseVersion(String versionStr, String groupId, String artifactId)
protected static int parseVersionPart(String partStr)
public static final void throwInternal()
String VERSION_FILE=Optional["VERSION.txt"]
String PACKAGE_VERSION_CLASS_NAME=Optional["PackageVersion"]
Pattern VERSION_SEPARATOR=Optional[Pattern.compile("[-_./;:]")]
Version _version
