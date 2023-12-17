public EvalContext(EvalContext parentContext)
public int compare(Object o1, Object o2)
public Pointer getContextNodePointer()
public JXPathContext getJXPathContext()
public int getPosition()
public int getDocumentOrder()
public boolean isChildOrderingRequired()
public boolean hasNext()
public Object next()
private void performIteratorStep()
public void remove()
private boolean constructIterator()
public List getContextNodeList()
public NodeSet getNodeSet()
public Object getValue()
public String toString()
public RootContext getRootContext()
public void reset()
public int getCurrentPosition()
public Pointer getSingleNodePointer()
public abstract NodePointer getCurrentNodePointer()
public boolean nextSet()
public abstract boolean nextNode()
public boolean setPosition(int position)
EvalContext parentContext
RootContext rootContext
int position=Optional[0]
boolean startedSetIteration=Optional[false]
boolean done=Optional[false]
boolean hasPerformedIteratorStep=Optional[false]
Iterator pointerIterator
Comparator REVERSE_COMPARATOR=Optional[new Comparator() {

    public int compare(Object o1, Object o2) {
        return ((Comparable) o2).compareTo(o1);
    }
}]
