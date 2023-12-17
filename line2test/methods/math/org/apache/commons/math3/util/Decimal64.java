public Decimal64(final double x) { [EOL]     this.value = x; [EOL] } <line_num>: 74,76
public Field<Decimal64> getField() { [EOL]     return Decimal64Field.getInstance(); [EOL] } <line_num>: 83,85
public Decimal64 add(final Decimal64 a) { [EOL]     return new Decimal64(this.value + a.value); [EOL] } <line_num>: 94,96
public Decimal64 subtract(final Decimal64 a) { [EOL]     return new Decimal64(this.value - a.value); [EOL] } <line_num>: 105,107
public Decimal64 negate() { [EOL]     return new Decimal64(-this.value); [EOL] } <line_num>: 115,117
public Decimal64 multiply(final Decimal64 a) { [EOL]     return new Decimal64(this.value * a.value); [EOL] } <line_num>: 126,128
public Decimal64 multiply(final int n) { [EOL]     return new Decimal64(n * this.value); [EOL] } <line_num>: 136,138
public Decimal64 divide(final Decimal64 a) { [EOL]     return new Decimal64(this.value / a.value); [EOL] } <line_num>: 148,150
public Decimal64 reciprocal() { [EOL]     return new Decimal64(1.0 / this.value); [EOL] } <line_num>: 159,161
@Override [EOL] public byte byteValue() { [EOL]     return (byte) value; [EOL] } <line_num>: 172,175
@Override [EOL] public short shortValue() { [EOL]     return (short) value; [EOL] } <line_num>: 182,185
@Override [EOL] public int intValue() { [EOL]     return (int) value; [EOL] } <line_num>: 192,195
@Override [EOL] public long longValue() { [EOL]     return (long) value; [EOL] } <line_num>: 202,205
@Override [EOL] public float floatValue() { [EOL]     return (float) value; [EOL] } <line_num>: 212,215
@Override [EOL] public double doubleValue() { [EOL]     return value; [EOL] } <line_num>: 218,221
public int compareTo(final Decimal64 o) { [EOL]     return Double.compare(this.value, o.value); [EOL] } <line_num>: 236,238
@Override [EOL] public boolean equals(final Object obj) { [EOL]     if (obj instanceof Decimal64) { [EOL]         final Decimal64 that = (Decimal64) obj; [EOL]         return Double.doubleToLongBits(this.value) == Double.doubleToLongBits(that.value); [EOL]     } [EOL]     return false; [EOL] } <line_num>: 245,253
@Override [EOL] public int hashCode() { [EOL]     long v = Double.doubleToLongBits(value); [EOL]     return (int) (v ^ (v >>> 32)); [EOL] } <line_num>: 263,267
@Override [EOL] public String toString() { [EOL]     return Double.toString(value); [EOL] } <line_num>: 277,280
public boolean isInfinite() { [EOL]     return Double.isInfinite(value); [EOL] } <line_num>: 292,294
public boolean isNaN() { [EOL]     return Double.isNaN(value); [EOL] } <line_num>: 302,304
public double getReal() { [EOL]     return value; [EOL] } <line_num>: 309,311
public Decimal64 add(final double a) { [EOL]     return new Decimal64(value + a); [EOL] } <line_num>: 316,318
public Decimal64 subtract(final double a) { [EOL]     return new Decimal64(value - a); [EOL] } <line_num>: 323,325
public Decimal64 multiply(final double a) { [EOL]     return new Decimal64(value * a); [EOL] } <line_num>: 330,332
public Decimal64 divide(final double a) { [EOL]     return new Decimal64(value / a); [EOL] } <line_num>: 337,339
public Decimal64 remainder(final double a) { [EOL]     return new Decimal64(FastMath.IEEEremainder(value, a)); [EOL] } <line_num>: 344,346
public Decimal64 remainder(final Decimal64 a) { [EOL]     return new Decimal64(FastMath.IEEEremainder(value, a.value)); [EOL] } <line_num>: 351,353
public Decimal64 abs() { [EOL]     return new Decimal64(FastMath.abs(value)); [EOL] } <line_num>: 358,360
public Decimal64 ceil() { [EOL]     return new Decimal64(FastMath.ceil(value)); [EOL] } <line_num>: 365,367
public Decimal64 floor() { [EOL]     return new Decimal64(FastMath.floor(value)); [EOL] } <line_num>: 372,374
public Decimal64 rint() { [EOL]     return new Decimal64(FastMath.rint(value)); [EOL] } <line_num>: 379,381
public long round() { [EOL]     return FastMath.round(value); [EOL] } <line_num>: 386,388
public Decimal64 signum() { [EOL]     return new Decimal64(FastMath.signum(value)); [EOL] } <line_num>: 393,395
public Decimal64 copySign(final Decimal64 sign) { [EOL]     return new Decimal64(FastMath.copySign(value, sign.value)); [EOL] } <line_num>: 400,402
public Decimal64 copySign(final double sign) { [EOL]     return new Decimal64(FastMath.copySign(value, sign)); [EOL] } <line_num>: 407,409
public Decimal64 scalb(final int n) { [EOL]     return new Decimal64(FastMath.scalb(value, n)); [EOL] } <line_num>: 414,416
public Decimal64 hypot(final Decimal64 y) { [EOL]     return new Decimal64(FastMath.hypot(value, y.value)); [EOL] } <line_num>: 421,423
public Decimal64 sqrt() { [EOL]     return new Decimal64(FastMath.sqrt(value)); [EOL] } <line_num>: 428,430
public Decimal64 cbrt() { [EOL]     return new Decimal64(FastMath.cbrt(value)); [EOL] } <line_num>: 435,437
public Decimal64 rootN(final int n) { [EOL]     if (value < 0) { [EOL]         return new Decimal64(-FastMath.pow(-value, 1.0 / n)); [EOL]     } else { [EOL]         return new Decimal64(FastMath.pow(value, 1.0 / n)); [EOL]     } [EOL] } <line_num>: 442,448
public Decimal64 pow(final double p) { [EOL]     return new Decimal64(FastMath.pow(value, p)); [EOL] } <line_num>: 453,455
public Decimal64 pow(final int n) { [EOL]     return new Decimal64(FastMath.pow(value, n)); [EOL] } <line_num>: 460,462
public Decimal64 pow(final Decimal64 e) { [EOL]     return new Decimal64(FastMath.pow(value, e.value)); [EOL] } <line_num>: 467,469
public Decimal64 exp() { [EOL]     return new Decimal64(FastMath.exp(value)); [EOL] } <line_num>: 474,476
public Decimal64 expm1() { [EOL]     return new Decimal64(FastMath.expm1(value)); [EOL] } <line_num>: 481,483
public Decimal64 log() { [EOL]     return new Decimal64(FastMath.log(value)); [EOL] } <line_num>: 488,490
public Decimal64 log1p() { [EOL]     return new Decimal64(FastMath.log1p(value)); [EOL] } <line_num>: 495,497
public Decimal64 log10() { [EOL]     return new Decimal64(FastMath.log10(value)); [EOL] } <line_num>: 503,505
public Decimal64 cos() { [EOL]     return new Decimal64(FastMath.cos(value)); [EOL] } <line_num>: 510,512
public Decimal64 sin() { [EOL]     return new Decimal64(FastMath.sin(value)); [EOL] } <line_num>: 517,519
public Decimal64 tan() { [EOL]     return new Decimal64(FastMath.tan(value)); [EOL] } <line_num>: 524,526
public Decimal64 acos() { [EOL]     return new Decimal64(FastMath.acos(value)); [EOL] } <line_num>: 531,533
public Decimal64 asin() { [EOL]     return new Decimal64(FastMath.asin(value)); [EOL] } <line_num>: 538,540
public Decimal64 atan() { [EOL]     return new Decimal64(FastMath.atan(value)); [EOL] } <line_num>: 545,547
public Decimal64 atan2(final Decimal64 x) { [EOL]     return new Decimal64(FastMath.atan2(value, x.value)); [EOL] } <line_num>: 552,554
public Decimal64 cosh() { [EOL]     return new Decimal64(FastMath.cosh(value)); [EOL] } <line_num>: 559,561
public Decimal64 sinh() { [EOL]     return new Decimal64(FastMath.sinh(value)); [EOL] } <line_num>: 566,568
public Decimal64 tanh() { [EOL]     return new Decimal64(FastMath.tanh(value)); [EOL] } <line_num>: 573,575
public Decimal64 acosh() { [EOL]     return new Decimal64(FastMath.acosh(value)); [EOL] } <line_num>: 580,582
public Decimal64 asinh() { [EOL]     return new Decimal64(FastMath.asinh(value)); [EOL] } <line_num>: 587,589
public Decimal64 atanh() { [EOL]     return new Decimal64(FastMath.atanh(value)); [EOL] } <line_num>: 594,596
public Decimal64 linearCombination(final Decimal64[] a, final Decimal64[] b) throws DimensionMismatchException { [EOL]     if (a.length != b.length) { [EOL]         throw new DimensionMismatchException(a.length, b.length); [EOL]     } [EOL]     final double[] aDouble = new double[a.length]; [EOL]     final double[] bDouble = new double[b.length]; [EOL]     for (int i = 0; i < a.length; ++i) { [EOL]         aDouble[i] = a[i].value; [EOL]         bDouble[i] = b[i].value; [EOL]     } [EOL]     return new Decimal64(MathArrays.linearCombination(aDouble, bDouble)); [EOL] } <line_num>: 601,613
public Decimal64 linearCombination(final double[] a, final Decimal64[] b) throws DimensionMismatchException { [EOL]     if (a.length != b.length) { [EOL]         throw new DimensionMismatchException(a.length, b.length); [EOL]     } [EOL]     final double[] bDouble = new double[b.length]; [EOL]     for (int i = 0; i < a.length; ++i) { [EOL]         bDouble[i] = b[i].value; [EOL]     } [EOL]     return new Decimal64(MathArrays.linearCombination(a, bDouble)); [EOL] } <line_num>: 618,628
public Decimal64 linearCombination(final Decimal64 a1, final Decimal64 b1, final Decimal64 a2, final Decimal64 b2) { [EOL]     return new Decimal64(MathArrays.linearCombination(a1.value, b1.value, a2.value, b2.value)); [EOL] } <line_num>: 633,637
public Decimal64 linearCombination(final double a1, final Decimal64 b1, final double a2, final Decimal64 b2) { [EOL]     return new Decimal64(MathArrays.linearCombination(a1, b1.value, a2, b2.value)); [EOL] } <line_num>: 642,646
public Decimal64 linearCombination(final Decimal64 a1, final Decimal64 b1, final Decimal64 a2, final Decimal64 b2, final Decimal64 a3, final Decimal64 b3) { [EOL]     return new Decimal64(MathArrays.linearCombination(a1.value, b1.value, a2.value, b2.value, a3.value, b3.value)); [EOL] } <line_num>: 651,657
public Decimal64 linearCombination(final double a1, final Decimal64 b1, final double a2, final Decimal64 b2, final double a3, final Decimal64 b3) { [EOL]     return new Decimal64(MathArrays.linearCombination(a1, b1.value, a2, b2.value, a3, b3.value)); [EOL] } <line_num>: 662,668
public Decimal64 linearCombination(final Decimal64 a1, final Decimal64 b1, final Decimal64 a2, final Decimal64 b2, final Decimal64 a3, final Decimal64 b3, final Decimal64 a4, final Decimal64 b4) { [EOL]     return new Decimal64(MathArrays.linearCombination(a1.value, b1.value, a2.value, b2.value, a3.value, b3.value, a4.value, b4.value)); [EOL] } <line_num>: 673,681
public Decimal64 linearCombination(final double a1, final Decimal64 b1, final double a2, final Decimal64 b2, final double a3, final Decimal64 b3, final double a4, final Decimal64 b4) { [EOL]     return new Decimal64(MathArrays.linearCombination(a1, b1.value, a2, b2.value, a3, b3.value, a4, b4.value)); [EOL] } <line_num>: 686,694
