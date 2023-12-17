public StandardDeviation()
public StandardDeviation(final SecondMoment m2)
public StandardDeviation(StandardDeviation original) throws NullArgumentException
public StandardDeviation(boolean isBiasCorrected)
public StandardDeviation(boolean isBiasCorrected, SecondMoment m2)
public void increment(final double d)
public long getN()
public double getResult()
public void clear()
public double evaluate(final double[] values) throws MathIllegalArgumentException
public double evaluate(final double[] values, final int begin, final int length) throws MathIllegalArgumentException
public double evaluate(final double[] values, final double mean, final int begin, final int length) throws MathIllegalArgumentException
public double evaluate(final double[] values, final double mean) throws MathIllegalArgumentException
public boolean isBiasCorrected()
public void setBiasCorrected(boolean isBiasCorrected)
public StandardDeviation copy()
public static void copy(StandardDeviation source, StandardDeviation dest) throws NullArgumentException
