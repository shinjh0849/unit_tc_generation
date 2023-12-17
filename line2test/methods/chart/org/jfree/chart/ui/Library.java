public Library(String name, String version, String licence, String info) { [EOL]     this.name = name; [EOL]     this.version = version; [EOL]     this.licenceName = licence; [EOL]     this.info = info; [EOL] } <line_num>: 71,77
protected Library() { [EOL] } <line_num>: 82,84
public String getName() { [EOL]     return this.name; [EOL] } <line_num>: 91,93
public String getVersion() { [EOL]     return this.version; [EOL] } <line_num>: 100,102
public String getLicenceName() { [EOL]     return this.licenceName; [EOL] } <line_num>: 109,111
public String getInfo() { [EOL]     return this.info; [EOL] } <line_num>: 118,120
protected void setInfo(String info) { [EOL]     this.info = info; [EOL] } <line_num>: 127,129
protected void setLicenceName(String licenceName) { [EOL]     this.licenceName = licenceName; [EOL] } <line_num>: 136,138
protected void setName(String name) { [EOL]     this.name = name; [EOL] } <line_num>: 145,147
protected void setVersion(String version) { [EOL]     this.version = version; [EOL] } <line_num>: 154,156
public boolean equals(Object obj) { [EOL]     if (this == obj) { [EOL]         return true; [EOL]     } [EOL]     if (obj == null || getClass() != obj.getClass()) { [EOL]         return false; [EOL]     } [EOL]     Library library = (Library) obj; [EOL]     if (this.name != null ? !this.name.equals(library.name) : library.name != null) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 165,181
public int hashCode() { [EOL]     return (this.name != null ? this.name.hashCode() : 0); [EOL] } <line_num>: 188,190
