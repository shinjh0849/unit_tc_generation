public PolynomialFitter(MultivariateVectorOptimizer optimizer) { [EOL]     super(optimizer); [EOL] } <line_num>: 36,38
public double[] fit(int maxEval, double[] guess) { [EOL]     return fit(maxEval, new PolynomialFunction.Parametric(), guess); [EOL] } <line_num>: 53,55
public double[] fit(double[] guess) { [EOL]     return fit(new PolynomialFunction.Parametric(), guess); [EOL] } <line_num>: 67,69
