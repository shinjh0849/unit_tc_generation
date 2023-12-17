public AbstractMessageFormatter(SourceExcerptProvider source) { [EOL]     this.source = source; [EOL] } <line_num>: 32,34
Color(String controlCharacter) { [EOL]     this.controlCharacter = controlCharacter; [EOL] } <line_num>: 64,66
public void setColorize(boolean colorize) { [EOL]     this.colorize = colorize; [EOL] } <line_num>: 36,38
protected final SourceExcerptProvider getSource() { [EOL]     return source; [EOL] } <line_num>: 43,45
static boolean termSupportsColor(String term) { [EOL]     return SUPPORTED_COLOR_TERMINALS.contains(term); [EOL] } <line_num>: 53,55
public String getControlCharacter() { [EOL]     return controlCharacter; [EOL] } <line_num>: 68,70
String getLevelName(CheckLevel level) { [EOL]     switch(level) { [EOL]         case ERROR: [EOL]             return maybeColorize("ERROR", Color.ERROR); [EOL]         case WARNING: [EOL]             return maybeColorize("WARNING", Color.WARNING); [EOL]         default: [EOL]             return level.toString(); [EOL]     } [EOL] } <line_num>: 73,79
private String maybeColorize(String text, Color color) { [EOL]     if (!colorize) [EOL]         return text; [EOL]     return color.getControlCharacter() + text + Color.RESET.getControlCharacter(); [EOL] } <line_num>: 81,86
