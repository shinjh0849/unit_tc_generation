public SimpleCharStream(java.io.Reader dstream, int startline, int startcolumn, int buffersize)
public SimpleCharStream(java.io.Reader dstream, int startline, int startcolumn)
public SimpleCharStream(java.io.Reader dstream)
public SimpleCharStream(java.io.InputStream dstream, int startline, int startcolumn, int buffersize)
public SimpleCharStream(java.io.InputStream dstream, int startline, int startcolumn)
public SimpleCharStream(java.io.InputStream dstream)
protected void ExpandBuff(boolean wrapAround)
protected void FillBuff() throws java.io.IOException
public char BeginToken() throws java.io.IOException
protected void UpdateLineColumn(char c)
public char readChar() throws java.io.IOException
public int getColumn()
public int getLine()
public int getEndColumn()
public int getEndLine()
public int getBeginColumn()
public int getBeginLine()
public void backup(int amount)
public void ReInit(java.io.Reader dstream, int startline, int startcolumn, int buffersize)
public void ReInit(java.io.Reader dstream, int startline, int startcolumn)
public void ReInit(java.io.Reader dstream)
public void ReInit(java.io.InputStream dstream, int startline, int startcolumn, int buffersize)
public void ReInit(java.io.InputStream dstream)
public void ReInit(java.io.InputStream dstream, int startline, int startcolumn)
public String GetImage()
public char[] GetSuffix(int len)
public void Done()
public void adjustBeginLineColumn(int newLine, int newCol)
boolean staticFlag=Optional[false]
int bufsize
int available
int tokenBegin
int bufpos=Optional[-1]
int[] bufline
int[] bufcolumn
int column=Optional[0]
int line=Optional[1]
boolean prevCharIsCR=Optional[false]
boolean prevCharIsLF=Optional[false]
java.io.Reader inputStream
char[] buffer
int maxNextCharInd=Optional[0]
int inBuf=Optional[0]
