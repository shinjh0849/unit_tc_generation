public OpenIntToDoubleHashMap()
public OpenIntToDoubleHashMap(final double missingEntries)
public OpenIntToDoubleHashMap(final int expectedSize)
public OpenIntToDoubleHashMap(final int expectedSize, final double missingEntries)
public OpenIntToDoubleHashMap(final OpenIntToDoubleHashMap source)
private Iterator()
private static int computeCapacity(final int expectedSize)
private static int nextPowerOfTwo(final int i)
public double get(final int key)
public boolean containsKey(final int key)
public Iterator iterator()
private static int perturb(final int hash)
private int findInsertionIndex(final int key)
private static int findInsertionIndex(final int[] keys, final byte[] states, final int key, final int mask)
private static int probe(final int perturb, final int j)
private static int changeIndexSign(final int index)
public int size()
public double remove(final int key)
private boolean containsKey(final int key, final int index)
private double doRemove(int index)
public double put(final int key, final double value)
private void growTable()
private boolean shouldGrowTable()
private static int hashOf(final int key)
public boolean hasNext()
public int key() throws ConcurrentModificationException, NoSuchElementException
public double value() throws ConcurrentModificationException, NoSuchElementException
public void advance() throws ConcurrentModificationException, NoSuchElementException
private void readObject(final ObjectInputStream stream) throws IOException, ClassNotFoundException
byte FREE=Optional[0]
byte FULL=Optional[1]
byte REMOVED=Optional[2]
long serialVersionUID=Optional[-3646337053166149105L]
float LOAD_FACTOR=Optional[0.5f]
int DEFAULT_EXPECTED_SIZE=Optional[16]
int RESIZE_MULTIPLIER=Optional[2]
int PERTURB_SHIFT=Optional[5]
int[] keys
double[] values
byte[] states
double missingEntries
int size
int mask
int count
