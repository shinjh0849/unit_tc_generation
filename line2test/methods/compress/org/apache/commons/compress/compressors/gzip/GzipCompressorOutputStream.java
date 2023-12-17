public GzipCompressorOutputStream(final OutputStream outputStream) throws IOException { [EOL]     out = new GZIPOutputStream(outputStream); [EOL] } <line_num>: 31,33
public void write(int b) throws IOException { [EOL]     out.write(b); [EOL] } <line_num>: 35,37
public void close() throws IOException { [EOL]     out.close(); [EOL] } <line_num>: 39,41
