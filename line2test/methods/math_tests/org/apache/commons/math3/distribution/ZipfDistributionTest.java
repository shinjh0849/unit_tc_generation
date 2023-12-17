@Test(expected = NotStrictlyPositiveException.class) [EOL] public void testPreconditions1() { [EOL]     new ZipfDistribution(0, 1); [EOL] } <line_num>: 35,38
@Test(expected = NotStrictlyPositiveException.class) [EOL] public void testPreconditions2() { [EOL]     new ZipfDistribution(1, 0); [EOL] } <line_num>: 40,43
@Override [EOL] public IntegerDistribution makeDistribution() { [EOL]     return new ZipfDistribution(10, 1); [EOL] } <line_num>: 48,51
@Override [EOL] public int[] makeDensityTestPoints() { [EOL]     return new int[] { -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 }; [EOL] } <line_num>: 54,57
@Override [EOL] public double[] makeDensityTestValues() { [EOL]     return new double[] { 0d, 0d, 0.3414d, 0.1707d, 0.1138d, 0.0854d, 0.0683d, 0.0569d, 0.0488d, 0.0427d, 0.0379d, 0.0341d, 0d }; [EOL] } <line_num>: 60,64
@Override [EOL] public int[] makeCumulativeTestPoints() { [EOL]     return makeDensityTestPoints(); [EOL] } <line_num>: 67,70
@Override [EOL] public double[] makeCumulativeTestValues() { [EOL]     return new double[] { 0d, 0.0000d, 0.3414d, 0.5121d, 0.6259d, 0.7113d, 0.7796d, 0.8365d, 0.8852d, 0.9279d, 0.9659d, 1d, 1d }; [EOL] } <line_num>: 73,77
@Override [EOL] public double[] makeInverseCumulativeTestPoints() { [EOL]     return new double[] { 0d, 0.001d, 0.010d, 0.025d, 0.050d, 0.3413d, 0.3415d, 0.999d, 0.990d, 0.975d, 0.950d, 0.900d, 1d }; [EOL] } <line_num>: 80,84
@Override [EOL] public int[] makeInverseCumulativeTestValues() { [EOL]     return new int[] { 1, 1, 1, 1, 1, 1, 2, 10, 10, 10, 9, 8, 10 }; [EOL] } <line_num>: 87,90
@Test [EOL] public void testMoments() { [EOL]     final double tol = 1e-9; [EOL]     ZipfDistribution dist; [EOL]     dist = new ZipfDistribution(2, 0.5); [EOL]     Assert.assertEquals(dist.getNumericalMean(), FastMath.sqrt(2), tol); [EOL]     Assert.assertEquals(dist.getNumericalVariance(), 0.24264068711928521, tol); [EOL] } <line_num>: 92,100
