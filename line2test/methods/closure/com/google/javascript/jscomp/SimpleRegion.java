public SimpleRegion(int beginningLineNumber, int endingLineNumber, String source) { [EOL]     this.beginningLineNumber = beginningLineNumber; [EOL]     this.endingLineNumber = endingLineNumber; [EOL]     this.source = source; [EOL] } <line_num>: 26,31
@Override [EOL] public int getBeginningLineNumber() { [EOL]     return beginningLineNumber; [EOL] } <line_num>: 33,36
@Override [EOL] public int getEndingLineNumber() { [EOL]     return endingLineNumber; [EOL] } <line_num>: 38,41
@Override [EOL] public String getSourceExcerpt() { [EOL]     return source; [EOL] } <line_num>: 43,46
