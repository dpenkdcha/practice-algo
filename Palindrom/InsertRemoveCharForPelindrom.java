package Palindrom;

import java.util.HashMap;
import java.util.Map;

public class InsertRemoveCharForPelindrom {
  public static void main(String[] args) {
    String S = "abycdcxba";
    StringBuilder sb = new StringBuilder(S);
    String rS = sb.reverse().toString();

    int[][] dp = new int[S.length() + 1][S.length() + 1];

    for (int i = 1; i <= S.length(); i++) {
      for (int j = 1; j <= S.length(); j++) {
        if (S.charAt(i - 1) == rS.charAt(j - 1)) {
          dp[i][j] = dp[i - 1][j - 1] + 1;
        } else {
          dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
        }
      }
    }

    insertChar(S, rS, dp);
    System.out.println();

    insertCharFormWholeString(S, rS, dp);
    System.out.println();

    removeChar(S, rS, dp);

    int lps = dp[S.length()][S.length()];

    System.out.println(S.length() - lps);

  }

  private static void insertChar(String S, String rS, int[][] dp) {
    int i = S.length(), j = S.length();
    String output = "";
    while (i > 0 && j > 0) {
      if (S.charAt(i - 1) == rS.charAt(j - 1)) {
        i--;
        j--;
      } else {
        if (dp[i][j - 1] > dp[i - 1][j]) {
          output = String.join("", output, String.valueOf(rS.charAt(j - 1)));
          j--;
        } else {
          output = String.join("", output, String.valueOf(S.charAt(i - 1)));
          i--;
        }
      }
    }

    // while (i > 0) {
    // output = String.join("", output, String.valueOf(S.charAt(i - 1)));
    // i--;
    // }

    // while (j > 0) {
    // output = String.join("", output, String.valueOf(rS.charAt(j - 1)));
    // j--;
    // }

    System.out.println(output);
  }

  private static void insertCharFormWholeString(String S, String rS, int[][] dp) {
    StringBuilder leftInsertions = new StringBuilder();
    StringBuilder rightInsertions = new StringBuilder();
    StringBuilder sbx = new StringBuilder(S);
    int i = S.length(), j = S.length();

    while (i > 0 && j > 0) {
      if (S.charAt(i - 1) == rS.charAt(j - 1)) {
        i--;
        j--;
      } else if (dp[i - 1][j] > dp[i][j - 1]) {
        sbx.insert(i - 1, rS.charAt(i - 1));
        // leftInsertions.append(S.charAt(i - 1));
        i--;
      } else {
        if (rS.charAt(j) != sbx.charAt(j))
          sbx.insert(j - 1, S.charAt(j - 1));
        // rightInsertions.insert(0, rS.charAt(j - 1));
        j--;
      }
    }

    // Combine left part, original string, and right part
    System.out.println(leftInsertions.toString() + S + rightInsertions.toString());
    System.out.println(sbx);

  }

  private static void removeChar(String S, String rS, int[][] dp) {
    int i = S.length(), j = S.length();
    String output = "";
    while (i > 0 && j > 0) {
      if (S.charAt(i - 1) == rS.charAt(j - 1)) {
        i--;
        j--;
      } else {
        if (dp[i][j - 1] > dp[i - 1][j]) {
          j--;
        } else {
          output = String.join("", output, String.valueOf(S.charAt(i - 1)));
          i--;
        }
      }
    }

    while (i > 0) {
      output = String.join("", output, String.valueOf(S.charAt(i - 1)));
      i--;
    }

    System.out.println(output);
  }

  private static boolean isPalindrom(String S) {
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < S.length(); i++) {
      map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
    }

    int count = 0;
    for (Map.Entry<Character, Integer> x : map.entrySet()) {
      if (x.getValue() % 2 != 0 && count++ > 1) {
        break;
      }
    }
    if (count > 1) {
      return false;
    }
    return true;
  }
}
