 void assertPrimeFactorsException(int n, Throwable expected)
 void assertNextPrimeException(int n, Throwable expected)
public void testNextPrime()
public void testIsPrime() throws Exception
 static int sum(List<Integer> numbers)
 static int product(List<Integer> numbers)
 static void checkPrimeFactors(List<Integer> factors)
public void testPrimeFactors() throws Exception
int[] PRIMES=Optional[{ // primes here have been verified one by one using Dario Alejandro Alpern's tool, see http://www.alpertron.com.ar/ECM.HTM
2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 43, 47, 53, 71, 73, 79, 89, 97, 107, 137, 151, 157, 271, 293, 331, 409, 607, 617, 683, 829, 1049, 1103, 1229, 1657, // around first boundary in miller-rabin
2039, // around first boundary in miller-rabin
2053, 2251, 2389, 2473, 2699, 3271, 3389, 3449, 5653, 6449, 6869, 9067, 9091, 11251, 12433, 12959, 22961, 41047, 46337, 65413, 80803, 91577, 92693, 118423, 656519, 795659, // around second boundary in miller-rabin
1373639, // around second boundary in miller-rabin
1373677, 588977, 952381, 1013041, 1205999, 2814001, 22605091, // around third boundary in miller-rabin
25325981, // around third boundary in miller-rabin
25326023, 100000007, 715827881, // Integer.MAX_VALUE
2147483647 }]
int[] NOT_PRIMES=Optional[{ // composite chosen at random + particular values used in algorithms such as boundaries for millerRabin
4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 22, 24, 25, 275, // around first boundary in miller-rabin
2037, // around first boundary in miller-rabin
2041, // around first boundary in miller-rabin
2045, // around first boundary in miller-rabin
2046, // around first boundary in miller-rabin
2047, // around first boundary in miller-rabin
2048, // around first boundary in miller-rabin
2049, // around first boundary in miller-rabin
2051, // around first boundary in miller-rabin
2055, 9095, 463465, // around second boundary in miller-rabin
1373637, // around second boundary in miller-rabin
1373641, // around second boundary in miller-rabin
1373651, // around second boundary in miller-rabin
1373652, // around second boundary in miller-rabin
1373653, // around second boundary in miller-rabin
1373654, // around second boundary in miller-rabin
1373655, // around second boundary in miller-rabin
1373673, // around second boundary in miller-rabin
1373675, // around second boundary in miller-rabin
1373679, // around third boundary in miller-rabin
25325979, // around third boundary in miller-rabin
25325983, // around third boundary in miller-rabin
25325993, // around third boundary in miller-rabin
25325997, // around third boundary in miller-rabin
25325999, // around third boundary in miller-rabin
25326001, // around third boundary in miller-rabin
25326003, // around third boundary in miller-rabin
25326007, // around third boundary in miller-rabin
25326009, // around third boundary in miller-rabin
25326011, // around third boundary in miller-rabin
25326021, // around third boundary in miller-rabin
25326025, 100000005, 1073741341, 1073741823, 2147473649, 2147483641, 2147483643, 2147483645, 2147483646 }]
int[] BELOW_2=Optional[{ Integer.MIN_VALUE, -1, 0, 1 }]
HashSet<Integer> PRIMES_SET=Optional[new HashSet<Integer>()]
