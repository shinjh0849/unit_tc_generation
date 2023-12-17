public BinaryEncoderAbstractTest(String name) { [EOL]     super(name); [EOL] } <line_num>: 28,30
protected abstract BinaryEncoder makeEncoder(); <line_num>: 32,32
public void testEncodeEmpty() throws Exception { [EOL]     BinaryEncoder encoder = makeEncoder(); [EOL]     encoder.encode(new byte[0]); [EOL] } <line_num>: 36,39
public void testEncodeNull() throws Exception { [EOL]     BinaryEncoder encoder = makeEncoder(); [EOL]     try { [EOL]         encoder.encode(null); [EOL]     } catch (EncoderException ee) { [EOL]     } [EOL] } <line_num>: 41,48
