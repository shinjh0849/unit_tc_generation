public HaltonSequenceGenerator(final int dimension) throws OutOfRangeException
public HaltonSequenceGenerator(final int dimension, final int[] bases, final int[] weights) throws NullArgumentException, OutOfRangeException, DimensionMismatchException
public double[] nextVector()
protected int scramble(final int i, final int j, final int b, final int digit)
public double[] skipTo(final int index) throws NotPositiveException
public int getNextIndex()
int[] PRIMES=Optional[new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173 }]
int[] WEIGHTS=Optional[new int[] { 1, 2, 3, 3, 8, 11, 12, 14, 7, 18, 12, 13, 17, 18, 29, 14, 18, 43, 41, 44, 40, 30, 47, 65, 71, 28, 40, 60, 79, 89, 56, 50, 52, 61, 108, 56, 66, 63, 60, 66 }]
int dimension
int count=Optional[0]
int[] base
int[] weight
