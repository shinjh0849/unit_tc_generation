public SpearmansCorrelation()
public SpearmansCorrelation(final RankingAlgorithm rankingAlgorithm)
public SpearmansCorrelation(final RealMatrix dataMatrix)
public SpearmansCorrelation(final RealMatrix dataMatrix, final RankingAlgorithm rankingAlgorithm)
public RealMatrix getCorrelationMatrix()
public PearsonsCorrelation getRankCorrelation()
public RealMatrix computeCorrelationMatrix(final RealMatrix matrix)
public RealMatrix computeCorrelationMatrix(final double[][] matrix)
public double correlation(final double[] xArray, final double[] yArray)
private RealMatrix rankTransform(final RealMatrix matrix)
private List<Integer> getNaNPositions(final double[] input)
private double[] removeValues(final double[] input, final Set<Integer> indices)
RealMatrix data
RankingAlgorithm rankingAlgorithm
PearsonsCorrelation rankCorrelation
