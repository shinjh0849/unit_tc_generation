public TestAll(String testName) { [EOL]     super(testName); [EOL] } <line_num>: 31,33
public static Test suite() { [EOL]     TestSuite suite = new TestSuite(); [EOL]     suite.addTest(new MainTest(1000, 0, 1345435247779935L)); [EOL]     suite.addTest(new MainTest(1000, 1, 1345435247779935L)); [EOL]     return suite; [EOL] } <line_num>: 35,40
public static void main(String[] args) { [EOL]     String[] testCaseName = { TestAll.class.getName() }; [EOL]     junit.textui.TestRunner.main(testCaseName); [EOL] } <line_num>: 42,47
