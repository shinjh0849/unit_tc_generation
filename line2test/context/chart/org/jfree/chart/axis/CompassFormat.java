public CompassFormat()
public String getDirectionCode(double direction)
public StringBuffer format(double number, StringBuffer toAppendTo, FieldPosition pos)
public StringBuffer format(long number, StringBuffer toAppendTo, FieldPosition pos)
public Number parse(String source, ParsePosition parsePosition)
String N=Optional["N"]
String E=Optional["E"]
String S=Optional["S"]
String W=Optional["W"]
String[] DIRECTIONS=Optional[{ N, N + N + E, N + E, E + N + E, E, E + S + E, S + E, S + S + E, S, S + S + W, S + W, W + S + W, W, W + N + W, N + W, N + N + W, N }]
