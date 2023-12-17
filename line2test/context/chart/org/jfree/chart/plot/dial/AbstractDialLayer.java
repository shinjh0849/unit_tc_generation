protected AbstractDialLayer()
public boolean isVisible()
public void setVisible(boolean visible)
public boolean equals(Object obj)
public int hashCode()
public Object clone() throws CloneNotSupportedException
public void addChangeListener(DialLayerChangeListener listener)
public void removeChangeListener(DialLayerChangeListener listener)
public boolean hasListener(EventListener listener)
protected void notifyListeners(DialLayerChangeEvent event)
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
boolean visible
EventListenerList listenerList
