package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;

// Sliding Window Technique
public class CountDistinctWindowWithHashMap {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 1, 3, 4, 2, 3, 2, 5, 7, 2, 16, 1, 5, 3, 6, 4, 6, 4 };
    int N = arr.length;
    int K = 10;
    HashMap<Integer, Integer> map = new HashMap<>();
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < K; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    list.add(map.size());

    for (int i = K; i < N; i++) {
      if (map.get(arr[i - K]) == 1) {
        map.remove(arr[i - K]);
      } else
        map.put(arr[i - K], map.get(arr[i - K]) - 1);

      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
      list.add(map.size());
    }

    list.forEach(x -> System.out.print(x + " "));
  }

}

// 6 6 7 7 7 6 7 8 8 8
// 6 5 6 5 5 5 6 5 6 5
