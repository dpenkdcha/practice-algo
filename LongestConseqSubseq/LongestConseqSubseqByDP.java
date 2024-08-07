package LongestConseqSubseq;

import java.util.Collections;
import java.util.HashMap;

public class LongestConseqSubseqByDP {
  public static void main(String[] args) {
    int[] arr = { 36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42 };
    int max = 1;

    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(arr[0], 1);
    for (int i = 1; i < arr.length; i++) {
      if (map.containsKey(arr[i] - 1)) {
        map.put(arr[i], map.get(arr[i] - 1) + 1);
        map.remove(arr[i] - 1);
      } else {
        map.put(arr[i], 1);
      }
    }
    System.out.println(Collections.max(map.values()));
  }
}
