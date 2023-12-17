private CharsToNameCanonicalizer()
private CharsToNameCanonicalizer(CharsToNameCanonicalizer parent, boolean canonicalize, boolean intern, String[] symbols, Bucket[] buckets, int size, int hashSeed, int longestColl)
public Bucket(String symbol, Bucket next)
public static CharsToNameCanonicalizer createRoot()
protected static CharsToNameCanonicalizer createRoot(int hashSeed)
private void initTables(int initialSize)
private static int _thresholdSize(int hashAreaSize)
public CharsToNameCanonicalizer makeChild(final boolean canonicalize, final boolean intern)
private CharsToNameCanonicalizer makeOrphan(int seed)
private void mergeChild(CharsToNameCanonicalizer child)
public void release()
public int size()
public int bucketCount()
public boolean maybeDirty()
public int hashSeed()
public int collisionCount()
public int maxCollisionLength()
public String findSymbol(char[] buffer, int start, int len, int h)
public int _hashToIndex(int rawHash)
public int calcHash(char[] buffer, int start, int len)
public int calcHash(String key)
private void copyArrays()
private void rehash()
protected void reportTooManyCollisions(int maxLen)
public String getSymbol()
public Bucket getNext()
public int length()
public String find(char[] buf, int start, int len)
int HASH_MULT=Optional[33]
int DEFAULT_TABLE_SIZE=Optional[64]
int MAX_TABLE_SIZE=Optional[0x10000]
int MAX_ENTRIES_FOR_REUSE=Optional[12000]
int MAX_COLL_CHAIN_LENGTH=Optional[255]
int MAX_COLL_CHAIN_FOR_REUSE=Optional[63]
CharsToNameCanonicalizer sBootstrapSymbolTable
CharsToNameCanonicalizer _parent
int _hashSeed
boolean _intern
boolean _canonicalize
String[] _symbols
Bucket[] _buckets
int _size
int _sizeThreshold
int _indexMask
int _longestCollisionList
boolean _dirty
