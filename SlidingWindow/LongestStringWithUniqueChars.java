package SlidingWindow;

// Sliding window
public class LongestStringWithUniqueChars {

  public static void main(String[] args) {
    String S = "ABDEFGABEF";

    int right = 0, left = 0, max = 0;
    String finalS = "";
    boolean[] visited = new boolean[256];

    while (right < S.length()) {
      if (visited[S.charAt(right)]) {
        while (visited[S.charAt(right)]) {
          visited[S.charAt(left)] = false;
          left++;
        }
      }
      visited[S.charAt(right)] = true;
      if (max < right - left + 1) {
        max = right - left + 1;
        finalS = S.substring(left, (right + 1)); // print sub
      }
      right++;
    }

    System.out.println(finalS);
    System.out.println(max);

  }

}
