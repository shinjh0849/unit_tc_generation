@Test [EOL] public void testZero() { [EOL]     Assert.assertEquals(Complex.ZERO, ComplexField.getInstance().getZero()); [EOL] } <line_num>: 25,28
@Test [EOL] public void testOne() { [EOL]     Assert.assertEquals(Complex.ONE, ComplexField.getInstance().getOne()); [EOL] } <line_num>: 30,33
@Test [EOL] public void testSerial() { [EOL]     ComplexField field = ComplexField.getInstance(); [EOL]     Assert.assertTrue(field == TestUtils.serializeAndRecover(field)); [EOL] } <line_num>: 35,40
