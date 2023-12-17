public PaintItem(double value, Paint paint)
public LookupPaintScale()
public LookupPaintScale(double lowerBound, double upperBound, Paint defaultPaint)
public int compareTo(Object obj)
public boolean equals(Object obj)
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
public Paint getDefaultPaint()
public double getLowerBound()
public double getUpperBound()
public void add(double value, Paint paint)
public Paint getPaint(double value)
public boolean equals(Object obj)
public Object clone() throws CloneNotSupportedException
private void writeObject(ObjectOutputStream stream) throws IOException
private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
long serialVersionUID=Optional[-5239384246251042006L]
double lowerBound
double upperBound
Paint defaultPaint
List lookupTable
