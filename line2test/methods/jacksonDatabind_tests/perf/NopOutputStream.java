public NopOutputStream() { [EOL] } <line_num>: 10,10
@Override [EOL] public void write(int b) throws IOException { [EOL]     ++size; [EOL] } <line_num>: 12,13
@Override [EOL] public void write(byte[] b) throws IOException { [EOL]     size += b.length; [EOL] } <line_num>: 15,16
@Override [EOL] public void write(byte[] b, int offset, int len) throws IOException { [EOL]     size += len; [EOL] } <line_num>: 18,19
public int size() { [EOL]     return size; [EOL] } <line_num>: 21,21
