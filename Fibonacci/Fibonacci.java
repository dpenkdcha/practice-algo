package Fibonacci;

public class Fibonacci {
  public static void main(String[] args) {
    int N = 10;

    FibonacciSwap(N);
    System.out.println();

    int[] fibonacciDP = FibonacciDP(N);
    for (int i = 0; i < N; i++) {
      System.out.print(fibonacciDP[i] + " ");
    }
    System.out.println();

    System.out.println(FibonacciNTH(N));
  }

  static void FibonacciSwap(int N) {
    int num1 = 0, num2 = 1;

    for (int i = 0; i < N; i++) {
      // Print the number
      System.out.print(num1 + " ");

      // Swap
      int num3 = num2 + num1;
      num1 = num2;
      num2 = num3;
    }
  }

  static int[] FibonacciDP(int N) {
    int f[] = new int[N];

    int i;

    // 0th and 1st number of
    // the series are 0 and 1
    f[0] = 0;
    f[1] = 1;

    for (i = 2; i < N; i++) {

      // Add the previous 2 numbers
      // in the series and store it
      f[i] = f[i - 1] + f[i - 2];
    }

    return f; // return f[N] for nth
  }

  private static int FibonacciNTH(int N) {
    int num1 = 0, num2 = 1;

    for (int i = 0; i < N-1; i++) {
      // Swap
      int num3 = num2 + num1;
      num1 = num2;
      num2 = num3;
    }

    return num1;
  }
}
