private Feature(boolean defaultState) { [EOL]     _mask = (1 << ordinal()); [EOL]     _defaultState = defaultState; [EOL] } <line_num>: 154,157
protected JsonGenerator() { [EOL] } <line_num>: 182,182
public static int collectDefaults() { [EOL]     int flags = 0; [EOL]     for (Feature f : values()) { [EOL]         if (f.enabledByDefault()) { [EOL]             flags |= f.getMask(); [EOL]         } [EOL]     } [EOL]     return flags; [EOL] } <line_num>: 143,152
public boolean enabledByDefault() { [EOL]     return _defaultState; [EOL] } <line_num>: 159,159
public int getMask() { [EOL]     return _mask; [EOL] } <line_num>: 160,160
public abstract JsonGenerator setCodec(ObjectCodec oc); <line_num>: 191,191
public abstract ObjectCodec getCodec(); <line_num>: 198,198
@Override [EOL] public abstract Version version(); <line_num>: 203,204
public Object getOutputTarget() { [EOL]     return null; [EOL] } <line_num>: 221,223
public abstract JsonGenerator enable(Feature f); <line_num>: 237,237
public abstract JsonGenerator disable(Feature f); <line_num>: 245,245
public final JsonGenerator configure(Feature f, boolean state) { [EOL]     if (state) { [EOL]         enable(f); [EOL]     } else { [EOL]         disable(f); [EOL]     } [EOL]     return this; [EOL] } <line_num>: 253,261
public abstract boolean isEnabled(Feature f); <line_num>: 267,267
public abstract int getFeatureMask(); <line_num>: 277,277
public abstract JsonGenerator setFeatureMask(int mask); <line_num>: 286,286
public void setSchema(FormatSchema schema) { [EOL]     throw new UnsupportedOperationException("Generator of type " + getClass().getName() + " does not support schema of type '" + schema.getSchemaType() + "'"); [EOL] } <line_num>: 309,313
public FormatSchema getSchema() { [EOL]     return null; [EOL] } <line_num>: 321,323
public JsonGenerator setPrettyPrinter(PrettyPrinter pp) { [EOL]     _cfgPrettyPrinter = pp; [EOL]     return this; [EOL] } <line_num>: 342,345
public PrettyPrinter getPrettyPrinter() { [EOL]     return _cfgPrettyPrinter; [EOL] } <line_num>: 353,355
public abstract JsonGenerator useDefaultPrettyPrinter(); <line_num>: 364,364
public JsonGenerator setHighestNonEscapedChar(int charCode) { [EOL]     return this; [EOL] } <line_num>: 387,389
public int getHighestEscapedChar() { [EOL]     return 0; [EOL] } <line_num>: 403,405
public CharacterEscapes getCharacterEscapes() { [EOL]     return null; [EOL] } <line_num>: 411,413
public JsonGenerator setCharacterEscapes(CharacterEscapes esc) { [EOL]     return this; [EOL] } <line_num>: 419,421
public JsonGenerator setRootValueSeparator(SerializableString sep) { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 432,434
public boolean canUseSchema(FormatSchema schema) { [EOL]     return false; [EOL] } <line_num>: 450,452
public boolean canWriteObjectId() { [EOL]     return false; [EOL] } <line_num>: 468,470
public boolean canWriteTypeId() { [EOL]     return false; [EOL] } <line_num>: 486,488
public boolean canOmitFields() { [EOL]     return true; [EOL] } <line_num>: 498,500
public abstract void writeStartArray() throws IOException, JsonGenerationException; <line_num>: 517,518
public abstract void writeEndArray() throws IOException, JsonGenerationException; <line_num>: 528,529
public abstract void writeStartObject() throws IOException, JsonGenerationException; <line_num>: 540,541
public abstract void writeEndObject() throws IOException, JsonGenerationException; <line_num>: 553,554
public abstract void writeFieldName(String name) throws IOException, JsonGenerationException; <line_num>: 565,566
public abstract void writeFieldName(SerializableString name) throws IOException, JsonGenerationException; <line_num>: 579,580
public abstract void writeString(String text) throws IOException, JsonGenerationException; <line_num>: 595,596
public abstract void writeString(char[] text, int offset, int len) throws IOException, JsonGenerationException; <line_num>: 605,606
public abstract void writeString(SerializableString text) throws IOException, JsonGenerationException; <line_num>: 618,619
public abstract void writeRawUTF8String(byte[] text, int offset, int length) throws IOException, JsonGenerationException; <line_num>: 635,636
public abstract void writeUTF8String(byte[] text, int offset, int length) throws IOException, JsonGenerationException; <line_num>: 656,657
public abstract void writeRaw(String text) throws IOException, JsonGenerationException; <line_num>: 677,678
public abstract void writeRaw(String text, int offset, int len) throws IOException, JsonGenerationException; <line_num>: 692,693
public abstract void writeRaw(char[] text, int offset, int len) throws IOException, JsonGenerationException; <line_num>: 707,708
public abstract void writeRaw(char c) throws IOException, JsonGenerationException; <line_num>: 722,723
public void writeRaw(SerializableString raw) throws IOException, JsonGenerationException { [EOL]     writeRaw(raw.getValue()); [EOL] } <line_num>: 744,747
public abstract void writeRawValue(String text) throws IOException, JsonGenerationException; <line_num>: 757,758
public abstract void writeRawValue(String text, int offset, int len) throws IOException, JsonGenerationException; <line_num>: 760,761
public abstract void writeRawValue(char[] text, int offset, int len) throws IOException, JsonGenerationException; <line_num>: 763,764
public abstract void writeBinary(Base64Variant b64variant, byte[] data, int offset, int len) throws IOException, JsonGenerationException; <line_num>: 787,789
public void writeBinary(byte[] data, int offset, int len) throws IOException, JsonGenerationException { [EOL]     writeBinary(Base64Variants.getDefaultVariant(), data, offset, len); [EOL] } <line_num>: 796,800
public void writeBinary(byte[] data) throws IOException, JsonGenerationException { [EOL]     writeBinary(Base64Variants.getDefaultVariant(), data, 0, data.length); [EOL] } <line_num>: 808,812
public int writeBinary(InputStream data, int dataLength) throws IOException, JsonGenerationException { [EOL]     return writeBinary(Base64Variants.getDefaultVariant(), data, dataLength); [EOL] } <line_num>: 827,830
public abstract int writeBinary(Base64Variant b64variant, InputStream data, int dataLength) throws IOException, JsonGenerationException; <line_num>: 853,855
public void writeNumber(short v) throws IOException, JsonGenerationException { [EOL]     writeNumber((int) v); [EOL] } <line_num>: 872,874
public abstract void writeNumber(int v) throws IOException, JsonGenerationException; <line_num>: 883,884
public abstract void writeNumber(long v) throws IOException, JsonGenerationException; <line_num>: 893,894
public abstract void writeNumber(BigInteger v) throws IOException, JsonGenerationException; <line_num>: 903,904
public abstract void writeNumber(double d) throws IOException, JsonGenerationException; <line_num>: 913,914
public abstract void writeNumber(float f) throws IOException, JsonGenerationException; <line_num>: 923,924
public abstract void writeNumber(BigDecimal dec) throws IOException, JsonGenerationException; <line_num>: 933,934
public abstract void writeNumber(String encodedValue) throws IOException, JsonGenerationException, UnsupportedOperationException; <line_num>: 952,954
public abstract void writeBoolean(boolean state) throws IOException, JsonGenerationException; <line_num>: 964,965
public abstract void writeNull() throws IOException, JsonGenerationException; <line_num>: 974,975
public void writeObjectId(Object id) throws IOException, JsonGenerationException { [EOL]     throw new JsonGenerationException("No native support for writing Object Ids"); [EOL] } <line_num>: 994,998
public void writeObjectRef(Object id) throws IOException, JsonGenerationException { [EOL]     throw new JsonGenerationException("No native support for writing Object Ids"); [EOL] } <line_num>: 1009,1012
public void writeTypeId(Object id) throws IOException, JsonGenerationException { [EOL]     throw new JsonGenerationException("No native support for writing Type Ids"); [EOL] } <line_num>: 1025,1028
public abstract void writeObject(Object pojo) throws IOException, JsonProcessingException; <line_num>: 1047,1048
public abstract void writeTree(TreeNode rootNode) throws IOException, JsonProcessingException; <line_num>: 1058,1059
public void writeStringField(String fieldName, String value) throws IOException, JsonGenerationException { [EOL]     writeFieldName(fieldName); [EOL]     writeString(value); [EOL] } <line_num>: 1077,1082
public final void writeBooleanField(String fieldName, boolean value) throws IOException, JsonGenerationException { [EOL]     writeFieldName(fieldName); [EOL]     writeBoolean(value); [EOL] } <line_num>: 1092,1097
public final void writeNullField(String fieldName) throws IOException, JsonGenerationException { [EOL]     writeFieldName(fieldName); [EOL]     writeNull(); [EOL] } <line_num>: 1107,1112
public final void writeNumberField(String fieldName, int value) throws IOException, JsonGenerationException { [EOL]     writeFieldName(fieldName); [EOL]     writeNumber(value); [EOL] } <line_num>: 1122,1127
public final void writeNumberField(String fieldName, long value) throws IOException, JsonGenerationException { [EOL]     writeFieldName(fieldName); [EOL]     writeNumber(value); [EOL] } <line_num>: 1137,1142
public final void writeNumberField(String fieldName, double value) throws IOException, JsonGenerationException { [EOL]     writeFieldName(fieldName); [EOL]     writeNumber(value); [EOL] } <line_num>: 1152,1157
public final void writeNumberField(String fieldName, float value) throws IOException, JsonGenerationException { [EOL]     writeFieldName(fieldName); [EOL]     writeNumber(value); [EOL] } <line_num>: 1167,1172
public final void writeNumberField(String fieldName, BigDecimal value) throws IOException, JsonGenerationException { [EOL]     writeFieldName(fieldName); [EOL]     writeNumber(value); [EOL] } <line_num>: 1183,1188
public final void writeBinaryField(String fieldName, byte[] data) throws IOException, JsonGenerationException { [EOL]     writeFieldName(fieldName); [EOL]     writeBinary(data); [EOL] } <line_num>: 1199,1204
public final void writeArrayFieldStart(String fieldName) throws IOException, JsonGenerationException { [EOL]     writeFieldName(fieldName); [EOL]     writeStartArray(); [EOL] } <line_num>: 1219,1224
public final void writeObjectFieldStart(String fieldName) throws IOException, JsonGenerationException { [EOL]     writeFieldName(fieldName); [EOL]     writeStartObject(); [EOL] } <line_num>: 1239,1244
public final void writeObjectField(String fieldName, Object pojo) throws IOException, JsonProcessingException { [EOL]     writeFieldName(fieldName); [EOL]     writeObject(pojo); [EOL] } <line_num>: 1255,1260
public void writeOmittedField(String fieldName) throws IOException, JsonGenerationException { [EOL] } <line_num>: 1271,1275
public abstract void copyCurrentEvent(JsonParser jp) throws IOException, JsonProcessingException; <line_num>: 1293,1294
public abstract void copyCurrentStructure(JsonParser jp) throws IOException, JsonProcessingException; <line_num>: 1326,1327
public abstract JsonStreamContext getOutputContext(); <line_num>: 1339,1339
@Override [EOL] public abstract void flush() throws IOException; <line_num>: 1352,1353
public abstract boolean isClosed(); <line_num>: 1359,1359
@Override [EOL] public abstract void close() throws IOException; <line_num>: 1379,1380
