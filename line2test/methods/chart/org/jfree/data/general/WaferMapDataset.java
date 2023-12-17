public WaferMapDataset(int maxChipX, int maxChipY) { [EOL]     this(maxChipX, maxChipY, null); [EOL] } <line_num>: 87,89
public WaferMapDataset(int maxChipX, int maxChipY, Number chipSpace) { [EOL]     this.maxValue = new Double(Double.NEGATIVE_INFINITY); [EOL]     this.minValue = new Double(Double.POSITIVE_INFINITY); [EOL]     this.data = new DefaultKeyedValues2D(); [EOL]     this.maxChipX = maxChipX; [EOL]     this.maxChipY = maxChipY; [EOL]     if (chipSpace == null) { [EOL]         this.chipSpace = DEFAULT_CHIP_SPACE; [EOL]     } else { [EOL]         this.chipSpace = chipSpace.doubleValue(); [EOL]     } [EOL] } <line_num>: 98,113
public void addValue(Number value, Comparable chipx, Comparable chipy) { [EOL]     setValue(value, chipx, chipy); [EOL] } <line_num>: 122,124
public void addValue(int v, int x, int y) { [EOL]     setValue(new Double(v), new Integer(x), new Integer(y)); [EOL] } <line_num>: 133,135
public void setValue(Number value, Comparable chipx, Comparable chipy) { [EOL]     this.data.setValue(value, chipx, chipy); [EOL]     if (isMaxValue(value)) { [EOL]         this.maxValue = (Double) value; [EOL]     } [EOL]     if (isMinValue(value)) { [EOL]         this.minValue = (Double) value; [EOL]     } [EOL] } <line_num>: 144,152
public int getUniqueValueCount() { [EOL]     return getUniqueValues().size(); [EOL] } <line_num>: 159,161
public Set getUniqueValues() { [EOL]     Set unique = new TreeSet(); [EOL]     for (int r = 0; r < this.data.getRowCount(); r++) { [EOL]         for (int c = 0; c < this.data.getColumnCount(); c++) { [EOL]             Number value = this.data.getValue(r, c); [EOL]             if (value != null) { [EOL]                 unique.add(value); [EOL]             } [EOL]         } [EOL]     } [EOL]     return unique; [EOL] } <line_num>: 168,180
public Number getChipValue(int chipx, int chipy) { [EOL]     return getChipValue(new Integer(chipx), new Integer(chipy)); [EOL] } <line_num>: 190,192
public Number getChipValue(Comparable chipx, Comparable chipy) { [EOL]     int rowIndex = this.data.getRowIndex(chipx); [EOL]     if (rowIndex < 0) { [EOL]         return null; [EOL]     } [EOL]     int colIndex = this.data.getColumnIndex(chipy); [EOL]     if (colIndex < 0) { [EOL]         return null; [EOL]     } [EOL]     return this.data.getValue(rowIndex, colIndex); [EOL] } <line_num>: 202,212
public boolean isMaxValue(Number check) { [EOL]     if (check.doubleValue() > this.maxValue.doubleValue()) { [EOL]         return true; [EOL]     } [EOL]     return false; [EOL] } <line_num>: 221,226
public boolean isMinValue(Number check) { [EOL]     if (check.doubleValue() < this.minValue.doubleValue()) { [EOL]         return true; [EOL]     } [EOL]     return false; [EOL] } <line_num>: 235,240
public Number getMaxValue() { [EOL]     return this.maxValue; [EOL] } <line_num>: 247,249
public Number getMinValue() { [EOL]     return this.minValue; [EOL] } <line_num>: 256,258
public int getMaxChipX() { [EOL]     return this.maxChipX; [EOL] } <line_num>: 265,267
public void setMaxChipX(int maxChipX) { [EOL]     this.maxChipX = maxChipX; [EOL] } <line_num>: 274,276
public int getMaxChipY() { [EOL]     return this.maxChipY; [EOL] } <line_num>: 283,285
public void setMaxChipY(int maxChipY) { [EOL]     this.maxChipY = maxChipY; [EOL] } <line_num>: 292,294
public double getChipSpace() { [EOL]     return this.chipSpace; [EOL] } <line_num>: 301,303
public void setChipSpace(double space) { [EOL]     this.chipSpace = space; [EOL] } <line_num>: 310,312
