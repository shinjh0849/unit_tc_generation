protected MathIllegalNumberException(Localizable pattern, Number wrong, Object... arguments) { [EOL]     super(pattern, wrong, arguments); [EOL]     argument = wrong; [EOL] } <line_num>: 48,53
public Number getArgument() { [EOL]     return argument; [EOL] } <line_num>: 58,60
