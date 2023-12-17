public DefaultIterativeLinearSolverEvent(final Object source, final int iterations, final RealVector x, final RealVector b, final RealVector r, final double rnorm) { [EOL]     super(source, iterations); [EOL]     this.x = x; [EOL]     this.b = b; [EOL]     this.r = r; [EOL]     this.rnorm = rnorm; [EOL] } <line_num>: 63,71
public DefaultIterativeLinearSolverEvent(final Object source, final int iterations, final RealVector x, final RealVector b, final double rnorm) { [EOL]     super(source, iterations); [EOL]     this.x = x; [EOL]     this.b = b; [EOL]     this.r = null; [EOL]     this.rnorm = rnorm; [EOL] } <line_num>: 91,98
@Override [EOL] public double getNormOfResidual() { [EOL]     return rnorm; [EOL] } <line_num>: 101,104
@Override [EOL] public RealVector getResidual() { [EOL]     if (r != null) { [EOL]         return r; [EOL]     } [EOL]     throw new MathUnsupportedOperationException(); [EOL] } <line_num>: 112,118
@Override [EOL] public RealVector getRightHandSideVector() { [EOL]     return b; [EOL] } <line_num>: 121,124
@Override [EOL] public RealVector getSolution() { [EOL]     return x; [EOL] } <line_num>: 127,130
@Override [EOL] public boolean providesResidual() { [EOL]     return r != null; [EOL] } <line_num>: 140,143
