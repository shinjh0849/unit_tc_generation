public DiagnosticGroupWarningsGuard(DiagnosticGroup group, CheckLevel level) { [EOL]     this.group = group; [EOL]     this.level = level; [EOL] } <line_num>: 32,36
@Override [EOL] public CheckLevel level(JSError error) { [EOL]     return group.matches(error) ? level : null; [EOL] } <line_num>: 38,41
@Override [EOL] public boolean disables(DiagnosticGroup otherGroup) { [EOL]     return !level.isOn() && group.isSubGroup(otherGroup); [EOL] } <line_num>: 43,46
@Override [EOL] public boolean enables(DiagnosticGroup otherGroup) { [EOL]     if (level.isOn()) { [EOL]         for (DiagnosticType type : otherGroup.getTypes()) { [EOL]             if (group.matches(type)) { [EOL]                 return true; [EOL]             } [EOL]         } [EOL]     } [EOL]     return false; [EOL] } <line_num>: 48,59
@Override [EOL] public String toString() { [EOL]     return group + "(" + level + ")"; [EOL] } <line_num>: 61,64
