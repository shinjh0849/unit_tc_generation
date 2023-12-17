public SobolSequenceGenerator(final int dimension) throws OutOfRangeException
public SobolSequenceGenerator(final int dimension, final InputStream is) throws NotStrictlyPositiveException, MathParseException, IOException
private int initFromStream(final InputStream is) throws MathParseException, IOException
private void initDirectionVector(final int d, final int a, final int[] m)
public double[] nextVector()
public double[] skipTo(final int index) throws NotPositiveException
public int getNextIndex()
int BITS=Optional[52]
double SCALE=Optional[FastMath.pow(2, BITS)]
int MAX_DIMENSION=Optional[1000]
String RESOURCE_NAME=Optional["/assets/org/apache/commons/math3/random/new-joe-kuo-6.1000"]
String FILE_CHARSET=Optional["US-ASCII"]
int dimension
int count=Optional[0]
long[][] direction
long[] x
