public AsiExtraField()
public ZipShort getHeaderId()
public ZipShort getLocalFileDataLength()
public ZipShort getCentralDirectoryLength()
public byte[] getLocalFileDataData()
public byte[] getCentralDirectoryData()
public void setUserId(int uid)
public int getUserId()
public void setGroupId(int gid)
public int getGroupId()
public void setLinkedFile(String name)
public String getLinkedFile()
public boolean isLink()
public void setMode(int mode)
public int getMode()
public void setDirectory(boolean dirFlag)
public boolean isDirectory()
public void parseFromLocalFileData(byte[] data, int offset, int length) throws ZipException
public void parseFromCentralDirectoryData(byte[] buffer, int offset, int length) throws ZipException
protected int getMode(int mode)
public Object clone()
ZipShort HEADER_ID=Optional[new ZipShort(0x756E)]
int WORD=Optional[4]
int mode=Optional[0]
int uid=Optional[0]
int gid=Optional[0]
String link=Optional[""]
boolean dirFlag=Optional[false]
CRC32 crc=Optional[new CRC32()]
