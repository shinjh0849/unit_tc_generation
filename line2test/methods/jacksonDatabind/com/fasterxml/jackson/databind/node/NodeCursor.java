public NodeCursor(int contextType, NodeCursor p) { [EOL]     super(); [EOL]     _type = contextType; [EOL]     _index = -1; [EOL]     _parent = p; [EOL] } <line_num>: 27,33
public RootValue(JsonNode n, NodeCursor p) { [EOL]     super(JsonStreamContext.TYPE_ROOT, p); [EOL]     _node = n; [EOL] } <line_num>: 104,107
public Array(JsonNode n, NodeCursor p) { [EOL]     super(JsonStreamContext.TYPE_ARRAY, p); [EOL]     _contents = n.elements(); [EOL] } <line_num>: 144,147
public Object(JsonNode n, NodeCursor p) { [EOL]     super(JsonStreamContext.TYPE_OBJECT, p); [EOL]     _contents = ((ObjectNode) n).fields(); [EOL]     _needEntry = true; [EOL] } <line_num>: 185,190
@Override [EOL] public final NodeCursor getParent() { [EOL]     return _parent; [EOL] } <line_num>: 42,43
@Override [EOL] public final String getCurrentName() { [EOL]     return _currentName; [EOL] } <line_num>: 45,48
public void overrideCurrentName(String name) { [EOL]     _currentName = name; [EOL] } <line_num>: 53,55
public abstract JsonToken nextToken(); <line_num>: 63,63
public abstract JsonToken nextValue(); <line_num>: 64,64
public abstract JsonToken endToken(); <line_num>: 65,65
public abstract JsonNode currentNode(); <line_num>: 67,67
public abstract boolean currentHasChildren(); <line_num>: 68,68
public final NodeCursor iterateChildren() { [EOL]     JsonNode n = currentNode(); [EOL]     if (n == null) [EOL]         throw new IllegalStateException("No current node"); [EOL]     if (n.isArray()) { [EOL]         return new Array(n, this); [EOL]     } [EOL]     if (n.isObject()) { [EOL]         return new Object(n, this); [EOL]     } [EOL]     throw new IllegalStateException("Current node of type " + n.getClass().getName()); [EOL] } <line_num>: 74,84
@Override [EOL] public void overrideCurrentName(String name) { [EOL] } <line_num>: 109,112
@Override [EOL] public JsonToken nextToken() { [EOL]     if (!_done) { [EOL]         _done = true; [EOL]         return _node.asToken(); [EOL]     } [EOL]     _node = null; [EOL]     return null; [EOL] } <line_num>: 114,122
@Override [EOL] public JsonToken nextValue() { [EOL]     return nextToken(); [EOL] } <line_num>: 124,125
@Override [EOL] public JsonToken endToken() { [EOL]     return null; [EOL] } <line_num>: 126,127
@Override [EOL] public JsonNode currentNode() { [EOL]     return _node; [EOL] } <line_num>: 128,129
@Override [EOL] public boolean currentHasChildren() { [EOL]     return false; [EOL] } <line_num>: 130,131
@Override [EOL] public JsonToken nextToken() { [EOL]     if (!_contents.hasNext()) { [EOL]         _currentNode = null; [EOL]         return null; [EOL]     } [EOL]     _currentNode = _contents.next(); [EOL]     return _currentNode.asToken(); [EOL] } <line_num>: 149,158
@Override [EOL] public JsonToken nextValue() { [EOL]     return nextToken(); [EOL] } <line_num>: 160,161
@Override [EOL] public JsonToken endToken() { [EOL]     return JsonToken.END_ARRAY; [EOL] } <line_num>: 162,163
@Override [EOL] public JsonNode currentNode() { [EOL]     return _currentNode; [EOL] } <line_num>: 165,166
@Override [EOL] public boolean currentHasChildren() { [EOL]     return ((ContainerNode<?>) currentNode()).size() > 0; [EOL] } <line_num>: 167,171
@Override [EOL] public JsonToken nextToken() { [EOL]     if (_needEntry) { [EOL]         if (!_contents.hasNext()) { [EOL]             _currentName = null; [EOL]             _current = null; [EOL]             return null; [EOL]         } [EOL]         _needEntry = false; [EOL]         _current = _contents.next(); [EOL]         _currentName = (_current == null) ? null : _current.getKey(); [EOL]         return JsonToken.FIELD_NAME; [EOL]     } [EOL]     _needEntry = true; [EOL]     return _current.getValue().asToken(); [EOL] } <line_num>: 192,209
@Override [EOL] public JsonToken nextValue() { [EOL]     JsonToken t = nextToken(); [EOL]     if (t == JsonToken.FIELD_NAME) { [EOL]         t = nextToken(); [EOL]     } [EOL]     return t; [EOL] } <line_num>: 211,219
@Override [EOL] public JsonToken endToken() { [EOL]     return JsonToken.END_OBJECT; [EOL] } <line_num>: 221,222
@Override [EOL] public JsonNode currentNode() { [EOL]     return (_current == null) ? null : _current.getValue(); [EOL] } <line_num>: 224,227
@Override [EOL] public boolean currentHasChildren() { [EOL]     return ((ContainerNode<?>) currentNode()).size() > 0; [EOL] } <line_num>: 228,232
