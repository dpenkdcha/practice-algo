import java.text.DecimalFormat;

/**
 * test
 */
public class test {

  public static void main(String[] args) {
    
    double d1 = 123.338;
    double d2 = 123.448;

    double dx = 64517 / Math.pow(10, 2);
    double dy = 23953667 / Math.pow(10, 2);

    DecimalFormat df = new DecimalFormat("#.##");

    // double d = Double.parseDouble(df.format(d1)) + Double.parseDouble(df.format(d2));
    double d = d1 + d2;

    System.out.println(Double.parseDouble(df.format(d1)));
    System.out.println(d2);
    System.out.println(d); ///
    System.out.println(Double.parseDouble(df.format(d)));
    System.out.println(dx);
    System.out.println(Double.parseDouble(df.format(dx)));
    System.out.println(dy);
    System.out.println(Double.parseDouble(df.format(dy)));
    System.out.println(dx+dy);
    System.out.println(Double.parseDouble(df.format(dx+dy)));

  }
}