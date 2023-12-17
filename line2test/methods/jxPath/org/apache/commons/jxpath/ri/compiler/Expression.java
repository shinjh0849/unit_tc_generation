public PointerIterator(Iterator it, QName qname, Locale locale) { [EOL]     this.iterator = it; [EOL]     this.qname = qname; [EOL]     this.locale = locale; [EOL] } <line_num>: 101,105
public ValueIterator(Iterator it) { [EOL]     this.iterator = it; [EOL] } <line_num>: 124,126
public boolean isContextDependent() { [EOL]     if (!contextDependencyKnown) { [EOL]         contextDependent = computeContextDependent(); [EOL]         contextDependencyKnown = true; [EOL]     } [EOL]     return contextDependent; [EOL] } <line_num>: 52,58
public abstract boolean computeContextDependent(); <line_num>: 63,63
public abstract Object computeValue(EvalContext context); <line_num>: 69,69
public abstract Object compute(EvalContext context); <line_num>: 70,70
public Iterator iterate(EvalContext context) { [EOL]     Object result = compute(context); [EOL]     if (result instanceof EvalContext) { [EOL]         return new ValueIterator((EvalContext) result); [EOL]     } [EOL]     return ValueUtils.iterate(result); [EOL] } <line_num>: 72,78
public Iterator iteratePointers(EvalContext context) { [EOL]     Object result = compute(context); [EOL]     if (result == null) { [EOL]         return Collections.EMPTY_LIST.iterator(); [EOL]     } [EOL]     if (result instanceof EvalContext) { [EOL]         return (EvalContext) result; [EOL]     } [EOL]     return new PointerIterator(ValueUtils.iterate(result), new QName(null, "value"), context.getRootContext().getCurrentNodePointer().getLocale()); [EOL] } <line_num>: 80,91
public boolean hasNext() { [EOL]     return iterator.hasNext(); [EOL] } <line_num>: 107,109
public Object next() { [EOL]     Object o = iterator.next(); [EOL]     return NodePointer.newNodePointer(qname, o, locale); [EOL] } <line_num>: 111,114
public void remove() { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 116,118
public boolean hasNext() { [EOL]     return iterator.hasNext(); [EOL] } <line_num>: 128,130
public Object next() { [EOL]     Object o = iterator.next(); [EOL]     if (o instanceof Pointer) { [EOL]         return ((Pointer) o).getValue(); [EOL]     } [EOL]     return o; [EOL] } <line_num>: 132,138
public void remove() { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 140,142
