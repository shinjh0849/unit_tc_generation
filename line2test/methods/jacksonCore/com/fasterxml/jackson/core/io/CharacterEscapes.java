public abstract int[] getEscapeCodesForAscii(); <line_num>: 50,50
public abstract SerializableString getEscapeSequence(int ch); <line_num>: 59,59
public static int[] standardAsciiEscapesForJSON() { [EOL]     int[] esc = CharTypes.get7BitOutputEscapes(); [EOL]     return Arrays.copyOf(esc, esc.length); [EOL] } <line_num>: 67,71
