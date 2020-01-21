package java2020;

import java.util.HashSet;
import java.util.Set;

public class sockMerchantSolution {

  // Complete the sockMerchant function below.
  static int sockMerchant(int n, int[] ar) {
    int pairs = 0;
    Set<Integer> colors = new HashSet<>();

    for (int i = 0; i < n; i++) {
      if (!colors.add(ar[i])) {
        pairs++;
        colors.remove(ar[i]);
      }
    }

    return pairs;
  }

  public static void main(String[] args) {
    int n = 9;
    int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};

    int pairs = sockMerchant(n, ar);

    System.out.println("Total pairs are: " + pairs);
  }
}
