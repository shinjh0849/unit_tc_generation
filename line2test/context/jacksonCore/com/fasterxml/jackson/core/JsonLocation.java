public JsonLocation(Object srcRef, long totalChars, int lineNr, int colNr)
public JsonLocation(Object sourceRef, long totalBytes, long totalChars, int lineNr, int columnNr)
public Object getSourceRef()
public int getLineNr()
public int getColumnNr()
public long getCharOffset()
public long getByteOffset()
public String toString()
public int hashCode()
public boolean equals(Object other)
long serialVersionUID=Optional[1L]
JsonLocation NA=Optional[new JsonLocation("N/A", -1L, -1L, -1, -1)]
long _totalBytes
long _totalChars
int _lineNr
int _columnNr
Object _sourceRef
