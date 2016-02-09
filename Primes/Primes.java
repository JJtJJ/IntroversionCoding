public class Primes {

  public static int getPrime(int n) {
    if (n == 0) return 2;
    if (n == 1) return 3;
    return 6 * (n / 2) + (n % 2 == 0 ? -1 : 1);
  }

  public static boolean isPrime(int n) {
    if (n < 2) return false;
    if (n > 2 && n % 2 == 0) return false;
    int i = 0;
    int prime = getPrime(0);
    while (prime < Math.sqrt(n)) {
      if (n % prime == 0) return false;
      prime = getPrime(++i);
    }
    return true;
  }

  public static boolean sumOfTwoPrimes(int n) {
    for (int i = 1; i <= n / 2; i++) {
      if (isPrime(i) && isPrime(n-i)) {
        return true;
      }
    }
    return false;
  }

}
