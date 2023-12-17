public synchronized void registerForTypeHierarchy(Class<?> typeOfT, T value)
public synchronized void registerForTypeHierarchy(Pair<Class<?>, T> pair)
private int getIndexOfAnOverriddenHandler(Class<?> type)
public synchronized void register(Type typeOfT, T value)
public synchronized void registerIfAbsent(ParameterizedTypeHandlerMap<T> other)
public synchronized void registerIfAbsent(Type typeOfT, T value)
public synchronized void makeUnmodifiable()
public synchronized T getHandlerFor(Type type)
private T getHandlerForTypeHierarchy(Class<?> type)
public synchronized boolean hasSpecificHandlerFor(Type type)
private synchronized int getIndexOfSpecificHandlerForTypeHierarchy(Class<?> type)
public synchronized ParameterizedTypeHandlerMap<T> copyOf()
public String toString()
private String typeToString(Type type)
Logger logger=Optional[Logger.getLogger(ParameterizedTypeHandlerMap.class.getName())]
Map<Type, T> map=Optional[new HashMap<Type, T>()]
List<Pair<Class<?>, T>> typeHierarchyList=Optional[new ArrayList<Pair<Class<?>, T>>()]
boolean modifiable=Optional[true]
