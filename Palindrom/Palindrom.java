package Palindrom;

import java.math.BigInteger;

public class Palindrom {
  public static void main(String[] args) {
    BigIntegerWay();

    ReverseNumberWay();

    StringTwoPointer();

  }

  private static void BigIntegerWay() {
    BigInteger n = new BigInteger("12345678999999999987654321");
    StringBuilder sb = new StringBuilder(n.toString());
    String s = sb.reverse().toString();
    BigInteger m = new BigInteger(s);

    if (n.compareTo(m) == 0) {
      System.out.println(true);
    } else {
      System.out.println(false);
    }
  }

  private static void ReverseNumberWay() {
    int n = 123464321, m = n;
    int reverseN = 0;

    while (m > 0) {
      reverseN = reverseN * 10 + m % 10;
      m = m / 10;
    }

    if (n == reverseN) {
      System.out.println(true);
    } else {
      System.out.println(false);
    }
  }

  private static void StringTwoPointer() {
    String str1 = "racecar";
    int i = 0, j = str1.length() - 1;

    boolean flag = true;
    while (i < j) {
      if (str1.charAt(i++) != str1.charAt(j--)) {
        flag = false;
      }
    }

    if (flag) {
      System.out.println(true);
    } else {
      System.out.println(false);
    }
  }
}
