public Product() { [EOL]     n = 0; [EOL]     value = 1; [EOL] } <line_num>: 58,61
public Product(Product original) throws NullArgumentException { [EOL]     copy(original, this); [EOL] } <line_num>: 70,72
@Override [EOL] public void increment(final double d) { [EOL]     value *= d; [EOL]     n++; [EOL] } <line_num>: 77,81
@Override [EOL] public double getResult() { [EOL]     return value; [EOL] } <line_num>: 86,89
public long getN() { [EOL]     return n; [EOL] } <line_num>: 94,96
@Override [EOL] public void clear() { [EOL]     value = 1; [EOL]     n = 0; [EOL] } <line_num>: 101,105
@Override [EOL] public double evaluate(final double[] values, final int begin, final int length) throws MathIllegalArgumentException { [EOL]     double product = Double.NaN; [EOL]     if (test(values, begin, length, true)) { [EOL]         product = 1.0; [EOL]         for (int i = begin; i < begin + length; i++) { [EOL]             product *= values[i]; [EOL]         } [EOL]     } [EOL]     return product; [EOL] } <line_num>: 121,132
public double evaluate(final double[] values, final double[] weights, final int begin, final int length) throws MathIllegalArgumentException { [EOL]     double product = Double.NaN; [EOL]     if (test(values, weights, begin, length, true)) { [EOL]         product = 1.0; [EOL]         for (int i = begin; i < begin + length; i++) { [EOL]             product *= FastMath.pow(values[i], weights[i]); [EOL]         } [EOL]     } [EOL]     return product; [EOL] } <line_num>: 162,172
public double evaluate(final double[] values, final double[] weights) throws MathIllegalArgumentException { [EOL]     return evaluate(values, weights, 0, values.length); [EOL] } <line_num>: 197,200
@Override [EOL] public Product copy() { [EOL]     Product result = new Product(); [EOL]     copy(this, result); [EOL]     return result; [EOL] } <line_num>: 206,212
public static void copy(Product source, Product dest) throws NullArgumentException { [EOL]     MathUtils.checkNotNull(source); [EOL]     MathUtils.checkNotNull(dest); [EOL]     dest.setData(source.getDataRef()); [EOL]     dest.n = source.n; [EOL]     dest.value = source.value; [EOL] } <line_num>: 222,229
