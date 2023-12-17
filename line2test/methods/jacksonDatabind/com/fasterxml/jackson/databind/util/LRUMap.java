public LRUMap(int initialEntries, int maxEntries) { [EOL]     super(initialEntries, 0.8f, true); [EOL]     _maxEntries = maxEntries; [EOL] } <line_num>: 21,25
@Override [EOL] protected boolean removeEldestEntry(Map.Entry<K, V> eldest) { [EOL]     return size() > _maxEntries; [EOL] } <line_num>: 27,31
private void readObject(ObjectInputStream in) throws IOException { [EOL]     _jdkSerializeMaxEntries = in.readInt(); [EOL] } <line_num>: 47,49
private void writeObject(ObjectOutputStream out) throws IOException { [EOL]     out.writeInt(_jdkSerializeMaxEntries); [EOL] } <line_num>: 51,53
protected Object readResolve() { [EOL]     return new LRUMap<Object, Object>(_jdkSerializeMaxEntries, _jdkSerializeMaxEntries); [EOL] } <line_num>: 55,57
