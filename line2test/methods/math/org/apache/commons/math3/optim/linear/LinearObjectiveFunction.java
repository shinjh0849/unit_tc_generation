public LinearObjectiveFunction(double[] coefficients, double constantTerm) { [EOL]     this(new ArrayRealVector(coefficients), constantTerm); [EOL] } <line_num>: 58,60
public LinearObjectiveFunction(RealVector coefficients, double constantTerm) { [EOL]     this.coefficients = coefficients; [EOL]     this.constantTerm = constantTerm; [EOL] } <line_num>: 66,69
public RealVector getCoefficients() { [EOL]     return coefficients; [EOL] } <line_num>: 76,78
public double getConstantTerm() { [EOL]     return constantTerm; [EOL] } <line_num>: 85,87
public double value(final double[] point) { [EOL]     return value(new ArrayRealVector(point, false)); [EOL] } <line_num>: 95,97
public double value(final RealVector point) { [EOL]     return coefficients.dotProduct(point) + constantTerm; [EOL] } <line_num>: 105,107
@Override [EOL] public boolean equals(Object other) { [EOL]     if (this == other) { [EOL]         return true; [EOL]     } [EOL]     if (other instanceof LinearObjectiveFunction) { [EOL]         LinearObjectiveFunction rhs = (LinearObjectiveFunction) other; [EOL]         return (constantTerm == rhs.constantTerm) && coefficients.equals(rhs.coefficients); [EOL]     } [EOL]     return false; [EOL] } <line_num>: 109,120
@Override [EOL] public int hashCode() { [EOL]     return Double.valueOf(constantTerm).hashCode() ^ coefficients.hashCode(); [EOL] } <line_num>: 122,125
private void writeObject(ObjectOutputStream oos) throws IOException { [EOL]     oos.defaultWriteObject(); [EOL]     MatrixUtils.serializeRealVector(coefficients, oos); [EOL] } <line_num>: 132,136
private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException { [EOL]     ois.defaultReadObject(); [EOL]     MatrixUtils.deserializeRealVector(this, "coefficients", ois); [EOL] } <line_num>: 144,148
