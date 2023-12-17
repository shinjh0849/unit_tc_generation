public LogarithmicAxis(String label)
public void setAllowNegativesFlag(boolean flgVal)
public boolean getAllowNegativesFlag()
public void setStrictValuesFlag(boolean flgVal)
public boolean getStrictValuesFlag()
public void setExpTickLabelsFlag(boolean flgVal)
public boolean getExpTickLabelsFlag()
public void setLog10TickLabelsFlag(boolean flag)
public boolean getLog10TickLabelsFlag()
public void setAutoRangeNextLogFlag(boolean flag)
public boolean getAutoRangeNextLogFlag()
public void setRange(Range range)
protected void setupSmallLogFlag()
protected void setupNumberFmtObj()
protected double switchedLog10(double val)
public double switchedPow10(double val)
public double adjustedLog10(double val)
public double adjustedPow10(double val)
protected double computeLogFloor(double lower)
protected double computeLogCeil(double upper)
public void autoAdjustRange()
public double valueToJava2D(double value, Rectangle2D plotArea, RectangleEdge edge)
public double java2DToValue(double java2DValue, Rectangle2D plotArea, RectangleEdge edge)
public void zoomRange(double lowerPercent, double upperPercent)
protected List refreshTicksHorizontal(Graphics2D g2, Rectangle2D dataArea, RectangleEdge edge)
protected List refreshTicksVertical(Graphics2D g2, Rectangle2D dataArea, RectangleEdge edge)
protected String makeTickLabel(double val, boolean forceFmtFlag)
protected String makeTickLabel(double val)
long serialVersionUID=Optional[2502918599004103054L]
double LOG10_VALUE=Optional[Math.log(10.0)]
double SMALL_LOG_VALUE=Optional[1e-100]
boolean allowNegativesFlag=Optional[false]
boolean strictValuesFlag=Optional[true]
NumberFormat numberFormatterObj=Optional[NumberFormat.getInstance()]
boolean expTickLabelsFlag=Optional[false]
boolean log10TickLabelsFlag=Optional[false]
boolean autoRangeNextLogFlag=Optional[false]
boolean smallLogFlag=Optional[false]
