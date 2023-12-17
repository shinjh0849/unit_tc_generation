public double value(double x) { [EOL]     return FastMath.expm1(x); [EOL] } <line_num>: 35,37
@Deprecated [EOL] public UnivariateFunction derivative() { [EOL]     return FunctionUtils.toDifferentiableUnivariateFunction(this).derivative(); [EOL] } <line_num>: 42,45
public DerivativeStructure value(final DerivativeStructure t) { [EOL]     return t.expm1(); [EOL] } <line_num>: 50,52
