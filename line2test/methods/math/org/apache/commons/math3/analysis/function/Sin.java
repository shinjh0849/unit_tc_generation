public double value(double x) { [EOL]     return FastMath.sin(x); [EOL] } <line_num>: 33,35
@Deprecated [EOL] public DifferentiableUnivariateFunction derivative() { [EOL]     return new Cos(); [EOL] } <line_num>: 40,43
public DerivativeStructure value(final DerivativeStructure t) { [EOL]     return t.sin(); [EOL] } <line_num>: 48,50
