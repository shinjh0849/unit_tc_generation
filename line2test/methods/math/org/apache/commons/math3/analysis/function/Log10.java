public double value(double x) { [EOL]     return FastMath.log10(x); [EOL] } <line_num>: 36,38
@Deprecated [EOL] public UnivariateFunction derivative() { [EOL]     return FunctionUtils.toDifferentiableUnivariateFunction(this).derivative(); [EOL] } <line_num>: 43,46
public DerivativeStructure value(final DerivativeStructure t) { [EOL]     return t.log10(); [EOL] } <line_num>: 51,53
