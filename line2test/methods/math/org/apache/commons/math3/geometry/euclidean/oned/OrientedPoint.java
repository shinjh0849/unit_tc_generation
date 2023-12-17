public OrientedPoint(final Vector1D location, final boolean direct) { [EOL]     this.location = location; [EOL]     this.direct = direct; [EOL] } <line_num>: 42,45
public OrientedPoint copySelf() { [EOL]     return this; [EOL] } <line_num>: 52,54
public double getOffset(final Vector<Euclidean1D> point) { [EOL]     final double delta = ((Vector1D) point).getX() - location.getX(); [EOL]     return direct ? delta : -delta; [EOL] } <line_num>: 57,60
public SubOrientedPoint wholeHyperplane() { [EOL]     return new SubOrientedPoint(this, null); [EOL] } <line_num>: 73,75
public IntervalsSet wholeSpace() { [EOL]     return new IntervalsSet(); [EOL] } <line_num>: 81,83
public boolean sameOrientationAs(final Hyperplane<Euclidean1D> other) { [EOL]     return !(direct ^ ((OrientedPoint) other).direct); [EOL] } <line_num>: 86,88
public Vector1D getLocation() { [EOL]     return location; [EOL] } <line_num>: 93,95
public boolean isDirect() { [EOL]     return direct; [EOL] } <line_num>: 101,103
public void revertSelf() { [EOL]     direct = !direct; [EOL] } <line_num>: 107,109
