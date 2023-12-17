private Euclidean3D() { [EOL] } <line_num>: 37,38
public static Euclidean3D getInstance() { [EOL]     return LazyHolder.INSTANCE; [EOL] } <line_num>: 43,45
public int getDimension() { [EOL]     return 3; [EOL] } <line_num>: 48,50
public Euclidean2D getSubSpace() { [EOL]     return Euclidean2D.getInstance(); [EOL] } <line_num>: 53,55
private Object readResolve() { [EOL]     return LazyHolder.INSTANCE; [EOL] } <line_num>: 70,73
