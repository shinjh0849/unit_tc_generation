public StandardDeviation() { [EOL]     variance = new Variance(); [EOL] } <line_num>: 57,59
public StandardDeviation(final SecondMoment m2) { [EOL]     variance = new Variance(m2); [EOL] } <line_num>: 66,68
public StandardDeviation(StandardDeviation original) throws NullArgumentException { [EOL]     copy(original, this); [EOL] } <line_num>: 77,79
public StandardDeviation(boolean isBiasCorrected) { [EOL]     variance = new Variance(isBiasCorrected); [EOL] } <line_num>: 91,93
public StandardDeviation(boolean isBiasCorrected, SecondMoment m2) { [EOL]     variance = new Variance(isBiasCorrected, m2); [EOL] } <line_num>: 106,108
@Override [EOL] public void increment(final double d) { [EOL]     variance.increment(d); [EOL] } <line_num>: 113,116
public long getN() { [EOL]     return variance.getN(); [EOL] } <line_num>: 121,123
@Override [EOL] public double getResult() { [EOL]     return FastMath.sqrt(variance.getResult()); [EOL] } <line_num>: 128,131
@Override [EOL] public void clear() { [EOL]     variance.clear(); [EOL] } <line_num>: 136,139
@Override [EOL] public double evaluate(final double[] values) throws MathIllegalArgumentException { [EOL]     return FastMath.sqrt(variance.evaluate(values)); [EOL] } <line_num>: 155,158
@Override [EOL] public double evaluate(final double[] values, final int begin, final int length) throws MathIllegalArgumentException { [EOL]     return FastMath.sqrt(variance.evaluate(values, begin, length)); [EOL] } <line_num>: 178,182
public double evaluate(final double[] values, final double mean, final int begin, final int length) throws MathIllegalArgumentException { [EOL]     return FastMath.sqrt(variance.evaluate(values, mean, begin, length)); [EOL] } <line_num>: 208,211
public double evaluate(final double[] values, final double mean) throws MathIllegalArgumentException { [EOL]     return FastMath.sqrt(variance.evaluate(values, mean)); [EOL] } <line_num>: 234,237
public boolean isBiasCorrected() { [EOL]     return variance.isBiasCorrected(); [EOL] } <line_num>: 242,244
public void setBiasCorrected(boolean isBiasCorrected) { [EOL]     variance.setBiasCorrected(isBiasCorrected); [EOL] } <line_num>: 249,251
@Override [EOL] public StandardDeviation copy() { [EOL]     StandardDeviation result = new StandardDeviation(); [EOL]     copy(this, result); [EOL]     return result; [EOL] } <line_num>: 256,262
public static void copy(StandardDeviation source, StandardDeviation dest) throws NullArgumentException { [EOL]     MathUtils.checkNotNull(source); [EOL]     MathUtils.checkNotNull(dest); [EOL]     dest.setData(source.getDataRef()); [EOL]     dest.variance = source.variance.copy(); [EOL] } <line_num>: 273,279
