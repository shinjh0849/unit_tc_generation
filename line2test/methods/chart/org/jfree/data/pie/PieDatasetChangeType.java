private PieDatasetChangeType(String name) { [EOL]     this.name = name; [EOL] } <line_num>: 101,103
public String toString() { [EOL]     return this.name; [EOL] } <line_num>: 110,112
public boolean equals(Object obj) { [EOL]     if (this == obj) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof PieDatasetChangeType)) { [EOL]         return false; [EOL]     } [EOL]     PieDatasetChangeType pdct = (PieDatasetChangeType) obj; [EOL]     if (!this.name.equals(pdct.toString())) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 122,134
public int hashCode() { [EOL]     return this.name.hashCode(); [EOL] } <line_num>: 141,143
private Object readResolve() throws ObjectStreamException { [EOL]     Object result = null; [EOL]     if (this.equals(PieDatasetChangeType.ADD)) { [EOL]         result = PieDatasetChangeType.ADD; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 152,159
