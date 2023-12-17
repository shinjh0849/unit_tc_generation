public DefaultHeatMapDataset(int xSamples, int ySamples, double minX, double maxX, double minY, double maxY)
public int getXSampleCount()
public int getYSampleCount()
public double getMinimumXValue()
public double getMaximumXValue()
public double getMinimumYValue()
public double getMaximumYValue()
public double getXValue(int xIndex)
public double getYValue(int yIndex)
public double getZValue(int xIndex, int yIndex)
public Number getZ(int xIndex, int yIndex)
public void setZValue(int xIndex, int yIndex, double z)
public void setZValue(int xIndex, int yIndex, double z, boolean notify)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
int xSamples
int ySamples
double minX
double maxX
double minY
double maxY
double[][] zValues
