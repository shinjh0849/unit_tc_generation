public DefaultPrettyPrinter()
public DefaultPrettyPrinter(String rootSeparator)
public DefaultPrettyPrinter(SerializableString rootSeparator)
public DefaultPrettyPrinter(DefaultPrettyPrinter base)
public DefaultPrettyPrinter(DefaultPrettyPrinter base, SerializableString rootSeparator)
public Lf2SpacesIndenter()
public Lf2SpacesIndenter(String lf)
 void writeIndentation(JsonGenerator jg, int level) throws IOException, JsonGenerationException
 boolean isInline()
public DefaultPrettyPrinter withRootSeparator(SerializableString rootSeparator)
public void indentArraysWith(Indenter i)
public void indentObjectsWith(Indenter i)
public void spacesInObjectEntries(boolean b)
public DefaultPrettyPrinter withArrayIndenter(Indenter i)
public DefaultPrettyPrinter withObjectIndenter(Indenter i)
public DefaultPrettyPrinter withSpacesInObjectEntries()
public DefaultPrettyPrinter withoutSpacesInObjectEntries()
protected DefaultPrettyPrinter _withSpaces(boolean state)
public DefaultPrettyPrinter createInstance()
public void writeRootValueSeparator(JsonGenerator jg) throws IOException, JsonGenerationException
public void writeStartObject(JsonGenerator jg) throws IOException, JsonGenerationException
public void beforeObjectEntries(JsonGenerator jg) throws IOException, JsonGenerationException
public void writeObjectFieldValueSeparator(JsonGenerator jg) throws IOException, JsonGenerationException
public void writeObjectEntrySeparator(JsonGenerator jg) throws IOException, JsonGenerationException
public void writeEndObject(JsonGenerator jg, int nrOfEntries) throws IOException, JsonGenerationException
public void writeStartArray(JsonGenerator jg) throws IOException, JsonGenerationException
public void beforeArrayValues(JsonGenerator jg) throws IOException, JsonGenerationException
public void writeArrayValueSeparator(JsonGenerator jg) throws IOException, JsonGenerationException
public void writeEndArray(JsonGenerator jg, int nrOfValues) throws IOException, JsonGenerationException
public void writeIndentation(JsonGenerator jg, int level) throws IOException, JsonGenerationException
public boolean isInline()
public void writeIndentation(JsonGenerator jg, int level) throws IOException, JsonGenerationException
public boolean isInline()
public Lf2SpacesIndenter withLinefeed(String lf)
public boolean isInline()
public void writeIndentation(JsonGenerator jg, int level) throws IOException, JsonGenerationException
long serialVersionUID=Optional[-5512586643324525213L]
SerializedString DEFAULT_ROOT_VALUE_SEPARATOR=Optional[new SerializedString(" ")]
Indenter _arrayIndenter=Optional[FixedSpaceIndenter.instance]
Indenter _objectIndenter=Optional[Lf2SpacesIndenter.instance]
SerializableString _rootSeparator
boolean _spacesInObjectEntries=Optional[true]
int _nesting=Optional[0]
