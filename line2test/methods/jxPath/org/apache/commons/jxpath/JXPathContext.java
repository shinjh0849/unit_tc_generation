protected JXPathContext(JXPathContext parentContext, Object contextBean) { [EOL]     this.parentContext = parentContext; [EOL]     this.contextBean = contextBean; [EOL] } <line_num>: 432,435
public static JXPathContext newContext(Object contextBean) { [EOL]     return getContextFactory().newContext(null, contextBean); [EOL] } <line_num>: 402,404
public static JXPathContext newContext(JXPathContext parentContext, Object contextBean) { [EOL]     return getContextFactory().newContext(parentContext, contextBean); [EOL] } <line_num>: 411,416
private static JXPathContextFactory getContextFactory() { [EOL]     if (contextFactory == null) { [EOL]         contextFactory = JXPathContextFactory.newInstance(); [EOL]     } [EOL]     return contextFactory; [EOL] } <line_num>: 421,426
public JXPathContext getParentContext() { [EOL]     return parentContext; [EOL] } <line_num>: 440,442
public Object getContextBean() { [EOL]     return contextBean; [EOL] } <line_num>: 447,449
public abstract Pointer getContextPointer(); <line_num>: 454,454
public abstract JXPathContext getRelativeContext(Pointer pointer); <line_num>: 462,462
public void setVariables(Variables vars) { [EOL]     this.vars = vars; [EOL] } <line_num>: 467,469
public Variables getVariables() { [EOL]     if (vars == null) { [EOL]         vars = new BasicVariables(); [EOL]     } [EOL]     return vars; [EOL] } <line_num>: 477,482
public void setFunctions(Functions functions) { [EOL]     this.functions = functions; [EOL] } <line_num>: 489,491
public Functions getFunctions() { [EOL]     if (functions != null) { [EOL]         return functions; [EOL]     } [EOL]     if (parentContext == null) { [EOL]         return GENERIC_FUNCTIONS; [EOL]     } [EOL]     return null; [EOL] } <line_num>: 496,504
public void setFactory(AbstractFactory factory) { [EOL]     this.factory = factory; [EOL] } <line_num>: 511,513
public AbstractFactory getFactory() { [EOL]     if (factory == null && parentContext != null) { [EOL]         return parentContext.getFactory(); [EOL]     } [EOL]     return factory; [EOL] } <line_num>: 520,525
public void setLocale(Locale locale) { [EOL]     this.locale = locale; [EOL] } <line_num>: 533,535
public Locale getLocale() { [EOL]     if (locale == null) { [EOL]         if (parentContext != null) { [EOL]             return parentContext.getLocale(); [EOL]         } else { [EOL]             locale = Locale.getDefault(); [EOL]         } [EOL]     } [EOL]     return locale; [EOL] } <line_num>: 542,552
public void setDecimalFormatSymbols(String name, DecimalFormatSymbols symbols) { [EOL]     if (decimalFormats == null) { [EOL]         decimalFormats = new HashMap(); [EOL]     } [EOL]     decimalFormats.put(name, symbols); [EOL] } <line_num>: 562,570
public DecimalFormatSymbols getDecimalFormatSymbols(String name) { [EOL]     if (decimalFormats == null) { [EOL]         if (parentContext != null) { [EOL]             return parentContext.getDecimalFormatSymbols(name); [EOL]         } [EOL]         return null; [EOL]     } [EOL]     return (DecimalFormatSymbols) decimalFormats.get(name); [EOL] } <line_num>: 575,583
public void setLenient(boolean lenient) { [EOL]     this.lenient = lenient; [EOL]     lenientSet = true; [EOL] } <line_num>: 594,597
public boolean isLenient() { [EOL]     if (!lenientSet && parentContext != null) { [EOL]         return parentContext.isLenient(); [EOL]     } [EOL]     return lenient; [EOL] } <line_num>: 602,607
public static CompiledExpression compile(String xpath) { [EOL]     if (compilationContext == null) { [EOL]         compilationContext = JXPathContext.newContext(null); [EOL]     } [EOL]     return compilationContext.compilePath(xpath); [EOL] } <line_num>: 616,621
protected abstract CompiledExpression compilePath(String xpath); <line_num>: 627,627
public Object selectSingleNode(String xpath) { [EOL]     Pointer pointer = getPointer(xpath); [EOL]     if (pointer == null) { [EOL]         return null; [EOL]     } [EOL]     return pointer.getNode(); [EOL] } <line_num>: 639,645
public List selectNodes(String xpath) { [EOL]     ArrayList list = new ArrayList(); [EOL]     Iterator iterator = iteratePointers(xpath); [EOL]     while (iterator.hasNext()) { [EOL]         Pointer pointer = (Pointer) iterator.next(); [EOL]         list.add(pointer.getNode()); [EOL]     } [EOL]     return list; [EOL] } <line_num>: 653,661
public abstract Object getValue(String xpath); <line_num>: 667,667
public abstract Object getValue(String xpath, Class requiredType); <line_num>: 673,673
public abstract void setValue(String xpath, Object value); <line_num>: 683,683
public abstract Pointer createPath(String xpath); <line_num>: 692,692
public abstract Pointer createPathAndSetValue(String xpath, Object value); <line_num>: 708,708
public abstract void removePath(String xpath); <line_num>: 713,713
public abstract void removeAll(String xpath); <line_num>: 718,718
public abstract Iterator iterate(String xpath); <line_num>: 725,725
public abstract Pointer getPointer(String xpath); <line_num>: 733,733
public abstract Iterator iteratePointers(String xpath); <line_num>: 741,741
public void setIdentityManager(IdentityManager idManager) { [EOL]     this.idManager = idManager; [EOL] } <line_num>: 747,749
public IdentityManager getIdentityManager() { [EOL]     if (idManager == null && parentContext != null) { [EOL]         return parentContext.getIdentityManager(); [EOL]     } [EOL]     return idManager; [EOL] } <line_num>: 755,760
public Pointer getPointerByID(String id) { [EOL]     IdentityManager manager = getIdentityManager(); [EOL]     if (manager != null) { [EOL]         return manager.getPointerByID(this, id); [EOL]     } else { [EOL]         throw new JXPathException("Cannot find an element by ID - " + "no IdentityManager has been specified"); [EOL]     } [EOL] } <line_num>: 767,777
public void setKeyManager(KeyManager keyManager) { [EOL]     this.keyManager = keyManager; [EOL] } <line_num>: 783,785
public KeyManager getKeyManager() { [EOL]     if (keyManager == null && parentContext != null) { [EOL]         return parentContext.getKeyManager(); [EOL]     } [EOL]     return keyManager; [EOL] } <line_num>: 791,796
public Pointer getPointerByKey(String key, String value) { [EOL]     KeyManager manager = getKeyManager(); [EOL]     if (manager != null) { [EOL]         return manager.getPointerByKey(this, key, value); [EOL]     } else { [EOL]         throw new JXPathException("Cannot find an element by key - " + "no KeyManager has been specified"); [EOL]     } [EOL] } <line_num>: 801,811
public void registerNamespace(String prefix, String namespaceURI) { [EOL]     throw new UnsupportedOperationException("Namespace registration is not implemented by " + getClass()); [EOL] } <line_num>: 819,822
public String getNamespaceURI(String prefix) { [EOL]     throw new UnsupportedOperationException("Namespace registration is not implemented by " + getClass()); [EOL] } <line_num>: 834,837
public void setNamespaceContextPointer(Pointer namespaceContextPointer) { [EOL]     throw new UnsupportedOperationException("Namespace registration is not implemented by " + getClass()); [EOL] } <line_num>: 848,851
public Pointer getNamespaceContextPointer() { [EOL]     throw new UnsupportedOperationException("Namespace registration is not implemented by " + getClass()); [EOL] } <line_num>: 860,863
public void registerDefaultNamespace(String uri) { [EOL]     throw new UnsupportedOperationException("Namespace registration is not implemented by " + getClass()); [EOL] } <line_num>: 881,884
public String getDefaultNamespaceURI() { [EOL]     return null; [EOL] } <line_num>: 888,890
