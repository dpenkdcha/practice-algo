package MovingZerosToEnd;

public class MovingZerosToEndArrayOrderNotPrevented {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 0, 0, 0, 3, 6};

    int j = arr.length;
    for (int i = 0; i < arr.length && j > i+1; i++) {
      if (arr[i] == 0) {
        while (arr[--j] == 0) {
          if (j <= i)
            break;
        }
        arr[i] = arr[j];
        arr[j] = 0;
      }
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

  }
}
