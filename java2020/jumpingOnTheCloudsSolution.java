package java2020;

public class jumpingOnTheCloudsSolution {

  static int jumpingOnClouds(int[] c) {
    int jumps = 0;
    int i = 0;
    while (i < c.length - 1) {
      if (i + 2 < c.length) {
        if (c[i] == c[i + 2])
          i++;
      }
      i = i + 1;
      jumps++;
    }
    return jumps;
  }

  public static void main(String[] args) {
    int[] c = {0, 0, 0, 1, 0, 0};

    int jumps = jumpingOnClouds(c);

    System.out.println("Total clouds to jump are: " + jumps);
  }

}
