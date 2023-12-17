private FastMathCalc()
private static void buildSinCosTables(double[] SINE_TABLE_A, double[] SINE_TABLE_B, double[] COSINE_TABLE_A, double[] COSINE_TABLE_B, int SINE_TABLE_LEN, double[] TANGENT_TABLE_A, double[] TANGENT_TABLE_B)
 static double slowCos(final double x, final double[] result)
 static double slowSin(final double x, final double[] result)
 static double slowexp(final double x, final double[] result)
private static void split(final double d, final double[] split)
private static void resplit(final double[] a)
private static void splitMult(double[] a, double[] b, double[] ans)
private static void splitAdd(final double[] a, final double[] b, final double[] ans)
 static void splitReciprocal(final double[] in, final double[] result)
private static void quadMult(final double[] a, final double[] b, final double[] result)
 static double expint(int p, final double[] result)
 static double[] slowLog(double xi)
 static void printarray(PrintStream out, String name, int expectedLen, double[][] array2d)
 static void printarray(PrintStream out, String name, int expectedLen, double[] array)
 static String format(double d)
private static void checkLen(int expectedLen, int actual) throws DimensionMismatchException
long HEX_40000000=Optional[0x40000000L]
double[] FACT=Optional[new double[] { // 0
+1.0d, // 1
+1.0d, // 2
+2.0d, // 3
+6.0d, // 4
+24.0d, // 5
+120.0d, // 6
+720.0d, // 7
+5040.0d, // 8
+40320.0d, // 9
+362880.0d, // 10
+3628800.0d, // 11
+39916800.0d, // 12
+479001600.0d, // 13
+6227020800.0d, // 14
+87178291200.0d, // 15
+1307674368000.0d, // 16
+20922789888000.0d, // 17
+355687428096000.0d, // 18
+6402373705728000.0d, // 19
+121645100408832000.0d }]
double[][] LN_SPLIT_COEF=Optional[{ { 2.0, 0.0 }, { 0.6666666269302368, 3.9736429850260626E-8 }, { 0.3999999761581421, 2.3841857910019882E-8 }, { 0.2857142686843872, 1.7029898543501842E-8 }, { 0.2222222089767456, 1.3245471311735498E-8 }, { 0.1818181574344635, 2.4384203044354907E-8 }, { 0.1538461446762085, 9.140260083262505E-9 }, { 0.13333332538604736, 9.220590270857665E-9 }, { 0.11764700710773468, 1.2393345855018391E-8 }, { 0.10526403784751892, 8.251545029714408E-9 }, { 0.0952233225107193, 1.2675934823758863E-8 }, { 0.08713622391223907, 1.1430250008909141E-8 }, { 0.07842259109020233, 2.404307984052299E-9 }, { 0.08371849358081818, 1.176342548272881E-8 }, { 0.030589580535888672, 1.2958646899018938E-9 }, { 0.14982303977012634, 1.225743062930824E-8 } }]
String TABLE_START_DECL=Optional["    {"]
String TABLE_END_DECL=Optional["    };"]
