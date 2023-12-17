public MappedObjectConstructor(ParameterizedTypeHandlerMap<InstanceCreator<?>> instanceCreators)
public T construct(Type typeOfT)
public Object constructArray(Type type, int length)
private T constructWithNoArgConstructor(Type typeOfT)
private Constructor<T> getNoArgsConstructor(Type typeOfT)
 void register(Type typeOfT, InstanceCreator<? extends T> creator)
public String toString()
Logger log=Optional[Logger.getLogger(MappedObjectConstructor.class.getName())]
ParameterizedTypeHandlerMap<InstanceCreator<?>> instanceCreatorMap
