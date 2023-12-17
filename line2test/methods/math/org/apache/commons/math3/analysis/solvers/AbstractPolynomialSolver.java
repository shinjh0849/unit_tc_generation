protected AbstractPolynomialSolver(final double absoluteAccuracy) { [EOL]     super(absoluteAccuracy); [EOL] } <line_num>: 39,41
protected AbstractPolynomialSolver(final double relativeAccuracy, final double absoluteAccuracy) { [EOL]     super(relativeAccuracy, absoluteAccuracy); [EOL] } <line_num>: 48,51
protected AbstractPolynomialSolver(final double relativeAccuracy, final double absoluteAccuracy, final double functionValueAccuracy) { [EOL]     super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy); [EOL] } <line_num>: 59,63
@Override [EOL] protected void setup(int maxEval, PolynomialFunction f, double min, double max, double startValue) { [EOL]     super.setup(maxEval, f, min, max, startValue); [EOL]     polynomialFunction = f; [EOL] } <line_num>: 68,73
protected double[] getCoefficients() { [EOL]     return polynomialFunction.getCoefficients(); [EOL] } <line_num>: 78,80
