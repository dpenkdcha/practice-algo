package Prime;

public class NthPrime {

  public static void main(String[] args) {
    int n = 10, num = 2, count = 0;

    while (true) {
      boolean prime = true;
      for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
          prime = false;
          break;
        }
      }

      if (prime){
        System.out.print(num + " ");
        count++;
      }

      if(count == n) {
        break;
      }
      num++;
    }

    System.out.println(num);
  }
}
