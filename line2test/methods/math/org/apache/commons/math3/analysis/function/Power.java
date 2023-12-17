public Power(double p) { [EOL]     this.p = p; [EOL] } <line_num>: 40,42
public double value(double x) { [EOL]     return FastMath.pow(x, p); [EOL] } <line_num>: 45,47
@Deprecated [EOL] public UnivariateFunction derivative() { [EOL]     return FunctionUtils.toDifferentiableUnivariateFunction(this).derivative(); [EOL] } <line_num>: 52,55
public DerivativeStructure value(final DerivativeStructure t) { [EOL]     return t.pow(p); [EOL] } <line_num>: 60,62
