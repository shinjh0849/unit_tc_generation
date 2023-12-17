public BaseClass(int x, int y) { [EOL] } <line_num>: 26,26
public SubClass() { [EOL]     this(1); [EOL] } <line_num>: 33,33
public SubClass(int x) { [EOL]     super(x, 2); [EOL] } <line_num>: 34,34
@JsonProperty [EOL] public int x() { [EOL]     return 3; [EOL] } <line_num>: 28,28
public int y() { [EOL]     return 3; [EOL] } <line_num>: 36,36
public abstract void setX(T value); <line_num>: 41,41
@Override [EOL] public void setX(Integer value) { [EOL] } <line_num>: 47,48
public void testFieldIntrospection() { [EOL]     AnnotatedClass ac = AnnotatedClass.construct(FieldBean.class, new JacksonAnnotationIntrospector(), null); [EOL]     assertEquals(2, ac.getFieldCount()); [EOL]     for (AnnotatedField f : ac.fields()) { [EOL]         String fname = f.getName(); [EOL]         if (!"bar".equals(fname) && !"props".equals(fname)) { [EOL]             fail("Unexpected field name '" + fname + "'"); [EOL]         } [EOL]     } [EOL] } <line_num>: 74,86
