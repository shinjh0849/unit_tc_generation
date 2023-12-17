public ValueSequence()
public ValueSequence(int length)
public DynamicTimeSeriesCollection(int nSeries, int nMoments)
public DynamicTimeSeriesCollection(int nSeries, int nMoments, TimeZone zone)
public DynamicTimeSeriesCollection(int nSeries, int nMoments, RegularTimePeriod timeSample)
public DynamicTimeSeriesCollection(int nSeries, int nMoments, RegularTimePeriod timeSample, TimeZone zone)
public void enterData(int index, float value)
public float getData(int index)
public synchronized long setTimeBase(RegularTimePeriod start)
protected void findDomainLimits()
public int getPosition()
public void setPosition(int position)
public void addSeries(float[] values, int seriesNumber, Comparable seriesKey)
public void setSeriesKey(int seriesNumber, Comparable key)
public void addValue(int seriesNumber, int index, float value)
public int getSeriesCount()
public int getItemCount(int series)
protected int translateGet(int toFetch)
public int offsetFromNewest(int delta)
public int offsetFromOldest(int delta)
protected int wrapOffset(int protoIndex)
public synchronized RegularTimePeriod advanceTime()
public void invalidateRangeInfo()
protected double findMaxValue()
public int getOldestIndex()
public int getNewestIndex()
public void appendData(float[] newData)
public void appendData(float[] newData, int insertionIndex, int refresh)
public RegularTimePeriod getNewestTime()
public RegularTimePeriod getOldestTime()
public Number getX(int series, int item)
public double getYValue(int series, int item)
public Number getY(int series, int item)
public Number getStartX(int series, int item)
public Number getEndX(int series, int item)
public Number getStartY(int series, int item)
public Number getEndY(int series, int item)
public Comparable getSeriesKey(int series)
protected void fireSeriesChanged()
public double getDomainLowerBound(boolean includeInterval)
public double getDomainUpperBound(boolean includeInterval)
public Range getDomainBounds(boolean includeInterval)
private long getX(RegularTimePeriod period)
public double getRangeLowerBound(boolean includeInterval)
public double getRangeUpperBound(boolean includeInterval)
public Range getRangeBounds(boolean includeInterval)
int START=Optional[0]
int MIDDLE=Optional[1]
int END=Optional[2]
int maximumItemCount=Optional[2000]
int historyCount
Comparable[] seriesKeys
Class timePeriodClass=Optional[Minute.class]
RegularTimePeriod[] pointsInTime
int seriesCount
ValueSequence[] valueHistory
Calendar workingCalendar
int position
boolean domainIsPointsInTime
int oldestAt
int newestAt
long deltaTime
Long domainStart
Long domainEnd
Range domainRange
Float minValue=Optional[new Float(0.0f)]
Float maxValue=Optional[null]
Range valueRange
