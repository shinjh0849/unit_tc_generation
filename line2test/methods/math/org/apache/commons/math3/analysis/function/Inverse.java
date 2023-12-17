public double value(double x) { [EOL]     return 1 / x; [EOL] } <line_num>: 34,36
@Deprecated [EOL] public UnivariateFunction derivative() { [EOL]     return FunctionUtils.toDifferentiableUnivariateFunction(this).derivative(); [EOL] } <line_num>: 41,44
public DerivativeStructure value(final DerivativeStructure t) { [EOL]     return t.reciprocal(); [EOL] } <line_num>: 49,51
