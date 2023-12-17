public SumOfSquares() { [EOL]     n = 0; [EOL]     value = 0; [EOL] } <line_num>: 56,59
public SumOfSquares(SumOfSquares original) throws NullArgumentException { [EOL]     copy(original, this); [EOL] } <line_num>: 68,70
@Override [EOL] public void increment(final double d) { [EOL]     value += d * d; [EOL]     n++; [EOL] } <line_num>: 75,79
@Override [EOL] public double getResult() { [EOL]     return value; [EOL] } <line_num>: 84,87
public long getN() { [EOL]     return n; [EOL] } <line_num>: 92,94
@Override [EOL] public void clear() { [EOL]     value = 0; [EOL]     n = 0; [EOL] } <line_num>: 99,103
@Override [EOL] public double evaluate(final double[] values, final int begin, final int length) throws MathIllegalArgumentException { [EOL]     double sumSq = Double.NaN; [EOL]     if (test(values, begin, length, true)) { [EOL]         sumSq = 0.0; [EOL]         for (int i = begin; i < begin + length; i++) { [EOL]             sumSq += values[i] * values[i]; [EOL]         } [EOL]     } [EOL]     return sumSq; [EOL] } <line_num>: 119,130
@Override [EOL] public SumOfSquares copy() { [EOL]     SumOfSquares result = new SumOfSquares(); [EOL]     copy(this, result); [EOL]     return result; [EOL] } <line_num>: 135,141
public static void copy(SumOfSquares source, SumOfSquares dest) throws NullArgumentException { [EOL]     MathUtils.checkNotNull(source); [EOL]     MathUtils.checkNotNull(dest); [EOL]     dest.setData(source.getDataRef()); [EOL]     dest.n = source.n; [EOL]     dest.value = source.value; [EOL] } <line_num>: 151,158
