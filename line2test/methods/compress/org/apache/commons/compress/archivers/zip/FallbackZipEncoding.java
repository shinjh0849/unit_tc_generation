public FallbackZipEncoding() { [EOL]     this.charset = null; [EOL] } <line_num>: 49,51
public FallbackZipEncoding(String charset) { [EOL]     this.charset = charset; [EOL] } <line_num>: 59,61
public boolean canEncode(String name) { [EOL]     return true; [EOL] } <line_num>: 67,69
public ByteBuffer encode(String name) throws IOException { [EOL]     if (this.charset == null) { [EOL]         return ByteBuffer.wrap(name.getBytes()); [EOL]     } else { [EOL]         return ByteBuffer.wrap(name.getBytes(this.charset)); [EOL]     } [EOL] } <line_num>: 75,81
public String decode(byte[] data) throws IOException { [EOL]     if (this.charset == null) { [EOL]         return new String(data); [EOL]     } else { [EOL]         return new String(data, this.charset); [EOL]     } [EOL] } <line_num>: 87,93
