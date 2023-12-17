public ExternalizableInput(ObjectInput in)
public ExternalizableOutput(ObjectOutput out)
public MyPojo()
public MyPojo(int id, String name, int[] values)
public MyPojoNative(int id, String name, int[] values)
public static ObjectMapper mapper()
public int available() throws IOException
public void close() throws IOException
public boolean markSupported()
public int read() throws IOException
public int read(byte[] buffer) throws IOException
public int read(byte[] buffer, int offset, int len) throws IOException
public long skip(long n) throws IOException
public void flush() throws IOException
public void close() throws IOException
public void write(int ch) throws IOException
public void write(byte[] data) throws IOException
public void write(byte[] data, int offset, int len) throws IOException
public void readExternal(ObjectInput in) throws IOException
public void writeExternal(ObjectOutput oo) throws IOException
public boolean equals(Object o)
public void testSerializeAsExternalizable() throws Exception
private int indexOf(byte[] full, byte[] fragment)
private boolean matches(byte[] full, int index, byte[] fragment)
