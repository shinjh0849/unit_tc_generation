public StandardCategoryItemLabelGenerator() { [EOL]     super(DEFAULT_LABEL_FORMAT_STRING, NumberFormat.getInstance()); [EOL] } <line_num>: 73,75
public StandardCategoryItemLabelGenerator(String labelFormat, NumberFormat formatter) { [EOL]     super(labelFormat, formatter); [EOL] } <line_num>: 84,87
public StandardCategoryItemLabelGenerator(String labelFormat, NumberFormat formatter, NumberFormat percentFormatter) { [EOL]     super(labelFormat, formatter, percentFormatter); [EOL] } <line_num>: 100,103
public StandardCategoryItemLabelGenerator(String labelFormat, DateFormat formatter) { [EOL]     super(labelFormat, formatter); [EOL] } <line_num>: 112,115
public String generateLabel(CategoryDataset dataset, int row, int column) { [EOL]     return generateLabelString(dataset, row, column); [EOL] } <line_num>: 128,130
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof StandardCategoryItemLabelGenerator)) { [EOL]         return false; [EOL]     } [EOL]     return super.equals(obj); [EOL] } <line_num>: 140,148
