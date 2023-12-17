private BigRealField() { [EOL] } <line_num>: 41,42
public static BigRealField getInstance() { [EOL]     return LazyHolder.INSTANCE; [EOL] } <line_num>: 47,49
public BigReal getOne() { [EOL]     return BigReal.ONE; [EOL] } <line_num>: 52,54
public BigReal getZero() { [EOL]     return BigReal.ZERO; [EOL] } <line_num>: 57,59
public Class<? extends FieldElement<BigReal>> getRuntimeClass() { [EOL]     return BigReal.class; [EOL] } <line_num>: 62,64
private Object readResolve() { [EOL]     return LazyHolder.INSTANCE; [EOL] } <line_num>: 79,82
