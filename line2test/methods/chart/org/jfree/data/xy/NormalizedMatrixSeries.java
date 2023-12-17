public NormalizedMatrixSeries(String name, int rows, int columns) { [EOL]     super(name, rows, columns); [EOL]     this.m_totalSum = Double.MIN_VALUE; [EOL] } <line_num>: 71,81
public Number getItem(int itemIndex) { [EOL]     int i = getItemRow(itemIndex); [EOL]     int j = getItemColumn(itemIndex); [EOL]     double mij = get(i, j) * this.m_scaleFactor; [EOL]     Number n = new Double(mij / this.m_totalSum); [EOL]     return n; [EOL] } <line_num>: 92,100
public void setScaleFactor(double factor) { [EOL]     this.m_scaleFactor = factor; [EOL] } <line_num>: 110,113
public double getScaleFactor() { [EOL]     return this.m_scaleFactor; [EOL] } <line_num>: 122,124
public void update(int i, int j, double mij) { [EOL]     this.m_totalSum -= get(i, j); [EOL]     this.m_totalSum += mij; [EOL]     super.update(i, j, mij); [EOL] } <line_num>: 136,141
public void zeroAll() { [EOL]     this.m_totalSum = 0; [EOL]     super.zeroAll(); [EOL] } <line_num>: 146,149
