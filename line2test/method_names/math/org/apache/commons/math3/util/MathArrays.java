private MathArrays()
 double evaluate(double[] array)
 double evaluate(double[] array, int startIndex, int numElements)
public static double[] scale(double val, final double[] arr)
public static void scaleInPlace(double val, final double[] arr)
public static double[] ebeAdd(double[] a, double[] b) throws DimensionMismatchException
public static double[] ebeSubtract(double[] a, double[] b) throws DimensionMismatchException
public static double[] ebeMultiply(double[] a, double[] b) throws DimensionMismatchException
public static double[] ebeDivide(double[] a, double[] b) throws DimensionMismatchException
public static double distance1(double[] p1, double[] p2)
public static int distance1(int[] p1, int[] p2)
public static double distance(double[] p1, double[] p2)
public static double distance(int[] p1, int[] p2)
public static double distanceInf(double[] p1, double[] p2)
public static int distanceInf(int[] p1, int[] p2)
public static boolean isMonotonic(T[] val, OrderDirection dir, boolean strict)
public static boolean isMonotonic(double[] val, OrderDirection dir, boolean strict)
public static boolean checkOrder(double[] val, OrderDirection dir, boolean strict, boolean abort) throws NonMonotonicSequenceException
public static void checkOrder(double[] val, OrderDirection dir, boolean strict) throws NonMonotonicSequenceException
public static void checkOrder(double[] val) throws NonMonotonicSequenceException
public static void checkRectangular(final long[][] in) throws NullArgumentException, DimensionMismatchException
public static void checkPositive(final double[] in) throws NotStrictlyPositiveException
public static void checkNonNegative(final long[] in) throws NotPositiveException
public static void checkNonNegative(final long[][] in) throws NotPositiveException
public static double safeNorm(double[] v)
public static void sortInPlace(double[] x, double[]... yList) throws DimensionMismatchException, NullArgumentException
public int compare(Pair<Double, Integer> o1, Pair<Double, Integer> o2)
public int compare(Pair<Double, Integer> o1, Pair<Double, Integer> o2)
public static void sortInPlace(double[] x, final OrderDirection dir, double[]... yList) throws NullArgumentException, DimensionMismatchException
public static int[] copyOf(int[] source)
public static double[] copyOf(double[] source)
public static int[] copyOf(int[] source, int len)
public static double[] copyOf(double[] source, int len)
public static double linearCombination(final double[] a, final double[] b) throws DimensionMismatchException
public static double linearCombination(final double a1, final double b1, final double a2, final double b2)
public static double linearCombination(final double a1, final double b1, final double a2, final double b2, final double a3, final double b3)
public static double linearCombination(final double a1, final double b1, final double a2, final double b2, final double a3, final double b3, final double a4, final double b4)
public static boolean equals(float[] x, float[] y)
public static boolean equalsIncludingNaN(float[] x, float[] y)
public static boolean equals(double[] x, double[] y)
public static boolean equalsIncludingNaN(double[] x, double[] y)
public static double[] normalizeArray(double[] values, double normalizedSum) throws MathIllegalArgumentException, MathArithmeticException
public static T[] buildArray(final Field<T> field, final int length)
public static T[][] buildArray(final Field<T> field, final int rows, final int columns)
public static double[] convolve(double[] x, double[] h) throws NullArgumentException, NoDataException
public static void shuffle(int[] list, int start, Position pos)
public static void shuffle(int[] list, int start, Position pos, RandomGenerator rng)
public static void shuffle(int[] list, RandomGenerator rng)
public static void shuffle(int[] list)
