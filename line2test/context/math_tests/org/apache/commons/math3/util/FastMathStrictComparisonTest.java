public FastMathStrictComparisonTest(Method m, Method f, Type[] types, Object[][] data) throws Exception
public void test1() throws Exception
private static boolean isNumber(Double d)
private static boolean isNumber(Float f)
private static void reportFailedResults(Method mathMethod, Object[] params, Object expected, Object actual, int[] entries)
private static void callMethods(Method mathMethod, Method fastMethod, Object[] params, int[] entries) throws IllegalAccessException, InvocationTargetException
private static void setupMethodCall(Method mathMethod, Method fastMethod, Type[] types, Object[][] valueArrays) throws Exception
public static List<Object[]> data() throws Exception
Double[] DOUBLE_SPECIAL_VALUES=Optional[{ // 1,2
-0.0, // 1,2
+0.0, // 3
Double.NaN, // 4,5
Double.NEGATIVE_INFINITY, // 4,5
Double.POSITIVE_INFINITY, // 6,7
-Double.MAX_VALUE, // 6,7
Double.MAX_VALUE, // decreasing order of absolute value to help catch first failure
// 8,9
-Precision.EPSILON, // 8,9
Precision.EPSILON, // 10,11
-Precision.SAFE_MIN, // 10,11
Precision.SAFE_MIN, // 12,13
-Double.MIN_VALUE, // 12,13
Double.MIN_VALUE }]
Float[] FLOAT_SPECIAL_VALUES=Optional[{ // 1,2
-0.0f, // 1,2
+0.0f, // 3
Float.NaN, // 4,5
Float.NEGATIVE_INFINITY, // 4,5
Float.POSITIVE_INFINITY, // 6,7
Float.MIN_VALUE, // 6,7
Float.MAX_VALUE, // 8,9
-Float.MIN_VALUE, // 8,9
-Float.MAX_VALUE }]
Object[] LONG_SPECIAL_VALUES=Optional[{ // 1,2,3
-1, // 1,2,3
0, // 1,2,3
1, // 4,5
Long.MIN_VALUE, // 4,5
Long.MAX_VALUE }]
Object[] INT_SPECIAL_VALUES=Optional[{ // 1,2,3
-1, // 1,2,3
0, // 1,2,3
1, // 4,5
Integer.MIN_VALUE, // 4,5
Integer.MAX_VALUE }]
Method mathMethod
Method fastMethod
Type[] types
Object[][] valueArrays
