protected AbstractAnnotation() { [EOL]     this.listenerList = new EventListenerList(); [EOL] } <line_num>: 77,79
public void addChangeListener(AnnotationChangeListener listener) { [EOL]     this.listenerList.add(AnnotationChangeListener.class, listener); [EOL] } <line_num>: 89,91
public void removeChangeListener(AnnotationChangeListener listener) { [EOL]     this.listenerList.remove(AnnotationChangeListener.class, listener); [EOL] } <line_num>: 101,103
public boolean hasListener(EventListener listener) { [EOL]     List list = Arrays.asList(this.listenerList.getListenerList()); [EOL]     return list.contains(listener); [EOL] } <line_num>: 117,120
protected void fireAnnotationChanged() { [EOL]     if (notify) { [EOL]         notifyListeners(new AnnotationChangeEvent(this, this)); [EOL]     } [EOL] } <line_num>: 127,131
protected void notifyListeners(AnnotationChangeEvent event) { [EOL]     Object[] listeners = this.listenerList.getListenerList(); [EOL]     for (int i = listeners.length - 2; i >= 0; i -= 2) { [EOL]         if (listeners[i] == AnnotationChangeListener.class) { [EOL]             ((AnnotationChangeListener) listeners[i + 1]).annotationChanged(event); [EOL]         } [EOL]     } [EOL] } <line_num>: 142,152
public boolean getNotify() { [EOL]     return this.notify; [EOL] } <line_num>: 162,164
public void setNotify(boolean flag) { [EOL]     this.notify = flag; [EOL]     if (notify) { [EOL]         fireAnnotationChanged(); [EOL]     } [EOL] } <line_num>: 174,179
public Object clone() throws CloneNotSupportedException { [EOL]     AbstractAnnotation clone = (AbstractAnnotation) super.clone(); [EOL]     clone.listenerList = new EventListenerList(); [EOL]     return clone; [EOL] } <line_num>: 191,195
private void writeObject(ObjectOutputStream stream) throws IOException { [EOL]     stream.defaultWriteObject(); [EOL] } <line_num>: 204,206
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException { [EOL]     stream.defaultReadObject(); [EOL]     this.listenerList = new EventListenerList(); [EOL] } <line_num>: 216,220
