public DynamicAttributeIterator(PropertyOwnerPointer parent, QName name) { [EOL]     super(parent, name); [EOL] } <line_num>: 33,35
protected void prepareForIndividualProperty(String name) { [EOL]     ((DynamicPropertyPointer) getPropertyPointer()).setPropertyName(name); [EOL]     super.prepareForIndividualProperty(name); [EOL] } <line_num>: 37,40
