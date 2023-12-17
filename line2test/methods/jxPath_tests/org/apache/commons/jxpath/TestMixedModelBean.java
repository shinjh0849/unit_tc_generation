public TestMixedModelBean() { [EOL]     string = "string"; [EOL]     bean = new TestBean(); [EOL]     map = new HashMap(); [EOL]     list = new ArrayList(); [EOL]     container = new DocumentContainer(getClass().getResource("Vendor.xml")); [EOL]     document = (Document) container.getValue(); [EOL]     element = document.getDocumentElement(); [EOL]     map.put("string", string); [EOL]     map.put("bean", bean); [EOL]     map.put("map", map); [EOL]     map.put("list", list); [EOL]     map.put("document", document); [EOL]     map.put("element", element); [EOL]     map.put("container", container); [EOL]     list.add(string); [EOL]     list.add(bean); [EOL]     list.add(map); [EOL]     list.add(new ArrayList(Collections.singletonList("string2"))); [EOL]     list.add(document); [EOL]     list.add(element); [EOL]     list.add(container); [EOL]     matrix = new int[1][]; [EOL]     matrix[0] = new int[1]; [EOL]     matrix[0][0] = 3; [EOL] } <line_num>: 47,76
public String getString() { [EOL]     return string; [EOL] } <line_num>: 78,80
public TestBean getBean() { [EOL]     return bean; [EOL] } <line_num>: 82,84
public Map getMap() { [EOL]     return map; [EOL] } <line_num>: 86,88
public List getList() { [EOL]     return list; [EOL] } <line_num>: 90,92
public Document getDocument() { [EOL]     return document; [EOL] } <line_num>: 94,96
public Element getElement() { [EOL]     return element; [EOL] } <line_num>: 98,100
public Container getContainer() { [EOL]     return container; [EOL] } <line_num>: 102,104
public int[][] getMatrix() { [EOL]     return matrix; [EOL] } <line_num>: 106,108
public void setMatrix(int[][] matrix) { [EOL]     this.matrix = matrix; [EOL] } <line_num>: 110,112
