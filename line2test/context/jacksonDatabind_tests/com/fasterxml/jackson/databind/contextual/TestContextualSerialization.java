public ContextualBean(String s)
public AnnotatedContextualBean(String s)
public ContextualBeanWrapper(String s)
public ContextualArrayBean(String... strings)
public ContextualArrayElementBean(String... strings)
public ContextualListBean(String... strings)
public BeanWithClassConfig(String v)
public AnnotatedContextualSerializer()
public AnnotatedContextualSerializer(String p)
public ContextualAndResolvable()
public ContextualAndResolvable(int resolved, int contextual)
public String getValue()
public void serialize(String value, JsonGenerator jgen, SerializerProvider provider) throws IOException
public JsonSerializer<?> createContextual(SerializerProvider prov, BeanProperty property) throws JsonMappingException
public void serialize(String value, JsonGenerator jgen, SerializerProvider provider) throws IOException
public JsonSerializer<?> createContextual(SerializerProvider prov, BeanProperty property) throws JsonMappingException
public void resolve(SerializerProvider provider)
public void testMethodAnnotations() throws Exception
public void testClassAnnotations() throws Exception
public void testWrappedBean() throws Exception
public void testMethodAnnotationInArray() throws Exception
public void testMethodAnnotationInList() throws Exception
public void testMethodAnnotationInMap() throws Exception
public void testContextualViaAnnotation() throws Exception
