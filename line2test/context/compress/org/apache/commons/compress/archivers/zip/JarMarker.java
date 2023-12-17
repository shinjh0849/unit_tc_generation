public JarMarker()
public static JarMarker getInstance()
public ZipShort getHeaderId()
public ZipShort getLocalFileDataLength()
public ZipShort getCentralDirectoryLength()
public byte[] getLocalFileDataData()
public byte[] getCentralDirectoryData()
public void parseFromLocalFileData(byte[] data, int offset, int length) throws ZipException
public void parseFromCentralDirectoryData(byte[] buffer, int offset, int length) throws ZipException
ZipShort ID=Optional[new ZipShort(0xCAFE)]
ZipShort NULL=Optional[new ZipShort(0)]
byte[] NO_BYTES=Optional[new byte[0]]
JarMarker DEFAULT=Optional[new JarMarker()]
