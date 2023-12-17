public ImmutableTriple(final L left, final M middle, final R right) { [EOL]     super(); [EOL]     this.left = left; [EOL]     this.middle = middle; [EOL]     this.right = right; [EOL] } <line_num>: 72,77
public static <L, M, R> ImmutableTriple<L, M, R> of(final L left, final M middle, final R right) { [EOL]     return new ImmutableTriple<L, M, R>(left, middle, right); [EOL] } <line_num>: 61,63
@Override [EOL] public L getLeft() { [EOL]     return left; [EOL] } <line_num>: 83,86
@Override [EOL] public M getMiddle() { [EOL]     return middle; [EOL] } <line_num>: 91,94
@Override [EOL] public R getRight() { [EOL]     return right; [EOL] } <line_num>: 99,102
