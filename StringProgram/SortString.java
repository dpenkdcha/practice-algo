package StringProgram;

public class SortString {

  public static void main(String[] args) {
    String inputString = "geeksforgeeks";
    char arr[] = inputString.toCharArray();
    char aux[] = new char[arr.length];

    mergeSort(arr, aux, 0, arr.length-1);

    System.err.println(new String(arr));

  }

  private static void mergeSort(char[] arr, char[] aux, int lo, int hi) {
    if (hi <= lo)
      return;

    int mid = lo + (hi - lo) / 2;

    mergeSort(arr, aux, lo, mid);
    mergeSort(arr, aux, mid + 1, hi);

    merge(arr, aux, lo, mid, hi);
  }

  private static void merge(char[] arr, char[] aux, int lo, int mid, int hi) {
    for (int i = lo; i <= hi; i++) {
      aux[i] = arr[i];
    }

    int i = lo, j = mid + 1;
    for (int k = lo; k <= hi; k++) {
      if (i > mid) {
        arr[k] = aux[j++];
      } else if(j > hi) {
        arr[k] = aux[i++];
      } else if(aux[i] < aux[j]) {
        arr[k] = aux[i++];
      } else {
        arr[k] = aux[j++];
      }
    }
  }

}
