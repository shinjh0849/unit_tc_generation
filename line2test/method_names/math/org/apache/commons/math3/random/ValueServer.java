public ValueServer()
public ValueServer(RandomDataImpl randomData)
public ValueServer(RandomGenerator generator)
public double getNext() throws IOException, MathIllegalStateException, MathIllegalArgumentException
public void fill(double[] values) throws IOException, MathIllegalStateException, MathIllegalArgumentException
public double[] fill(int length) throws IOException, MathIllegalStateException, MathIllegalArgumentException
public void computeDistribution() throws IOException, ZeroException, NullArgumentException
public void computeDistribution(int binCount) throws NullArgumentException, IOException, ZeroException
public int getMode()
public void setMode(int mode)
public URL getValuesFileURL()
public void setValuesFileURL(String url) throws MalformedURLException
public void setValuesFileURL(URL url)
public EmpiricalDistribution getEmpiricalDistribution()
public void resetReplayFile() throws IOException
public void closeReplayFile() throws IOException
public double getMu()
public void setMu(double mu)
public double getSigma()
public void setSigma(double sigma)
public void reSeed(long seed)
private double getNextDigest() throws MathIllegalStateException
private double getNextReplay() throws IOException, MathIllegalStateException
private double getNextUniform() throws MathIllegalArgumentException
private double getNextExponential() throws MathIllegalArgumentException
private double getNextGaussian() throws MathIllegalArgumentException
