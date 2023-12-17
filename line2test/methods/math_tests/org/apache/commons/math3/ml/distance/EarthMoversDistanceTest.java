@Test [EOL] public void testZero() { [EOL]     Assert.assertEquals(0, distance.compute(a, a), 0d); [EOL] } <line_num>: 33,36
@Test [EOL] public void testZero2() { [EOL]     final double[] zero = new double[] { 0, 0 }; [EOL]     Assert.assertEquals(0, distance.compute(zero, zero), 0d); [EOL] } <line_num>: 38,42
@Test [EOL] public void test() { [EOL]     double expected = 0.65; [EOL]     Assert.assertEquals(expected, distance.compute(a, b), 1e-10); [EOL]     Assert.assertEquals(expected, distance.compute(b, a), 1e-10); [EOL] } <line_num>: 44,49
