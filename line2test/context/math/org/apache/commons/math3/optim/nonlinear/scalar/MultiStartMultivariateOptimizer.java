public MultiStartMultivariateOptimizer(final MultivariateOptimizer optimizer, final int starts, final RandomVectorGenerator generator) throws NullArgumentException, NotStrictlyPositiveException
public PointValuePair[] getOptima()
protected void store(PointValuePair optimum)
protected void clear()
public int compare(final PointValuePair o1, final PointValuePair o2)
private Comparator<PointValuePair> getPairComparator()
MultivariateOptimizer optimizer
List<PointValuePair> optima=Optional[new ArrayList<PointValuePair>()]
