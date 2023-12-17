public Account(String name, Long id) { [EOL]     this.id = id; [EOL]     this.name = name; [EOL] } <line_num>: 21,24
public Key(T id) { [EOL]     this.id = id; [EOL] } <line_num>: 33,33
public Person1(String name) { [EOL]     this.name = name; [EOL] } <line_num>: 45,45
public Person2(String name) { [EOL]     this.name = name; [EOL] } <line_num>: 69,71
public GenericBogusWrapper(T v) { [EOL]     wrapped = new Element(v); [EOL] } <line_num>: 85,85
public Element(T v) { [EOL]     value = v; [EOL] } <line_num>: 90,90
public String getName() { [EOL]     return name; [EOL] } <line_num>: 26,26
public Long getId() { [EOL]     return id; [EOL] } <line_num>: 27,27
public T getId() { [EOL]     return id; [EOL] } <line_num>: 35,35
public <V> Key<V> getParent() { [EOL]     return null; [EOL] } <line_num>: 37,37
public String getName() { [EOL]     return name; [EOL] } <line_num>: 47,49
public Key<Account> getAccount() { [EOL]     return account; [EOL] } <line_num>: 51,53
public Long getId() { [EOL]     return id; [EOL] } <line_num>: 55,57
public void setAccount(Key<Account> account) { [EOL]     this.account = account; [EOL] } <line_num>: 59,61
public String getName() { [EOL]     return name; [EOL] } <line_num>: 73,73
public List<Key<Account>> getAccounts() { [EOL]     return accounts; [EOL] } <line_num>: 74,74
public Long getId() { [EOL]     return id; [EOL] } <line_num>: 75,75
public void setAccounts(List<Key<Account>> accounts) { [EOL]     this.accounts = accounts; [EOL] } <line_num>: 77,79
@SuppressWarnings("unchecked") [EOL] public void testIssue468a() throws Exception { [EOL]     Person1 p1 = new Person1("John"); [EOL]     p1.setAccount(new Key<Account>(new Account("something", 42L))); [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     String json = mapper.writeValueAsString(p1); [EOL]     Map<String, Object> map = mapper.readValue(json, Map.class); [EOL]     assertEquals("John", map.get("name")); [EOL]     Object ob = map.get("account"); [EOL]     assertNotNull(ob); [EOL]     Map<String, Object> acct = (Map<String, Object>) ob; [EOL]     Object idOb = acct.get("id"); [EOL]     assertNotNull(idOb); [EOL]     Map<String, Object> key = (Map<String, Object>) idOb; [EOL]     assertEquals("something", key.get("name")); [EOL]     assertEquals(Integer.valueOf(42), key.get("id")); [EOL] } <line_num>: 100,121
@SuppressWarnings("unchecked") [EOL] public void testIssue468b() throws Exception { [EOL]     Person2 p2 = new Person2("John"); [EOL]     List<Key<Account>> accounts = new ArrayList<Key<Account>>(); [EOL]     accounts.add(new Key<Account>(new Account("a", 42L))); [EOL]     accounts.add(new Key<Account>(new Account("b", 43L))); [EOL]     accounts.add(new Key<Account>(new Account("c", 44L))); [EOL]     p2.setAccounts(accounts); [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     String json = mapper.writeValueAsString(p2); [EOL]     Map<String, Object> map = mapper.readValue(json, Map.class); [EOL]     assertEquals("John", map.get("name")); [EOL]     Object ob = map.get("accounts"); [EOL]     assertNotNull(ob); [EOL]     List<?> acctList = (List<?>) ob; [EOL]     assertEquals(3, acctList.size()); [EOL] } <line_num>: 123,145
public void testUnboundIssue572() throws Exception { [EOL]     GenericBogusWrapper<Integer> list = new GenericBogusWrapper<Integer>(Integer.valueOf(7)); [EOL]     String json = new ObjectMapper().writeValueAsString(list); [EOL]     assertEquals("{\"wrapped\":{\"value\":7}}", json); [EOL] } <line_num>: 151,156
