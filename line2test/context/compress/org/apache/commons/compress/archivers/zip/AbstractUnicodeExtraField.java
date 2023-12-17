protected AbstractUnicodeExtraField()
protected AbstractUnicodeExtraField(String text, byte[] bytes, int off, int len)
protected AbstractUnicodeExtraField(String text, byte[] bytes)
private void assembleData()
public long getNameCRC32()
public void setNameCRC32(long nameCRC32)
public byte[] getUnicodeName()
public void setUnicodeName(byte[] unicodeName)
public byte[] getCentralDirectoryData()
public ZipShort getCentralDirectoryLength()
public byte[] getLocalFileDataData()
public ZipShort getLocalFileDataLength()
public void parseFromLocalFileData(byte[] buffer, int offset, int length) throws ZipException
public void parseFromCentralDirectoryData(byte[] buffer, int offset, int length) throws ZipException
long nameCRC32
byte[] unicodeName
byte[] data
