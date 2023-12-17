public ZipArchiveEntry(String name)
public ZipArchiveEntry(java.util.zip.ZipEntry entry) throws ZipException
public ZipArchiveEntry(ZipArchiveEntry entry) throws ZipException
protected ZipArchiveEntry()
public Object clone()
public int getInternalAttributes()
public void setInternalAttributes(int value)
public long getExternalAttributes()
public void setExternalAttributes(long value)
public void setUnixMode(int mode)
public int getUnixMode()
public int getPlatform()
protected void setPlatform(int platform)
public void setExtraFields(ZipExtraField[] fields)
public ZipExtraField[] getExtraFields()
public void addExtraField(ZipExtraField ze)
public void addAsFirstExtraField(ZipExtraField ze)
public void removeExtraField(ZipShort type)
public ZipExtraField getExtraField(ZipShort type)
public void setExtra(byte[] extra) throws RuntimeException
protected void setExtra()
public void setCentralDirectoryExtra(byte[] b)
public byte[] getLocalFileDataExtra()
public byte[] getCentralDirectoryExtra()
public String getName()
public boolean isDirectory()
protected void setName(String name)
public int hashCode()
private void mergeExtraFields(ZipExtraField[] f, boolean local) throws ZipException
int PLATFORM_UNIX=Optional[3]
int PLATFORM_FAT=Optional[0]
int SHORT_MASK=Optional[0xFFFF]
int SHORT_SHIFT=Optional[16]
int internalAttributes=Optional[0]
int platform=Optional[PLATFORM_FAT]
long externalAttributes=Optional[0]
LinkedHashMap extraFields=Optional[null]
String name=Optional[null]
