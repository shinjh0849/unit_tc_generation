public DefaultFieldMatrixChangingVisitor(final T zero) { [EOL]     this.zero = zero; [EOL] } <line_num>: 41,43
public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) { [EOL] } <line_num>: 46,48
public T visit(int row, int column, T value) { [EOL]     return value; [EOL] } <line_num>: 51,53
public T end() { [EOL]     return zero; [EOL] } <line_num>: 56,58
