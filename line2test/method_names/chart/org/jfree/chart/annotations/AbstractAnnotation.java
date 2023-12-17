protected AbstractAnnotation()
public void addChangeListener(AnnotationChangeListener listener)
public void removeChangeListener(AnnotationChangeListener listener)
public boolean hasListener(EventListener listener)
protected void fireAnnotationChanged()
protected void notifyListeners(AnnotationChangeEvent event)
public boolean getNotify()
public void setNotify(boolean flag)
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
