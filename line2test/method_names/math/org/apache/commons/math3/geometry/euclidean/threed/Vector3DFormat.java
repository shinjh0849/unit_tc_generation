public Vector3DFormat()
public Vector3DFormat(final NumberFormat format)
public Vector3DFormat(final String prefix, final String suffix, final String separator)
public Vector3DFormat(final String prefix, final String suffix, final String separator, final NumberFormat format)
public static Vector3DFormat getInstance()
public static Vector3DFormat getInstance(final Locale locale)
public StringBuffer format(final Vector<Euclidean3D> vector, final StringBuffer toAppendTo, final FieldPosition pos)
public Vector3D parse(final String source) throws MathParseException
public Vector3D parse(final String source, final ParsePosition pos)
