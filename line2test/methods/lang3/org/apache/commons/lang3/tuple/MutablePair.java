public MutablePair() { [EOL]     super(); [EOL] } <line_num>: 59,61
public MutablePair(final L left, final R right) { [EOL]     super(); [EOL]     this.left = left; [EOL]     this.right = right; [EOL] } <line_num>: 69,73
public static <L, R> MutablePair<L, R> of(final L left, final R right) { [EOL]     return new MutablePair<L, R>(left, right); [EOL] } <line_num>: 52,54
@Override [EOL] public L getLeft() { [EOL]     return left; [EOL] } <line_num>: 79,82
public void setLeft(final L left) { [EOL]     this.left = left; [EOL] } <line_num>: 89,91
@Override [EOL] public R getRight() { [EOL]     return right; [EOL] } <line_num>: 96,99
public void setRight(final R right) { [EOL]     this.right = right; [EOL] } <line_num>: 106,108
@Override [EOL] public R setValue(final R value) { [EOL]     final R result = getRight(); [EOL]     setRight(value); [EOL]     return result; [EOL] } <line_num>: 117,122
