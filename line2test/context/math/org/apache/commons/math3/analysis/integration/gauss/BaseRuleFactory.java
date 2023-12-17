public Pair<double[], double[]> getRule(int numberOfPoints) throws NotStrictlyPositiveException, DimensionMismatchException
protected synchronized Pair<T[], T[]> getRuleInternal(int numberOfPoints) throws DimensionMismatchException
protected void addRule(Pair<T[], T[]> rule) throws DimensionMismatchException
protected abstract Pair<T[], T[]> computeRule(int numberOfPoints) throws DimensionMismatchException
private static Pair<double[], double[]> convertToDouble(Pair<T[], T[]> rule)
Map<Integer, Pair<T[], T[]>> pointsAndWeights=Optional[new TreeMap<Integer, Pair<T[], T[]>>()]
Map<Integer, Pair<double[], double[]>> pointsAndWeightsDouble=Optional[new TreeMap<Integer, Pair<double[], double[]>>()]
