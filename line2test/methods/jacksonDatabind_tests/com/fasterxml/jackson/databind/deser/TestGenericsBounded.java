public Range() { [EOL] } <line_num>: 19,19
public Range(E start, E end) { [EOL]     this.start = start; [EOL]     this.end = end; [EOL] } <line_num>: 20,23
public DoubleRange() { [EOL] } <line_num>: 36,36
public DoubleRange(Double s, Double e) { [EOL]     super(s, e); [EOL] } <line_num>: 37,37
public E getEnd() { [EOL]     return end; [EOL] } <line_num>: 25,25
public void setEnd(E e) { [EOL]     end = e; [EOL] } <line_num>: 26,26
public E getStart() { [EOL]     return start; [EOL] } <line_num>: 28,28
public void setStart(E s) { [EOL]     start = s; [EOL] } <line_num>: 29,31
public void testLowerBound() throws Exception { [EOL]     IntBeanWrapper<?> result = new ObjectMapper().readValue("{\"wrapped\":{\"x\":3}}", IntBeanWrapper.class); [EOL]     assertNotNull(result); [EOL]     assertEquals(IntBean.class, result.wrapped.getClass()); [EOL]     assertEquals(3, result.wrapped.x); [EOL] } <line_num>: 74,81
public void testBounded() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     BoundedWrapper<IntBean> result = mapper.readValue("{\"values\":[ {\"x\":3} ] } ", new TypeReference<BoundedWrapper<IntBean>>() { [EOL]     }); [EOL]     List<?> list = result.values; [EOL]     assertEquals(1, list.size()); [EOL]     Object ob = list.get(0); [EOL]     assertEquals(IntBean.class, ob.getClass()); [EOL]     assertEquals(3, result.values.get(0).x); [EOL] } <line_num>: 84,94
public void testGenericsComplex() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     DoubleRange in = new DoubleRange(-0.5, 0.5); [EOL]     String json = m.writeValueAsString(in); [EOL]     DoubleRange out = m.readValue(json, DoubleRange.class); [EOL]     assertNotNull(out); [EOL]     assertEquals(-0.5, out.start); [EOL]     assertEquals(0.5, out.end); [EOL] } <line_num>: 96,105
public void testIssue778() throws Exception { [EOL]     final ObjectMapper mapper = new ObjectMapper(); [EOL]     String json = "{\"rows\":[{\"d\":{}}]}"; [EOL]     final TypeReference<?> type = new TypeReference<ResultSetWithDoc<MyDoc>>() { [EOL]     }; [EOL]     ResultSetWithDoc<MyDoc> rs = mapper.readValue(json, type); [EOL]     Document d = rs.rows.iterator().next().d; [EOL]     assertEquals(MyDoc.class, d.getClass()); [EOL] } <line_num>: 107,119
