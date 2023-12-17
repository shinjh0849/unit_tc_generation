public InputId(String id) { [EOL]     this.id = id; [EOL] } <line_num>: 51,53
public String getIdName() { [EOL]     return id; [EOL] } <line_num>: 55,57
@Override [EOL] public int hashCode() { [EOL]     return id.hashCode(); [EOL] } <line_num>: 59,62
@Override [EOL] public boolean equals(Object obj) { [EOL]     if (this == obj) [EOL]         return true; [EOL]     if (obj == null) [EOL]         return false; [EOL]     if (getClass() != obj.getClass()) [EOL]         return false; [EOL]     return id.equals(((InputId) obj).id); [EOL] } <line_num>: 64,70
@Override [EOL] public String toString() { [EOL]     return "InputId: " + getIdName(); [EOL] } <line_num>: 72,75
