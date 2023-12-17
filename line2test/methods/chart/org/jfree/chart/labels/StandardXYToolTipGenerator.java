public StandardXYToolTipGenerator() { [EOL]     this(DEFAULT_TOOL_TIP_FORMAT, NumberFormat.getNumberInstance(), NumberFormat.getNumberInstance()); [EOL] } <line_num>: 81,84
public StandardXYToolTipGenerator(String formatString, NumberFormat xFormat, NumberFormat yFormat) { [EOL]     super(formatString, xFormat, yFormat); [EOL] } <line_num>: 96,101
public StandardXYToolTipGenerator(String formatString, DateFormat xFormat, NumberFormat yFormat) { [EOL]     super(formatString, xFormat, yFormat); [EOL] } <line_num>: 113,118
public StandardXYToolTipGenerator(String formatString, NumberFormat xFormat, DateFormat yFormat) { [EOL]     super(formatString, xFormat, yFormat); [EOL] } <line_num>: 134,138
public StandardXYToolTipGenerator(String formatString, DateFormat xFormat, DateFormat yFormat) { [EOL]     super(formatString, xFormat, yFormat); [EOL] } <line_num>: 149,154
public static StandardXYToolTipGenerator getTimeSeriesInstance() { [EOL]     return new StandardXYToolTipGenerator(DEFAULT_TOOL_TIP_FORMAT, DateFormat.getInstance(), NumberFormat.getInstance()); [EOL] } <line_num>: 73,76
public String generateToolTip(XYDataset dataset, int series, int item) { [EOL]     return generateLabelString(dataset, series, item); [EOL] } <line_num>: 165,167
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof StandardXYToolTipGenerator)) { [EOL]         return false; [EOL]     } [EOL]     return super.equals(obj); [EOL] } <line_num>: 176,184
public Object clone() throws CloneNotSupportedException { [EOL]     return super.clone(); [EOL] } <line_num>: 193,195
