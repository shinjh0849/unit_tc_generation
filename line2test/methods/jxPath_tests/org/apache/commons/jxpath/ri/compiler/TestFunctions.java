public TestFunctions() { [EOL] } <line_num>: 40,41
public TestFunctions(int foo, String bar) { [EOL]     this.foo = foo; [EOL]     this.bar = bar; [EOL] } <line_num>: 43,46
public TestFunctions(ExpressionContext context, String bar) { [EOL]     this.foo = ((Number) context.getContextNodePointer().getValue()).intValue(); [EOL]     this.bar = bar; [EOL] } <line_num>: 48,52
public TestFunctions(int foo, Object object, boolean another) { [EOL]     this.foo = foo; [EOL]     bar = String.valueOf(object); [EOL] } <line_num>: 54,57
public int getFoo() { [EOL]     return foo; [EOL] } <line_num>: 59,61
public String getBar() { [EOL]     return bar; [EOL] } <line_num>: 63,65
public void doit() { [EOL] } <line_num>: 67,68
public TestFunctions setFooAndBar(int foo, String bar) { [EOL]     this.foo = foo; [EOL]     this.bar = bar; [EOL]     return this; [EOL] } <line_num>: 70,74
public static TestFunctions build(int foo, String bar) { [EOL]     return new TestFunctions(foo, bar); [EOL] } <line_num>: 76,78
public String toString() { [EOL]     return "foo=" + foo + "; bar=" + bar; [EOL] } <line_num>: 80,82
public static String path(ExpressionContext context) { [EOL]     return context.getContextNodePointer().asPath(); [EOL] } <line_num>: 84,86
public String instancePath(ExpressionContext context) { [EOL]     return context.getContextNodePointer().asPath(); [EOL] } <line_num>: 88,90
public String pathWithSuffix(ExpressionContext context, String suffix) { [EOL]     return context.getContextNodePointer().asPath() + suffix; [EOL] } <line_num>: 92,94
public String className(ExpressionContext context, ExpressionContext child) { [EOL]     return context.getContextNodePointer().asPath(); [EOL] } <line_num>: 96,101
public static boolean isMap(ExpressionContext context) { [EOL]     Pointer ptr = context.getContextNodePointer(); [EOL]     return ptr == null ? false : (ptr.getValue() instanceof Map); [EOL] } <line_num>: 106,109
public static int count(ExpressionContext context, Collection col) { [EOL]     for (Iterator iter = col.iterator(); iter.hasNext(); ) { [EOL]         Object element = iter.next(); [EOL]         if (!(element instanceof String)) { [EOL]             throw new RuntimeException("Invalid argument"); [EOL]         } [EOL]     } [EOL]     ; [EOL]     return col.size(); [EOL] } <line_num>: 115,123
public static int countPointers(NodeSet nodeSet) { [EOL]     return nodeSet.getPointers().size(); [EOL] } <line_num>: 125,127
public static String string(String string) { [EOL]     return string; [EOL] } <line_num>: 129,131
public static Collection collection() { [EOL]     ArrayList list = new ArrayList(); [EOL]     list.add(new NestedTestBean("foo")); [EOL]     list.add(new NestedTestBean("bar")); [EOL]     return list; [EOL] } <line_num>: 133,138
public static NodeSet nodeSet(ExpressionContext context) { [EOL]     JXPathContext jxpathCtx = context.getJXPathContext(); [EOL]     BasicNodeSet set = new BasicNodeSet(); [EOL]     set.add(jxpathCtx.getPointer("/beans[1]")); [EOL]     set.add(jxpathCtx.getPointer("/beans[2]")); [EOL]     return set; [EOL] } <line_num>: 140,147
public static Collection items(Collection arg) { [EOL]     return arg; [EOL] } <line_num>: 149,151
