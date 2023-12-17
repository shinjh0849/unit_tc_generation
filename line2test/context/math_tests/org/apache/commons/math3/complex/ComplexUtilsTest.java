public void testPolar2Complex()
protected Complex altPolar(double r, double theta)
public void testPolar2ComplexIllegalModulus()
public void testPolar2ComplexNaN()
public void testPolar2ComplexInf()
public void testConvertToComplex()
double inf=Optional[Double.POSITIVE_INFINITY]
double negInf=Optional[Double.NEGATIVE_INFINITY]
double nan=Optional[Double.NaN]
double pi=Optional[FastMath.PI]
Complex negInfInf=Optional[new Complex(negInf, inf)]
Complex infNegInf=Optional[new Complex(inf, negInf)]
Complex infInf=Optional[new Complex(inf, inf)]
Complex negInfNegInf=Optional[new Complex(negInf, negInf)]
Complex infNaN=Optional[new Complex(inf, nan)]
