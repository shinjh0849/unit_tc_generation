public OpenIntToFieldHashMap(final Field<T> field)
public OpenIntToFieldHashMap(final Field<T> field, final T missingEntries)
public OpenIntToFieldHashMap(final Field<T> field, final int expectedSize)
public OpenIntToFieldHashMap(final Field<T> field, final int expectedSize, final T missingEntries)
public OpenIntToFieldHashMap(final OpenIntToFieldHashMap<T> source)
private Iterator()
private static int computeCapacity(final int expectedSize)
private static int nextPowerOfTwo(final int i)
public T get(final int key)
public boolean containsKey(final int key)
public Iterator iterator()
private static int perturb(final int hash)
private int findInsertionIndex(final int key)
private static int findInsertionIndex(final int[] keys, final byte[] states, final int key, final int mask)
private static int probe(final int perturb, final int j)
private static int changeIndexSign(final int index)
public int size()
public T remove(final int key)
private boolean containsKey(final int key, final int index)
private T doRemove(int index)
public T put(final int key, final T value)
private void growTable()
private boolean shouldGrowTable()
private static int hashOf(final int key)
public boolean hasNext()
public int key() throws ConcurrentModificationException, NoSuchElementException
public T value() throws ConcurrentModificationException, NoSuchElementException
public void advance() throws ConcurrentModificationException, NoSuchElementException
private void readObject(final ObjectInputStream stream) throws IOException, ClassNotFoundException
private T[] buildArray(final int length)
byte FREE=Optional[0]
byte FULL=Optional[1]
byte REMOVED=Optional[2]
long serialVersionUID=Optional[-9179080286849120720L]
float LOAD_FACTOR=Optional[0.5f]
int DEFAULT_EXPECTED_SIZE=Optional[16]
int RESIZE_MULTIPLIER=Optional[2]
int PERTURB_SHIFT=Optional[5]
Field<T> field
int[] keys
T[] values
byte[] states
T missingEntries
int size
int mask
int count
