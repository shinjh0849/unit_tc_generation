public ObjectTypePair push(ObjectTypePair obj) { [EOL]     Preconditions.checkNotNull(obj); [EOL]     return stack.push(obj); [EOL] } <line_num>: 37,41
public ObjectTypePair pop() { [EOL]     return stack.pop(); [EOL] } <line_num>: 49,51
public boolean isEmpty() { [EOL]     return stack.isEmpty(); [EOL] } <line_num>: 53,55
public ObjectTypePair peek() { [EOL]     return stack.peek(); [EOL] } <line_num>: 63,65
public boolean contains(ObjectTypePair obj) { [EOL]     if (obj == null) { [EOL]         return false; [EOL]     } [EOL]     for (ObjectTypePair stackObject : stack) { [EOL]         if (stackObject.getObject() == obj.getObject() && stackObject.type.equals(obj.type)) { [EOL]             return true; [EOL]         } [EOL]     } [EOL]     return false; [EOL] } <line_num>: 74,86
