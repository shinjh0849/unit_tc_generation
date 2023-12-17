public LinearObjectiveFunction(double[] coefficients, double constantTerm)
public LinearObjectiveFunction(RealVector coefficients, double constantTerm)
public RealVector getCoefficients()
public double getConstantTerm()
public double value(final double[] point)
public double value(final RealVector point)
public boolean equals(Object other)
public int hashCode()
private void writeObject(ObjectOutputStream oos) throws IOException
private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException
