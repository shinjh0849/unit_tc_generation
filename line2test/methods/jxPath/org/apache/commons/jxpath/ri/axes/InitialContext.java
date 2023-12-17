public InitialContext(EvalContext parentContext) { [EOL]     super(parentContext); [EOL]     nodePointer = (NodePointer) parentContext.getCurrentNodePointer().clone(); [EOL]     if (nodePointer != null) { [EOL]         collection = (nodePointer.getIndex() == NodePointer.WHOLE_COLLECTION); [EOL]     } [EOL] } <line_num>: 37,45
public Pointer getSingleNodePointer() { [EOL]     return nodePointer; [EOL] } <line_num>: 47,49
public NodePointer getCurrentNodePointer() { [EOL]     return nodePointer; [EOL] } <line_num>: 51,53
public Object getValue() { [EOL]     return nodePointer.getValue(); [EOL] } <line_num>: 55,57
public boolean nextNode() { [EOL]     return setPosition(position + 1); [EOL] } <line_num>: 59,61
public boolean setPosition(int position) { [EOL]     this.position = position; [EOL]     if (collection) { [EOL]         if (position >= 1 && position <= nodePointer.getLength()) { [EOL]             nodePointer.setIndex(position - 1); [EOL]             return true; [EOL]         } [EOL]         return false; [EOL]     } else { [EOL]         return position == 1; [EOL]     } [EOL] } <line_num>: 63,75
public boolean nextSet() { [EOL]     if (started) { [EOL]         return false; [EOL]     } [EOL]     started = true; [EOL]     return true; [EOL] } <line_num>: 77,83
