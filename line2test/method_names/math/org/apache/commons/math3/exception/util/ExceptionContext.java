public ExceptionContext(final Throwable throwable)
public Throwable getThrowable()
public void addMessage(Localizable pattern, Object... arguments)
public void setValue(String key, Object value)
public Object getValue(String key)
public Set<String> getKeys()
public String getMessage()
public String getLocalizedMessage()
public String getMessage(final Locale locale)
public String getMessage(final Locale locale, final String separator)
private String buildMessage(Locale locale, String separator)
private void writeObject(ObjectOutputStream out) throws IOException
private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
private void serializeMessages(ObjectOutputStream out) throws IOException
private void deSerializeMessages(ObjectInputStream in) throws IOException, ClassNotFoundException
private void serializeContext(ObjectOutputStream out) throws IOException
private void deSerializeContext(ObjectInputStream in) throws IOException, ClassNotFoundException
private String nonSerializableReplacement(Object obj)
