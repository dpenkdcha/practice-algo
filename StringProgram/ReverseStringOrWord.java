package StringProgram;

/**
 * ReverseWord
 */
public class ReverseStringOrWord {

  public static void main(String[] args) {
    String S = " Welcome to  geeksforgeeks! ";

    // reverse string
    for (int i = S.length() - 1; i >= 0; i--) {
      System.out.print(S.charAt(i));
    }
    System.out.println();
    System.out.println("S lenght " + S.length());

    // reverse word
    String[] sa = S.split(" ");
    System.out.println("sa lenght " + sa.length);
    String o = sa[sa.length - 1];
    for (int i = sa.length - 2; i >= 0; i--) {
      // System.out.println();
      if (!sa[i].equals(""))
        o = String.join(" ", o, sa[i]);
    }

    System.out.println("o lenght " + o.length());
    System.out.print(o);

  }
}