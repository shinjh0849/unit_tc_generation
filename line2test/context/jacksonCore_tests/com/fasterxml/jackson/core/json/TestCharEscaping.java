public int[] getEscapeCodesForAscii()
public SerializableString getEscapeSequence(int ch)
public void testMissingEscaping() throws Exception
public void testSimpleEscaping() throws Exception
public void testInvalid() throws Exception
public void test8DigitSequence() throws Exception
public void testWriteLongCustomEscapes() throws Exception
CharacterEscapes ESC_627=Optional[new CharacterEscapes() {

    final int[] ascii = CharacterEscapes.standardAsciiEscapesForJSON();

    {
        ascii['<'] = CharacterEscapes.ESCAPE_STANDARD;
        ascii['>'] = CharacterEscapes.ESCAPE_STANDARD;
    }

    @Override
    public int[] getEscapeCodesForAscii() {
        return ascii;
    }

    @Override
    public SerializableString getEscapeSequence(int ch) {
        throw new UnsupportedOperationException("Not implemented for test");
    }
}]
