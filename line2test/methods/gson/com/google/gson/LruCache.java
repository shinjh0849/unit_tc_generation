LruCache(int maxCapacity) { [EOL]     super(maxCapacity, 0.7F, true); [EOL]     this.maxCapacity = maxCapacity; [EOL] } <line_num>: 35,38
public void addElement(K key, V value) { [EOL]     put(key, value); [EOL] } <line_num>: 40,42
public void clear() { [EOL]     super.clear(); [EOL] } <line_num>: 44,46
public V getElement(K key) { [EOL]     return get(key); [EOL] } <line_num>: 48,50
public V removeElement(K key) { [EOL]     return remove(key); [EOL] } <line_num>: 52,54
public int size() { [EOL]     return super.size(); [EOL] } <line_num>: 56,58
@Override [EOL] protected boolean removeEldestEntry(Map.Entry<K, V> entry) { [EOL]     return size() > maxCapacity; [EOL] } <line_num>: 60,63
