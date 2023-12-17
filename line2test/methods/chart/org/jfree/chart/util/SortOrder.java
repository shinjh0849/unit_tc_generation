private SortOrder(String name) { [EOL]     this.name = name; [EOL] } <line_num>: 74,76
public String toString() { [EOL]     return this.name; [EOL] } <line_num>: 83,85
public boolean equals(Object obj) { [EOL]     if (this == obj) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof SortOrder)) { [EOL]         return false; [EOL]     } [EOL]     final SortOrder that = (SortOrder) obj; [EOL]     if (!this.name.equals(that.toString())) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 95,110
public int hashCode() { [EOL]     return this.name.hashCode(); [EOL] } <line_num>: 117,119
private Object readResolve() throws ObjectStreamException { [EOL]     if (this.equals(SortOrder.ASCENDING)) { [EOL]         return SortOrder.ASCENDING; [EOL]     } else if (this.equals(SortOrder.DESCENDING)) { [EOL]         return SortOrder.DESCENDING; [EOL]     } [EOL]     return null; [EOL] } <line_num>: 128,136
