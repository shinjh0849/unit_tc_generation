public DiceDistribution() { [EOL]     super(null); [EOL] } <line_num>: 67,69
@Test [EOL] public void testCumulativeProbabilitiesSingleArguments() { [EOL]     for (int i = 1; i < 7; i++) { [EOL]         Assert.assertEquals(p * i, diceDistribution.cumulativeProbability(i), Double.MIN_VALUE); [EOL]     } [EOL]     Assert.assertEquals(0.0, diceDistribution.cumulativeProbability(0), Double.MIN_VALUE); [EOL]     Assert.assertEquals(1.0, diceDistribution.cumulativeProbability(7), Double.MIN_VALUE); [EOL] } <line_num>: 31,41
@Test [EOL] public void testCumulativeProbabilitiesRangeArguments() { [EOL]     int lower = 0; [EOL]     int upper = 6; [EOL]     for (int i = 0; i < 2; i++) { [EOL]         Assert.assertEquals(1 - p * 2 * i, diceDistribution.cumulativeProbability(lower, upper), 1E-12); [EOL]         lower++; [EOL]         upper--; [EOL]     } [EOL]     for (int i = 0; i < 6; i++) { [EOL]         Assert.assertEquals(p, diceDistribution.cumulativeProbability(i, i + 1), 1E-12); [EOL]     } [EOL] } <line_num>: 43,57
public double probability(int x) { [EOL]     if (x < 1 || x > 6) { [EOL]         return 0; [EOL]     } else { [EOL]         return p; [EOL]     } [EOL] } <line_num>: 71,77
public double cumulativeProbability(int x) { [EOL]     if (x < 1) { [EOL]         return 0; [EOL]     } else if (x >= 6) { [EOL]         return 1; [EOL]     } else { [EOL]         return p * x; [EOL]     } [EOL] } <line_num>: 79,87
public double getNumericalMean() { [EOL]     return 3.5; [EOL] } <line_num>: 89,91
public double getNumericalVariance() { [EOL]     return 12.5 - 3.5 * 3.5; [EOL] } <line_num>: 93,95
public int getSupportLowerBound() { [EOL]     return 1; [EOL] } <line_num>: 97,99
public int getSupportUpperBound() { [EOL]     return 6; [EOL] } <line_num>: 101,103
public final boolean isSupportConnected() { [EOL]     return true; [EOL] } <line_num>: 105,107
