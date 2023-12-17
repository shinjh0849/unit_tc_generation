 EventBindingInvocationHandler(final Object target, final String methodName, final String[] eventTypes)
public static void addEventListener(final Object eventSource, final Class<L> listenerType, final L listener)
public static void bindEventsToMethod(final Object target, final String methodName, final Object eventSource, final Class<L> listenerType, final String... eventTypes)
public Object invoke(final Object proxy, final Method method, final Object[] parameters) throws Throwable
private boolean hasMatchingParametersMethod(final Method method)
