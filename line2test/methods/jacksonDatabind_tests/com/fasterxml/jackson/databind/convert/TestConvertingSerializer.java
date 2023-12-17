public ConvertingBean(int v1, int v2) { [EOL]     x = v1; [EOL]     y = v2; [EOL] } <line_num>: 16,19
public Point(int v1, int v2) { [EOL]     x = v1; [EOL]     y = v2; [EOL] } <line_num>: 26,29
public ConvertingBeanContainer(ConvertingBean... beans) { [EOL]     values = Arrays.asList(beans); [EOL] } <line_num>: 36,38
public PointWrapper(int x, int y) { [EOL]     value = new Point(x, y); [EOL] } <line_num>: 60,62
public PointListWrapperArray(int x, int y) { [EOL]     values = new Point[] { new Point(x, y), new Point(y, x) }; [EOL] } <line_num>: 69,71
public PointListWrapperList(int x, int y) { [EOL]     values = Arrays.asList(new Point[] { new Point(x, y), new Point(y, x) }); [EOL] } <line_num>: 78,80
public PointListWrapperMap(String key, int x, int y) { [EOL]     values = new HashMap<String, Point>(); [EOL]     values.put(key, new Point(x, y)); [EOL] } <line_num>: 87,90
@Override [EOL] public int[] convert(ConvertingBean value) { [EOL]     return new int[] { value.x, value.y }; [EOL] } <line_num>: 43,46
@Override [EOL] public int[] convert(Point value) { [EOL]     return new int[] { value.x, value.y }; [EOL] } <line_num>: 51,53
public void testClassAnnotationSimple() throws Exception { [EOL]     String json = objectWriter().writeValueAsString(new ConvertingBean(1, 2)); [EOL]     assertEquals("[1,2]", json); [EOL] } <line_num>: 99,103
public void testClassAnnotationForLists() throws Exception { [EOL]     String json = objectWriter().writeValueAsString(new ConvertingBeanContainer(new ConvertingBean(1, 2), new ConvertingBean(3, 4))); [EOL]     assertEquals("{\"values\":[[1,2],[3,4]]}", json); [EOL] } <line_num>: 105,110
public void testPropertyAnnotationSimple() throws Exception { [EOL]     String json = objectWriter().writeValueAsString(new PointWrapper(3, 4)); [EOL]     assertEquals("{\"value\":[3,4]}", json); [EOL] } <line_num>: 112,116
public void testPropertyAnnotationForArrays() throws Exception { [EOL]     String json = objectWriter().writeValueAsString(new PointListWrapperArray(4, 5)); [EOL]     assertEquals("{\"values\":[[4,5],[5,4]]}", json); [EOL] } <line_num>: 118,121
public void testPropertyAnnotationForLists() throws Exception { [EOL]     String json = objectWriter().writeValueAsString(new PointListWrapperList(7, 8)); [EOL]     assertEquals("{\"values\":[[7,8],[8,7]]}", json); [EOL] } <line_num>: 123,126
public void testPropertyAnnotationForMaps() throws Exception { [EOL]     String json = objectWriter().writeValueAsString(new PointListWrapperMap("a", 1, 2)); [EOL]     assertEquals("{\"values\":{\"a\":[1,2]}}", json); [EOL] } <line_num>: 128,131
