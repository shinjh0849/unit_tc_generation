public ExtensionFileFilter(String description, String extension) { [EOL]     this.description = description; [EOL]     this.extension = extension; [EOL] } <line_num>: 66,69
public boolean accept(File file) { [EOL]     if (file.isDirectory()) { [EOL]         return true; [EOL]     } [EOL]     String name = file.getName().toLowerCase(); [EOL]     if (name.endsWith(this.extension)) { [EOL]         return true; [EOL]     } else { [EOL]         return false; [EOL]     } [EOL] } <line_num>: 78,92
public String getDescription() { [EOL]     return this.description; [EOL] } <line_num>: 99,101
