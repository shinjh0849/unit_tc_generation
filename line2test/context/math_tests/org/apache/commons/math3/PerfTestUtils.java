public RunTest(String name)
public static StatisticalSummary[] time(int repeatChunk, int repeatStat, boolean runGC, Callable<Double>... methods)
public static double[][][] timesAndResults(int repeatChunk, int repeatStat, boolean runGC, Callable<Double>... methods)
public static StatisticalSummary[] timeAndReport(String title, int repeatChunk, int repeatStat, boolean runGC, RunTest... methods)
public static StatisticalSummary[] timeAndReport(String title, RunTest... methods)
public String getName()
public abstract Double call() throws Exception
double NANO_TO_MILLI=Optional[1e-6]
int DEFAULT_REPEAT_CHUNK=Optional[1000]
int DEFAULT_REPEAT_STAT=Optional[10000]
Random rng=Optional[new Random()]
