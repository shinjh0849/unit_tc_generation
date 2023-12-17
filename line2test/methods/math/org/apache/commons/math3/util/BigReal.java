public BigReal(BigDecimal val) { [EOL]     d = val; [EOL] } <line_num>: 63,65
public BigReal(BigInteger val) { [EOL]     d = new BigDecimal(val); [EOL] } <line_num>: 70,72
public BigReal(BigInteger unscaledVal, int scale) { [EOL]     d = new BigDecimal(unscaledVal, scale); [EOL] } <line_num>: 78,80
public BigReal(BigInteger unscaledVal, int scale, MathContext mc) { [EOL]     d = new BigDecimal(unscaledVal, scale, mc); [EOL] } <line_num>: 87,89
public BigReal(BigInteger val, MathContext mc) { [EOL]     d = new BigDecimal(val, mc); [EOL] } <line_num>: 95,97
public BigReal(char[] in) { [EOL]     d = new BigDecimal(in); [EOL] } <line_num>: 102,104
public BigReal(char[] in, int offset, int len) { [EOL]     d = new BigDecimal(in, offset, len); [EOL] } <line_num>: 111,113
public BigReal(char[] in, int offset, int len, MathContext mc) { [EOL]     d = new BigDecimal(in, offset, len, mc); [EOL] } <line_num>: 121,123
public BigReal(char[] in, MathContext mc) { [EOL]     d = new BigDecimal(in, mc); [EOL] } <line_num>: 129,131
public BigReal(double val) { [EOL]     d = new BigDecimal(val); [EOL] } <line_num>: 136,138
public BigReal(double val, MathContext mc) { [EOL]     d = new BigDecimal(val, mc); [EOL] } <line_num>: 144,146
public BigReal(int val) { [EOL]     d = new BigDecimal(val); [EOL] } <line_num>: 151,153
public BigReal(int val, MathContext mc) { [EOL]     d = new BigDecimal(val, mc); [EOL] } <line_num>: 159,161
public BigReal(long val) { [EOL]     d = new BigDecimal(val); [EOL] } <line_num>: 166,168
public BigReal(long val, MathContext mc) { [EOL]     d = new BigDecimal(val, mc); [EOL] } <line_num>: 174,176
public BigReal(String val) { [EOL]     d = new BigDecimal(val); [EOL] } <line_num>: 181,183
public BigReal(String val, MathContext mc) { [EOL]     d = new BigDecimal(val, mc); [EOL] } <line_num>: 189,191
public RoundingMode getRoundingMode() { [EOL]     return roundingMode; [EOL] } <line_num>: 199,201
public void setRoundingMode(RoundingMode roundingMode) { [EOL]     this.roundingMode = roundingMode; [EOL] } <line_num>: 208,210
public int getScale() { [EOL]     return scale; [EOL] } <line_num>: 218,220
public void setScale(int scale) { [EOL]     this.scale = scale; [EOL] } <line_num>: 227,229
public BigReal add(BigReal a) { [EOL]     return new BigReal(d.add(a.d)); [EOL] } <line_num>: 232,234
public BigReal subtract(BigReal a) { [EOL]     return new BigReal(d.subtract(a.d)); [EOL] } <line_num>: 237,239
public BigReal negate() { [EOL]     return new BigReal(d.negate()); [EOL] } <line_num>: 242,244
public BigReal divide(BigReal a) throws MathArithmeticException { [EOL]     try { [EOL]         return new BigReal(d.divide(a.d, scale, roundingMode)); [EOL]     } catch (ArithmeticException e) { [EOL]         throw new MathArithmeticException(LocalizedFormats.ZERO_NOT_ALLOWED); [EOL]     } [EOL] } <line_num>: 251,258
public BigReal reciprocal() throws MathArithmeticException { [EOL]     try { [EOL]         return new BigReal(BigDecimal.ONE.divide(d, scale, roundingMode)); [EOL]     } catch (ArithmeticException e) { [EOL]         throw new MathArithmeticException(LocalizedFormats.ZERO_NOT_ALLOWED); [EOL]     } [EOL] } <line_num>: 265,272
public BigReal multiply(BigReal a) { [EOL]     return new BigReal(d.multiply(a.d)); [EOL] } <line_num>: 275,277
public BigReal multiply(final int n) { [EOL]     return new BigReal(d.multiply(new BigDecimal(n))); [EOL] } <line_num>: 280,282
public int compareTo(BigReal a) { [EOL]     return d.compareTo(a.d); [EOL] } <line_num>: 285,287
public double doubleValue() { [EOL]     return d.doubleValue(); [EOL] } <line_num>: 292,294
public BigDecimal bigDecimalValue() { [EOL]     return d; [EOL] } <line_num>: 299,301
@Override [EOL] public boolean equals(Object other) { [EOL]     if (this == other) { [EOL]         return true; [EOL]     } [EOL]     if (other instanceof BigReal) { [EOL]         return d.equals(((BigReal) other).d); [EOL]     } [EOL]     return false; [EOL] } <line_num>: 304,314
@Override [EOL] public int hashCode() { [EOL]     return d.hashCode(); [EOL] } <line_num>: 317,320
public Field<BigReal> getField() { [EOL]     return BigRealField.getInstance(); [EOL] } <line_num>: 323,325
