public ArArchiveEntry(String name, long length) { [EOL]     this(name, length, 0, 0, 33188, System.currentTimeMillis()); [EOL] } <line_num>: 35,37
public ArArchiveEntry(String name, long length, int userId, int groupId, int mode, long lastModified) { [EOL]     this.name = name; [EOL]     this.length = length; [EOL]     this.userId = userId; [EOL]     this.groupId = groupId; [EOL]     this.mode = mode; [EOL]     this.lastModified = lastModified; [EOL] } <line_num>: 39,46
public long getSize() { [EOL]     return this.getLength(); [EOL] } <line_num>: 48,50
public String getName() { [EOL]     return name; [EOL] } <line_num>: 52,54
public int getUserId() { [EOL]     return userId; [EOL] } <line_num>: 56,58
public int getGroupId() { [EOL]     return groupId; [EOL] } <line_num>: 60,62
public int getMode() { [EOL]     return mode; [EOL] } <line_num>: 64,66
public long getLastModified() { [EOL]     return lastModified; [EOL] } <line_num>: 68,70
public long getLength() { [EOL]     return length; [EOL] } <line_num>: 72,74
public boolean isDirectory() { [EOL]     return false; [EOL] } <line_num>: 76,78
