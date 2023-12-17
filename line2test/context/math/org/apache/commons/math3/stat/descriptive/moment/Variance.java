public Variance()
public Variance(final SecondMoment m2)
public Variance(boolean isBiasCorrected)
public Variance(boolean isBiasCorrected, SecondMoment m2)
public Variance(Variance original) throws NullArgumentException
public void increment(final double d)
public double getResult()
public long getN()
public void clear()
public double evaluate(final double[] values) throws MathIllegalArgumentException
public double evaluate(final double[] values, final int begin, final int length) throws MathIllegalArgumentException
public double evaluate(final double[] values, final double[] weights, final int begin, final int length) throws MathIllegalArgumentException
public double evaluate(final double[] values, final double[] weights) throws MathIllegalArgumentException
public double evaluate(final double[] values, final double mean, final int begin, final int length) throws MathIllegalArgumentException
public double evaluate(final double[] values, final double mean) throws MathIllegalArgumentException
public double evaluate(final double[] values, final double[] weights, final double mean, final int begin, final int length) throws MathIllegalArgumentException
public double evaluate(final double[] values, final double[] weights, final double mean) throws MathIllegalArgumentException
public boolean isBiasCorrected()
public void setBiasCorrected(boolean biasCorrected)
public Variance copy()
public static void copy(Variance source, Variance dest) throws NullArgumentException
long serialVersionUID=Optional[-9111962718267217978L]
SecondMoment moment=Optional[null]
boolean incMoment=Optional[true]
boolean isBiasCorrected=Optional[true]
