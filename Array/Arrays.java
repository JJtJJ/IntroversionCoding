public class Arrays {
  
  /*
  / Create a new array of the correct size,
  / and populate that array with the original array without
  / every third element
  */
  public static int[] removeEveryThirdElement(int[] xs) {
    int xsSize = xs.length;
    int[] resultXs = new int[xsSize - (xsSize / 3)];

    int noRemoved = 0;
    for (int i = 0; i < xsSize; i++) {
      if ((i+1) % 3 != 0) {
        resultXs[i - noRemoved] = xs[i];
      } else {
        noRemoved++;
      }
    }

    return resultXs;
  }

}
