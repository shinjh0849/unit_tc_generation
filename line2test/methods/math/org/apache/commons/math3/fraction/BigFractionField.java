private BigFractionField() { [EOL] } <line_num>: 41,42
public static BigFractionField getInstance() { [EOL]     return LazyHolder.INSTANCE; [EOL] } <line_num>: 47,49
public BigFraction getOne() { [EOL]     return BigFraction.ONE; [EOL] } <line_num>: 52,54
public BigFraction getZero() { [EOL]     return BigFraction.ZERO; [EOL] } <line_num>: 57,59
public Class<? extends FieldElement<BigFraction>> getRuntimeClass() { [EOL]     return BigFraction.class; [EOL] } <line_num>: 62,64
private Object readResolve() { [EOL]     return LazyHolder.INSTANCE; [EOL] } <line_num>: 78,81
