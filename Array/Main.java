public class Main {


  public static void main(String[] args) {
    int[] xs = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for (int x : xs) {
      System.out.print(x + ",");
    }
    System.out.println();
    xs = Arrays.removeEveryThirdElement(xs);
    for (int x : xs) {
      System.out.print(x + ",");
    }
    System.out.println();
  }
}
