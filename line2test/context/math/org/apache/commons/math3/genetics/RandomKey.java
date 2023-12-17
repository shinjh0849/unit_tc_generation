public RandomKey(final List<Double> representation) throws InvalidRepresentationException
public RandomKey(final Double[] representation) throws InvalidRepresentationException
public List<T> decode(final List<T> sequence)
private static List<S> decodeGeneric(final List<S> sequence, List<Double> representation, final List<Double> sortedRepr) throws DimensionMismatchException
protected boolean isSame(final Chromosome another)
protected void checkValidity(final List<Double> chromosomeRepresentation) throws InvalidRepresentationException
public static final List<Double> randomPermutation(final int l)
public static final List<Double> identityPermutation(final int l)
public static List<Double> comparatorPermutation(final List<S> data, final Comparator<S> comparator)
public static List<Double> inducedPermutation(final List<S> originalData, final List<S> permutedData) throws DimensionMismatchException, MathIllegalArgumentException
public String toString()
private static List<Integer> baseSequence(final int l)
List<Double> sortedRepresentation
List<Integer> baseSeqPermutation
