private EmptyIterator() { [EOL] } <line_num>: 17,17
@SuppressWarnings("unchecked") [EOL] public static <T> Iterator<T> instance() { [EOL]     return (Iterator<T>) instance; [EOL] } <line_num>: 19,22
@Override [EOL] public boolean hasNext() { [EOL]     return false; [EOL] } <line_num>: 24,25
@Override [EOL] public T next() { [EOL]     throw new NoSuchElementException(); [EOL] } <line_num>: 26,27
@Override [EOL] public void remove() { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 29,32
