void reportChange(); <line_num>: 29,29
@Override [EOL] public void reportChange() { [EOL]     hasChanged = true; [EOL] } <line_num>: 38,41
boolean hasCodeChanged() { [EOL]     return hasChanged; [EOL] } <line_num>: 43,45
void reset() { [EOL]     hasChanged = false; [EOL] } <line_num>: 47,49
@Override [EOL] public void reportChange() { [EOL]     throw new IllegalStateException("Code changes forbidden"); [EOL] } <line_num>: 56,59
