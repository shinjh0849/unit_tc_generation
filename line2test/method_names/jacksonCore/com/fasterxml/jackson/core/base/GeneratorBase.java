protected GeneratorBase(int features, ObjectCodec codec)
public Version version()
public JsonGenerator enable(Feature f)
public JsonGenerator disable(Feature f)
public final boolean isEnabled(Feature f)
public int getFeatureMask()
public JsonGenerator setFeatureMask(int mask)
public JsonGenerator useDefaultPrettyPrinter()
public JsonGenerator setCodec(ObjectCodec oc)
public final ObjectCodec getCodec()
public final JsonWriteContext getOutputContext()
public void writeFieldName(SerializableString name) throws IOException, JsonGenerationException
public void writeString(SerializableString text) throws IOException, JsonGenerationException
public void writeRawValue(String text) throws IOException, JsonGenerationException
public void writeRawValue(String text, int offset, int len) throws IOException, JsonGenerationException
public void writeRawValue(char[] text, int offset, int len) throws IOException, JsonGenerationException
public int writeBinary(Base64Variant b64variant, InputStream data, int dataLength) throws IOException, JsonGenerationException
public void writeObject(Object value) throws IOException, JsonProcessingException
public void writeTree(TreeNode rootNode) throws IOException, JsonProcessingException
public abstract void flush() throws IOException
public void close() throws IOException
public boolean isClosed()
public final void copyCurrentEvent(JsonParser jp) throws IOException, JsonProcessingException
public final void copyCurrentStructure(JsonParser jp) throws IOException, JsonProcessingException
protected abstract void _releaseBuffers()
protected abstract void _verifyValueWrite(String typeMsg) throws IOException, JsonGenerationException
protected void _reportError(String msg) throws JsonGenerationException
protected void _writeSimpleObject(Object value) throws IOException, JsonGenerationException
protected final void _throwInternal()
protected void _reportUnsupportedOperation()
