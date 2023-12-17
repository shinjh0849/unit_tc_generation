public SobolSequenceGenerator(final int dimension) throws OutOfRangeException
public SobolSequenceGenerator(final int dimension, final InputStream is) throws NotStrictlyPositiveException, MathParseException, IOException
private int initFromStream(final InputStream is) throws MathParseException, IOException
private void initDirectionVector(final int d, final int a, final int[] m)
public double[] nextVector()
public double[] skipTo(final int index) throws NotPositiveException
public int getNextIndex()
