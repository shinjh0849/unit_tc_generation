protected AbstractDataset() { [EOL]     this.group = new DatasetGroup(); [EOL]     this.listenerList = new EventListenerList(); [EOL] } <line_num>: 95,98
public DatasetGroup getGroup() { [EOL]     return this.group; [EOL] } <line_num>: 107,109
public void setGroup(DatasetGroup group) { [EOL]     if (group == null) { [EOL]         throw new IllegalArgumentException("Null 'group' argument."); [EOL]     } [EOL]     this.group = group; [EOL] } <line_num>: 118,123
public void addChangeListener(DatasetChangeListener listener) { [EOL]     this.listenerList.add(DatasetChangeListener.class, listener); [EOL] } <line_num>: 132,134
public void removeChangeListener(DatasetChangeListener listener) { [EOL]     this.listenerList.remove(DatasetChangeListener.class, listener); [EOL] } <line_num>: 144,146
public boolean hasListener(EventListener listener) { [EOL]     List list = Arrays.asList(this.listenerList.getListenerList()); [EOL]     return list.contains(listener); [EOL] } <line_num>: 160,163
protected void fireDatasetChanged(DatasetChangeInfo info) { [EOL]     notifyListeners(new DatasetChangeEvent(this, this, info)); [EOL] } <line_num>: 175,177
protected void notifyListeners(DatasetChangeEvent event) { [EOL]     Object[] listeners = this.listenerList.getListenerList(); [EOL]     for (int i = listeners.length - 2; i >= 0; i -= 2) { [EOL]         if (listeners[i] == DatasetChangeListener.class) { [EOL]             ((DatasetChangeListener) listeners[i + 1]).datasetChanged(event); [EOL]         } [EOL]     } [EOL] } <line_num>: 188,196
public Object clone() throws CloneNotSupportedException { [EOL]     AbstractDataset clone = (AbstractDataset) super.clone(); [EOL]     clone.listenerList = new EventListenerList(); [EOL]     return clone; [EOL] } <line_num>: 208,212
private void writeObject(ObjectOutputStream stream) throws IOException { [EOL]     stream.defaultWriteObject(); [EOL] } <line_num>: 221,223
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException { [EOL]     stream.defaultReadObject(); [EOL]     this.listenerList = new EventListenerList(); [EOL]     stream.registerValidation(this, 10); [EOL] } <line_num>: 233,239
public void validateObject() throws InvalidObjectException { [EOL]     fireDatasetChanged(new DatasetChangeInfo()); [EOL] } <line_num>: 258,261
