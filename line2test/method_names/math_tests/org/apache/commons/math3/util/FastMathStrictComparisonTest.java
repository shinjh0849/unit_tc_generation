public FastMathStrictComparisonTest(Method m, Method f, Type[] types, Object[][] data) throws Exception
public void test1() throws Exception
private static boolean isNumber(Double d)
private static boolean isNumber(Float f)
private static void reportFailedResults(Method mathMethod, Object[] params, Object expected, Object actual, int[] entries)
private static void callMethods(Method mathMethod, Method fastMethod, Object[] params, int[] entries) throws IllegalAccessException, InvocationTargetException
private static void setupMethodCall(Method mathMethod, Method fastMethod, Type[] types, Object[][] valueArrays) throws Exception
public static List<Object[]> data() throws Exception
