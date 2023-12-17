public BZip2CompressorOutputStream(OutputStream inStream) throws IOException
public BZip2CompressorOutputStream(OutputStream inStream, int inBlockSize) throws IOException
private static void panic()
private void makeMaps()
protected static void hbMakeCodeLengths(char[] len, int[] freq, int alphaSize, int maxLen)
public void write(int bv) throws IOException
private void writeRun() throws IOException
protected void finalize() throws Throwable
public void close() throws IOException
protected void finish() throws IOException
public void flush() throws IOException
private void initialize() throws IOException
private void initBlock()
private void endBlock() throws IOException
private void endCompression() throws IOException
private void hbAssignCodes(int[] code, char[] length, int minLen, int maxLen, int alphaSize)
private void bsSetStream(OutputStream f)
private void bsFinishedWithStream() throws IOException
private void bsW(int n, int v) throws IOException
private void bsPutUChar(int c) throws IOException
private void bsPutint(int u) throws IOException
private void bsPutIntVS(int numBits, int c) throws IOException
private void sendMTFValues() throws IOException
private void moveToFrontCodeAndSend() throws IOException
private void simpleSort(int lo, int hi, int d)
private void vswap(int p1, int p2, int n)
private char med3(char a, char b, char c)
private void qSort3(int loSt, int hiSt, int dSt, StackElem[] stack)
private void mainSort()
private void randomiseBlock()
private void doReversibleTransformation()
private boolean fullGtU(int i1, int i2)
private void allocateCompressStructures()
private void generateMTFValues()
