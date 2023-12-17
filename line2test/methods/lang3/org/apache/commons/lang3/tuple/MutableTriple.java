public MutableTriple() { [EOL]     super(); [EOL] } <line_num>: 63,65
public MutableTriple(final L left, final M middle, final R right) { [EOL]     super(); [EOL]     this.left = left; [EOL]     this.middle = middle; [EOL]     this.right = right; [EOL] } <line_num>: 74,79
public static <L, M, R> MutableTriple<L, M, R> of(final L left, final M middle, final R right) { [EOL]     return new MutableTriple<L, M, R>(left, middle, right); [EOL] } <line_num>: 56,58
@Override [EOL] public L getLeft() { [EOL]     return left; [EOL] } <line_num>: 85,88
public void setLeft(final L left) { [EOL]     this.left = left; [EOL] } <line_num>: 95,97
@Override [EOL] public M getMiddle() { [EOL]     return middle; [EOL] } <line_num>: 102,105
public void setMiddle(final M middle) { [EOL]     this.middle = middle; [EOL] } <line_num>: 112,114
@Override [EOL] public R getRight() { [EOL]     return right; [EOL] } <line_num>: 119,122
public void setRight(final R right) { [EOL]     this.right = right; [EOL] } <line_num>: 129,131
