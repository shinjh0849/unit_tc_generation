public CollectionAttributeNodeIterator(CollectionPointer pointer, QName name) { [EOL]     super(pointer, false, null); [EOL]     this.name = name; [EOL] } <line_num>: 34,40
protected NodeIterator getElementNodeIterator(NodePointer elementPointer) { [EOL]     return elementPointer.attributeIterator(name); [EOL] } <line_num>: 42,44
