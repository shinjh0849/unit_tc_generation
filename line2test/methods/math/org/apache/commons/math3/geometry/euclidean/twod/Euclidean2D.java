private Euclidean2D() { [EOL] } <line_num>: 37,38
public static Euclidean2D getInstance() { [EOL]     return LazyHolder.INSTANCE; [EOL] } <line_num>: 43,45
public int getDimension() { [EOL]     return 2; [EOL] } <line_num>: 48,50
public Euclidean1D getSubSpace() { [EOL]     return Euclidean1D.getInstance(); [EOL] } <line_num>: 53,55
private Object readResolve() { [EOL]     return LazyHolder.INSTANCE; [EOL] } <line_num>: 70,73
