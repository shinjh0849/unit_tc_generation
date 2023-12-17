public FieldUtils()
public static Field getField(final Class<?> cls, final String fieldName)
public static Field getField(final Class<?> cls, final String fieldName, final boolean forceAccess)
public static Field getDeclaredField(final Class<?> cls, final String fieldName)
public static Field getDeclaredField(final Class<?> cls, final String fieldName, final boolean forceAccess)
public static Field[] getAllFields(Class<?> cls)
public static List<Field> getAllFieldsList(Class<?> cls)
public static Object readStaticField(final Field field) throws IllegalAccessException
public static Object readStaticField(final Field field, final boolean forceAccess) throws IllegalAccessException
public static Object readStaticField(final Class<?> cls, final String fieldName) throws IllegalAccessException
public static Object readStaticField(final Class<?> cls, final String fieldName, final boolean forceAccess) throws IllegalAccessException
public static Object readDeclaredStaticField(final Class<?> cls, final String fieldName) throws IllegalAccessException
public static Object readDeclaredStaticField(final Class<?> cls, final String fieldName, final boolean forceAccess) throws IllegalAccessException
public static Object readField(final Field field, final Object target) throws IllegalAccessException
public static Object readField(final Field field, final Object target, final boolean forceAccess) throws IllegalAccessException
public static Object readField(final Object target, final String fieldName) throws IllegalAccessException
public static Object readField(final Object target, final String fieldName, final boolean forceAccess) throws IllegalAccessException
public static Object readDeclaredField(final Object target, final String fieldName) throws IllegalAccessException
public static Object readDeclaredField(final Object target, final String fieldName, final boolean forceAccess) throws IllegalAccessException
public static void writeStaticField(final Field field, final Object value) throws IllegalAccessException
public static void writeStaticField(final Field field, final Object value, final boolean forceAccess) throws IllegalAccessException
public static void writeStaticField(final Class<?> cls, final String fieldName, final Object value) throws IllegalAccessException
public static void writeStaticField(final Class<?> cls, final String fieldName, final Object value, final boolean forceAccess) throws IllegalAccessException
public static void writeDeclaredStaticField(final Class<?> cls, final String fieldName, final Object value) throws IllegalAccessException
public static void writeDeclaredStaticField(final Class<?> cls, final String fieldName, final Object value, final boolean forceAccess) throws IllegalAccessException
public static void writeField(final Field field, final Object target, final Object value) throws IllegalAccessException
public static void writeField(final Field field, final Object target, final Object value, final boolean forceAccess) throws IllegalAccessException
public static void writeField(final Object target, final String fieldName, final Object value) throws IllegalAccessException
public static void writeField(final Object target, final String fieldName, final Object value, final boolean forceAccess) throws IllegalAccessException
public static void writeDeclaredField(final Object target, final String fieldName, final Object value) throws IllegalAccessException
public static void writeDeclaredField(final Object target, final String fieldName, final Object value, final boolean forceAccess) throws IllegalAccessException
