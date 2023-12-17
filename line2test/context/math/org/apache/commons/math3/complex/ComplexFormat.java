public ComplexFormat()
public ComplexFormat(NumberFormat format) throws NullArgumentException
public ComplexFormat(NumberFormat realFormat, NumberFormat imaginaryFormat) throws NullArgumentException
public ComplexFormat(String imaginaryCharacter) throws NullArgumentException, NoDataException
public ComplexFormat(String imaginaryCharacter, NumberFormat format) throws NullArgumentException, NoDataException
public ComplexFormat(String imaginaryCharacter, NumberFormat realFormat, NumberFormat imaginaryFormat) throws NullArgumentException, NoDataException
public static Locale[] getAvailableLocales()
public String format(Complex c)
public String format(Double c)
public StringBuffer format(Complex complex, StringBuffer toAppendTo, FieldPosition pos)
private StringBuffer formatImaginary(double absIm, StringBuffer toAppendTo, FieldPosition pos)
public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) throws MathIllegalArgumentException
public String getImaginaryCharacter()
public NumberFormat getImaginaryFormat()
public static ComplexFormat getInstance()
public static ComplexFormat getInstance(Locale locale)
public static ComplexFormat getInstance(String imaginaryCharacter, Locale locale) throws NullArgumentException, NoDataException
public NumberFormat getRealFormat()
public Complex parse(String source) throws MathParseException
public Complex parse(String source, ParsePosition pos)
String DEFAULT_IMAGINARY_CHARACTER=Optional["i"]
String imaginaryCharacter
NumberFormat imaginaryFormat
NumberFormat realFormat
