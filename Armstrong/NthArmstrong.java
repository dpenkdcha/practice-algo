package Armstrong;

/**
 * NthArmstrong
 */
public class NthArmstrong {

  public static void main(String[] args) {
    int n = 12;

    int count = 0;

    for (int i = 1; i <= Integer.MAX_VALUE; i++) {
      int num = i, rem, digit = 0, sum = 0;

      digit = String.valueOf(num).length();
      
      while (num > 0) {
        rem = num % 10;
        sum = sum + (int) Math.pow(rem, digit);
        num = num / 10;
      }

      if(i == sum) {
        count++;
        // System.out.println(i);
      }

      if(count == n) {
        System.out.println(i);
        break;
      } 
    }
  }
}