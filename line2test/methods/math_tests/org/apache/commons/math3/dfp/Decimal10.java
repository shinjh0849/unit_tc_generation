Decimal10(final DfpField factory) { [EOL]     super(factory); [EOL] } <line_num>: 22,24
Decimal10(final DfpField factory, final byte x) { [EOL]     super(factory, x); [EOL] } <line_num>: 26,28
Decimal10(final DfpField factory, final int x) { [EOL]     super(factory, x); [EOL] } <line_num>: 30,32
Decimal10(final DfpField factory, final long x) { [EOL]     super(factory, x); [EOL] } <line_num>: 34,36
Decimal10(final DfpField factory, final double x) { [EOL]     super(factory, x); [EOL] } <line_num>: 38,40
public Decimal10(final Dfp d) { [EOL]     super(d); [EOL] } <line_num>: 42,44
public Decimal10(final DfpField factory, final String s) { [EOL]     super(factory, s); [EOL] } <line_num>: 46,48
protected Decimal10(final DfpField factory, final byte sign, final byte nans) { [EOL]     super(factory, sign, nans); [EOL] } <line_num>: 50,52
@Override [EOL] public Dfp newInstance() { [EOL]     return new Decimal10(getField()); [EOL] } <line_num>: 54,57
@Override [EOL] public Dfp newInstance(final byte x) { [EOL]     return new Decimal10(getField(), x); [EOL] } <line_num>: 59,62
@Override [EOL] public Dfp newInstance(final int x) { [EOL]     return new Decimal10(getField(), x); [EOL] } <line_num>: 64,67
@Override [EOL] public Dfp newInstance(final long x) { [EOL]     return new Decimal10(getField(), x); [EOL] } <line_num>: 69,72
@Override [EOL] public Dfp newInstance(final double x) { [EOL]     return new Decimal10(getField(), x); [EOL] } <line_num>: 74,77
@Override [EOL] public Dfp newInstance(final Dfp d) { [EOL]     return new Decimal10(d); [EOL] } <line_num>: 79,82
@Override [EOL] public Dfp newInstance(final String s) { [EOL]     return new Decimal10(getField(), s); [EOL] } <line_num>: 84,87
@Override [EOL] public Dfp newInstance(final byte sign, final byte nans) { [EOL]     return new Decimal10(getField(), sign, nans); [EOL] } <line_num>: 89,92
@Override [EOL] protected int getDecimalDigits() { [EOL]     return 10; [EOL] } <line_num>: 94,97
