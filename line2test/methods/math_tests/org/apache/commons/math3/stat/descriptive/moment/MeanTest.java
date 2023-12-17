@Override [EOL] public UnivariateStatistic getUnivariateStatistic() { [EOL]     return new Mean(); [EOL] } <line_num>: 35,38
@Override [EOL] public double expectedValue() { [EOL]     return this.mean; [EOL] } <line_num>: 43,46
public double expectedWeightedValue() { [EOL]     return this.weightedMean; [EOL] } <line_num>: 49,51
@Test [EOL] public void testSmallSamples() { [EOL]     Mean mean = new Mean(); [EOL]     Assert.assertTrue(Double.isNaN(mean.getResult())); [EOL]     mean.increment(1d); [EOL]     Assert.assertEquals(1d, mean.getResult(), 0); [EOL] } <line_num>: 53,59
@Test [EOL] public void testWeightedMean() { [EOL]     Mean mean = new Mean(); [EOL]     Assert.assertEquals(expectedWeightedValue(), mean.evaluate(testArray, testWeightsArray, 0, testArray.length), getTolerance()); [EOL]     Assert.assertEquals(expectedValue(), mean.evaluate(testArray, identicalWeightsArray, 0, testArray.length), getTolerance()); [EOL] } <line_num>: 61,66
