@Deprecated [EOL] protected AbstractScalarDifferentiableOptimizer() { [EOL] } <line_num>: 55,56
protected AbstractScalarDifferentiableOptimizer(ConvergenceChecker<PointValuePair> checker) { [EOL]     super(checker); [EOL] } <line_num>: 61,63
protected double[] computeObjectiveGradient(final double[] evaluationPoint) { [EOL]     return gradient.value(evaluationPoint); [EOL] } <line_num>: 73,75
@Override [EOL] protected PointValuePair optimizeInternal(int maxEval, final DifferentiableMultivariateFunction f, final GoalType goalType, final double[] startPoint) { [EOL]     gradient = f.gradient(); [EOL]     return super.optimizeInternal(maxEval, f, goalType, startPoint); [EOL] } <line_num>: 78,87
public PointValuePair optimize(final int maxEval, final MultivariateDifferentiableFunction f, final GoalType goalType, final double[] startPoint) { [EOL]     return optimizeInternal(maxEval, FunctionUtils.toDifferentiableMultivariateFunction(f), goalType, startPoint); [EOL] } <line_num>: 106,114
