public class Main {

  public static void main(String[] args) {
    System.out.println("running");
    if (args.length > 1) {
      int n = Integer.parseInt(args[1]);
      if (args[0].equals("0")) {

        System.out.println(n + " is " + (Primes.isPrime(n) ? "" : "not ") + "prime");

      } else {

        System.out.println(n + " is " + (Primes.sumOfTwoPrimes(n) ? "" : "not ") + "the sum of two primes");

      }
    }
  }

}
