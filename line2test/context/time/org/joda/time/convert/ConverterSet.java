 ConverterSet(Converter[] converters)
 Entry(Class<?> type, Converter converter)
 Converter select(Class<?> type) throws IllegalStateException
 int size()
 void copyInto(Converter[] converters)
 ConverterSet add(Converter converter, Converter[] removed)
 ConverterSet remove(Converter converter, Converter[] removed)
 ConverterSet remove(final int index, Converter[] removed)
private static Converter selectSlow(ConverterSet set, Class<?> type)
Converter[] iConverters
Entry[] iSelectEntries
