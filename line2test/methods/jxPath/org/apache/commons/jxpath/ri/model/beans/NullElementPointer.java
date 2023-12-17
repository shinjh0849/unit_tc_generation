public NullElementPointer(NodePointer parent, int index) { [EOL]     super(parent, (Object) null); [EOL]     this.index = index; [EOL] } <line_num>: 36,39
public QName getName() { [EOL]     return null; [EOL] } <line_num>: 41,43
public Object getBaseValue() { [EOL]     return null; [EOL] } <line_num>: 45,47
public Object getImmediateNode() { [EOL]     return null; [EOL] } <line_num>: 49,51
public boolean isLeaf() { [EOL]     return true; [EOL] } <line_num>: 53,55
public boolean isCollection() { [EOL]     return false; [EOL] } <line_num>: 57,59
public PropertyPointer getPropertyPointer() { [EOL]     return new NullPropertyPointer(this); [EOL] } <line_num>: 61,63
public NodePointer getValuePointer() { [EOL]     return new NullPointer(this, getName()); [EOL] } <line_num>: 65,67
public void setValue(Object value) { [EOL]     throw new UnsupportedOperationException("Collection element does not exist: " + this); [EOL] } <line_num>: 69,72
public boolean isActual() { [EOL]     return false; [EOL] } <line_num>: 74,76
public boolean isContainer() { [EOL]     return true; [EOL] } <line_num>: 78,80
public NodePointer createPath(JXPathContext context) { [EOL]     return parent.createChild(context, null, index); [EOL] } <line_num>: 82,84
public NodePointer createPath(JXPathContext context, Object value) { [EOL]     return parent.createChild(context, null, index, value); [EOL] } <line_num>: 86,88
public int hashCode() { [EOL]     return getImmediateParentPointer().hashCode() + index; [EOL] } <line_num>: 90,92
public boolean equals(Object object) { [EOL]     if (object == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(object instanceof NullElementPointer)) { [EOL]         return false; [EOL]     } [EOL]     NullElementPointer other = (NullElementPointer) object; [EOL]     return getImmediateParentPointer() == other.getImmediateParentPointer() && index == other.index; [EOL] } <line_num>: 94,106
public int getLength() { [EOL]     return 0; [EOL] } <line_num>: 108,110
public String asPath() { [EOL]     StringBuffer buffer = new StringBuffer(); [EOL]     NodePointer parent = getImmediateParentPointer(); [EOL]     if (parent != null) { [EOL]         buffer.append(parent.asPath()); [EOL]     } [EOL]     if (index != WHOLE_COLLECTION) { [EOL]         if (parent != null && parent.getIndex() != WHOLE_COLLECTION) { [EOL]             buffer.append("/."); [EOL]         } else if (parent != null && parent.getImmediateParentPointer() != null && parent.getImmediateParentPointer().getIndex() != WHOLE_COLLECTION) { [EOL]             buffer.append("/."); [EOL]         } [EOL]         buffer.append("[").append(index + 1).append(']'); [EOL]     } [EOL]     return buffer.toString(); [EOL] } <line_num>: 112,134
