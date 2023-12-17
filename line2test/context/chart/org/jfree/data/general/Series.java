protected Series(Comparable key)
protected Series(Comparable key, String description)
public Comparable getKey()
public void setKey(Comparable key)
public String getDescription()
public void setDescription(String description)
public boolean getNotify()
public void setNotify(boolean notify)
public boolean isEmpty()
public abstract int getItemCount()
public Object clone() throws CloneNotSupportedException
public boolean equals(Object obj)
public int hashCode()
public void addChangeListener(SeriesChangeListener listener)
public void removeChangeListener(SeriesChangeListener listener)
public void fireSeriesChanged()
protected void notifyListeners(SeriesChangeEvent event)
public void addPropertyChangeListener(PropertyChangeListener listener)
public void removePropertyChangeListener(PropertyChangeListener listener)
protected void firePropertyChange(String property, Object oldValue, Object newValue)
long serialVersionUID=Optional[-6906561437538683581L]
Comparable key
String description
EventListenerList listeners
PropertyChangeSupport propertyChangeSupport
boolean notify
