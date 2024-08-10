package Prime;

public class isPrime {
  public static void main(String[] args) {
    int n = 7;
    boolean prime = true;
    if (n <= 0) {
      prime = false;
    } else {
      for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
          prime = false;
          break;
        }
      }
    }

    System.out.println(prime);
  }
}
