package StringProgram;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingChar {
  public static void main(String[] args) {
    String s = "iggjlidfka423";

    LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
    for(int i=0;i<s.length();i++) {
      if(map.containsKey(s.charAt(i))) {
        map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
      } else {
        map.put(s.charAt(i), 1);
      }
    }

    for (Map.Entry<Character,Integer> mapElement : map.entrySet()) {
      if(mapElement.getValue() == 1)
        System.out.print(mapElement.getKey() + " ");
    }
  }
}
