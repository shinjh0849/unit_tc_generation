public FirstMoment() { [EOL]     n = 0; [EOL]     m1 = Double.NaN; [EOL]     dev = Double.NaN; [EOL]     nDev = Double.NaN; [EOL] } <line_num>: 79,84
public FirstMoment(FirstMoment original) throws NullArgumentException { [EOL]     super(); [EOL]     copy(original, this); [EOL] } <line_num>: 93,96
@Override [EOL] public void increment(final double d) { [EOL]     if (n == 0) { [EOL]         m1 = 0.0; [EOL]     } [EOL]     n++; [EOL]     double n0 = n; [EOL]     dev = d - m1; [EOL]     nDev = dev / n0; [EOL]     m1 += nDev; [EOL] } <line_num>: 101,111
@Override [EOL] public void clear() { [EOL]     m1 = Double.NaN; [EOL]     n = 0; [EOL]     dev = Double.NaN; [EOL]     nDev = Double.NaN; [EOL] } <line_num>: 116,122
@Override [EOL] public double getResult() { [EOL]     return m1; [EOL] } <line_num>: 127,130
public long getN() { [EOL]     return n; [EOL] } <line_num>: 135,137
@Override [EOL] public FirstMoment copy() { [EOL]     FirstMoment result = new FirstMoment(); [EOL]     copy(this, result); [EOL]     return result; [EOL] } <line_num>: 142,148
public static void copy(FirstMoment source, FirstMoment dest) throws NullArgumentException { [EOL]     MathUtils.checkNotNull(source); [EOL]     MathUtils.checkNotNull(dest); [EOL]     dest.setData(source.getDataRef()); [EOL]     dest.n = source.n; [EOL]     dest.m1 = source.m1; [EOL]     dest.dev = source.dev; [EOL]     dest.nDev = source.nDev; [EOL] } <line_num>: 158,167
