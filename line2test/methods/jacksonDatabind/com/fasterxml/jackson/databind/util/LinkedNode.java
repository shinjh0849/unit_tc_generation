public LinkedNode(T value, LinkedNode<T> next) { [EOL]     _value = value; [EOL]     _next = next; [EOL] } <line_num>: 15,19
public LinkedNode<T> next() { [EOL]     return _next; [EOL] } <line_num>: 21,21
public T value() { [EOL]     return _value; [EOL] } <line_num>: 23,23
public static <ST> boolean contains(LinkedNode<ST> node, ST value) { [EOL]     while (node != null) { [EOL]         if (node.value() == value) { [EOL]             return true; [EOL]         } [EOL]         node = node.next(); [EOL]     } [EOL]     return false; [EOL] } <line_num>: 35,44
