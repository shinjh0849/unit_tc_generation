ZipShort getHeaderId(); <line_num>: 37,37
ZipShort getLocalFileDataLength(); <line_num>: 45,45
ZipShort getCentralDirectoryLength(); <line_num>: 53,53
byte[] getLocalFileDataData(); <line_num>: 61,61
byte[] getCentralDirectoryData(); <line_num>: 69,69
void parseFromLocalFileData(byte[] buffer, int offset, int length) throws ZipException; <line_num>: 79,80
void parseFromCentralDirectoryData(byte[] buffer, int offset, int length) throws ZipException; <line_num>: 90,91
