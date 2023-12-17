public static <L, R> Pair<L, R> of(final L left, final R right) { [EOL]     return new ImmutablePair<L, R>(left, right); [EOL] } <line_num>: 59,61
public abstract L getLeft(); <line_num>: 71,71
public abstract R getRight(); <line_num>: 80,80
@Override [EOL] public final L getKey() { [EOL]     return getLeft(); [EOL] } <line_num>: 90,93
@Override [EOL] public R getValue() { [EOL]     return getRight(); [EOL] } <line_num>: 103,106
@Override [EOL] public int compareTo(final Pair<L, R> other) { [EOL]     return new CompareToBuilder().append(getLeft(), other.getLeft()).append(getRight(), other.getRight()).toComparison(); [EOL] } <line_num>: 116,120
@Override [EOL] public boolean equals(final Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (obj instanceof Map.Entry<?, ?>) { [EOL]         final Map.Entry<?, ?> other = (Map.Entry<?, ?>) obj; [EOL]         return ObjectUtils.equals(getKey(), other.getKey()) && ObjectUtils.equals(getValue(), other.getValue()); [EOL]     } [EOL]     return false; [EOL] } <line_num>: 128,139
@Override [EOL] public int hashCode() { [EOL]     return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() == null ? 0 : getValue().hashCode()); [EOL] } <line_num>: 147,152
@Override [EOL] public String toString() { [EOL]     return new StringBuilder().append('(').append(getLeft()).append(',').append(getRight()).append(')').toString(); [EOL] } <line_num>: 159,162
public String toString(final String format) { [EOL]     return String.format(format, getLeft(), getRight()); [EOL] } <line_num>: 175,177
