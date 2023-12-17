public Sum() { [EOL]     n = 0; [EOL]     value = 0; [EOL] } <line_num>: 57,60
public Sum(Sum original) throws NullArgumentException { [EOL]     copy(original, this); [EOL] } <line_num>: 69,71
@Override [EOL] public void increment(final double d) { [EOL]     value += d; [EOL]     n++; [EOL] } <line_num>: 76,80
@Override [EOL] public double getResult() { [EOL]     return value; [EOL] } <line_num>: 85,88
public long getN() { [EOL]     return n; [EOL] } <line_num>: 93,95
@Override [EOL] public void clear() { [EOL]     value = 0; [EOL]     n = 0; [EOL] } <line_num>: 100,104
@Override [EOL] public double evaluate(final double[] values, final int begin, final int length) throws MathIllegalArgumentException { [EOL]     double sum = Double.NaN; [EOL]     if (test(values, begin, length, true)) { [EOL]         sum = 0.0; [EOL]         for (int i = begin; i < begin + length; i++) { [EOL]             sum += values[i]; [EOL]         } [EOL]     } [EOL]     return sum; [EOL] } <line_num>: 120,131
public double evaluate(final double[] values, final double[] weights, final int begin, final int length) throws MathIllegalArgumentException { [EOL]     double sum = Double.NaN; [EOL]     if (test(values, weights, begin, length, true)) { [EOL]         sum = 0.0; [EOL]         for (int i = begin; i < begin + length; i++) { [EOL]             sum += values[i] * weights[i]; [EOL]         } [EOL]     } [EOL]     return sum; [EOL] } <line_num>: 160,170
public double evaluate(final double[] values, final double[] weights) throws MathIllegalArgumentException { [EOL]     return evaluate(values, weights, 0, values.length); [EOL] } <line_num>: 194,197
@Override [EOL] public Sum copy() { [EOL]     Sum result = new Sum(); [EOL]     copy(this, result); [EOL]     return result; [EOL] } <line_num>: 202,208
public static void copy(Sum source, Sum dest) throws NullArgumentException { [EOL]     MathUtils.checkNotNull(source); [EOL]     MathUtils.checkNotNull(dest); [EOL]     dest.setData(source.getDataRef()); [EOL]     dest.n = source.n; [EOL]     dest.value = source.value; [EOL] } <line_num>: 218,225
