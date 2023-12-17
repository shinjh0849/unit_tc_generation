private KeyedValueComparatorType(String name) { [EOL]     this.name = name; [EOL] } <line_num>: 66,68
public String toString() { [EOL]     return this.name; [EOL] } <line_num>: 75,77
public boolean equals(Object o) { [EOL]     if (this == o) { [EOL]         return true; [EOL]     } [EOL]     if (!(o instanceof KeyedValueComparatorType)) { [EOL]         return false; [EOL]     } [EOL]     KeyedValueComparatorType type = (KeyedValueComparatorType) o; [EOL]     if (!this.name.equals(type.name)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 87,101
public int hashCode() { [EOL]     return this.name.hashCode(); [EOL] } <line_num>: 108,110
