private Layer(String name) { [EOL]     this.name = name; [EOL] } <line_num>: 69,71
public String toString() { [EOL]     return this.name; [EOL] } <line_num>: 78,80
public boolean equals(Object obj) { [EOL]     if (this == obj) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof Layer)) { [EOL]         return false; [EOL]     } [EOL]     Layer layer = (Layer) obj; [EOL]     if (!this.name.equals(layer.name)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 90,106
public int hashCode() { [EOL]     return this.name.hashCode(); [EOL] } <line_num>: 113,115
private Object readResolve() throws ObjectStreamException { [EOL]     Layer result = null; [EOL]     if (this.equals(Layer.FOREGROUND)) { [EOL]         result = Layer.FOREGROUND; [EOL]     } else if (this.equals(Layer.BACKGROUND)) { [EOL]         result = Layer.BACKGROUND; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 124,133
