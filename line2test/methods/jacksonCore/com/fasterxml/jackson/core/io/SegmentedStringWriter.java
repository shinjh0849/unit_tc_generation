public SegmentedStringWriter(BufferRecycler br) { [EOL]     super(); [EOL]     _buffer = new TextBuffer(br); [EOL] } <line_num>: 21,25
@Override [EOL] public Writer append(char c) { [EOL]     write(c); [EOL]     return this; [EOL] } <line_num>: 33,38
@Override [EOL] public Writer append(CharSequence csq) { [EOL]     String str = csq.toString(); [EOL]     _buffer.append(str, 0, str.length()); [EOL]     return this; [EOL] } <line_num>: 40,46
@Override [EOL] public Writer append(CharSequence csq, int start, int end) { [EOL]     String str = csq.subSequence(start, end).toString(); [EOL]     _buffer.append(str, 0, str.length()); [EOL]     return this; [EOL] } <line_num>: 48,54
@Override [EOL] public void close() { [EOL] } <line_num>: 56,56
@Override [EOL] public void flush() { [EOL] } <line_num>: 58,58
@Override [EOL] public void write(char[] cbuf) { [EOL]     _buffer.append(cbuf, 0, cbuf.length); [EOL] } <line_num>: 60,63
@Override [EOL] public void write(char[] cbuf, int off, int len) { [EOL]     _buffer.append(cbuf, off, len); [EOL] } <line_num>: 65,68
@Override [EOL] public void write(int c) { [EOL]     _buffer.append((char) c); [EOL] } <line_num>: 70,73
@Override [EOL] public void write(String str) { [EOL]     _buffer.append(str, 0, str.length()); [EOL] } <line_num>: 75,76
@Override [EOL] public void write(String str, int off, int len) { [EOL]     _buffer.append(str, off, len); [EOL] } <line_num>: 78,81
public String getAndClear() { [EOL]     String result = _buffer.contentsAsString(); [EOL]     _buffer.releaseBuffers(); [EOL]     return result; [EOL] } <line_num>: 96,101
