public Constant(double c) { [EOL]     this.c = c; [EOL] } <line_num>: 37,39
public double value(double x) { [EOL]     return c; [EOL] } <line_num>: 42,44
@Deprecated [EOL] public DifferentiableUnivariateFunction derivative() { [EOL]     return new Constant(0); [EOL] } <line_num>: 49,52
public DerivativeStructure value(final DerivativeStructure t) { [EOL]     return new DerivativeStructure(t.getFreeParameters(), t.getOrder(), c); [EOL] } <line_num>: 57,59
