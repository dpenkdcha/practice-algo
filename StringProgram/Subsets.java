package StringProgram;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
  public static void main(String[] args) {
    List<Integer> array = List.of(1, 2, 3);
    List<Integer> subset = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();

    int index = 0;
    calcSubset(array, res, subset, index);

    // Print the generated subsets
    for (List<Integer> sub : res) {
      for (Integer num : sub) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }

  private static void calcSubset(List<Integer> array, List<List<Integer>> res, List<Integer> subset, int index) {

    res.add(new ArrayList<>(subset));
    // System.out.println("1 res " + res + " subset " + subset + " index " + index);

    for (int i = index; i < array.size(); i++) {
      subset.add(array.get(i));
      // System.out.println("2 res " + res + " subset " + subset + " index " + i);

      calcSubset(array, res, subset, i + 1);
      // System.out.println("3 res " + res + " subset " + subset + " index " + i);

      subset.remove(subset.size() - 1);
      // System.out.println("4 res " + res + " subset " + subset + " index " + i);

    }

  }

}
