@Test(expected = MathIllegalStateException.class) [EOL] @Retry [EOL] public void testRetryFailAlways() { [EOL]     throw new MathIllegalStateException(); [EOL] } <line_num>: 37,41
@Test [EOL] @Retry(100) [EOL] public void testRetryFailSometimes() { [EOL]     if (rng.nextBoolean()) { [EOL]         throw new MathIllegalStateException(); [EOL]     } [EOL] } <line_num>: 48,54
