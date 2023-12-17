public double value(double x) { [EOL]     return FastMath.log1p(x); [EOL] } <line_num>: 35,37
@Deprecated [EOL] public UnivariateFunction derivative() { [EOL]     return FunctionUtils.toDifferentiableUnivariateFunction(this).derivative(); [EOL] } <line_num>: 42,45
public DerivativeStructure value(final DerivativeStructure t) { [EOL]     return t.log1p(); [EOL] } <line_num>: 50,52
