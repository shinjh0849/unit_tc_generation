public QuarterDateFormat()
public QuarterDateFormat(TimeZone zone)
public QuarterDateFormat(TimeZone zone, String[] quarterSymbols)
public QuarterDateFormat(TimeZone zone, String[] quarterSymbols, boolean quarterFirst)
public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition)
public Date parse(String source, ParsePosition pos)
public boolean equals(Object obj)
long serialVersionUID=Optional[-6738465248529797176L]
String[] REGULAR_QUARTERS=Optional[new String[] { "1", "2", "3", "4" }]
String[] ROMAN_QUARTERS=Optional[new String[] { "I", "II", "III", "IV" }]
String[] GREEK_QUARTERS=Optional[new String[] { "\u0391", "\u0392", "\u0393", "\u0394" }]
String[] quarters=Optional[REGULAR_QUARTERS]
boolean quarterFirst
