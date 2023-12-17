public EventListenerSupport(final Class<L> listenerInterface)
public EventListenerSupport(final Class<L> listenerInterface, final ClassLoader classLoader)
private EventListenerSupport()
public static EventListenerSupport<T> create(final Class<T> listenerInterface)
public L fire()
public void addListener(final L listener)
 int getListenerCount()
public void removeListener(final L listener)
public L[] getListeners()
private void writeObject(final ObjectOutputStream objectOutputStream) throws IOException
private void readObject(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException
private void initializeTransientFields(final Class<L> listenerInterface, final ClassLoader classLoader)
private void createProxy(final Class<L> listenerInterface, final ClassLoader classLoader)
protected InvocationHandler createInvocationHandler()
public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable
