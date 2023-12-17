public ChromosomePair(final Chromosome c1, final Chromosome c2) { [EOL]     super(); [EOL]     first = c1; [EOL]     second = c2; [EOL] } <line_num>: 38,42
public Chromosome getFirst() { [EOL]     return first; [EOL] } <line_num>: 49,51
public Chromosome getSecond() { [EOL]     return second; [EOL] } <line_num>: 58,60
@Override [EOL] public String toString() { [EOL]     return String.format("(%s,%s)", getFirst(), getSecond()); [EOL] } <line_num>: 62,65
