public VectorDataItem(double x, double y, double deltaX, double deltaY) { [EOL]     super(new XYCoordinate(x, y), new Vector(deltaX, deltaY)); [EOL] } <line_num>: 64,66
public double getXValue() { [EOL]     XYCoordinate xy = (XYCoordinate) getComparable(); [EOL]     return xy.getX(); [EOL] } <line_num>: 73,76
public double getYValue() { [EOL]     XYCoordinate xy = (XYCoordinate) getComparable(); [EOL]     return xy.getY(); [EOL] } <line_num>: 83,86
public Vector getVector() { [EOL]     return (Vector) getObject(); [EOL] } <line_num>: 93,95
public double getVectorX() { [EOL]     Vector vi = (Vector) getObject(); [EOL]     if (vi != null) { [EOL]         return vi.getX(); [EOL]     } else { [EOL]         return Double.NaN; [EOL]     } [EOL] } <line_num>: 102,110
public double getVectorY() { [EOL]     Vector vi = (Vector) getObject(); [EOL]     if (vi != null) { [EOL]         return vi.getY(); [EOL]     } else { [EOL]         return Double.NaN; [EOL]     } [EOL] } <line_num>: 117,125
