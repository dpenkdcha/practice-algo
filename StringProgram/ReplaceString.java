package StringProgram;

import java.util.HashMap;

public class ReplaceString {
  public static void main(String[] args) {

    int index[] = { 0, 4 };
    String sources[] = { "g", "ks" };
    String targets[] = { "geeks", "geeks" };

    String out = findAndReplace("gforks", 2, index, sources, targets);
    System.out.println(out);
  }

  static String findAndReplace(String S, int Q, int[] index, String[] sources, String[] targets) {
    // code here

    String finalS = "";
    HashMap<Integer, String> map = new HashMap<>();
    for (int i = 0; i < Q; i++) {
      int startIndex = index[i];
      String sourceString = sources[i];
      String targetString = targets[i];
      if (sourceString.equals(S.substring(startIndex, startIndex + sourceString.length()))) {
        map.put(startIndex, targetString);
      } else {
        map.put(startIndex, S.substring(startIndex, startIndex + 1));
      }
    }
    int i = 0;
    int sourceIndex = 0;
    while (i < S.length()) {
      if (map.containsKey(i)) {
        finalS = finalS + map.get(i);
        // System.out.println("finalS " + finalS + " map.get(i) " + map.get(i));
        // System.out.println("I value " + i +" sources[sourceIndex].length() " +
        // sources[sourceIndex].length());
        if (sources[sourceIndex].equals(S.substring(i, i + sources[sourceIndex].length()))) {
          i = i + sources[sourceIndex].length();
        } else {
          i++;
        }
        sourceIndex++;
      } else {
        finalS = finalS + S.charAt(i);
        i++;
      }
    }

    return finalS;

  }

}
