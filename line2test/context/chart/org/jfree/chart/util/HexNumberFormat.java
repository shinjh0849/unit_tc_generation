public HexNumberFormat()
public HexNumberFormat(int digits)
public final int getNumberOfDigits()
public void setNumberOfDigits(int digits)
public StringBuffer format(double number, StringBuffer toAppendTo, FieldPosition pos)
public StringBuffer format(long number, StringBuffer toAppendTo, FieldPosition pos)
public Number parse(String source, ParsePosition parsePosition)
int BYTE=Optional[2]
int WORD=Optional[4]
int DWORD=Optional[8]
int QWORD=Optional[16]
int m_numDigits=Optional[DWORD]
