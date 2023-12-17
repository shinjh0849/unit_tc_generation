public StandardXYItemLabelGenerator() { [EOL]     this(DEFAULT_ITEM_LABEL_FORMAT, NumberFormat.getNumberInstance(), NumberFormat.getNumberInstance()); [EOL] } <line_num>: 88,91
public StandardXYItemLabelGenerator(String formatString) { [EOL]     this(formatString, NumberFormat.getNumberInstance(), NumberFormat.getNumberInstance()); [EOL] } <line_num>: 101,104
public StandardXYItemLabelGenerator(String formatString, NumberFormat xFormat, NumberFormat yFormat) { [EOL]     super(formatString, xFormat, yFormat); [EOL] } <line_num>: 116,120
public StandardXYItemLabelGenerator(String formatString, DateFormat xFormat, NumberFormat yFormat) { [EOL]     super(formatString, xFormat, yFormat); [EOL] } <line_num>: 132,136
public StandardXYItemLabelGenerator(String formatString, NumberFormat xFormat, DateFormat yFormat) { [EOL]     super(formatString, xFormat, yFormat); [EOL] } <line_num>: 152,156
public StandardXYItemLabelGenerator(String formatString, DateFormat xFormat, DateFormat yFormat) { [EOL]     super(formatString, xFormat, yFormat); [EOL] } <line_num>: 168,172
public String generateLabel(XYDataset dataset, int series, int item) { [EOL]     return generateLabelString(dataset, series, item); [EOL] } <line_num>: 183,185
public Object clone() throws CloneNotSupportedException { [EOL]     return super.clone(); [EOL] } <line_num>: 194,196
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof StandardXYItemLabelGenerator)) { [EOL]         return false; [EOL]     } [EOL]     return super.equals(obj); [EOL] } <line_num>: 205,213
