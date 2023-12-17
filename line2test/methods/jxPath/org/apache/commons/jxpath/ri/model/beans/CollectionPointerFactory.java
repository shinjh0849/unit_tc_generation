public int getOrder() { [EOL]     return COLLECTION_POINTER_FACTORY_ORDER; [EOL] } <line_num>: 36,38
public NodePointer createNodePointer(QName name, Object bean, Locale locale) { [EOL]     if (ValueUtils.isCollection(bean)) { [EOL]         return new CollectionPointer(bean, locale); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 40,49
public NodePointer createNodePointer(NodePointer parent, QName name, Object bean) { [EOL]     if (ValueUtils.isCollection(bean)) { [EOL]         return new CollectionPointer(parent, bean); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 51,60
