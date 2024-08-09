package CountDistinctWindow;

import java.util.HashSet;

public class CountDistinctWindowWithHashSet {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 1, 3, 4, 2, 3, 2, 5, 7, 2, 16, 1, 5, 3, 6, 4, 6, 4 };
    int N = arr.length;
    int K = 10;

    HashSet<Integer> set = new HashSet<>();
    int startIndex = 0;
    int i = startIndex;
    while (K > i && K <= N) {
      set.add(arr[i++]);
      if (i % K == 0) {
        System.out.print(set.size() + " ");
        set.clear();
        K++;
        startIndex++;
        i = startIndex;
      }
    }
  }
}
