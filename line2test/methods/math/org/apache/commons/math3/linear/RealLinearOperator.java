public abstract int getRowDimension(); <line_num>: 59,59
public abstract int getColumnDimension(); <line_num>: 66,66
public abstract RealVector operate(final RealVector x) throws DimensionMismatchException; <line_num>: 76,77
public RealVector operateTranspose(final RealVector x) throws DimensionMismatchException, UnsupportedOperationException { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 93,96
public boolean isTransposable() { [EOL]     return false; [EOL] } <line_num>: 107,109
