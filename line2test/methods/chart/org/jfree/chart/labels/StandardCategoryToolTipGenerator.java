public StandardCategoryToolTipGenerator() { [EOL]     super(DEFAULT_TOOL_TIP_FORMAT_STRING, NumberFormat.getInstance()); [EOL] } <line_num>: 69,71
public StandardCategoryToolTipGenerator(String labelFormat, NumberFormat formatter) { [EOL]     super(labelFormat, formatter); [EOL] } <line_num>: 80,83
public StandardCategoryToolTipGenerator(String labelFormat, DateFormat formatter) { [EOL]     super(labelFormat, formatter); [EOL] } <line_num>: 92,95
public String generateToolTip(CategoryDataset dataset, int row, int column) { [EOL]     return generateLabelString(dataset, row, column); [EOL] } <line_num>: 108,111
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof StandardCategoryToolTipGenerator)) { [EOL]         return false; [EOL]     } [EOL]     return super.equals(obj); [EOL] } <line_num>: 120,128
