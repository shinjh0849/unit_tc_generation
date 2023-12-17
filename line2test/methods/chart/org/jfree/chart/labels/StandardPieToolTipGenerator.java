public StandardPieToolTipGenerator() { [EOL]     this(DEFAULT_TOOLTIP_FORMAT); [EOL] } <line_num>: 90,92
public StandardPieToolTipGenerator(Locale locale) { [EOL]     this(DEFAULT_TOOLTIP_FORMAT, locale); [EOL] } <line_num>: 102,104
public StandardPieToolTipGenerator(String labelFormat) { [EOL]     this(labelFormat, Locale.getDefault()); [EOL] } <line_num>: 111,113
public StandardPieToolTipGenerator(String labelFormat, Locale locale) { [EOL]     this(labelFormat, NumberFormat.getNumberInstance(locale), NumberFormat.getPercentInstance(locale)); [EOL] } <line_num>: 123,126
public StandardPieToolTipGenerator(String labelFormat, NumberFormat numberFormat, NumberFormat percentFormat) { [EOL]     super(labelFormat, numberFormat, percentFormat); [EOL] } <line_num>: 138,141
public String generateToolTip(PieDataset dataset, Comparable key) { [EOL]     return generateSectionLabel(dataset, key); [EOL] } <line_num>: 151,153
public Object clone() throws CloneNotSupportedException { [EOL]     return super.clone(); [EOL] } <line_num>: 162,164
