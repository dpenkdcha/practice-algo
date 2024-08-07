package Armstrong;

public class isArmstrong {
  public static void main(String[] args) {
    int num = 372, rem, digit = 0, sum = 0;
    int i = num;
    digit = String.valueOf(num).length();

    while (num > 0) {
      rem = num % 10;
      sum = sum + (int) Math.pow(rem, digit);
      num = num / 10;
    }

    if (sum == i)
      System.out.println(true);
    else
      System.out.println(false);

  }
}
