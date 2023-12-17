public MultiStartMultivariateVectorOptimizer(final MultivariateVectorOptimizer optimizer, final int starts, final RandomVectorGenerator generator) throws NullArgumentException, NotStrictlyPositiveException
public PointVectorValuePair[] getOptima()
protected void store(PointVectorValuePair optimum)
protected void clear()
public int compare(final PointVectorValuePair o1, final PointVectorValuePair o2)
private double weightedResidual(final PointVectorValuePair pv)
private Comparator<PointVectorValuePair> getPairComparator()
