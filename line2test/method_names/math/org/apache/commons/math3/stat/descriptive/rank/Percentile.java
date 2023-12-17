public Percentile()
public Percentile(final double p) throws MathIllegalArgumentException
public Percentile(Percentile original) throws NullArgumentException
public void setData(final double[] values)
public void setData(final double[] values, final int begin, final int length) throws MathIllegalArgumentException
public double evaluate(final double p) throws MathIllegalArgumentException
public double evaluate(final double[] values, final double p) throws MathIllegalArgumentException
public double evaluate(final double[] values, final int start, final int length) throws MathIllegalArgumentException
public double evaluate(final double[] values, final int begin, final int length, final double p) throws MathIllegalArgumentException
private double select(final double[] work, final int[] pivotsHeap, final int k)
 int medianOf3(final double[] work, final int begin, final int end)
private int partition(final double[] work, final int begin, final int end, final int pivot)
private void insertionSort(final double[] work, final int begin, final int end)
public double getQuantile()
public void setQuantile(final double p) throws MathIllegalArgumentException
public Percentile copy()
public static void copy(Percentile source, Percentile dest) throws NullArgumentException
