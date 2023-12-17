public JsonGeneratorDelegate(JsonGenerator d) { [EOL]     delegate = d; [EOL] } <line_num>: 24,26
@Override [EOL] public ObjectCodec getCodec() { [EOL]     return delegate.getCodec(); [EOL] } <line_num>: 28,31
@Override [EOL] public JsonGenerator setCodec(ObjectCodec oc) { [EOL]     delegate.setCodec(oc); [EOL]     return this; [EOL] } <line_num>: 33,37
@Override [EOL] public void setSchema(FormatSchema schema) { [EOL]     delegate.setSchema(schema); [EOL] } <line_num>: 39,42
@Override [EOL] public FormatSchema getSchema() { [EOL]     return delegate.getSchema(); [EOL] } <line_num>: 44,47
@Override [EOL] public Version version() { [EOL]     return delegate.version(); [EOL] } <line_num>: 49,52
@Override [EOL] public Object getOutputTarget() { [EOL]     return delegate.getOutputTarget(); [EOL] } <line_num>: 54,57
@Override [EOL] public boolean canUseSchema(FormatSchema schema) { [EOL]     return delegate.canUseSchema(schema); [EOL] } <line_num>: 65,68
@Override [EOL] public boolean canWriteTypeId() { [EOL]     return delegate.canWriteTypeId(); [EOL] } <line_num>: 70,73
@Override [EOL] public boolean canWriteObjectId() { [EOL]     return delegate.canWriteObjectId(); [EOL] } <line_num>: 75,78
@Override [EOL] public boolean canOmitFields() { [EOL]     return delegate.canOmitFields(); [EOL] } <line_num>: 80,83
@Override [EOL] public JsonGenerator enable(Feature f) { [EOL]     delegate.enable(f); [EOL]     return this; [EOL] } <line_num>: 91,95
@Override [EOL] public JsonGenerator disable(Feature f) { [EOL]     delegate.disable(f); [EOL]     return this; [EOL] } <line_num>: 97,101
@Override [EOL] public boolean isEnabled(Feature f) { [EOL]     return delegate.isEnabled(f); [EOL] } <line_num>: 103,106
@Override [EOL] public int getFeatureMask() { [EOL]     return delegate.getFeatureMask(); [EOL] } <line_num>: 111,114
@Override [EOL] public JsonGenerator setFeatureMask(int mask) { [EOL]     delegate.setFeatureMask(mask); [EOL]     return this; [EOL] } <line_num>: 116,120
@Override [EOL] public JsonGenerator setPrettyPrinter(PrettyPrinter pp) { [EOL]     delegate.setPrettyPrinter(pp); [EOL]     return this; [EOL] } <line_num>: 128,132
@Override [EOL] public PrettyPrinter getPrettyPrinter() { [EOL]     return delegate.getPrettyPrinter(); [EOL] } <line_num>: 134,137
@Override [EOL] public JsonGenerator useDefaultPrettyPrinter() { [EOL]     delegate.useDefaultPrettyPrinter(); [EOL]     return this; [EOL] } <line_num>: 139,143
@Override [EOL] public JsonGenerator setHighestNonEscapedChar(int charCode) { [EOL]     delegate.setHighestNonEscapedChar(charCode); [EOL]     return this; [EOL] } <line_num>: 145,149
@Override [EOL] public int getHighestEscapedChar() { [EOL]     return delegate.getHighestEscapedChar(); [EOL] } <line_num>: 151,154
@Override [EOL] public CharacterEscapes getCharacterEscapes() { [EOL]     return delegate.getCharacterEscapes(); [EOL] } <line_num>: 156,159
@Override [EOL] public JsonGenerator setCharacterEscapes(CharacterEscapes esc) { [EOL]     delegate.setCharacterEscapes(esc); [EOL]     return this; [EOL] } <line_num>: 161,165
@Override [EOL] public JsonGenerator setRootValueSeparator(SerializableString sep) { [EOL]     delegate.setRootValueSeparator(sep); [EOL]     return this; [EOL] } <line_num>: 167,171
@Override [EOL] public void writeStartArray() throws IOException, JsonGenerationException { [EOL]     delegate.writeStartArray(); [EOL] } <line_num>: 179,182
@Override [EOL] public void writeEndArray() throws IOException, JsonGenerationException { [EOL]     delegate.writeEndArray(); [EOL] } <line_num>: 185,188
@Override [EOL] public void writeStartObject() throws IOException, JsonGenerationException { [EOL]     delegate.writeStartObject(); [EOL] } <line_num>: 190,193
@Override [EOL] public void writeEndObject() throws IOException, JsonGenerationException { [EOL]     delegate.writeEndObject(); [EOL] } <line_num>: 195,198
@Override [EOL] public void writeFieldName(String name) throws IOException, JsonGenerationException { [EOL]     delegate.writeFieldName(name); [EOL] } <line_num>: 200,205
@Override [EOL] public void writeFieldName(SerializableString name) throws IOException, JsonGenerationException { [EOL]     delegate.writeFieldName(name); [EOL] } <line_num>: 207,212
@Override [EOL] public void writeString(String text) throws IOException, JsonGenerationException { [EOL]     delegate.writeString(text); [EOL] } <line_num>: 220,223
@Override [EOL] public void writeString(char[] text, int offset, int len) throws IOException, JsonGenerationException { [EOL]     delegate.writeString(text, offset, len); [EOL] } <line_num>: 225,228
@Override [EOL] public void writeString(SerializableString text) throws IOException, JsonGenerationException { [EOL]     delegate.writeString(text); [EOL] } <line_num>: 230,233
@Override [EOL] public void writeRawUTF8String(byte[] text, int offset, int length) throws IOException, JsonGenerationException { [EOL]     delegate.writeRawUTF8String(text, offset, length); [EOL] } <line_num>: 235,240
@Override [EOL] public void writeUTF8String(byte[] text, int offset, int length) throws IOException, JsonGenerationException { [EOL]     delegate.writeUTF8String(text, offset, length); [EOL] } <line_num>: 242,247
@Override [EOL] public void writeRaw(String text) throws IOException, JsonGenerationException { [EOL]     delegate.writeRaw(text); [EOL] } <line_num>: 255,258
@Override [EOL] public void writeRaw(String text, int offset, int len) throws IOException, JsonGenerationException { [EOL]     delegate.writeRaw(text, offset, len); [EOL] } <line_num>: 260,263
@Override [EOL] public void writeRaw(SerializableString raw) throws IOException, JsonGenerationException { [EOL]     delegate.writeRaw(raw); [EOL] } <line_num>: 265,269
@Override [EOL] public void writeRaw(char[] text, int offset, int len) throws IOException, JsonGenerationException { [EOL]     delegate.writeRaw(text, offset, len); [EOL] } <line_num>: 271,274
@Override [EOL] public void writeRaw(char c) throws IOException, JsonGenerationException { [EOL]     delegate.writeRaw(c); [EOL] } <line_num>: 276,279
@Override [EOL] public void writeRawValue(String text) throws IOException, JsonGenerationException { [EOL]     delegate.writeRawValue(text); [EOL] } <line_num>: 281,284
@Override [EOL] public void writeRawValue(String text, int offset, int len) throws IOException, JsonGenerationException { [EOL]     delegate.writeRawValue(text, offset, len); [EOL] } <line_num>: 286,289
@Override [EOL] public void writeRawValue(char[] text, int offset, int len) throws IOException, JsonGenerationException { [EOL]     delegate.writeRawValue(text, offset, len); [EOL] } <line_num>: 291,294
@Override [EOL] public void writeBinary(Base64Variant b64variant, byte[] data, int offset, int len) throws IOException, JsonGenerationException { [EOL]     delegate.writeBinary(b64variant, data, offset, len); [EOL] } <line_num>: 296,301
@Override [EOL] public int writeBinary(Base64Variant b64variant, InputStream data, int dataLength) throws IOException, JsonGenerationException { [EOL]     return delegate.writeBinary(b64variant, data, dataLength); [EOL] } <line_num>: 303,307
@Override [EOL] public void writeNumber(short v) throws IOException, JsonGenerationException { [EOL]     delegate.writeNumber(v); [EOL] } <line_num>: 315,318
@Override [EOL] public void writeNumber(int v) throws IOException, JsonGenerationException { [EOL]     delegate.writeNumber(v); [EOL] } <line_num>: 320,323
@Override [EOL] public void writeNumber(long v) throws IOException, JsonGenerationException { [EOL]     delegate.writeNumber(v); [EOL] } <line_num>: 325,328
@Override [EOL] public void writeNumber(BigInteger v) throws IOException, JsonGenerationException { [EOL]     delegate.writeNumber(v); [EOL] } <line_num>: 330,334
@Override [EOL] public void writeNumber(double v) throws IOException, JsonGenerationException { [EOL]     delegate.writeNumber(v); [EOL] } <line_num>: 336,340
@Override [EOL] public void writeNumber(float v) throws IOException, JsonGenerationException { [EOL]     delegate.writeNumber(v); [EOL] } <line_num>: 342,346
@Override [EOL] public void writeNumber(BigDecimal v) throws IOException, JsonGenerationException { [EOL]     delegate.writeNumber(v); [EOL] } <line_num>: 348,352
@Override [EOL] public void writeNumber(String encodedValue) throws IOException, JsonGenerationException, UnsupportedOperationException { [EOL]     delegate.writeNumber(encodedValue); [EOL] } <line_num>: 354,357
@Override [EOL] public void writeBoolean(boolean state) throws IOException, JsonGenerationException { [EOL]     delegate.writeBoolean(state); [EOL] } <line_num>: 359,362
@Override [EOL] public void writeNull() throws IOException, JsonGenerationException { [EOL]     delegate.writeNull(); [EOL] } <line_num>: 364,367
@Override [EOL] public void writeOmittedField(String fieldName) throws IOException, JsonGenerationException { [EOL]     delegate.writeOmittedField(fieldName); [EOL] } <line_num>: 375,380
@Override [EOL] public void writeObjectId(Object id) throws IOException, JsonGenerationException { [EOL]     delegate.writeObjectId(id); [EOL] } <line_num>: 388,392
@Override [EOL] public void writeObjectRef(Object id) throws IOException, JsonGenerationException { [EOL]     delegate.writeObjectRef(id); [EOL] } <line_num>: 394,398
@Override [EOL] public void writeTypeId(Object id) throws IOException, JsonGenerationException { [EOL]     delegate.writeTypeId(id); [EOL] } <line_num>: 400,404
@Override [EOL] public void writeObject(Object pojo) throws IOException, JsonProcessingException { [EOL]     delegate.writeObject(pojo); [EOL] } <line_num>: 412,415
@Override [EOL] public void writeTree(TreeNode rootNode) throws IOException, JsonProcessingException { [EOL]     delegate.writeTree(rootNode); [EOL] } <line_num>: 417,420
@Override [EOL] public void copyCurrentEvent(JsonParser jp) throws IOException, JsonProcessingException { [EOL]     delegate.copyCurrentEvent(jp); [EOL] } <line_num>: 436,439
@Override [EOL] public void copyCurrentStructure(JsonParser jp) throws IOException, JsonProcessingException { [EOL]     delegate.copyCurrentStructure(jp); [EOL] } <line_num>: 441,444
@Override [EOL] public JsonStreamContext getOutputContext() { [EOL]     return delegate.getOutputContext(); [EOL] } <line_num>: 452,455
@Override [EOL] public void flush() throws IOException { [EOL]     delegate.flush(); [EOL] } <line_num>: 463,466
@Override [EOL] public void close() throws IOException { [EOL]     delegate.close(); [EOL] } <line_num>: 468,471
@Override [EOL] public boolean isClosed() { [EOL]     return delegate.isClosed(); [EOL] } <line_num>: 479,482
