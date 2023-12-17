public SerializedString(String v)
private void readObject(ObjectInputStream in) throws IOException
private void writeObject(ObjectOutputStream out) throws IOException
protected Object readResolve()
public final String getValue()
public final int charLength()
public final char[] asQuotedChars()
public final byte[] asUnquotedUTF8()
public final byte[] asQuotedUTF8()
public int appendQuotedUTF8(byte[] buffer, int offset)
public int appendQuoted(char[] buffer, int offset)
public int appendUnquotedUTF8(byte[] buffer, int offset)
public int appendUnquoted(char[] buffer, int offset)
public int writeQuotedUTF8(OutputStream out) throws IOException
public int writeUnquotedUTF8(OutputStream out) throws IOException
public int putQuotedUTF8(ByteBuffer buffer)
public int putUnquotedUTF8(ByteBuffer buffer)
public final String toString()
public final int hashCode()
public final boolean equals(Object o)
String _value
byte[] _quotedUTF8Ref
byte[] _unquotedUTF8Ref
char[] _quotedChars
String _jdkSerializeValue
