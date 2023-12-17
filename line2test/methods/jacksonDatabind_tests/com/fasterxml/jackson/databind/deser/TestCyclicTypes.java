public Bean() { [EOL] } <line_num>: 25,25
public void setNext(Bean b) { [EOL]     _next = b; [EOL] } <line_num>: 27,27
public void setName(String n) { [EOL]     _name = n; [EOL] } <line_num>: 28,28
public void setA(LinkA a) { [EOL]     this.a = a; [EOL] } <line_num>: 39,39
public LinkA getA() { [EOL]     return a; [EOL] } <line_num>: 40,40
public void testLinked() throws Exception { [EOL]     Bean first = new ObjectMapper().readValue("{\"name\":\"first\", \"next\": { " + " \"name\":\"last\", \"next\" : null }}", Bean.class); [EOL]     assertNotNull(first); [EOL]     assertEquals("first", first._name); [EOL]     Bean last = first._next; [EOL]     assertNotNull(last); [EOL]     assertEquals("last", last._name); [EOL]     assertNull(last._next); [EOL] } <line_num>: 56,69
public void testLinkedGeneric() throws Exception { [EOL]     StringLink link = new ObjectMapper().readValue("{\"next\":null}", StringLink.class); [EOL]     assertNotNull(link); [EOL]     assertNull(link.next); [EOL] } <line_num>: 71,77
public void testCycleWith2Classes() throws Exception { [EOL]     LinkA a = new ObjectMapper().readValue("{\"next\":{\"a\":null}}", LinkA.class); [EOL]     assertNotNull(a.next); [EOL]     LinkB b = a.next; [EOL]     assertNull(b.a); [EOL] } <line_num>: 79,85
