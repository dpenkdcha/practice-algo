package Palindrom;

import java.util.HashMap;
import java.util.Map;

public class RearrangeCharForPelindrom {
  public static void main(String[] args) {
    String s = "geeksogeeks";// "mdaam";
    char[] ca = s.toCharArray();
    HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < ca.length; i++) {
      map.put(ca[i], map.getOrDefault(ca[i], 0) + 1);
    }

    int stringIndex = 0;
    StringBuilder sb = new StringBuilder();
    String mid = "";
    for (Map.Entry<Character, Integer> mapEntry : map.entrySet()) {
      if (mapEntry.getValue() % 2 == 0) {
        sb.insert(stringIndex, mapEntry.getKey());
        sb.insert(sb.length() - 1 - stringIndex, mapEntry.getKey());
        stringIndex++;
      } else if (mid.equals("")) {
        mid = mapEntry.getKey().toString();
      } else {
        sb = new StringBuilder("");
        break;
      }
    }

    StringBuilder sbx = new StringBuilder();
    sbx.repeat(mid, map.get(mid.charAt(0)));
    sb.insert(stringIndex, sbx);

    System.out.println(sb);

  }
}
