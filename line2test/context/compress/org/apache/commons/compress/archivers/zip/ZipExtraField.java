 ZipShort getHeaderId()
 ZipShort getLocalFileDataLength()
 ZipShort getCentralDirectoryLength()
 byte[] getLocalFileDataData()
 byte[] getCentralDirectoryData()
 void parseFromLocalFileData(byte[] buffer, int offset, int length) throws ZipException
 void parseFromCentralDirectoryData(byte[] buffer, int offset, int length) throws ZipException
