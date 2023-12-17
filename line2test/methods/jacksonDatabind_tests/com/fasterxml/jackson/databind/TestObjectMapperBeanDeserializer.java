public CtorValueBean(String d) { [EOL]     _desc = d; [EOL] } <line_num>: 32,32
public CtorValueBean(int value) { [EOL]     _desc = String.valueOf(value); [EOL] } <line_num>: 33,33
public CtorValueBean(long value) { [EOL]     _desc = String.valueOf(value); [EOL] } <line_num>: 34,34
protected FactoryValueBean(String desc, int dummy) { [EOL]     _desc = desc; [EOL] } <line_num>: 61,61
public TestBean(int x, long y, String desc, URI uri, Collection<?> misc) { [EOL]     _x = x; [EOL]     _y = y; [EOL]     _desc = desc; [EOL]     _uri = uri; [EOL]     _misc = misc; [EOL] } <line_num>: 82,89
public TestBean() { [EOL] } <line_num>: 92,92
public BeanWithList() { [EOL] } <line_num>: 144,144
public BeanWithList(List<CtorValueBean> beans) { [EOL]     _beans = beans; [EOL] } <line_num>: 145,145
@Override [EOL] public void serialize(JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException { [EOL]     jgen.writeString(_desc); [EOL] } <line_num>: 36,41
@Override [EOL] public String toString() { [EOL]     return _desc; [EOL] } <line_num>: 43,43
@Override [EOL] public boolean equals(Object o) { [EOL]     if (!(o instanceof CtorValueBean)) [EOL]         return false; [EOL]     CtorValueBean other = (CtorValueBean) o; [EOL]     return _desc.equals(other._desc); [EOL] } <line_num>: 45,49
@Override [EOL] public void serializeWithType(JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonProcessingException { [EOL] } <line_num>: 50,54
public static FactoryValueBean valueOf(String v) { [EOL]     return new FactoryValueBean(v, 0); [EOL] } <line_num>: 63,63
public static FactoryValueBean valueOf(int v) { [EOL]     return new FactoryValueBean(String.valueOf(v), 0); [EOL] } <line_num>: 64,64
public static FactoryValueBean valueOf(long v) { [EOL]     return new FactoryValueBean(String.valueOf(v), 0); [EOL] } <line_num>: 65,65
@Override [EOL] public String toString() { [EOL]     return _desc; [EOL] } <line_num>: 67,67
public String getDesc() { [EOL]     return _desc; [EOL] } <line_num>: 94,94
public int getX() { [EOL]     return _x; [EOL] } <line_num>: 95,95
public long getY() { [EOL]     return _y; [EOL] } <line_num>: 96,96
public URI getURI() { [EOL]     return _uri; [EOL] } <line_num>: 97,97
public Collection<?> getMisc() { [EOL]     return _misc; [EOL] } <line_num>: 98,98
public void setDesc(String value) { [EOL]     _desc = value; [EOL] } <line_num>: 100,100
public void setX(int value) { [EOL]     _x = value; [EOL] } <line_num>: 101,101
public void setY(long value) { [EOL]     _y = value; [EOL] } <line_num>: 102,102
public void setURI(URI value) { [EOL]     _uri = value; [EOL] } <line_num>: 103,103
public void setMisc(Collection<?> value) { [EOL]     _misc = value; [EOL] } <line_num>: 104,104
@Override [EOL] public boolean equals(Object o) { [EOL]     if (o == null || o.getClass() != getClass()) [EOL]         return false; [EOL]     TestBean other = (TestBean) o; [EOL]     return (other._x == _x) && (other._y == _y) && (other._desc.equals(_desc)) && (other._uri.equals(_uri)) && (other._misc.equals(_misc)); [EOL] } <line_num>: 106,117
@Override [EOL] public String toString() { [EOL]     StringBuilder sb = new StringBuilder(); [EOL]     sb.append("[TestBean "); [EOL]     sb.append("x=").append(_x); [EOL]     sb.append(" y=").append(_y); [EOL]     sb.append(" desc=").append(_desc); [EOL]     sb.append(" uri=").append(_uri); [EOL]     sb.append(" misc=").append(_misc); [EOL]     sb.append("]"); [EOL]     return sb.toString(); [EOL] } <line_num>: 119,131
public List<CtorValueBean> getBeans() { [EOL]     return _beans; [EOL] } <line_num>: 147,147
public void setBeans(List<CtorValueBean> beans) { [EOL]     _beans = beans; [EOL] } <line_num>: 149,151
@Override [EOL] public int hashCode() { [EOL]     return (_beans == null) ? -1 : _beans.size(); [EOL] } <line_num>: 153,154
@Override [EOL] public boolean equals(Object o) { [EOL]     if (!(o instanceof BeanWithList)) [EOL]         return false; [EOL]     BeanWithList other = BeanWithList.class.cast(o); [EOL]     return _beans.equals(other._beans); [EOL] } <line_num>: 156,161
@Override [EOL] public String toString() { [EOL]     StringBuilder sb = new StringBuilder(); [EOL]     sb.append("[Bean, list "); [EOL]     if (_beans == null) { [EOL]         sb.append("NULL"); [EOL]     } else { [EOL]         sb.append('(').append(_beans.size()).append('/'); [EOL]         sb.append(_beans.getClass().getName()).append(") "); [EOL]         boolean type = false; [EOL]         for (CtorValueBean bean : _beans) { [EOL]             if (!type) { [EOL]                 sb.append("(").append(bean.getClass().getSimpleName()).append(")"); [EOL]                 type = true; [EOL]             } [EOL]             sb.append(bean); [EOL]             sb.append(' '); [EOL]         } [EOL]     } [EOL]     sb.append(']'); [EOL]     return sb.toString(); [EOL] } <line_num>: 163,184
public void testFromStringCtor() throws Exception { [EOL]     CtorValueBean result = MAPPER.readValue("\"abc\"", CtorValueBean.class); [EOL]     assertEquals("abc", result.toString()); [EOL] } <line_num>: 195,199
public void testFromIntCtor() throws Exception { [EOL]     CtorValueBean result = MAPPER.readValue("13", CtorValueBean.class); [EOL]     assertEquals("13", result.toString()); [EOL] } <line_num>: 201,205
public void testFromLongCtor() throws Exception { [EOL]     long value = 12345678901244L; [EOL]     CtorValueBean result = MAPPER.readValue("" + value, CtorValueBean.class); [EOL]     assertEquals("" + value, result.toString()); [EOL] } <line_num>: 207,213
public void testFromStringFactory() throws Exception { [EOL]     FactoryValueBean result = MAPPER.readValue("\"abc\"", FactoryValueBean.class); [EOL]     assertEquals("abc", result.toString()); [EOL] } <line_num>: 215,219
public void testFromIntFactory() throws Exception { [EOL]     FactoryValueBean result = MAPPER.readValue("13", FactoryValueBean.class); [EOL]     assertEquals("13", result.toString()); [EOL] } <line_num>: 221,225
public void testFromLongFactory() throws Exception { [EOL]     long value = 12345678901244L; [EOL]     FactoryValueBean result = MAPPER.readValue("" + value, FactoryValueBean.class); [EOL]     assertEquals("" + value, result.toString()); [EOL] } <line_num>: 227,233
public void testSimpleBean() throws Exception { [EOL]     ArrayList<Object> misc = new ArrayList<Object>(); [EOL]     misc.add("xyz"); [EOL]     misc.add(42); [EOL]     misc.add(null); [EOL]     misc.add(Boolean.TRUE); [EOL]     TestBean bean = new TestBean(13, -900L, "\"test\"", new URI("http://foobar.com"), misc); [EOL]     String json = MAPPER.writeValueAsString(bean); [EOL]     TestBean result = MAPPER.readValue(json, TestBean.class); [EOL]     assertEquals(bean, result); [EOL] } <line_num>: 241,255
public void testListBean() throws Exception { [EOL]     final int COUNT = 13; [EOL]     ArrayList<CtorValueBean> beans = new ArrayList<CtorValueBean>(); [EOL]     for (int i = 0; i < COUNT; ++i) { [EOL]         beans.add(new CtorValueBean(i)); [EOL]     } [EOL]     BeanWithList bean = new BeanWithList(beans); [EOL]     StringWriter sw = new StringWriter(); [EOL]     MAPPER.writeValue(sw, bean); [EOL]     BeanWithList result = MAPPER.readValue(sw.toString(), BeanWithList.class); [EOL]     assertEquals(bean, result); [EOL] } <line_num>: 257,271
public void testUnknownFields() throws Exception { [EOL]     try { [EOL]         TestBean bean = MAPPER.readValue("{ \"foobar\" : 3 }", TestBean.class); [EOL]         fail("Expected an exception, got bean: " + bean); [EOL]     } catch (JsonMappingException jse) { [EOL]         ; [EOL]     } [EOL] } <line_num>: 277,285
