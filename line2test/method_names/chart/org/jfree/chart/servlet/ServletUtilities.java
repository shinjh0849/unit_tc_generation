public static String getTempFilePrefix()
public static void setTempFilePrefix(String prefix)
public static String getTempOneTimeFilePrefix()
public static void setTempOneTimeFilePrefix(String prefix)
public static String saveChartAsPNG(JFreeChart chart, int width, int height, HttpSession session) throws IOException
public static String saveChartAsPNG(JFreeChart chart, int width, int height, ChartRenderingInfo info, HttpSession session) throws IOException
public static String saveChartAsJPEG(JFreeChart chart, int width, int height, HttpSession session) throws IOException
public static String saveChartAsJPEG(JFreeChart chart, int width, int height, ChartRenderingInfo info, HttpSession session) throws IOException
protected static void createTempDir()
protected static void registerChartForDeletion(File tempFile, HttpSession session)
public static void sendTempFile(String filename, HttpServletResponse response) throws IOException
public static void sendTempFile(File file, HttpServletResponse response) throws IOException
public static void sendTempFile(File file, HttpServletResponse response, String mimeType) throws IOException
public static String searchReplace(String inputString, String searchString, String replaceString)
