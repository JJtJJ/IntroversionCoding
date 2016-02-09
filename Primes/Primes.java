public class Primes {

  /*
  / This method works as a primefilter.
  / All numbers can be represented as 6k+n, but for a number to be prime,
  / it must be represented by 6k +/- 1, since 6k, 6k+2 and 6k+4 all divide by 2, 
  / and 6k+3 divides by 3.
  / This doesn't return only primes, but since the only non-primes it generates
  / are multiples of a previous prime, it works for checking primality.
  */
  public static int getPrime(int n) {
    if (n == 0) return 2;
    if (n == 1) return 3;
    return 6 * (n / 2) + (n % 2 == 0 ? -1 : 1);
  }

  /*
  / Here, if a number is greater than 2, and isn't even, we take every prime
  / lower than the square root of n, and check whether n divides exactly into it.
  */
  public static boolean isPrime(int n) {
    if (n < 2) return false;
    if (n > 2 && n % 2 == 0) return false;
    int i = 1;
    int prime = getPrime(1);
    while (prime < Math.sqrt(n)) {
      if (n % prime == 0) return false;
      prime = getPrime(++i);
    }
    return true;
  }

  /*
  / This function checks every prime number less than half n, and checks whether
  / the difference between n and that prime is also prime.
  */
  public static boolean sumOfTwoPrimes(int n) {
    int i = 0;
    int prime = getPrime(i);
    while (prime <= n/2) {
      if (isPrime(n-prime)) {
        System.out.printf("%d is the sum of %d and %d\n", n, prime, n-prime);
        return true;
      }
      prime = getPrime(++i);
    }
    return false;
  }

}
