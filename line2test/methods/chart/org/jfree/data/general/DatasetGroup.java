public DatasetGroup() { [EOL]     super(); [EOL]     this.id = "NOID"; [EOL] } <line_num>: 62,65
public DatasetGroup(String id) { [EOL]     if (id == null) { [EOL]         throw new IllegalArgumentException("Null 'id' argument."); [EOL]     } [EOL]     this.id = id; [EOL] } <line_num>: 72,77
public String getID() { [EOL]     return this.id; [EOL] } <line_num>: 84,86
public Object clone() throws CloneNotSupportedException { [EOL]     return super.clone(); [EOL] } <line_num>: 95,97
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof DatasetGroup)) { [EOL]         return false; [EOL]     } [EOL]     DatasetGroup that = (DatasetGroup) obj; [EOL]     if (!this.id.equals(that.id)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 106,118
