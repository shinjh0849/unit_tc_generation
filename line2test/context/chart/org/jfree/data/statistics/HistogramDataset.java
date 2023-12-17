public HistogramDataset()
public HistogramType getType()
public void setType(HistogramType type)
public void addSeries(Comparable key, double[] values, int bins)
public void addSeries(Comparable key, double[] values, int bins, double minimum, double maximum)
private double getMinimum(double[] values)
private double getMaximum(double[] values)
 List getBins(int series)
private int getTotal(int series)
private double getBinWidth(int series)
public int getSeriesCount()
public Comparable getSeriesKey(int series)
public int getItemCount(int series)
public Number getX(int series, int item)
public Number getY(int series, int item)
public Number getStartX(int series, int item)
public Number getEndX(int series, int item)
public Number getStartY(int series, int item)
public Number getEndY(int series, int item)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
long serialVersionUID=Optional[-6341668077370231153L]
List list
HistogramType type
