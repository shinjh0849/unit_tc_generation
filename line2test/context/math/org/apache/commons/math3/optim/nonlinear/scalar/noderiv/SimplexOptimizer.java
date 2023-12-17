public SimplexOptimizer(ConvergenceChecker<PointValuePair> checker)
public SimplexOptimizer(double rel, double abs)
public PointValuePair optimize(OptimizationData... optData)
public double value(double[] point)
public int compare(final PointValuePair o1, final PointValuePair o2)
protected PointValuePair doOptimize()
protected void parseOptimizationData(OptimizationData... optData)
private void checkParameters()
AbstractSimplex simplex
