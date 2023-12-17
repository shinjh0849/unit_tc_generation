public CollectionChildNodeIterator(CollectionPointer pointer, NodeTest test, boolean reverse, NodePointer startWith) { [EOL]     super(pointer, reverse, startWith); [EOL]     this.test = test; [EOL] } <line_num>: 34,42
protected NodeIterator getElementNodeIterator(NodePointer elementPointer) { [EOL]     return elementPointer.childIterator(test, false, null); [EOL] } <line_num>: 44,46
