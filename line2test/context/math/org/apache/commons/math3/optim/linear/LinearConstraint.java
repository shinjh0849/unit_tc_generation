public LinearConstraint(final double[] coefficients, final Relationship relationship, final double value)
public LinearConstraint(final RealVector coefficients, final Relationship relationship, final double value)
public LinearConstraint(final double[] lhsCoefficients, final double lhsConstant, final Relationship relationship, final double[] rhsCoefficients, final double rhsConstant)
public LinearConstraint(final RealVector lhsCoefficients, final double lhsConstant, final Relationship relationship, final RealVector rhsCoefficients, final double rhsConstant)
public RealVector getCoefficients()
public Relationship getRelationship()
public double getValue()
public boolean equals(Object other)
public int hashCode()
private void writeObject(ObjectOutputStream oos) throws IOException
private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException
long serialVersionUID=Optional[-764632794033034092L]
RealVector coefficients
Relationship relationship
double value
