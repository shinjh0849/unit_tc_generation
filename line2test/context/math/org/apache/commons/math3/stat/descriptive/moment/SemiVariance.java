public SemiVariance()
public SemiVariance(final boolean biasCorrected)
public SemiVariance(final Direction direction)
public SemiVariance(final boolean corrected, final Direction direction)
public SemiVariance(final SemiVariance original) throws NullArgumentException
 Direction(boolean b)
public SemiVariance copy()
public static void copy(final SemiVariance source, SemiVariance dest) throws NullArgumentException
public double evaluate(final double[] values, final int start, final int length) throws MathIllegalArgumentException
public double evaluate(final double[] values, Direction direction) throws MathIllegalArgumentException
public double evaluate(final double[] values, final double cutoff) throws MathIllegalArgumentException
public double evaluate(final double[] values, final double cutoff, final Direction direction) throws MathIllegalArgumentException
public double evaluate(final double[] values, final double cutoff, final Direction direction, final boolean corrected, final int start, final int length) throws MathIllegalArgumentException
public boolean isBiasCorrected()
public void setBiasCorrected(boolean biasCorrected)
public Direction getVarianceDirection()
public void setVarianceDirection(Direction varianceDirection)
 boolean getDirection()
Direction UPSIDE_VARIANCE=Optional[Direction.UPSIDE]
Direction DOWNSIDE_VARIANCE=Optional[Direction.DOWNSIDE]
long serialVersionUID=Optional[-2653430366886024994L]
boolean biasCorrected=Optional[true]
Direction varianceDirection=Optional[Direction.DOWNSIDE]
