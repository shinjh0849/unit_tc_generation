public MethodUtils()
public static Object invokeMethod(final Object object, final String methodName, Object... args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException
public static Object invokeMethod(final Object object, final String methodName, Object[] args, Class<?>[] parameterTypes) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException
public static Object invokeExactMethod(final Object object, final String methodName, Object... args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException
public static Object invokeExactMethod(final Object object, final String methodName, Object[] args, Class<?>[] parameterTypes) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException
public static Object invokeExactStaticMethod(final Class<?> cls, final String methodName, Object[] args, Class<?>[] parameterTypes) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException
public static Object invokeStaticMethod(final Class<?> cls, final String methodName, Object... args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException
public static Object invokeStaticMethod(final Class<?> cls, final String methodName, Object[] args, Class<?>[] parameterTypes) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException
public static Object invokeExactStaticMethod(final Class<?> cls, final String methodName, Object... args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException
public static Method getAccessibleMethod(final Class<?> cls, final String methodName, final Class<?>... parameterTypes)
public static Method getAccessibleMethod(Method method)
private static Method getAccessibleMethodFromSuperclass(final Class<?> cls, final String methodName, final Class<?>... parameterTypes)
private static Method getAccessibleMethodFromInterfaceNest(Class<?> cls, final String methodName, final Class<?>... parameterTypes)
public static Method getMatchingAccessibleMethod(final Class<?> cls, final String methodName, final Class<?>... parameterTypes)
