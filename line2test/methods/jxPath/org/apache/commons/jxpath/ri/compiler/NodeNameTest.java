public NodeNameTest(QName qname) { [EOL]     this.qname = qname; [EOL] } <line_num>: 29,31
public NodeNameTest(QName qname, String namespaceURI) { [EOL]     this.qname = qname; [EOL]     this.namespaceURI = namespaceURI; [EOL] } <line_num>: 33,36
public QName getNodeName() { [EOL]     return qname; [EOL] } <line_num>: 38,40
public String getNamespaceURI() { [EOL]     return namespaceURI; [EOL] } <line_num>: 42,44
public boolean isWildcard() { [EOL]     return qname.getName().equals("*"); [EOL] } <line_num>: 46,48
public String toString() { [EOL]     return qname.toString(); [EOL] } <line_num>: 50,52
