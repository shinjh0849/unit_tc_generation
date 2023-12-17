@Test [EOL] public void testZero() { [EOL]     Assert.assertEquals(BigFraction.ZERO, BigFractionField.getInstance().getZero()); [EOL] } <line_num>: 26,29
@Test [EOL] public void testOne() { [EOL]     Assert.assertEquals(BigFraction.ONE, BigFractionField.getInstance().getOne()); [EOL] } <line_num>: 31,34
@Test [EOL] public void testSerial() { [EOL]     BigFractionField field = BigFractionField.getInstance(); [EOL]     Assert.assertTrue(field == TestUtils.serializeAndRecover(field)); [EOL] } <line_num>: 36,41
