Pair(FIRST first, SECOND second) { [EOL]     this.first = first; [EOL]     this.second = second; [EOL] } <line_num>: 33,36
@Override [EOL] public int hashCode() { [EOL]     return 17 * ((first != null) ? first.hashCode() : 0) + 17 * ((second != null) ? second.hashCode() : 0); [EOL] } <line_num>: 38,42
@Override [EOL] public boolean equals(Object o) { [EOL]     if (!(o instanceof Pair<?, ?>)) { [EOL]         return false; [EOL]     } [EOL]     Pair<?, ?> that = (Pair<?, ?>) o; [EOL]     return equal(this.first, that.first) && equal(this.second, that.second); [EOL] } <line_num>: 44,52
private static boolean equal(Object a, Object b) { [EOL]     return a == b || (a != null && a.equals(b)); [EOL] } <line_num>: 54,56
@Override [EOL] public String toString() { [EOL]     return String.format("{%s,%s}", first, second); [EOL] } <line_num>: 58,61
