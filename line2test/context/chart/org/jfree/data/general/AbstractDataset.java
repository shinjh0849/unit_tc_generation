protected AbstractDataset()
public DatasetGroup getGroup()
public void setGroup(DatasetGroup group)
public void addChangeListener(DatasetChangeListener listener)
public void removeChangeListener(DatasetChangeListener listener)
public boolean hasListener(EventListener listener)
protected void fireDatasetChanged(DatasetChangeInfo info)
protected void notifyListeners(DatasetChangeEvent event)
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
public void validateObject() throws InvalidObjectException
long serialVersionUID=Optional[1918768939869230744L]
DatasetGroup group
EventListenerList listenerList
