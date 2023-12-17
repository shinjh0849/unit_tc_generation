@Deprecated [EOL] protected BaseAbstractMultivariateSimpleBoundsOptimizer() { [EOL] } <line_num>: 57,58
protected BaseAbstractMultivariateSimpleBoundsOptimizer(ConvergenceChecker<PointValuePair> checker) { [EOL]     super(checker); [EOL] } <line_num>: 63,65
@Override [EOL] public PointValuePair optimize(int maxEval, FUNC f, GoalType goalType, double[] startPoint) { [EOL]     return super.optimizeInternal(maxEval, f, goalType, new InitialGuess(startPoint)); [EOL] } <line_num>: 68,73
public PointValuePair optimize(int maxEval, FUNC f, GoalType goalType, double[] startPoint, double[] lower, double[] upper) { [EOL]     return super.optimizeInternal(maxEval, f, goalType, new InitialGuess(startPoint), new SimpleBounds(lower, upper)); [EOL] } <line_num>: 76,82
