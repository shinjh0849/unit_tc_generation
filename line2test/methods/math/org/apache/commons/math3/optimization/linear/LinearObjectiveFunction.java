public LinearObjectiveFunction(double[] coefficients, double constantTerm) { [EOL]     this(new ArrayRealVector(coefficients), constantTerm); [EOL] } <line_num>: 59,61
public LinearObjectiveFunction(RealVector coefficients, double constantTerm) { [EOL]     this.coefficients = coefficients; [EOL]     this.constantTerm = constantTerm; [EOL] } <line_num>: 67,70
public RealVector getCoefficients() { [EOL]     return coefficients; [EOL] } <line_num>: 76,78
public double getConstantTerm() { [EOL]     return constantTerm; [EOL] } <line_num>: 84,86
public double getValue(final double[] point) { [EOL]     return coefficients.dotProduct(new ArrayRealVector(point, false)) + constantTerm; [EOL] } <line_num>: 93,95
public double getValue(final RealVector point) { [EOL]     return coefficients.dotProduct(point) + constantTerm; [EOL] } <line_num>: 102,104
@Override [EOL] public boolean equals(Object other) { [EOL]     if (this == other) { [EOL]         return true; [EOL]     } [EOL]     if (other instanceof LinearObjectiveFunction) { [EOL]         LinearObjectiveFunction rhs = (LinearObjectiveFunction) other; [EOL]         return (constantTerm == rhs.constantTerm) && coefficients.equals(rhs.coefficients); [EOL]     } [EOL]     return false; [EOL] } <line_num>: 106,119
@Override [EOL] public int hashCode() { [EOL]     return Double.valueOf(constantTerm).hashCode() ^ coefficients.hashCode(); [EOL] } <line_num>: 121,124
private void writeObject(ObjectOutputStream oos) throws IOException { [EOL]     oos.defaultWriteObject(); [EOL]     MatrixUtils.serializeRealVector(coefficients, oos); [EOL] } <line_num>: 131,135
private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException { [EOL]     ois.defaultReadObject(); [EOL]     MatrixUtils.deserializeRealVector(this, "coefficients", ois); [EOL] } <line_num>: 143,147
