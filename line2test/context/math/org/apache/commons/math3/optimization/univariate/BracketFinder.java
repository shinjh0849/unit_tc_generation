public BracketFinder()
public BracketFinder(double growLimit, int maxEvaluations)
public void search(UnivariateFunction func, GoalType goal, double xA, double xB)
public int getMaxEvaluations()
public int getEvaluations()
public double getLo()
public double getFLo()
public double getHi()
public double getFHi()
public double getMid()
public double getFMid()
private double eval(UnivariateFunction f, double x)
double EPS_MIN=Optional[1e-21]
double GOLD=Optional[1.618034]
double growLimit
Incrementor evaluations=Optional[new Incrementor()]
double lo
double hi
double mid
double fLo
double fHi
double fMid
