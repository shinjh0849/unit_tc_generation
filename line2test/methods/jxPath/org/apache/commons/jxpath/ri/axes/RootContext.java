public RootContext(JXPathContextReferenceImpl jxpathContext, NodePointer pointer) { [EOL]     super(null); [EOL]     this.jxpathContext = jxpathContext; [EOL]     this.pointer = pointer; [EOL]     if (pointer != null) { [EOL]         pointer.setNamespaceResolver(jxpathContext.getNamespaceResolver()); [EOL]     } [EOL] } <line_num>: 41,51
public JXPathContext getJXPathContext() { [EOL]     return jxpathContext; [EOL] } <line_num>: 53,55
public RootContext getRootContext() { [EOL]     return this; [EOL] } <line_num>: 57,59
public EvalContext getAbsoluteRootContext() { [EOL]     return jxpathContext.getAbsoluteRootContext(); [EOL] } <line_num>: 61,63
public NodePointer getCurrentNodePointer() { [EOL]     return pointer; [EOL] } <line_num>: 65,67
public Object getValue() { [EOL]     return pointer; [EOL] } <line_num>: 69,71
public int getCurrentPosition() { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 73,75
public boolean nextNode() { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 77,79
public boolean nextSet() { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 81,83
public boolean setPosition(int position) { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 85,87
public EvalContext getConstantContext(Object constant) { [EOL]     if (constant instanceof NodeSet) { [EOL]         return new NodeSetContext(new RootContext(jxpathContext, null), (NodeSet) constant); [EOL]     } [EOL]     NodePointer pointer; [EOL]     if (constant instanceof NodePointer) { [EOL]         pointer = (NodePointer) constant; [EOL]     } else { [EOL]         pointer = NodePointer.newNodePointer(new QName(null, ""), constant, null); [EOL]     } [EOL]     return new InitialContext(new RootContext(jxpathContext, pointer)); [EOL] } <line_num>: 89,107
public EvalContext getVariableContext(QName variableName) { [EOL]     return new InitialContext(new RootContext(jxpathContext, jxpathContext.getVariablePointer(variableName))); [EOL] } <line_num>: 109,114
public Function getFunction(QName functionName, Object[] parameters) { [EOL]     return jxpathContext.getFunction(functionName, parameters); [EOL] } <line_num>: 116,118
public Object getRegisteredValue(int id) { [EOL]     if (registers == null || id >= MAX_REGISTER || id == -1) { [EOL]         return UNKNOWN_VALUE; [EOL]     } [EOL]     return registers[id]; [EOL] } <line_num>: 120,125
public int setRegisteredValue(Object value) { [EOL]     if (registers == null) { [EOL]         registers = new Object[MAX_REGISTER]; [EOL]         for (int i = 0; i < MAX_REGISTER; i++) { [EOL]             registers[i] = UNKNOWN_VALUE; [EOL]         } [EOL]     } [EOL]     if (availableRegister >= MAX_REGISTER) { [EOL]         return -1; [EOL]     } [EOL]     registers[availableRegister] = value; [EOL]     availableRegister++; [EOL]     return availableRegister - 1; [EOL] } <line_num>: 127,140
public String toString() { [EOL]     return super.toString() + ":" + pointer.asPath(); [EOL] } <line_num>: 142,144
