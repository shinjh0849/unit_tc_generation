MockUnknownCalendar(long millis) { [EOL]     this.millis = millis; [EOL] } <line_num>: 31,33
MockUnknownCalendar(TimeZone zone) { [EOL]     this.zone = zone; [EOL] } <line_num>: 34,36
public long getTimeInMillis() { [EOL]     return millis; [EOL] } <line_num>: 38,40
public TimeZone getTimeZone() { [EOL]     return zone; [EOL] } <line_num>: 41,43
protected void computeTime() { [EOL] } <line_num>: 45,46
protected void computeFields() { [EOL] } <line_num>: 47,48
public void add(int field, int amount) { [EOL] } <line_num>: 49,50
public void roll(int field, boolean up) { [EOL] } <line_num>: 51,52
public int getMinimum(int field) { [EOL]     return 0; [EOL] } <line_num>: 53,55
public int getMaximum(int field) { [EOL]     return 0; [EOL] } <line_num>: 56,58
public int getGreatestMinimum(int field) { [EOL]     return 0; [EOL] } <line_num>: 59,61
public int getLeastMaximum(int field) { [EOL]     return 0; [EOL] } <line_num>: 62,64
