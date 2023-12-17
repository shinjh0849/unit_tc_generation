public GzipCompressorInputStream(InputStream inputStream) throws IOException { [EOL]     in = new GZIPInputStream(inputStream); [EOL] } <line_num>: 31,33
public int read() throws IOException { [EOL]     return in.read(); [EOL] } <line_num>: 35,37
