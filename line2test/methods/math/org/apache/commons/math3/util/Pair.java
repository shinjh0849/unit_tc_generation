public Pair(K k, V v) { [EOL]     key = k; [EOL]     value = v; [EOL] } <line_num>: 45,48
public Pair(Pair<? extends K, ? extends V> entry) { [EOL]     this(entry.getKey(), entry.getValue()); [EOL] } <line_num>: 55,57
public K getKey() { [EOL]     return key; [EOL] } <line_num>: 64,66
public V getValue() { [EOL]     return value; [EOL] } <line_num>: 73,75
public K getFirst() { [EOL]     return key; [EOL] } <line_num>: 83,85
public V getSecond() { [EOL]     return value; [EOL] } <line_num>: 93,95
@Override [EOL] public boolean equals(Object o) { [EOL]     if (this == o) { [EOL]         return true; [EOL]     } [EOL]     if (!(o instanceof Pair)) { [EOL]         return false; [EOL]     } else { [EOL]         Pair<?, ?> oP = (Pair<?, ?>) o; [EOL]         return (key == null ? oP.key == null : key.equals(oP.key)) && (value == null ? oP.value == null : value.equals(oP.value)); [EOL]     } [EOL] } <line_num>: 104,120
@Override [EOL] public int hashCode() { [EOL]     int result = key == null ? 0 : key.hashCode(); [EOL]     final int h = value == null ? 0 : value.hashCode(); [EOL]     result = 37 * result + h ^ (h >>> 16); [EOL]     return result; [EOL] } <line_num>: 127,135
