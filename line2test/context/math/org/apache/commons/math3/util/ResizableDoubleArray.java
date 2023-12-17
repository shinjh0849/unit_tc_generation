public ResizableDoubleArray()
public ResizableDoubleArray(int initialCapacity) throws MathIllegalArgumentException
public ResizableDoubleArray(double[] initialArray)
public ResizableDoubleArray(int initialCapacity, float expansionFactor) throws MathIllegalArgumentException
public ResizableDoubleArray(int initialCapacity, double expansionFactor) throws MathIllegalArgumentException
public ResizableDoubleArray(int initialCapacity, float expansionFactor, float contractionCriteria) throws MathIllegalArgumentException
public ResizableDoubleArray(int initialCapacity, double expansionFactor, double contractionCriterion) throws MathIllegalArgumentException
public ResizableDoubleArray(int initialCapacity, float expansionFactor, float contractionCriteria, int expansionMode) throws MathIllegalArgumentException
public ResizableDoubleArray(int initialCapacity, double expansionFactor, double contractionCriterion, ExpansionMode expansionMode, double... data) throws MathIllegalArgumentException
public ResizableDoubleArray(ResizableDoubleArray original) throws NullArgumentException
public synchronized void addElement(double value)
public synchronized void addElements(double[] values)
public synchronized double addElementRolling(double value)
public synchronized double substituteMostRecentElement(double value) throws MathIllegalStateException
protected void checkContractExpand(float contraction, float expansion) throws MathIllegalArgumentException
protected void checkContractExpand(double contraction, double expansion) throws NumberIsTooSmallException
public synchronized void clear()
public synchronized void contract()
public synchronized void discardFrontElements(int i) throws MathIllegalArgumentException
public synchronized void discardMostRecentElements(int i) throws MathIllegalArgumentException
private synchronized void discardExtremeElements(int i, boolean front) throws MathIllegalArgumentException
protected synchronized void expand()
private synchronized void expandTo(int size)
public float getContractionCriteria()
public double getContractionCriterion()
public synchronized double getElement(int index)
public synchronized double[] getElements()
public float getExpansionFactor()
public int getExpansionMode()
 synchronized int getInternalLength()
public int getCapacity()
public synchronized int getNumElements()
public synchronized double[] getInternalValues()
protected double[] getArrayRef()
protected int getStartIndex()
public void setContractionCriteria(float contractionCriteria) throws MathIllegalArgumentException
public double compute(MathArrays.Function f)
public synchronized void setElement(int index, double value)
public void setExpansionFactor(float expansionFactor) throws MathIllegalArgumentException
public void setExpansionMode(int expansionMode) throws MathIllegalArgumentException
public void setExpansionMode(ExpansionMode expansionMode)
protected void setInitialCapacity(int initialCapacity) throws MathIllegalArgumentException
public synchronized void setNumElements(int i) throws MathIllegalArgumentException
private synchronized boolean shouldContract()
public synchronized int start()
public static void copy(ResizableDoubleArray source, ResizableDoubleArray dest) throws NullArgumentException
public synchronized ResizableDoubleArray copy()
public boolean equals(Object object)
public synchronized int hashCode()
int ADDITIVE_MODE=Optional[1]
int MULTIPLICATIVE_MODE=Optional[0]
long serialVersionUID=Optional[-3485529955529426875L]
int DEFAULT_INITIAL_CAPACITY=Optional[16]
double DEFAULT_EXPANSION_FACTOR=Optional[2.0]
double DEFAULT_CONTRACTION_DELTA=Optional[0.5]
double contractionCriterion=Optional[2.5]
double expansionFactor=Optional[2.0]
ExpansionMode expansionMode=Optional[ExpansionMode.MULTIPLICATIVE]
double[] internalArray
int numElements=Optional[0]
int startIndex=Optional[0]
