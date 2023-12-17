public ParentContext(EvalContext parentContext, NodeTest nodeTest) { [EOL]     super(parentContext); [EOL]     this.nodeTest = nodeTest; [EOL] } <line_num>: 34,37
public NodePointer getCurrentNodePointer() { [EOL]     return currentNodePointer; [EOL] } <line_num>: 39,41
public int getCurrentPosition() { [EOL]     return 1; [EOL] } <line_num>: 43,45
public int getDocumentOrder() { [EOL]     return -1; [EOL] } <line_num>: 47,49
public void reset() { [EOL]     super.reset(); [EOL]     setStarted = false; [EOL] } <line_num>: 51,54
public boolean setPosition(int position) { [EOL]     super.setPosition(position); [EOL]     return position == 1; [EOL] } <line_num>: 56,59
public boolean nextNode() { [EOL]     if (setStarted) { [EOL]         return false; [EOL]     } [EOL]     setStarted = true; [EOL]     NodePointer thisLocation = parentContext.getCurrentNodePointer(); [EOL]     currentNodePointer = thisLocation.getImmediateParentPointer(); [EOL]     while (currentNodePointer != null && currentNodePointer.isContainer()) { [EOL]         currentNodePointer = currentNodePointer.getImmediateParentPointer(); [EOL]     } [EOL]     if (currentNodePointer != null && currentNodePointer.testNode(nodeTest)) { [EOL]         position++; [EOL]         return true; [EOL]     } [EOL]     return false; [EOL] } <line_num>: 61,79
