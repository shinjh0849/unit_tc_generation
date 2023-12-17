public DefaultEmployee(@JsonProperty("name") String name, @JsonProperty("friends") List<User> friends, @JsonProperty("employer") String employer)
public DefaultUser(@JsonProperty("name") String name, @JsonProperty("friends") List<User> friends)
public abstract String getEmployer()
public abstract String getName()
public abstract List<User> getFriends()
public String getEmployer()
public String getName()
public List<User> getFriends()
public int getValue()
public String toString()
public void testEmptyCollection() throws Exception
public void testInnerClassWithType() throws Exception
