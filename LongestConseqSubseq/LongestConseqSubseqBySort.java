package LongestConseqSubseq;

import java.util.Arrays;

public class LongestConseqSubseqBySort {
  public static void main(String[] args) {
    int[] arr = { 1, 9, 3, 10, 4, 2, 11, 13, 14, 12 };
    int max = 1, count = 1;
    Arrays.sort(arr);

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] == arr[i + 1] - 1) {
        count++;
      } else {
        count = 1;
      }
      max = Math.max(max, count);
    }

    System.out.println(max);
  }
}
