public double value(double x) { [EOL]     return (x - 1) * (x - 0.5) * x * (x + 0.5) * (x + 1); [EOL] } <line_num>: 32,34
public DerivativeStructure value(DerivativeStructure t) { [EOL]     return t.subtract(1).multiply(t.subtract(0.5)).multiply(t).multiply(t.add(0.5)).multiply(t.add(1)); [EOL] } <line_num>: 36,38
