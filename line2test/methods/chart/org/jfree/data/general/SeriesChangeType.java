private SeriesChangeType(String name) { [EOL]     this.name = name; [EOL] } <line_num>: 92,94
public String toString() { [EOL]     return this.name; [EOL] } <line_num>: 101,103
public boolean equals(Object obj) { [EOL]     if (this == obj) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof SeriesChangeType)) { [EOL]         return false; [EOL]     } [EOL]     SeriesChangeType style = (SeriesChangeType) obj; [EOL]     if (!this.name.equals(style.toString())) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 113,125
public int hashCode() { [EOL]     return this.name.hashCode(); [EOL] } <line_num>: 132,134
private Object readResolve() throws ObjectStreamException { [EOL]     Object result = null; [EOL]     if (this.equals(SeriesChangeType.ADD)) { [EOL]         result = SeriesChangeType.ADD; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 143,150
