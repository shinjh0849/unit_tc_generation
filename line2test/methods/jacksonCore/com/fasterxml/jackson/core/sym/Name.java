protected Name(String name, int hashCode) { [EOL]     _name = name; [EOL]     _hashCode = hashCode; [EOL] } <line_num>: 16,19
public String getName() { [EOL]     return _name; [EOL] } <line_num>: 21,21
public abstract boolean equals(int quad1); <line_num>: 29,29
public abstract boolean equals(int quad1, int quad2); <line_num>: 31,31
public abstract boolean equals(int[] quads, int qlen); <line_num>: 33,33
@Override [EOL] public String toString() { [EOL]     return _name; [EOL] } <line_num>: 41,41
@Override [EOL] public final int hashCode() { [EOL]     return _hashCode; [EOL] } <line_num>: 43,43
@Override [EOL] public boolean equals(Object o) { [EOL]     return (o == this); [EOL] } <line_num>: 45,49
