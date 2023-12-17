public BrokenStringWriter(String msg) { [EOL]     super(new StringWriter()); [EOL]     _message = msg; [EOL] } <line_num>: 10,13
@Override [EOL] public void write(char[] cbuf, int off, int len) throws IOException { [EOL]     throw new IOException(_message); [EOL] } <line_num>: 15,19
@Override [EOL] public void write(int c) throws IOException { [EOL]     throw new IOException(_message); [EOL] } <line_num>: 21,25
@Override [EOL] public void write(String str, int off, int len) throws IOException { [EOL]     throw new IOException(_message); [EOL] } <line_num>: 27,31
