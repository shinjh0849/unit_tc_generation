public NaturalRanking()
public NaturalRanking(TiesStrategy tiesStrategy)
public NaturalRanking(NaNStrategy nanStrategy)
public NaturalRanking(NaNStrategy nanStrategy, TiesStrategy tiesStrategy)
public NaturalRanking(RandomGenerator randomGenerator)
public NaturalRanking(NaNStrategy nanStrategy, RandomGenerator randomGenerator)
public IntDoublePair(double value, int position)
public NaNStrategy getNanStrategy()
public TiesStrategy getTiesStrategy()
public double[] rank(double[] data)
private IntDoublePair[] removeNaNs(IntDoublePair[] ranks)
private void recodeNaNs(IntDoublePair[] ranks, double value)
private boolean containsNaNs(IntDoublePair[] ranks)
private void resolveTie(double[] ranks, List<Integer> tiesTrace)
private void fill(double[] data, List<Integer> tiesTrace, double value)
private void restoreNaNs(double[] ranks, List<Integer> nanPositions)
private List<Integer> getNanPositions(IntDoublePair[] ranks)
public int compareTo(IntDoublePair other)
public double getValue()
public int getPosition()
NaNStrategy DEFAULT_NAN_STRATEGY=Optional[NaNStrategy.FAILED]
TiesStrategy DEFAULT_TIES_STRATEGY=Optional[TiesStrategy.AVERAGE]
NaNStrategy nanStrategy
TiesStrategy tiesStrategy
RandomDataGenerator randomData
