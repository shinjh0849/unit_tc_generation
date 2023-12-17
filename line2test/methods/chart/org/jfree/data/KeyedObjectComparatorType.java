private KeyedObjectComparatorType(String name) { [EOL]     this.name = name; [EOL] } <line_num>: 65,67
public String toString() { [EOL]     return this.name; [EOL] } <line_num>: 74,76
public boolean equals(Object obj) { [EOL]     if (this == obj) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof KeyedObjectComparatorType)) { [EOL]         return false; [EOL]     } [EOL]     KeyedObjectComparatorType type = (KeyedObjectComparatorType) obj; [EOL]     if (!this.name.equals(type.name)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 86,98
public int hashCode() { [EOL]     return this.name.hashCode(); [EOL] } <line_num>: 105,107
