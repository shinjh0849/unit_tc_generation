public SeriesChangeEvent(Object source) { [EOL]     this(source, null); [EOL] } <line_num>: 69,71
public SeriesChangeEvent(Object source, SeriesChangeInfo summary) { [EOL]     super(source); [EOL]     this.summary = summary; [EOL] } <line_num>: 81,84
public SeriesChangeInfo getSummary() { [EOL]     return this.summary; [EOL] } <line_num>: 93,95
public void setSummary(SeriesChangeInfo summary) { [EOL]     this.summary = summary; [EOL] } <line_num>: 104,106
