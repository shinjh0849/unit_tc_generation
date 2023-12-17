private FractionField() { [EOL] } <line_num>: 41,42
public static FractionField getInstance() { [EOL]     return LazyHolder.INSTANCE; [EOL] } <line_num>: 47,49
public Fraction getOne() { [EOL]     return Fraction.ONE; [EOL] } <line_num>: 52,54
public Fraction getZero() { [EOL]     return Fraction.ZERO; [EOL] } <line_num>: 57,59
public Class<? extends FieldElement<Fraction>> getRuntimeClass() { [EOL]     return Fraction.class; [EOL] } <line_num>: 62,64
private Object readResolve() { [EOL]     return LazyHolder.INSTANCE; [EOL] } <line_num>: 78,81
