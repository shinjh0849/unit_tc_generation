public MockZone(long transition, int winterOffset, int sizeSecs) { [EOL]     super("MockZone"); [EOL]     this.transition = transition; [EOL]     this.winterOffset = winterOffset; [EOL]     this.sizeMillis = sizeSecs * 1000; [EOL] } <line_num>: 24,29
public int getOffset(long instant) { [EOL]     return (instant < transition ? winterOffset : winterOffset + sizeMillis); [EOL] } <line_num>: 31,33
public int getStandardOffset(long instant) { [EOL]     return winterOffset; [EOL] } <line_num>: 35,37
public long nextTransition(long instant) { [EOL]     return (instant < transition ? transition : transition + 180L * DateTimeConstants.MILLIS_PER_DAY); [EOL] } <line_num>: 39,41
public long previousTransition(long instant) { [EOL]     return (instant > transition ? transition : transition - 180L * DateTimeConstants.MILLIS_PER_DAY); [EOL] } <line_num>: 43,45
public boolean isFixed() { [EOL]     return false; [EOL] } <line_num>: 47,49
public String getNameKey(long instant) { [EOL]     return null; [EOL] } <line_num>: 51,53
public boolean equals(Object object) { [EOL]     return false; [EOL] } <line_num>: 55,57
