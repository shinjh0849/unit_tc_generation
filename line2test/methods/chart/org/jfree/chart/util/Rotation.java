private Rotation(final String name, final double factor) { [EOL]     this.name = name; [EOL]     this.factor = factor; [EOL] } <line_num>: 81,84
public String toString() { [EOL]     return this.name; [EOL] } <line_num>: 91,93
public double getFactor() { [EOL]     return this.factor; [EOL] } <line_num>: 101,103
public boolean equals(final Object o) { [EOL]     if (this == o) { [EOL]         return true; [EOL]     } [EOL]     if (!(o instanceof Rotation)) { [EOL]         return false; [EOL]     } [EOL]     final Rotation rotation = (Rotation) o; [EOL]     if (this.factor != rotation.factor) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 113,128
public int hashCode() { [EOL]     final long temp = Double.doubleToLongBits(this.factor); [EOL]     return (int) (temp ^ (temp >>> 32)); [EOL] } <line_num>: 135,138
private Object readResolve() throws ObjectStreamException { [EOL]     if (this.equals(Rotation.CLOCKWISE)) { [EOL]         return Rotation.CLOCKWISE; [EOL]     } else if (this.equals(Rotation.ANTICLOCKWISE)) { [EOL]         return Rotation.ANTICLOCKWISE; [EOL]     } [EOL]     return null; [EOL] } <line_num>: 147,155
