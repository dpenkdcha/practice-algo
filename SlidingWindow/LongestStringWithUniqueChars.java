package SlidingWindow;

// Sliding window
public class LongestStringWithUniqueChars {

  public static void main(String[] args) {
    String S = "geeksforgeeks";

    int right =0, left=0, max=0;
    boolean[] visited = new boolean[256];

    while(right < S.length()) {
      if(visited[S.charAt(right)]) {

        while(visited[S.charAt(right)]) {
          visited[S.charAt(left)] = false;
          left++;
        }
      }

      visited[S.charAt(right)] = true;
      max = Math.max(max, (right-left+1));
      right++;
    }

    System.out.println(max);
    
  }

  
}
