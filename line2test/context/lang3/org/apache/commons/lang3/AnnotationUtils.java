public AnnotationUtils()
protected String getShortClassName(final java.lang.Class<?> cls)
protected void appendDetail(final StringBuffer buffer, final String fieldName, Object value)
public static boolean equals(final Annotation a1, final Annotation a2)
public static int hashCode(final Annotation a)
public static String toString(final Annotation a)
public static boolean isValidAnnotationMemberType(Class<?> type)
private static int hashMember(final String name, final Object value)
private static boolean memberEquals(final Class<?> type, final Object o1, final Object o2)
private static boolean arrayMemberEquals(final Class<?> componentType, final Object o1, final Object o2)
private static boolean annotationArrayMemberEquals(final Annotation[] a1, final Annotation[] a2)
private static int arrayMemberHash(final Class<?> componentType, final Object o)
ToStringStyle TO_STRING_STYLE=Optional[new ToStringStyle() {

    /**
     * Serialization version
     */
    private static final long serialVersionUID = 1L;

    {
        setDefaultFullDetail(true);
        setArrayContentDetail(true);
        setUseClassName(true);
        setUseShortClassName(true);
        setUseIdentityHashCode(false);
        setContentStart("(");
        setContentEnd(")");
        setFieldSeparator(", ");
        setArrayStart("[");
        setArrayEnd("]");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getShortClassName(final java.lang.Class<?> cls) {
        Class<? extends Annotation> annotationType = null;
        for (final Class<?> iface : ClassUtils.getAllInterfaces(cls)) {
            if (Annotation.class.isAssignableFrom(iface)) {
                // OK because we just checked the assignability
                @SuppressWarnings("unchecked")
                final Class<? extends Annotation> found = (Class<? extends Annotation>) iface;
                annotationType = found;
                break;
            }
        }
        return new StringBuilder(annotationType == null ? "" : annotationType.getName()).insert(0, '@').toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void appendDetail(final StringBuffer buffer, final String fieldName, Object value) {
        if (value instanceof Annotation) {
            value = AnnotationUtils.toString((Annotation) value);
        }
        super.appendDetail(buffer, fieldName, value);
    }
}]
