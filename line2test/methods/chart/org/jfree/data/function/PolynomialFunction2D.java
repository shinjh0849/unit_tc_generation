public PolynomialFunction2D(double[] coefficients) { [EOL]     if (coefficients == null) { [EOL]         throw new IllegalArgumentException("Null 'coefficients' argument"); [EOL]     } [EOL]     this.coefficients = (double[]) coefficients.clone(); [EOL] } <line_num>: 66,71
public double[] getCoefficients() { [EOL]     return (double[]) this.coefficients.clone(); [EOL] } <line_num>: 79,81
public int getOrder() { [EOL]     return this.coefficients.length - 1; [EOL] } <line_num>: 88,90
public double getValue(double x) { [EOL]     double y = 0; [EOL]     for (int i = 0; i < coefficients.length; i++) { [EOL]         y += coefficients[i] * Math.pow(x, i); [EOL]     } [EOL]     return y; [EOL] } <line_num>: 99,105
public boolean equals(Object obj) { [EOL]     if (!(obj instanceof PolynomialFunction2D)) { [EOL]         return false; [EOL]     } [EOL]     PolynomialFunction2D that = (PolynomialFunction2D) obj; [EOL]     return Arrays.equals(this.coefficients, that.coefficients); [EOL] } <line_num>: 114,120
public int hashCode() { [EOL]     return HashUtilities.hashCodeForDoubleArray(this.coefficients); [EOL] } <line_num>: 127,129
