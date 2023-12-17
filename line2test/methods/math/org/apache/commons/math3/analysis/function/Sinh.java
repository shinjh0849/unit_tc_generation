public double value(double x) { [EOL]     return FastMath.sinh(x); [EOL] } <line_num>: 33,35
@Deprecated [EOL] public DifferentiableUnivariateFunction derivative() { [EOL]     return new Cosh(); [EOL] } <line_num>: 40,43
public DerivativeStructure value(final DerivativeStructure t) { [EOL]     return t.sinh(); [EOL] } <line_num>: 48,50
