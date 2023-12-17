public ImmutablePair(final L left, final R right) { [EOL]     super(); [EOL]     this.left = left; [EOL]     this.right = right; [EOL] } <line_num>: 67,71
public static <L, R> ImmutablePair<L, R> of(final L left, final R right) { [EOL]     return new ImmutablePair<L, R>(left, right); [EOL] } <line_num>: 57,59
@Override [EOL] public L getLeft() { [EOL]     return left; [EOL] } <line_num>: 77,80
@Override [EOL] public R getRight() { [EOL]     return right; [EOL] } <line_num>: 85,88
@Override [EOL] public R setValue(final R value) { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 99,102
