protected AbstractScalarDifferentiableOptimizer()
protected AbstractScalarDifferentiableOptimizer(ConvergenceChecker<PointValuePair> checker)
protected double[] computeObjectiveGradient(final double[] evaluationPoint)
protected PointValuePair optimizeInternal(int maxEval, final DifferentiableMultivariateFunction f, final GoalType goalType, final double[] startPoint)
public PointValuePair optimize(final int maxEval, final MultivariateDifferentiableFunction f, final GoalType goalType, final double[] startPoint)
MultivariateVectorFunction gradient
