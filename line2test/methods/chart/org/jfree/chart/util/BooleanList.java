public BooleanList() { [EOL] } <line_num>: 60,61
public Boolean getBoolean(int index) { [EOL]     return (Boolean) get(index); [EOL] } <line_num>: 70,72
public void setBoolean(int index, Boolean b) { [EOL]     set(index, b); [EOL] } <line_num>: 81,83
public boolean equals(Object obj) { [EOL]     if (obj instanceof BooleanList) { [EOL]         return super.equals(obj); [EOL]     } [EOL]     return false; [EOL] } <line_num>: 92,97
public int hashCode() { [EOL]     return super.hashCode(); [EOL] } <line_num>: 104,106
