private UnitType(String name) { [EOL]     this.name = name; [EOL] } <line_num>: 69,71
public String toString() { [EOL]     return this.name; [EOL] } <line_num>: 78,80
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof UnitType)) { [EOL]         return false; [EOL]     } [EOL]     UnitType that = (UnitType) obj; [EOL]     if (!this.name.equals(that.name)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 90,102
public int hashCode() { [EOL]     return this.name.hashCode(); [EOL] } <line_num>: 109,111
private Object readResolve() throws ObjectStreamException { [EOL]     if (this.equals(UnitType.ABSOLUTE)) { [EOL]         return UnitType.ABSOLUTE; [EOL]     } else if (this.equals(UnitType.RELATIVE)) { [EOL]         return UnitType.RELATIVE; [EOL]     } [EOL]     return null; [EOL] } <line_num>: 120,128
