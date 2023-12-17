@Override [EOL] protected double transformed(final double g) { [EOL]     return 0; [EOL] } <line_num>: 40,43
@Override [EOL] protected double transformed(final double g) { [EOL]     return g; [EOL] } <line_num>: 54,57
@Override [EOL] protected double transformed(final double g) { [EOL]     return -g; [EOL] } <line_num>: 68,71
@Override [EOL] protected double transformed(final double g) { [EOL]     return FastMath.min(-Precision.SAFE_MIN, FastMath.min(-g, +g)); [EOL] } <line_num>: 82,85
@Override [EOL] protected double transformed(final double g) { [EOL]     return FastMath.max(+Precision.SAFE_MIN, FastMath.max(-g, +g)); [EOL] } <line_num>: 96,99
protected abstract double transformed(double g); <line_num>: 106,106
