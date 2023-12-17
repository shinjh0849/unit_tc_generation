public RunTest(String name)
public static StatisticalSummary[] time(int repeatChunk, int repeatStat, boolean runGC, Callable<Double>... methods)
public static double[][][] timesAndResults(int repeatChunk, int repeatStat, boolean runGC, Callable<Double>... methods)
public static StatisticalSummary[] timeAndReport(String title, int repeatChunk, int repeatStat, boolean runGC, RunTest... methods)
public static StatisticalSummary[] timeAndReport(String title, RunTest... methods)
public String getName()
public abstract Double call() throws Exception
