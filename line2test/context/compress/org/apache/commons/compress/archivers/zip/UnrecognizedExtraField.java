public void setHeaderId(ZipShort headerId)
public ZipShort getHeaderId()
public void setLocalFileDataData(byte[] data)
public ZipShort getLocalFileDataLength()
public byte[] getLocalFileDataData()
public void setCentralDirectoryData(byte[] data)
public ZipShort getCentralDirectoryLength()
public byte[] getCentralDirectoryData()
public void parseFromLocalFileData(byte[] data, int offset, int length)
public void parseFromCentralDirectoryData(byte[] data, int offset, int length)
private static byte[] copy(byte[] from)
ZipShort headerId
byte[] localData
byte[] centralData
