public ColumnMetadata(@JsonProperty("name") String name, @JsonProperty("type") String type, @JsonProperty("comment") String comment)
public Employee()
public Employee(int id, String name, Employee manager)
public String getName()
public String getType()
public String getComment()
public void add(Employee e)
public Employee addReport(Employee e)
public void testColumnMetadata() throws Exception
public void testMixedRefsIssue188() throws Exception
