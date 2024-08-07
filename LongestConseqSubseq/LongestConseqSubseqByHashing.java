package LongestConseqSubseq;

import java.util.HashSet;

public class LongestConseqSubseqByHashing {
  public static void main(String[] args) {
    int[] arr = { 36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42 };
    int max = 1;
    HashSet<Integer> set = new HashSet<>();

    for (Integer integer : arr) {
      set.add(integer);
    }

    for (int i = 0; i < arr.length; i++) {
      int start = arr[i];
      if (!set.contains(start - 1)) {
        int next = start+1;
        int count = 1;
        while(set.contains(next++)){
          count++;
        }
        max = Math.max(max, count);
      }
    }

    System.out.println(max);
  }
}
