public BuildTest(String name) { [EOL]     super(name); [EOL] } <line_num>: 29,32
public static Test suite() { [EOL]     return new TestSuite(BuildTest.class); [EOL] } <line_num>: 25,27
public void setUp() { [EOL] } <line_num>: 34,37
public void tearDown() { [EOL] } <line_num>: 39,42
public void testSimple() { [EOL]     Options opts = new Options(); [EOL]     opts.addOption("a", false, "toggle -a"); [EOL]     opts.addOption("b", true, "toggle -b"); [EOL] } <line_num>: 44,55
public void testDuplicateSimple() { [EOL]     Options opts = new Options(); [EOL]     opts.addOption("a", false, "toggle -a"); [EOL]     opts.addOption("a", true, "toggle -a*"); [EOL]     assertEquals("last one in wins", "toggle -a*", opts.getOption("a").getDescription()); [EOL] } <line_num>: 57,69
public void testLong() { [EOL]     Options opts = new Options(); [EOL]     opts.addOption("a", "--a", false, "toggle -a"); [EOL]     opts.addOption("b", "--b", true, "set -b"); [EOL] } <line_num>: 71,85
public void testDuplicateLong() { [EOL]     Options opts = new Options(); [EOL]     opts.addOption("a", "--a", false, "toggle -a"); [EOL]     opts.addOption("a", "--a", false, "toggle -a*"); [EOL]     assertEquals("last one in wins", "toggle -a*", opts.getOption("a").getDescription()); [EOL] } <line_num>: 87,100
