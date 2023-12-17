public SystemUtils() { [EOL]     super(); [EOL] } <line_num>: 1456,1458
public static File getJavaHome() { [EOL]     return new File(System.getProperty(JAVA_HOME_KEY)); [EOL] } <line_num>: 1254,1256
public static File getJavaIoTmpDir() { [EOL]     return new File(System.getProperty(JAVA_IO_TMPDIR_KEY)); [EOL] } <line_num>: 1269,1271
private static boolean getJavaVersionMatches(final String versionPrefix) { [EOL]     return isJavaVersionMatch(JAVA_SPECIFICATION_VERSION, versionPrefix); [EOL] } <line_num>: 1281,1283
private static boolean getOSMatches(final String osNamePrefix, final String osVersionPrefix) { [EOL]     return isOSMatch(OS_NAME, OS_VERSION, osNamePrefix, osVersionPrefix); [EOL] } <line_num>: 1292,1294
private static boolean getOSMatchesName(final String osNamePrefix) { [EOL]     return isOSNameMatch(OS_NAME, osNamePrefix); [EOL] } <line_num>: 1302,1304
private static String getSystemProperty(final String property) { [EOL]     try { [EOL]         return System.getProperty(property); [EOL]     } catch (final SecurityException ex) { [EOL]         System.err.println("Caught a SecurityException reading the system property '" + property + "'; the SystemUtils property value will default to null."); [EOL]         return null; [EOL]     } [EOL] } <line_num>: 1319,1328
public static File getUserDir() { [EOL]     return new File(System.getProperty(USER_DIR_KEY)); [EOL] } <line_num>: 1341,1343
public static File getUserHome() { [EOL]     return new File(System.getProperty(USER_HOME_KEY)); [EOL] } <line_num>: 1356,1358
public static boolean isJavaAwtHeadless() { [EOL]     return JAVA_AWT_HEADLESS != null ? JAVA_AWT_HEADLESS.equals(Boolean.TRUE.toString()) : false; [EOL] } <line_num>: 1368,1370
public static boolean isJavaVersionAtLeast(final JavaVersion requiredVersion) { [EOL]     return JAVA_SPECIFICATION_VERSION_AS_ENUM.atLeast(requiredVersion); [EOL] } <line_num>: 1387,1389
static boolean isJavaVersionMatch(final String version, final String versionPrefix) { [EOL]     if (version == null) { [EOL]         return false; [EOL]     } [EOL]     return version.startsWith(versionPrefix); [EOL] } <line_num>: 1403,1408
static boolean isOSMatch(final String osName, final String osVersion, final String osNamePrefix, final String osVersionPrefix) { [EOL]     if (osName == null || osVersion == null) { [EOL]         return false; [EOL]     } [EOL]     return osName.startsWith(osNamePrefix) && osVersion.startsWith(osVersionPrefix); [EOL] } <line_num>: 1422,1427
static boolean isOSNameMatch(final String osName, final String osNamePrefix) { [EOL]     if (osName == null) { [EOL]         return false; [EOL]     } [EOL]     return osName.startsWith(osNamePrefix); [EOL] } <line_num>: 1439,1444
