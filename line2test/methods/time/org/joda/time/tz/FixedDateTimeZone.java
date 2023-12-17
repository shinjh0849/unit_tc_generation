public FixedDateTimeZone(String id, String nameKey, int wallOffset, int standardOffset) { [EOL]     super(id); [EOL]     iNameKey = nameKey; [EOL]     iWallOffset = wallOffset; [EOL]     iStandardOffset = standardOffset; [EOL] } <line_num>: 36,42
public String getNameKey(long instant) { [EOL]     return iNameKey; [EOL] } <line_num>: 44,46
public int getOffset(long instant) { [EOL]     return iWallOffset; [EOL] } <line_num>: 48,50
public int getStandardOffset(long instant) { [EOL]     return iStandardOffset; [EOL] } <line_num>: 52,54
public int getOffsetFromLocal(long instantLocal) { [EOL]     return iWallOffset; [EOL] } <line_num>: 56,58
public boolean isFixed() { [EOL]     return true; [EOL] } <line_num>: 60,62
public long nextTransition(long instant) { [EOL]     return instant; [EOL] } <line_num>: 64,66
public long previousTransition(long instant) { [EOL]     return instant; [EOL] } <line_num>: 68,70
public java.util.TimeZone toTimeZone() { [EOL]     String id = getID(); [EOL]     if (id.length() == 6 && (id.startsWith("+") || id.startsWith("-"))) { [EOL]         return java.util.TimeZone.getTimeZone("GMT" + getID()); [EOL]     } [EOL]     return new java.util.SimpleTimeZone(iWallOffset, getID()); [EOL] } <line_num>: 76,85
public boolean equals(Object obj) { [EOL]     if (this == obj) { [EOL]         return true; [EOL]     } [EOL]     if (obj instanceof FixedDateTimeZone) { [EOL]         FixedDateTimeZone other = (FixedDateTimeZone) obj; [EOL]         return getID().equals(other.getID()) && iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset; [EOL]     } [EOL]     return false; [EOL] } <line_num>: 87,99
public int hashCode() { [EOL]     return getID().hashCode() + 37 * iStandardOffset + 31 * iWallOffset; [EOL] } <line_num>: 101,103
