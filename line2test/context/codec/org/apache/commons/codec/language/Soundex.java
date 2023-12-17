public Soundex()
public Soundex(char[] mapping)
public int difference(String s1, String s2) throws EncoderException
public Object encode(Object pObject) throws EncoderException
public String encode(String pString)
private char getMappingCode(String str, int index)
public int getMaxLength()
private char[] getSoundexMapping()
private char map(char ch)
public void setMaxLength(int maxLength)
private void setSoundexMapping(char[] soundexMapping)
public String soundex(String str)
String US_ENGLISH_MAPPING_STRING=Optional["01230120022455012623010202"]
char[] US_ENGLISH_MAPPING=Optional[US_ENGLISH_MAPPING_STRING.toCharArray()]
Soundex US_ENGLISH=Optional[new Soundex()]
int maxLength=Optional[4]
char[] soundexMapping
