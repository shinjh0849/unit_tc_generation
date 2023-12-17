public IterativeLinearSolverEvent(final Object source, final int iterations) { [EOL]     super(source, iterations); [EOL] } <line_num>: 42,44
public abstract RealVector getRightHandSideVector(); <line_num>: 54,54
public abstract double getNormOfResidual(); <line_num>: 71,71
public RealVector getResidual() { [EOL]     throw new MathUnsupportedOperationException(); [EOL] } <line_num>: 92,94
public abstract RealVector getSolution(); <line_num>: 104,104
public boolean providesResidual() { [EOL]     return false; [EOL] } <line_num>: 113,115
