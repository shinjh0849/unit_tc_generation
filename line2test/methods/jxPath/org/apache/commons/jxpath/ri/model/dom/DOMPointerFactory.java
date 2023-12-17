public int getOrder() { [EOL]     return DOM_POINTER_FACTORY_ORDER; [EOL] } <line_num>: 36,38
public NodePointer createNodePointer(QName name, Object bean, Locale locale) { [EOL]     if (bean instanceof Node) { [EOL]         return new DOMNodePointer((Node) bean, locale); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 40,49
public NodePointer createNodePointer(NodePointer parent, QName name, Object bean) { [EOL]     if (bean instanceof Node) { [EOL]         return new DOMNodePointer(parent, (Node) bean); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 51,60
