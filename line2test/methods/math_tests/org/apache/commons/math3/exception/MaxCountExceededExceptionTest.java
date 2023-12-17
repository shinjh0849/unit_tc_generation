@Test [EOL] public void testAccessors() { [EOL]     final MaxCountExceededException e = new MaxCountExceededException(10); [EOL]     Assert.assertEquals(10, e.getMax()); [EOL] } <line_num>: 28,32
