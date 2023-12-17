public NodeSetContext(EvalContext parentContext, NodeSet nodeSet) { [EOL]     super(parentContext); [EOL]     this.nodeSet = nodeSet; [EOL] } <line_num>: 33,36
public NodeSet getNodeSet() { [EOL]     return nodeSet; [EOL] } <line_num>: 38,40
public NodePointer getCurrentNodePointer() { [EOL]     if (position == 0) { [EOL]         if (!setPosition(1)) { [EOL]             return null; [EOL]         } [EOL]     } [EOL]     return (NodePointer) nodeSet.getPointers().get(position - 1); [EOL] } <line_num>: 42,49
public boolean setPosition(int position) { [EOL]     super.setPosition(position); [EOL]     return position >= 1 && position <= nodeSet.getPointers().size(); [EOL] } <line_num>: 51,54
public boolean nextSet() { [EOL]     if (startedSet) { [EOL]         return false; [EOL]     } [EOL]     startedSet = true; [EOL]     return true; [EOL] } <line_num>: 56,62
public boolean nextNode() { [EOL]     return setPosition(position + 1); [EOL] } <line_num>: 64,66
