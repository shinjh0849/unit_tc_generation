public ThirdMoment() { [EOL]     super(); [EOL]     m3 = Double.NaN; [EOL]     nDevSq = Double.NaN; [EOL] } <line_num>: 68,72
public ThirdMoment(ThirdMoment original) throws NullArgumentException { [EOL]     copy(original, this); [EOL] } <line_num>: 81,83
@Override [EOL] public void increment(final double d) { [EOL]     if (n < 1) { [EOL]         m3 = m2 = m1 = 0.0; [EOL]     } [EOL]     double prevM2 = m2; [EOL]     super.increment(d); [EOL]     nDevSq = nDev * nDev; [EOL]     double n0 = n; [EOL]     m3 = m3 - 3.0 * nDev * prevM2 + (n0 - 1) * (n0 - 2) * nDevSq * dev; [EOL] } <line_num>: 88,99
@Override [EOL] public double getResult() { [EOL]     return m3; [EOL] } <line_num>: 104,107
@Override [EOL] public void clear() { [EOL]     super.clear(); [EOL]     m3 = Double.NaN; [EOL]     nDevSq = Double.NaN; [EOL] } <line_num>: 112,117
@Override [EOL] public ThirdMoment copy() { [EOL]     ThirdMoment result = new ThirdMoment(); [EOL]     copy(this, result); [EOL]     return result; [EOL] } <line_num>: 122,128
public static void copy(ThirdMoment source, ThirdMoment dest) throws NullArgumentException { [EOL]     MathUtils.checkNotNull(source); [EOL]     MathUtils.checkNotNull(dest); [EOL]     SecondMoment.copy(source, dest); [EOL]     dest.m3 = source.m3; [EOL]     dest.nDevSq = source.nDevSq; [EOL] } <line_num>: 138,145
