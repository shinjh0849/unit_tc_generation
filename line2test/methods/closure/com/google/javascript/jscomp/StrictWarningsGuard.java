@Override [EOL] public CheckLevel level(JSError error) { [EOL]     if (error.getType() == UNRAISABLE_WARNING) { [EOL]         return null; [EOL]     } [EOL]     return error.getDefaultLevel().isOn() ? CheckLevel.ERROR : null; [EOL] } <line_num>: 30,36
@Override [EOL] protected int getPriority() { [EOL]     return WarningsGuard.Priority.STRICT.value; [EOL] } <line_num>: 38,41
