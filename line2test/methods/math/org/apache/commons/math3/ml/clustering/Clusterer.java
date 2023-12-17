protected Clusterer(final DistanceMeasure measure) { [EOL]     this.measure = measure; [EOL] } <line_num>: 43,45
public abstract List<? extends Cluster<T>> cluster(Collection<T> points) throws MathIllegalArgumentException, ConvergenceException; <line_num>: 57,58
public DistanceMeasure getDistanceMeasure() { [EOL]     return measure; [EOL] } <line_num>: 65,67
protected double distance(final Clusterable p1, final Clusterable p2) { [EOL]     return measure.compute(p1.getPoint(), p2.getPoint()); [EOL] } <line_num>: 77,79
