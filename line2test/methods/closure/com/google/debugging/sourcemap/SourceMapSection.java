@Deprecated [EOL] public SourceMapSection(String sectionUrl, int line, int column) { [EOL]     this.type = SectionType.URL; [EOL]     this.value = sectionUrl; [EOL]     this.line = line; [EOL]     this.column = column; [EOL] } <line_num>: 47,53
private SourceMapSection(SectionType type, String value, int line, int column) { [EOL]     this.type = type; [EOL]     this.value = value; [EOL]     this.line = line; [EOL]     this.column = column; [EOL] } <line_num>: 55,61
public static SourceMapSection forMap(String value, int line, int column) { [EOL]     return new SourceMapSection(SectionType.MAP, value, line, column); [EOL] } <line_num>: 63,65
public static SourceMapSection forURL(String value, int line, int column) { [EOL]     return new SourceMapSection(SectionType.URL, value, line, column); [EOL] } <line_num>: 67,69
public SectionType getSectionType() { [EOL]     return this.type; [EOL] } <line_num>: 71,73
@Deprecated [EOL] public String getSectionUrl() { [EOL]     assert (type.equals(SectionType.URL)); [EOL]     return value; [EOL] } <line_num>: 79,83
public String getSectionValue() { [EOL]     return value; [EOL] } <line_num>: 88,90
public int getLine() { [EOL]     return line; [EOL] } <line_num>: 95,97
public int getColumn() { [EOL]     return column; [EOL] } <line_num>: 102,104
