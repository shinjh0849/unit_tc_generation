CSVRecord(String[] values, Map<String, Integer> mapping) { [EOL]     this.values = values != null ? values : EMPTY_STRING_ARRAY; [EOL]     this.mapping = mapping; [EOL] } <line_num>: 38,41
public String get(int i) { [EOL]     return values[i]; [EOL] } <line_num>: 48,50
public String get(String name) { [EOL]     if (mapping == null) { [EOL]         throw new IllegalStateException("No header was specified, the record values can't be accessed by name"); [EOL]     } [EOL]     Integer index = mapping.get(name); [EOL]     return index != null ? values[index.intValue()] : null; [EOL] } <line_num>: 59,67
public Iterator<String> iterator() { [EOL]     return Arrays.asList(values).iterator(); [EOL] } <line_num>: 69,71
String[] values() { [EOL]     return values; [EOL] } <line_num>: 73,75
public int size() { [EOL]     return values.length; [EOL] } <line_num>: 80,82
@Override [EOL] public String toString() { [EOL]     return Arrays.toString(values); [EOL] } <line_num>: 84,87
