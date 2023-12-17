public DefaultBoxAndWhiskerXYDataset(Comparable seriesKey)
public double getOutlierCoefficient()
public void setOutlierCoefficient(double outlierCoefficient)
public double getFaroutCoefficient()
public void setFaroutCoefficient(double faroutCoefficient)
public int getSeriesCount()
public int getItemCount(int series)
public void add(Date date, BoxAndWhiskerItem item)
public Comparable getSeriesKey(int i)
public BoxAndWhiskerItem getItem(int series, int item)
public Number getX(int series, int item)
public Date getXDate(int series, int item)
public Number getY(int series, int item)
public Number getMeanValue(int series, int item)
public Number getMedianValue(int series, int item)
public Number getQ1Value(int series, int item)
public Number getQ3Value(int series, int item)
public Number getMinRegularValue(int series, int item)
public Number getMaxRegularValue(int series, int item)
public Number getMinOutlier(int series, int item)
public Number getMaxOutlier(int series, int item)
public List getOutliers(int series, int item)
public double getRangeLowerBound(boolean includeInterval)
public double getRangeUpperBound(boolean includeInterval)
public Range getRangeBounds(boolean includeInterval)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
Comparable seriesKey
List dates
List items
Number minimumRangeValue
Number maximumRangeValue
Range rangeBounds
double outlierCoefficient=Optional[1.5]
double faroutCoefficient=Optional[2.0]
