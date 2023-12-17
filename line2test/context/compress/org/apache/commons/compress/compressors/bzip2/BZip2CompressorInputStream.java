public BZip2CompressorInputStream(final InputStream in) throws IOException
 Data(int blockSize100k)
public int read() throws IOException
public int read(final byte[] dest, final int offs, final int len) throws IOException
private void makeMaps()
private int read0() throws IOException
private void init() throws IOException
private void checkMagicChar(char expected, String position) throws IOException
private void initBlock() throws IOException
private void endBlock() throws IOException
private void complete() throws IOException
public void close() throws IOException
private int bsR(final int n) throws IOException
private boolean bsGetBit() throws IOException
private char bsGetUByte() throws IOException
private int bsGetInt() throws IOException
private static void hbCreateDecodeTables(final int[] limit, final int[] base, final int[] perm, final char[] length, final int minLen, final int maxLen, final int alphaSize)
private void recvDecodingTables() throws IOException
private void createHuffmanDecodingTables(final int alphaSize, final int nGroups)
private void getAndMoveToFrontDecode() throws IOException
private int getAndMoveToFrontDecode0(final int groupNo) throws IOException
private void setupBlock() throws IOException
private void setupRandPartA() throws IOException
private void setupNoRandPartA() throws IOException
private void setupRandPartB() throws IOException
private void setupRandPartC() throws IOException
private void setupNoRandPartB() throws IOException
private void setupNoRandPartC() throws IOException
 final int[] initTT(int length)
int last
int origPtr
int blockSize100k
boolean blockRandomised
int bsBuff
int bsLive
CRC crc=Optional[new CRC()]
int nInUse
InputStream in
int currentChar=Optional[-1]
int EOF=Optional[0]
int START_BLOCK_STATE=Optional[1]
int RAND_PART_A_STATE=Optional[2]
int RAND_PART_B_STATE=Optional[3]
int RAND_PART_C_STATE=Optional[4]
int NO_RAND_PART_A_STATE=Optional[5]
int NO_RAND_PART_B_STATE=Optional[6]
int NO_RAND_PART_C_STATE=Optional[7]
int currentState=Optional[START_BLOCK_STATE]
int storedBlockCRC
int storedCombinedCRC
int computedBlockCRC
int computedCombinedCRC
int su_count
int su_ch2
int su_chPrev
int su_i2
int su_j2
int su_rNToGo
int su_rTPos
int su_tPos
char su_z
BZip2CompressorInputStream.Data data
