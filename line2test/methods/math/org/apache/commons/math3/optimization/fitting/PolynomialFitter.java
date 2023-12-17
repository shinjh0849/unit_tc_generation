@Deprecated [EOL] public PolynomialFitter(int degree, final DifferentiableMultivariateVectorOptimizer optimizer) { [EOL]     super(optimizer); [EOL]     this.degree = degree; [EOL] } <line_num>: 50,54
public PolynomialFitter(DifferentiableMultivariateVectorOptimizer optimizer) { [EOL]     super(optimizer); [EOL]     degree = -1; [EOL] } <line_num>: 62,65
@Deprecated [EOL] public double[] fit() { [EOL]     return fit(new PolynomialFunction.Parametric(), new double[degree + 1]); [EOL] } <line_num>: 75,78
public double[] fit(int maxEval, double[] guess) { [EOL]     return fit(maxEval, new PolynomialFunction.Parametric(), guess); [EOL] } <line_num>: 94,96
public double[] fit(double[] guess) { [EOL]     return fit(new PolynomialFunction.Parametric(), guess); [EOL] } <line_num>: 109,111
