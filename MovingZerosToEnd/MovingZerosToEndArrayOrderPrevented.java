package MovingZerosToEnd;

public class MovingZerosToEndArrayOrderPrevented {
  public static void main(String[] args) {
    int[] arr = { 0, 0, 0, 3, 1, 4, };
    int n = arr.length;
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] != 0) {
        //arr[count++] = arr[i]; // 2 loop
        
        int temp = arr[i];
        arr[i] = arr[count];
        arr[count] = temp;

        count++;
      }
    }
    // 2 loop
    // while(count<n){
    //   arr[count] = 0;
    //   count++;
    // }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
