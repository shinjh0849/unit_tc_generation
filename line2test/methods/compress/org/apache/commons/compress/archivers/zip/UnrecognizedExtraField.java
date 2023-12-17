public void setHeaderId(ZipShort headerId) { [EOL]     this.headerId = headerId; [EOL] } <line_num>: 40,42
public ZipShort getHeaderId() { [EOL]     return headerId; [EOL] } <line_num>: 48,50
public void setLocalFileDataData(byte[] data) { [EOL]     localData = copy(data); [EOL] } <line_num>: 63,65
public ZipShort getLocalFileDataLength() { [EOL]     return new ZipShort(localData.length); [EOL] } <line_num>: 71,73
public byte[] getLocalFileDataData() { [EOL]     return copy(localData); [EOL] } <line_num>: 79,81
public void setCentralDirectoryData(byte[] data) { [EOL]     centralData = copy(data); [EOL] } <line_num>: 93,95
public ZipShort getCentralDirectoryLength() { [EOL]     if (centralData != null) { [EOL]         return new ZipShort(centralData.length); [EOL]     } [EOL]     return getLocalFileDataLength(); [EOL] } <line_num>: 102,107
public byte[] getCentralDirectoryData() { [EOL]     if (centralData != null) { [EOL]         return copy(centralData); [EOL]     } [EOL]     return getLocalFileDataData(); [EOL] } <line_num>: 113,118
public void parseFromLocalFileData(byte[] data, int offset, int length) { [EOL]     byte[] tmp = new byte[length]; [EOL]     System.arraycopy(data, offset, tmp, 0, length); [EOL]     setLocalFileDataData(tmp); [EOL] } <line_num>: 126,130
public void parseFromCentralDirectoryData(byte[] data, int offset, int length) { [EOL]     byte[] tmp = new byte[length]; [EOL]     System.arraycopy(data, offset, tmp, 0, length); [EOL]     setCentralDirectoryData(tmp); [EOL]     if (localData == null) { [EOL]         setLocalFileDataData(tmp); [EOL]     } [EOL] } <line_num>: 138,146
private static byte[] copy(byte[] from) { [EOL]     if (from != null) { [EOL]         byte[] to = new byte[from.length]; [EOL]         System.arraycopy(from, 0, to, 0, to.length); [EOL]         return to; [EOL]     } [EOL]     return null; [EOL] } <line_num>: 148,155
