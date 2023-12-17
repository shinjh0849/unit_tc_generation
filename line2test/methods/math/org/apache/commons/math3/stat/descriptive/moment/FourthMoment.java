public FourthMoment() { [EOL]     super(); [EOL]     m4 = Double.NaN; [EOL] } <line_num>: 67,70
public FourthMoment(FourthMoment original) throws NullArgumentException { [EOL]     super(); [EOL]     copy(original, this); [EOL] } <line_num>: 79,82
@Override [EOL] public void increment(final double d) { [EOL]     if (n < 1) { [EOL]         m4 = 0.0; [EOL]         m3 = 0.0; [EOL]         m2 = 0.0; [EOL]         m1 = 0.0; [EOL]     } [EOL]     double prevM3 = m3; [EOL]     double prevM2 = m2; [EOL]     super.increment(d); [EOL]     double n0 = n; [EOL]     m4 = m4 - 4.0 * nDev * prevM3 + 6.0 * nDevSq * prevM2 + ((n0 * n0) - 3 * (n0 - 1)) * (nDevSq * nDevSq * (n0 - 1) * n0); [EOL] } <line_num>: 87,105
@Override [EOL] public double getResult() { [EOL]     return m4; [EOL] } <line_num>: 110,113
@Override [EOL] public void clear() { [EOL]     super.clear(); [EOL]     m4 = Double.NaN; [EOL] } <line_num>: 118,122
@Override [EOL] public FourthMoment copy() { [EOL]     FourthMoment result = new FourthMoment(); [EOL]     copy(this, result); [EOL]     return result; [EOL] } <line_num>: 127,133
public static void copy(FourthMoment source, FourthMoment dest) throws NullArgumentException { [EOL]     MathUtils.checkNotNull(source); [EOL]     MathUtils.checkNotNull(dest); [EOL]     ThirdMoment.copy(source, dest); [EOL]     dest.m4 = source.m4; [EOL] } <line_num>: 143,149
