public JarMarker() { [EOL] } <line_num>: 34,36
public static JarMarker getInstance() { [EOL]     return DEFAULT; [EOL] } <line_num>: 42,44
public ZipShort getHeaderId() { [EOL]     return ID; [EOL] } <line_num>: 50,52
public ZipShort getLocalFileDataLength() { [EOL]     return NULL; [EOL] } <line_num>: 59,61
public ZipShort getCentralDirectoryLength() { [EOL]     return NULL; [EOL] } <line_num>: 68,70
public byte[] getLocalFileDataData() { [EOL]     return NO_BYTES; [EOL] } <line_num>: 77,79
public byte[] getCentralDirectoryData() { [EOL]     return NO_BYTES; [EOL] } <line_num>: 86,88
public void parseFromLocalFileData(byte[] data, int offset, int length) throws ZipException { [EOL]     if (length != 0) { [EOL]         throw new ZipException("JarMarker doesn't expect any data"); [EOL]     } [EOL] } <line_num>: 98,103
public void parseFromCentralDirectoryData(byte[] buffer, int offset, int length) throws ZipException { [EOL]     parseFromLocalFileData(buffer, offset, length); [EOL] } <line_num>: 109,113
