private ComplexField() { [EOL] } <line_num>: 41,42
public static ComplexField getInstance() { [EOL]     return LazyHolder.INSTANCE; [EOL] } <line_num>: 47,49
public Complex getOne() { [EOL]     return Complex.ONE; [EOL] } <line_num>: 52,54
public Complex getZero() { [EOL]     return Complex.ZERO; [EOL] } <line_num>: 57,59
public Class<? extends FieldElement<Complex>> getRuntimeClass() { [EOL]     return Complex.class; [EOL] } <line_num>: 62,64
private Object readResolve() { [EOL]     return LazyHolder.INSTANCE; [EOL] } <line_num>: 79,82
