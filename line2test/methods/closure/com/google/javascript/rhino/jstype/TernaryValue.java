@Override [EOL] public TernaryValue and(TernaryValue that) { [EOL]     return FALSE; [EOL] } <line_num>: 61,64
@Override [EOL] public TernaryValue not() { [EOL]     return TRUE; [EOL] } <line_num>: 66,69
@Override [EOL] public TernaryValue or(TernaryValue that) { [EOL]     return that; [EOL] } <line_num>: 71,74
@Override [EOL] public TernaryValue xor(TernaryValue that) { [EOL]     return that; [EOL] } <line_num>: 76,79
@Override [EOL] public boolean toBoolean(boolean unknown) { [EOL]     return false; [EOL] } <line_num>: 81,84
@Override [EOL] public String toString() { [EOL]     return "false"; [EOL] } <line_num>: 86,89
@Override [EOL] public TernaryValue and(TernaryValue that) { [EOL]     return that; [EOL] } <line_num>: 96,99
@Override [EOL] public TernaryValue not() { [EOL]     return FALSE; [EOL] } <line_num>: 101,104
@Override [EOL] public TernaryValue or(TernaryValue that) { [EOL]     return TRUE; [EOL] } <line_num>: 106,109
@Override [EOL] public TernaryValue xor(TernaryValue that) { [EOL]     return that.not(); [EOL] } <line_num>: 111,114
@Override [EOL] public boolean toBoolean(boolean unknown) { [EOL]     return true; [EOL] } <line_num>: 116,119
@Override [EOL] public String toString() { [EOL]     return "true"; [EOL] } <line_num>: 121,124
@Override [EOL] public TernaryValue and(TernaryValue that) { [EOL]     return (FALSE.equals(that)) ? FALSE : UNKNOWN; [EOL] } <line_num>: 132,135
@Override [EOL] public TernaryValue not() { [EOL]     return UNKNOWN; [EOL] } <line_num>: 137,140
@Override [EOL] public TernaryValue or(TernaryValue that) { [EOL]     return (TRUE.equals(that)) ? TRUE : UNKNOWN; [EOL] } <line_num>: 142,145
@Override [EOL] public TernaryValue xor(TernaryValue that) { [EOL]     return UNKNOWN; [EOL] } <line_num>: 147,150
@Override [EOL] public boolean toBoolean(boolean unknown) { [EOL]     return unknown; [EOL] } <line_num>: 152,155
@Override [EOL] public String toString() { [EOL]     return "unknown"; [EOL] } <line_num>: 157,160
public abstract TernaryValue and(TernaryValue that); <line_num>: 166,166
public abstract TernaryValue not(); <line_num>: 171,171
public abstract TernaryValue or(TernaryValue that); <line_num>: 176,176
public abstract TernaryValue xor(TernaryValue that); <line_num>: 181,181
public abstract boolean toBoolean(boolean unknown); <line_num>: 196,196
public static TernaryValue forBoolean(boolean val) { [EOL]     return val ? TernaryValue.TRUE : TernaryValue.FALSE; [EOL] } <line_num>: 201,203
