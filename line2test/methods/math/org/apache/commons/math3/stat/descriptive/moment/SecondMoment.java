public SecondMoment() { [EOL]     super(); [EOL]     m2 = Double.NaN; [EOL] } <line_num>: 59,62
public SecondMoment(SecondMoment original) throws NullArgumentException { [EOL]     super(original); [EOL]     this.m2 = original.m2; [EOL] } <line_num>: 71,75
@Override [EOL] public void increment(final double d) { [EOL]     if (n < 1) { [EOL]         m1 = m2 = 0.0; [EOL]     } [EOL]     super.increment(d); [EOL]     m2 += ((double) n - 1) * dev * nDev; [EOL] } <line_num>: 80,87
@Override [EOL] public void clear() { [EOL]     super.clear(); [EOL]     m2 = Double.NaN; [EOL] } <line_num>: 92,96
@Override [EOL] public double getResult() { [EOL]     return m2; [EOL] } <line_num>: 101,104
@Override [EOL] public SecondMoment copy() { [EOL]     SecondMoment result = new SecondMoment(); [EOL]     copy(this, result); [EOL]     return result; [EOL] } <line_num>: 109,115
public static void copy(SecondMoment source, SecondMoment dest) throws NullArgumentException { [EOL]     MathUtils.checkNotNull(source); [EOL]     MathUtils.checkNotNull(dest); [EOL]     FirstMoment.copy(source, dest); [EOL]     dest.m2 = source.m2; [EOL] } <line_num>: 125,131
