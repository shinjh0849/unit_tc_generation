public SumOfLogs() { [EOL]     value = 0d; [EOL]     n = 0; [EOL] } <line_num>: 65,68
public SumOfLogs(SumOfLogs original) throws NullArgumentException { [EOL]     copy(original, this); [EOL] } <line_num>: 77,79
@Override [EOL] public void increment(final double d) { [EOL]     value += FastMath.log(d); [EOL]     n++; [EOL] } <line_num>: 84,88
@Override [EOL] public double getResult() { [EOL]     return value; [EOL] } <line_num>: 93,96
public long getN() { [EOL]     return n; [EOL] } <line_num>: 101,103
@Override [EOL] public void clear() { [EOL]     value = 0d; [EOL]     n = 0; [EOL] } <line_num>: 108,112
@Override [EOL] public double evaluate(final double[] values, final int begin, final int length) throws MathIllegalArgumentException { [EOL]     double sumLog = Double.NaN; [EOL]     if (test(values, begin, length, true)) { [EOL]         sumLog = 0.0; [EOL]         for (int i = begin; i < begin + length; i++) { [EOL]             sumLog += FastMath.log(values[i]); [EOL]         } [EOL]     } [EOL]     return sumLog; [EOL] } <line_num>: 131,142
@Override [EOL] public SumOfLogs copy() { [EOL]     SumOfLogs result = new SumOfLogs(); [EOL]     copy(this, result); [EOL]     return result; [EOL] } <line_num>: 147,153
public static void copy(SumOfLogs source, SumOfLogs dest) throws NullArgumentException { [EOL]     MathUtils.checkNotNull(source); [EOL]     MathUtils.checkNotNull(dest); [EOL]     dest.setData(source.getDataRef()); [EOL]     dest.n = source.n; [EOL]     dest.value = source.value; [EOL] } <line_num>: 163,170
