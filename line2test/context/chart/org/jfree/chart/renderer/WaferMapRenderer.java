public WaferMapRenderer()
public WaferMapRenderer(int paintLimit, int paintIndexMethod)
public WaferMapRenderer(Integer paintLimit, Integer paintIndexMethod)
private boolean isMethodValid(int method)
public DrawingSupplier getDrawingSupplier()
public WaferMapPlot getPlot()
public void setPlot(WaferMapPlot plot)
public Paint getChipColor(Number value)
private int getPaintIndex(Number value)
private void makePaintIndex()
private void makePositionIndex(Set uniqueValues)
private void makeValueIndex(Number max, Number min, Set uniqueValues)
public LegendItemCollection getLegendCollection()
private Number getMinPaintValue(Integer index)
private Number getMaxPaintValue(Integer index)
Map paintIndex
WaferMapPlot plot
int paintLimit
int DEFAULT_PAINT_LIMIT=Optional[35]
int POSITION_INDEX=Optional[0]
int VALUE_INDEX=Optional[1]
int paintIndexMethod
